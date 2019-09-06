package chap12;
/*
 * ThreadEx4 예제를 Runnable 인터페이스를 구현한 형태로 바꿔줌.
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
//		Thread t1 = new Thread(r1);  //원래는 이런 형태이지만 아래처럼 한 줄에 코딩을 더 많이 사용. 만일 PrintRunnable에만 있는 멤버를 가져와야 할 땐 하나하나 객체 생성 필요.
		Thread t1 = new Thread(new PrintRunnable('A'));
		Thread t2 = new Thread(new PrintRunnable('B'));
		Thread t3 = new Thread(new PrintRunnable('C'));
		t1.start(); t2.start(); t3.start();
	}
}
