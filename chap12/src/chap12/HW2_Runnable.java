package chap12;
/*
 * 2. 1부터 1000까지의 합을 5개의 스레드가 나누어 합을 구하기 : Runnable 인터페이스를 상속받는 방식으로 구현하기
 * 
 * t1 : 1 ~ 200까지 합
 * t2 : 201 ~400까지 합
 * t3 : 401 ~ 600까지 합
 * t4 : 601 ~ 800까지 합
 * t5 : 801 ~ 1000까지 합
 * 
 * main 스레드 : 모든 스레드가 종료할때 까지 기다렸다가 
 * 모든 스레드의 합을 더해서 1 ~ 1000까지의 합 출력하는 프로그램 구현하기  
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
		System.out.println("1~200까지 합 = " + s1.sum
						 + "\n201~400까지 합 = " + s2.sum
					 	 + "\n401~600까지 합 = " + s3.sum
						 + "\n601~800까지 합 = " + s4.sum
						 + "\n801~1000까지 합 = " + s5.sum);
		System.out.println("1~1000까지의 합 = " + (s1.sum+s2.sum+s3.sum+s4.sum+s5.sum));
	}
}
