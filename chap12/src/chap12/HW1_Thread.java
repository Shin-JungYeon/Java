package chap12;
/*
 * 1. 1���� 1000������ ���� 5���� �����尡 ������ ���� ���ϱ� : Thread Ŭ������ ��ӹ޴� ������� �����ϱ�
 * 
 * t1 : 1 ~ 200���� ��
 * t2 : 201 ~400���� ��
 * t3 : 401 ~ 600���� ��
 * t4 : 601 ~ 800���� ��
 * t5 : 801 ~ 1000���� ��
 * 
 * main ������ : ��� �����尡 �����Ҷ� ���� ��ٷȴٰ� 
 * ��� �������� ���� ���ؼ� 1 ~ 1000������ �� ����ϴ� ���α׷� �����ϱ�  
 */
class SumThread extends Thread {
	int sum=0;
	int i, f;
	SumThread(int i, int f) {
		this.i = i;
		this.f = f;
	}
	@Override
	public void run() {
		for(int j=this.i; j<=this.f; j++) {
			sum += j;
		}
	}		
}
public class HW1_Thread {
	public static void main(String[] args) throws InterruptedException {
		SumThread t1 = new SumThread(1, 200);
		SumThread t2 = new SumThread(201, 400);
		SumThread t3 = new SumThread(401, 600);
		SumThread t4 = new SumThread(601, 800);
		SumThread t5 = new SumThread(801, 1000);
		t1.start(); t2.start(); t3.start(); t4.start(); t5.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch(InterruptedException e) {}  //��� �����尡 ���� �Ϸ��ؾ� ��ü �հ� ���� �� ����.
		System.out.println("1~200���� �� = " + t1.sum
						 + "\n201~400���� �� = " + t2.sum
					 	 + "\n401~600���� �� = " + t3.sum
						 + "\n601~800���� �� = " + t4.sum
						 + "\n801~1000���� �� = " + t5.sum);
		System.out.println("1~1000������ �� = " + (t1.sum+t2.sum+t3.sum+t4.sum+t5.sum));
		
		
		SumThread[] tarr = new SumThread[5];  //�迭�� ����ϸ� �ξ� ��������.
		int total=0;
		for(int i=0; i<tarr.length; i++) {
			tarr[i] = new SumThread(i*200+1, (i+1)*200);
			tarr[i].start();
		}
		for(SumThread t : tarr) {
			t.join();   //try-catch ���� or main ���� throws InterruptedException (����ó�� �ʼ�)
			total += t.sum;
		}
		System.out.println("1~1000������ �� = " + total);
		
	}
}
