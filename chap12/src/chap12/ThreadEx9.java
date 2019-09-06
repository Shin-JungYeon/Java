package chap12;
/*
 * 데몬 스레드 : 일반스레드의 보조 역할을 하는 스레드
 *           일반스레드가 종료되면, 데몬스레드도 자동으로 종료.
 */
class DeamonThread extends Thread {
	@Override
	public void run() {
		while(true) {  //무한 반복 -> 프로그램 실행해보면 종료가 됨. 데몬스레드로 설정됐기 때문.
			System.out.println(this);
			try {
				sleep(100);  //main이 살아있는 2초 동안 0.01초에 한 번씩 println 실행
			} catch (InterruptedException e) {}
		}
	}
}
public class ThreadEx9 {
	public static void main(String[] args) {
		Thread t1 = new DeamonThread();
		Thread t2 = new DeamonThread();
		t1.setDaemon(true);  //데몬스레드로 설정 -> new 상태에서(start()전에)만 설정 가능, Runnable 상태가 된 후 설정하려고 하면 에러 발생.
		t2.setDaemon(true);  //데몬스레드로 설정
		t1.start(); t2.start();
		try {
			Thread.sleep(2000);  //main스레드(일반스레드)가 2초 살아 있는 동안 데몬도 함께.. 종료되면 데몬도 함께 종료.
		} catch (InterruptedException e) {}
		System.out.println("main 메서드 종료");
	}
}
