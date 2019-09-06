package chap12;
/*
 * InterruptedException ���� �߻��Ͽ� sleep ���� ������ �����.
 */
class InterruptedThread extends Thread {
	@Override
	public void run() {
		System.out.println("�ڰ� �ֽ��ϴ�. ������ ������.");
		try {
			sleep(1000000);
		} catch (InterruptedException e) {
			System.out.println("���� ������?");
		}
	}
}
public class ThreadEx8 {
	public static void main(String[] args) {
		InterruptedThread t1 = new InterruptedThread();
		t1.start();
		try {
			Thread.sleep(2000);  //main�� 2�� sleep
		} catch (InterruptedException e) {}
		t1.interrupt();  //t1 �����忡 InterruptedException ���� �߻�. -> ���� ���� ���� ������ ���� �����ų �� ����.
	}
}
