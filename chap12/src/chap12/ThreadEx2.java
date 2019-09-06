package chap12;
/*
 * Thread ��ü �����ϱ�
 *   1. Thread Ŭ������ ��ӹ޾� ������ ����
 *   2. Runnable �������̽��� �����Ͽ� �����带 ����. Runnable �������̽��� ������ Ŭ������ ������ ��ü�� �ƴϴ�.
 *      Runnable �ȿ��� run() �޼��� �ݵ�� ������. -> Runnable �������̽��� �����ϸ� run()�޼��� �������̵� ����� ��.
 *      Ŭ������ ���� ����̶�� ������ �����ϱ� ���� �����ϴ� ���.
 *      ������ ��ü�� ���� �������� �ϴ� �� ����� ���ٰ� ���� ��.
 */
class Runnable1 implements Runnable {  //Thread Ŭ������ ��ü �ƴ�.
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i + "=" + Thread.currentThread().getName());
			//Thread.currentThread() : ���� ���� ����(Running ������) ������ ����.
			try {
				Thread.sleep(1000);  //�����忡 �ִ� �޼����̱� ������ ������ Ŭ������ ��ü�� �ƴϸ� �ݵ�� Thread. �ٿ���� ��.
			}catch (InterruptedException e) {}
		}
	}
}
public class ThreadEx2 {
	public static void main(String[] args) {
		System.out.println("main ������ ����");
		Runnable r = new Runnable1();  //������ ��ü�� �ƴ�, �ܼ� �Ű�����.  Runnable1�� Runnable�� ������ Ŭ���� �̹Ƿ� Runnable Ÿ������ ���� ��.(Runnable�� ������ ����.)
		Thread t1 = new Thread(r, "First");  //������ ��ü�� ���� ����� ��� ��. Thread(�Ű�����, �̸�)
		Thread t2 = new Thread(r, "Second");
		/*
		 * new Thread(r, "First")
		 *   Thread ��ü�� ����. running�� �����ϴ� run()�޼���� �������� r�� run() �޼��带 ����.
		 *   ������ Thread�� �̸��� First��.
		 */
		t1.start(); t2.start();  //��Ƽȯ�� ����.
//		t1.run(); t2.run();  //r ��ü�� run() �޼��� ȣ��. ������ �޼��尡 ������ ����.
		System.out.println("main ������ ����");
	}
}
