package chap12;
/*
 * ThreadEx9 예제를 Runnable 인터페이스를 구현한 형태로 바꿔줌.
 */
class DeamonRunnable implements Runnable {
	@Override
	public void run() {
		while(true) {
			System.out.println(this);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}
public class RunnableEx9 {
	public static void main(String[] args) {
		DeamonRunnable d1 = new DeamonRunnable();
		DeamonRunnable d2 = new DeamonRunnable();
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		t1.setDaemon(true);  //setDaemon() 메서드도 Thread 에 있는 멤버 메서드임.
		t2.setDaemon(true);
		t1.start(); t2.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println("main 메서드 종료");
	}
}
