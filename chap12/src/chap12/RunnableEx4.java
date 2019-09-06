package chap12;
/*
 * ThreadEx4 ������ Runnable �������̽��� ������ ���·� �ٲ���.
 */
class PrintRunnable implements Runnable {
	char ch;
	PrintRunnable(char ch) {
		this.ch = ch;
	}
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			for(int j=0; j<80; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
public class RunnableEx4 {
	public static void main(String[] args) {
//		PrintRunnable r1 = new PrintRunnable('A');
//		Thread t1 = new Thread(r1);  //������ �̷� ���������� �Ʒ�ó�� �� �ٿ� �ڵ��� �� ���� ���. ���� PrintRunnable���� �ִ� ����� �����;� �� �� �ϳ��ϳ� ��ü ���� �ʿ�.
		Thread t1 = new Thread(new PrintRunnable('A'));
		Thread t2 = new Thread(new PrintRunnable('B'));
		Thread t3 = new Thread(new PrintRunnable('C'));
		t1.start(); t2.start(); t3.start();
	}
}
