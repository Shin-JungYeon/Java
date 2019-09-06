package chap12;
/*
 * 2. 1���� 1000������ ���� 5���� �����尡 ������ ���� ���ϱ� : Runnable �������̽��� ��ӹ޴� ������� �����ϱ�
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
class SumRunnable implements Runnable {
	int sum=0;
	int i, f;
	SumRunnable(int i, int f) {
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
public class HW2_Runnable {
	public static void main(String[] args) {
		SumRunnable s1 = new SumRunnable(1, 200);
		SumRunnable s2 = new SumRunnable(201, 400);
		SumRunnable s3 = new SumRunnable(401, 600);
		SumRunnable s4 = new SumRunnable(601, 800);
		SumRunnable s5 = new SumRunnable(801, 1000);
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		Thread t3 = new Thread(s3);
		Thread t4 = new Thread(s4);
		Thread t5 = new Thread(s5);
		t1.start(); t2.start(); t3.start(); t4.start(); t5.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch(InterruptedException e) {}
		System.out.println("1~200���� �� = " + s1.sum
						 + "\n201~400���� �� = " + s2.sum
					 	 + "\n401~600���� �� = " + s3.sum
						 + "\n601~800���� �� = " + s4.sum
						 + "\n801~1000���� �� = " + s5.sum);
		System.out.println("1~1000������ �� = " + (s1.sum+s2.sum+s3.sum+s4.sum+s5.sum));
	}
}
