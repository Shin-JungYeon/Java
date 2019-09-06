package chap12;
/*
 * ThreadEx10 ������ wait(), notify(), notifyAll() �߰�.
 *   1. ����ȭ ����(����ȭ ��, ����ȭ �޼���)������ ȣ���� ������. -> �� ���� �������� ȣ���Ϸ��� �ϸ� ���� �߻�.
 *   2. Thread�� �ƴ� Object Ŭ������ �����. -> ��� ��ü�� �� �� ���� �޼��带 ȣ���� �� �ִ�. (����ȭ �� ���������� ���ܰ� �߻��� ��.)
 *   3. wait() : ���� ���� ���� ������(����ȭ �������� lock�� ������ �ִ� ������)�� �����·� ��ȯ. lock�� ������.
 *      notify() : wait() ������ ������ �� ���� Runnable ���·� ��ȯ��. ��, ������ ������ �Ұ�.
 *      notifyAll() : wait() ������ ��� �����带 Runnable ���·� ��ȯ��.
 */
class ATM2 implements Runnable {
	private int money = 100000;
	@Override
	public void run() {
		try {
			Thread.sleep((int)(Math.random()*1000));  //���ð��� �����ϰ� �༭ ���� ���� ������ �� �𸣰� ����.
		} catch (InterruptedException e) {}
		synchronized (this) {  //mother, son�� atm�̶�� �ϳ��� ��ü�� �����ϰ� �ֱ� ������ ����.
			while(true) {
				if(money <= 0) {
					notifyAll();  //���� ��ü�� ������ ��ü�� �ƴԿ��� �ұ��ϰ� ��� ����. -> Object�� ����̱� ����.
					break;
				}
				withdraw();
				if(money%20000 == 0) {
					try {
						wait();  //���� ���� ���� �����尡 �����·� ���鼭 lock�� �ٿ����� �̸�ǥ ��.  ���� ��ü�� ������ ��ü�� �ƴԿ��� �ұ��ϰ� ��� ����. -> Object�� ����̱� ����.
					} catch(InterruptedException e) {}
				} else {
					notifyAll();  //ó���� notify �� �� ����. �� �������� ���Ǯ�� ���� �����带 ������ Runnable ���·� �������.(������ ���� �������� �����尡 lock�� �ɷ��־� �޼��忡��  ���� ����.)
				}
			}
		}
	}
	private void withdraw() {
		if(money <= 0) return;
		money -= 10000;
		System.out.println(Thread.currentThread().getName() + " ���, �ܾ� : " + money);
	}
}
public class ThreadEx11 {
	public static void main(String[] args) {
		ATM2 atm = new ATM2();
		Thread mother = new Thread(atm, "MOTHER");
		Thread son = new Thread(atm, "SON");
		mother.start(); son.start();
	}
}