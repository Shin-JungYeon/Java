package chap12;
/*
 * Thread �켱���� : �����ٷ����� ���� ������ ���� �� �ֵ��� ������ �����ϴ�.
 *                �� �켱������ ���ٰ� ������ ���� ������ ���� �� �ִ� ���� �ƴϴ�. Ȯ���� ������ ��.
 *                
 * garbage collector�� ��������.(�켱���� 2) ���� �����尡 ������ ��ü�� �������� ����. �ٸ� �����忡�� this�� �����ϰ� �ֱ� ����.
 */
class ThreadPriority extends Thread {
	ThreadPriority(String name) {
		this(name, Thread.NORM_PRIORITY);
	}
	ThreadPriority(String name, int p) {
		super(name);
		this.setPriority(p);  //�켱���� ����. 1 ~ 10, ���ڰ� ���� ���� �켱���� ����.
	}
	@Override
	public void run() {
		try {
			sleep(20);  //0.02��
		} catch (InterruptedException e) {}
		for(int i=0; i<50; i++) {
			System.out.println(this.toString());  //(�޼��� �����Ǿ������� toString) (�������̵� ���� �ʾұ� ������) Thread�� �ִ� toString() �޼��� ȣ��.
			/*
			 * Thread�� toString()�޼��� :
			 * Thread[First,1,main]
			 *   First	: ������ �̸�. 
			 *   1		: �켱���� ��.
			 *   main	: ������ �׷� �̸�.
			 */
		}
		
	}
}
public class ThreadEx3 {
	public static void main(String[] args) {
		System.out.println("���� �켱���� : " + Thread.MAX_PRIORITY);
		System.out.println("�⺻ �켱���� : " + Thread.NORM_PRIORITY);
		System.out.println("���� �켱���� : " + Thread.MIN_PRIORITY);
		Thread t1 = new ThreadPriority("First", 1);
		Thread t2 = new ThreadPriority("Second");
		Thread t3 = new ThreadPriority("Third", 10);
		t1.start();
//		try {
//			t1.sleep(500);  //t1�� �ƴ϶� main�� ���, ��ü�ʹ� ������� �޼���, �� �޼��尡 ���� �Ǿ� �ִ� �����尡 ����ϴ� ��.
//		} catch(InterruptedException e) {}
		t2.start(); t3.start();
	}
}
