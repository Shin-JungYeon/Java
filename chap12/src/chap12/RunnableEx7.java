package chap12;
/*
 * ThreadEx7 ������ Runnable �������̽��� ������ ���·� �ٲ���.
 */
class JoinRunnable implements Runnable {
	int sum=0;
	@Override
	public void run() {
		for(int i=0; i<=100; i++) {
			sum += i;
		}
		System.out.println();
	}
}
public class RunnableEx7 {
	public static void main(String[] args) {
		System.out.println("�����带 �̿��Ͽ� 100������ �� ���ϱ�");
		JoinRunnable join = new JoinRunnable();
		Thread t1 = new Thread(join);
		t1.start();
		try {
			t1.join();
		} catch(InterruptedException e) {}
		System.out.println("��� : " + join.sum);
	}
}
