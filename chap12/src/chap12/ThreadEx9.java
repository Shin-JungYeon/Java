package chap12;
/*
 * ���� ������ : �Ϲݽ������� ���� ������ �ϴ� ������
 *           �Ϲݽ����尡 ����Ǹ�, ���󽺷��嵵 �ڵ����� ����.
 */
class DeamonThread extends Thread {
	@Override
	public void run() {
		while(true) {  //���� �ݺ� -> ���α׷� �����غ��� ���ᰡ ��. ���󽺷���� �����Ʊ� ����.
			System.out.println(this);
			try {
				sleep(100);  //main�� ����ִ� 2�� ���� 0.01�ʿ� �� ���� println ����
			} catch (InterruptedException e) {}
		}
	}
}
public class ThreadEx9 {
	public static void main(String[] args) {
		Thread t1 = new DeamonThread();
		Thread t2 = new DeamonThread();
		t1.setDaemon(true);  //���󽺷���� ���� -> new ���¿���(start()����)�� ���� ����, Runnable ���°� �� �� �����Ϸ��� �ϸ� ���� �߻�.
		t2.setDaemon(true);  //���󽺷���� ����
		t1.start(); t2.start();
		try {
			Thread.sleep(2000);  //main������(�Ϲݽ�����)�� 2�� ��� �ִ� ���� ���� �Բ�.. ����Ǹ� ���� �Բ� ����.
		} catch (InterruptedException e) {}
		System.out.println("main �޼��� ����");
	}
}
