package chap12;
/*
 * Thread ��ü �����ϱ�
 *   1. Thread Ŭ������ ��ӹ޾� ������ ����. 
 */
class Thread1 extends Thread {
	Thread1(String name) {
		super(name);
	}
	@Override   //Thread�� run()�޼���� �ƹ� ����� ����. �����尡 �����ؾ��� ����� ����.
	public void run() {		//3. Running ����. run �޼��� ���� ���� ����
		for(int i=1; i<=5; i++) {
			System.out.println(i + "=" + getName());
			try {
				sleep(1000);  //1000�и���(1��)���� ��� ����
							  //4. ��� ����(Ȥ�� �ٸ� ��� ���� ����) -> ��� ���� ���� �� Runnable ���·� ���ư�. (���ջ���, ���� ���� ����� ���ΰ� -> �̰��� �����ϰ��ִ� ���� �����ٷ�)
			} catch(InterruptedException e) {}
		}
	}//5. dead ����. run �޼��� ����.
}
public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("main ������ ����");  //������ ��ü�� �����ǰ� ��Ƽ ȯ���� �����Ǹ� main�� �ϳ��� ��������.
		Thread1 t1 = new Thread1("First");		//1. new ���� (������ ��ü ����)
		Thread1 t2 = new Thread1("Second");		//1. new ����
		t1.start(); t2.start();					//2. Runnable ����. ���� ���� ����. ������ ���δ�. -> ���� ���� ���� �� ���ΰ�(�����ٷ��� ����)
		/* 
		 * ���ÿ����� �����(����ȯ�� ����). -> t1.run() ȣ��(�������� �ٸ� �����̹Ƿ� main���� ������� ����). main, t1.run(), t2.run() �� ���� ����
		 * main�� t1.start() t2.start() �� ȣ�������Ƿ� �� �� ��. -> ���� ���� ����.
		 * 
		 * start() : �������� ���� (����ȯ��, ��Ƽȯ�� ����)
		 *   1. ���ÿ����� ����ȭ ��.
		 *   2. ���ο� ���ÿ����� run()�޼��� ȣ��.
		 */
		t1.run();
		t2.run();  //�����尡 �ƴ�, �Ϲ� �޼��� ȣ��ó�� ���� ��. start()�� ���� ���ÿ����� ���ȭ �Ǿ�߸� ��Ƽ�� ����.
		System.out.println("main ������ ����");
	}
}
