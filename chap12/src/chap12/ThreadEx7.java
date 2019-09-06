package chap12;
/*
 * join() : �����尡 ������ ������ ���.
 */
class JoinThread extends Thread {
	int sum=0;
	@Override
	public void run() {
		for(int i=0; i<=100; i++) {
			sum += i;
		}
		System.out.println();
	}
}
public class ThreadEx7 {
	public static void main(String[] args) {
		System.out.println("�����带 �̿��Ͽ� 100������ �� ���ϱ�");
		JoinThread t1 = new JoinThread();
		t1.start();  //����ȯ�� ���� �� t1.run() ȣ���ϰ� main�� �״�� �귯����.
		try {
			t1.join();  //t1 �����尡 ������ ������(t1 Dead ���� �� ������) t1�����尡 �ƴ� main�� ���. ���� t2�� �� �ִٸ� ������ ������ �� ����. ���� ���� ����� �����尡 ������ ��ٷ��ٻ���.
		} catch(InterruptedException e) {}
		System.out.println("��� : " + t1.sum);  //t1.join() ���� �� ��� : 0  -> main�� t1.start() ȣ�� �ϰ�, t1�����带 ��ٷ����� �ʰ� ���� ����.
	}
}
