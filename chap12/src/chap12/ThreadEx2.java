package chap12;
/*
 * Thread 객체 생성하기
 *   1. Thread 클래스를 상속받아 스레드 생성
 *   2. Runnable 인터페이스를 구현하여 스레드를 생성. Runnable 인터페이스를 구현한 클래스는 스레드 객체가 아니다.
 *      Runnable 안에는 run() 메서드 반드시 존재함. -> Runnable 인터페이스를 구현하면 run()메서드 오버라이딩 해줘야 함.
 *      클래스의 단일 상속이라는 단점을 보완하기 위해 존재하는 방법.
 *      스레드 객체를 따로 만들어줘야 하는 것 말고는 같다고 보면 됨.
 */
class Runnable1 implements Runnable {  //Thread 클래스의 객체 아님.
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i + "=" + Thread.currentThread().getName());
			//Thread.currentThread() : 현재 실행 중인(Running 상태인) 스레드 리턴.
			try {
				Thread.sleep(1000);  //스레드에 있는 메서드이기 때문에 스레드 클래스의 객체가 아니면 반드시 Thread. 붙여줘야 함.
			}catch (InterruptedException e) {}
		}
	}
}
public class ThreadEx2 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작");
		Runnable r = new Runnable1();  //스레드 객체가 아님, 단순 매개변수.  Runnable1은 Runnable을 구현한 클래스 이므로 Runnable 타입으로 만들어도 됨.(Runnable을 가지고 있음.)
		Thread t1 = new Thread(r, "First");  //스레드 객체를 따로 만들어 줘야 함. Thread(매개변수, 이름)
		Thread t2 = new Thread(r, "Second");
		/*
		 * new Thread(r, "First")
		 *   Thread 객체를 생성. running을 수행하는 run()메서드는 참조변수 r의 run() 메서드를 수행.
		 *   생성된 Thread의 이름은 First임.
		 */
		t1.start(); t2.start();  //멀티환경 조성.
//		t1.run(); t2.run();  //r 객체의 run() 메서드 호출. 각각의 메서드가 섞이지 않음.
		System.out.println("main 스레드 종료");
	}
}
