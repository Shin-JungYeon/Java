package chap12;
/*
 * ThreadEx8 ������ Runnable �������̽��� ������ ���·� �ٲ���.
 */
class InterruptedRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("�ڰ� �ֽ��ϴ�. ������ ������.");
		try {
			Thread.sleep(1000000);
		} catch (InterruptedException e) {
			System.out.println("���� ������?");
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
