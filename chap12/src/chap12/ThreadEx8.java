package chap12;
/*
 * InterruptedException 예외 발생하여 sleep 중인 스레드 깨우기.
 */
class InterruptedThread extends Thread {
	@Override
	public void run() {
		System.out.println("자고 있습니다. 깨우지 마세요.");
		try {
			sleep(1000000);
		} catch (InterruptedException e) {
			System.out.println("누가 깨웠니?");
		}
	}
}
public class ThreadEx8 {
	public static void main(String[] args) {
		InterruptedThread t1 = new InterruptedThread();
		t1.start();
		try {
			Thread.sleep(2000);  //main이 2초 sleep
		} catch (InterruptedException e) {}
		t1.interrupt();  //t1 스레드에 InterruptedException 예외 발생. -> 현재 실행 중인 스레드 강제 종료시킬 수 있음.
	}
}
