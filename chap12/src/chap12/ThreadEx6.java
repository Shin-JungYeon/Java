package chap12;
/*
 * ����ȭ ���� : synchronized ���� �����.
 *   1. ����ȭ �� �̿�
 *   2. ����ȭ �޼��� �̿�
 *   
 * ����ȭ �޼��� ���� ���� ��ü�� �����ؾ� �Ѵ�. 
 */
class PrintThread3 extends Thread {
	Printer ptr;  //���� ��ü -> ����ȭ �� ��Ŀ��� Lock���� ��� ����.
	char ch;
	PrintThread3(char ch, Printer ptr) {
		this.ch = ch;
		this.ptr = ptr;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			ptr.printChar(ch);  //���� Running ������ ������ ��ü�� Printer Ŭ������ �ִ� ����ȭ �޼��� ȣ��
//			printChar(ch);
		}	
	}
//	public synchronized void printChar(char ch) {
//		for(int i=0; i<80; i++) {
//			System.out.print(ch);
//		}
//		System.out.println();
//	}  //���� Ŭ�������� �ڵ��� �� static ������ �޼��尡 �������� �ʰ�, ��ü���� �޼��� ȣ���ϱ� ������ ����ȭ�� �ǰ� ������ ȿ���� ����.
	   // ������ �ƿ� �ٸ� Ŭ�������� �ۼ��ϰų� static �پ���� ��.
}
class Printer {
	//t1(or t2 or t3)�̶�� �̸�ǥ�� ���̰� �޼��� ȣ��
	public synchronized void printChar(char ch) {  //����ȭ �޼���. 
		for(int i=0; i<80; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}  //�޼��� ���� �� ���� ���� ���̴� ��ü lock Ǯ����, �ٸ� ��ü�� ��⿡�� Runnable ���·� ���ư�.
}
public class ThreadEx6 {
	public static void main(String[] args) {
		Printer ptr = new Printer();
		PrintThread3 t1 = new PrintThread3('A', ptr);
		PrintThread3 t2 = new PrintThread3('B', ptr);
		PrintThread3 t3 = new PrintThread3('C', ptr);
		t1.start(); t2.start(); t3.start();
	}
}
