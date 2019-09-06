package chap12;
/*
 * ThreadEx8 예제를 Runnable 인터페이스를 구현한 형태로 바꿔줌.
 */
class InterruptedRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("자고 있습니다. 깨우지 마세요.");
		try {
			Thread.sleep(1000000);
		} catch (InterruptedException e) {
			System.out.println("누가 깨웠니?");
		}
	}
}
public class RunnableEx8 {
	public static void main(String[] args) {
		InterruptedRunnable itrp = new InterruptedRunnable();
		Thread t1 = new Thread(itrp);
		t1.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		t1.interrupt();
	}
}
