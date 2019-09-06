package chap12;
/*
 * ThreadEx7 예제를 Runnable 인터페이스를 구현한 형태로 바꿔줌.
 */
class JoinRunnable implements Runnable {
	int sum=0;
	@Override
	public void run() {
		for(int i=0; i<=100; i++) {
			sum += i;
		}
		System.out.println();
	}
}
public class RunnableEx7 {
	public static void main(String[] args) {
		System.out.println("스레드를 이용하여 100까지의 합 구하기");
		JoinRunnable join = new JoinRunnable();
		Thread t1 = new Thread(join);
		t1.start();
		try {
			t1.join();
		} catch(InterruptedException e) {}
		System.out.println("결과 : " + join.sum);
	}
}
