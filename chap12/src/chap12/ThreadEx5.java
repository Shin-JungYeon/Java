package chap12;
/*
 * ����ȭ ���� : synchronized ���� �����.
 *   1. ����ȭ �� �̿�
 */
class PrintThread2 extends Thread {
	char ch;
	PrintThread2(char ch) {
		this.ch = ch;
	}
	/*
	 * Lock ��ü�� ��� �����尡 �����ϴ� ��ü���� �Ѵ�.(static) -> ���ڸ��� Lock�� ������ ������ ����ȭ�� �ǰ� ������ ���� �Ǳ⶧���� ȿ���� ����.
	 * Lock ��ü�� �ݵ�� ��ü(Object��ü)���� �Ѵ�. �⺻�ڷ���(int, char, ...)�� ������ Lock ��ü�� ����� �� ����.
	 */
//	static Object Lock = new Object();  //static ������ ����ȭ �ȵ�.(��� ����ȭ �ǰ� ������ �ǹ̰� ����. -> ������ ��ü�� Lock�� ���� ��. ���� �ڽſ� �ִ� Lock�� �̸�ǥ ���̴°Ŵϱ� ����ȭ�� �ǹ̰� ����.)
//	static Integer Lock = 100;  //Integer�� Object�� ���� ��ü�̹Ƿ� ����.
	static String Lock = "";  //String, �迭, ... Object�� ���� ��ü�̸� ��. this�� ����(��, �� this�� �����ؾ���. ���� ���������� this�� �� ������ �ȵ�.) ���������� ��� ����. final�� ��� ����. �����ϱ⸸ �ϸ� ��!
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			synchronized(Lock) {  //�Ӱ迵��. ����ȭ ����(����ȭ �� ���), ����ȭ ���� ���� -> ���� Running ��ü�� lock �ɸ�.
			//t1(or t2 or t3)�� Running �����̸� Lock ��ü�� t1(or t2 or t3) �̸�ǥ �ٿ�. -> 80ĭ �� ��� ���� Ǯ���� ����. �ٸ� ��ü�� ���� �����·� ��������.
				for(int j=0; j<80; j++) {
					System.out.print(ch);
				}
				System.out.println();
			}  //����ȭ ���� �� -> lock Ǯ��. -> �ٸ� ��ü�� ��Ⱑ Ǯ����, Runnable���°� ��(Running ���°� �� �� ����).
		}
	}
}
public class ThreadEx5 {
	public static void main(String[] args) {
		PrintThread2 t1 = new PrintThread2('A');
		PrintThread2 t2 = new PrintThread2('B');
		PrintThread2 t3 = new PrintThread2('C');
		t1.start(); t2.start(); t3.start();
	}
}
