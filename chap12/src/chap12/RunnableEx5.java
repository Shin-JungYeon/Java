package chap12;
/*
 * ThreadEx5 예제를 Runnable 인터페이스를 구현한 형태로 바꿔줌.
 */
class PrintRunnable2 implements Runnable {
	char ch;
	PrintRunnable2(char ch) {
		this.ch = ch;
	}
	static Object Lock = new Object();
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			synchronized(Lock) {
				for(int j=0; j<80; j++) {
					System.out.print(ch);
				}
				System.out.println();
			}
		}
	}
}
public class RunnableEx5 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new PrintRunnable2('A'));
		Thread t2 = new Thread(new PrintRunnable2('B'));
		Thread t3 = new Thread(new PrintRunnable2('C'));
		t1.start(); t2.start(); t3.start();
	}
}
