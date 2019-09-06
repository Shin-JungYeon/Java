package chap12;
/*
 * ThreadEx6 예제를 Runnable 인터페이스를 구현한 형태로 바꿔줌.
 */
class PrintRunnable3 implements Runnable {
	Printer ptr;  //기존에 있는거 재사용.
	char ch;
	PrintRunnable3(char ch, Printer ptr) {
		this.ch = ch;
		this.ptr = ptr;
	}
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			ptr.printChar(ch);
		}
	}
}
public class RunnableEx6 {
	public static void main(String[] args) {
		Printer ptr = new Printer();
		Thread t1 = new Thread(new PrintRunnable3('A', ptr));
		Thread t2 = new Thread(new PrintRunnable3('B', ptr));
		Thread t3 = new Thread(new PrintRunnable3('C', ptr));
		t1.start(); t2.start(); t3.start();
	}
}
