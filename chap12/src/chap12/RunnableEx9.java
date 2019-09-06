package chap12;
/*
 * ThreadEx9 ������ Runnable �������̽��� ������ ���·� �ٲ���.
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
		t1.setDaemon(true);  //setDaemon() �޼��嵵 Thread �� �ִ� ��� �޼�����.
		t2.setDaemon(true);
		t1.start(); t2.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println("main �޼��� ����");
	}
}
