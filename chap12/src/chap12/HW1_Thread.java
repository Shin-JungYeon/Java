package chap12;
/*
 * 1. 1부터 1000까지의 합을 5개의 스레드가 나누어 합을 구하기 : Thread 클래스를 상속받는 방식으로 구현하기
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
		} catch(InterruptedException e) {}  //모든 스레드가 실행 완료해야 전체 합계 구할 수 있음.
		System.out.println("1~200까지 합 = " + t1.sum
						 + "\n201~400까지 합 = " + t2.sum
					 	 + "\n401~600까지 합 = " + t3.sum
						 + "\n601~800까지 합 = " + t4.sum
						 + "\n801~1000까지 합 = " + t5.sum);
		System.out.println("1~1000까지의 합 = " + (t1.sum+t2.sum+t3.sum+t4.sum+t5.sum));
		
		
		SumThread[] tarr = new SumThread[5];  //배열을 사용하면 훨씬 간단해짐.
		int total=0;
		for(int i=0; i<tarr.length; i++) {
			tarr[i] = new SumThread(i*200+1, (i+1)*200);
			tarr[i].start();
		}
		for(SumThread t : tarr) {
			t.join();   //try-catch 구문 or main 옆에 throws InterruptedException (예외처리 필수)
			total += t.sum;
		}
		System.out.println("1~1000까지의 합 = " + total);
		
	}
}
