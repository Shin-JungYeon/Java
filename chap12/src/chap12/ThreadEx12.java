package chap12;
/*
 * ������ ������ : �����͸� ����� ���� ���
 * �Һ��� ������ : �����ڰ� ����� ���� �����͸� ����ϴ� ���
 * 
 * �ϳ��� ���¸� ������ �Ƶ��� ������.
 * ���¿� �ݾ��� 0�� �Ǹ� �Ƶ��� wait ���·� ����, ������ �Ա��ϸ� ������� ���α׷� �����ϱ�.
 * ���¿� �ݾ��� �����ϸ�, ������  wait ���·� ����, �Ƶ��� ���� ���� ������
 * ��, �Ƶ��� ������ �ܾ��� 0���� �����. ������ 10000 ~ 30000 ���� �� ������ ���Ƿ� �Ա�.
 *    ���� ���� �� �������� sleep �Ѵ�.
 */
class Account {  //input�� mother, output�� son�� ȣ���ϱ� ������ �̸�ǥ ���̰� ����� �ǹ̰� ����.
	int money;
	synchronized void output() {
		while(money == 0) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		notifyAll();  //�ڱⰡ ��Ƴ��� ���� ������ ���� ����.
		System.out.println(Thread.currentThread().getName() + " : " + money + "�� ���");
		money = 0;
	}
	synchronized void input() {
		while(money > 0) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		money = ((int)(Math.random()*3) + 1)*10000;
		notifyAll();
		System.out.println();
		System.out.println(Thread.currentThread().getName() + " : " + money + "�� �Ա�");
	}
}
class Mother extends Thread {  //������ ������
	Account account;
	Mother(Account account) {
		super("Mother");
		this.account = account;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			account.input();
			try {
				sleep((int)(Math.random()*3000));
			} catch (InterruptedException e) {}
		}
	}
}
class Son extends Thread {  //�Һ��� ������
	Account account;
	Son(Account account) {
		super("Son");
		this.account = account;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			account.output();
			try {
				sleep((int)(Math.random()*300));
			} catch (InterruptedException e) {}
		}
	}
}
public class ThreadEx12 {
	public static void main(String[] args) {
		Account a = new Account();
		Thread mother = new Mother(a);
		Thread son = new Son(a);
		son.start(); mother.start();  //������ �����忡 �ִ� run �޼��� ȣ��. ������ mother���� ����
	}
}
