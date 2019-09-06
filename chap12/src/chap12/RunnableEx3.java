package chap12;
/*
 * ThreadEx3 ������ Runnable �������̽��� ������ ���·� �ٲ���.
 */
class RunnablePriority implements Runnable {
	
	@Override
	public void run() {  //Runnable �������̽��� �߻�޼��� run()�� �ֱ� ������ �ݵ�� �������̵� �ʿ�.
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {}
		for(int i=0; i<50; i++) {
			System.out.println(Thread.currentThread());  //this ���� �� ����. ���⿡�� this�� RunnablePriority ��ü��.
		}	
	}
}
public class RunnableEx3 {
	public static void main(String[] args) {
		RunnablePriority r = new RunnablePriority();
		Thread t1 = new Thread(r, "First");  //Runnable�� ������ Ŭ������ �����尡 �ƴϱ� ������ ������ ��ü�� �������� �� ���� Ŭ������ ��ü�� �־��༭ �� Ŭ������ ���� �޼��带 �������� �ϱ� ����.
		Thread t2 = new Thread(r, "Second");
		Thread t3 = new Thread(r, "Third");
		t1.setPriority(1);  //Thread�� �����ϴ� �޼����̹Ƿ� ���� ����� ��.
		t2.setPriority(5);
		t3.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
	}
}
