package chap12;
/*
 * Thread 객체 생성하기
 *   1. Thread 클래스를 상속받아 스레드 생성. 
 */
class Thread1 extends Thread {
	Thread1(String name) {
		super(name);
	}
	@Override   //Thread의 run()메서드는 아무 기능이 없음. 스레드가 수행해야할 기능을 구현.
	public void run() {		//3. Running 상태. run 메서드 실행 중인 상태
		for(int i=1; i<=5; i++) {
			System.out.println(i + "=" + getName());
			try {
				sleep(1000);  //1000밀리초(1초)동안 대기 상태
							  //4. 대기 상태(혹은 다른 기능 수행 가능) -> 대기 상태 종료 시 Runnable 상태로 돌아감. (경합상태, 누가 먼저 실행될 것인가 -> 이것을 관장하고있는 것이 스케줄러)
			} catch(InterruptedException e) {}
		}
	}//5. dead 상태. run 메서드 종료.
}
public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작");  //스레드 객체가 생성되고 멀티 환경이 조성되면 main도 하나의 스레드임.
		Thread1 t1 = new Thread1("First");		//1. new 상태 (스레드 객체 생성)
		Thread1 t2 = new Thread1("Second");		//1. new 상태
		t1.start(); t2.start();					//2. Runnable 상태. 실행 가능 상태. 경합을 벌인다. -> 누가 먼저 실행 될 것인가(스케줄러가 결정)
		/* 
		 * 스택영역을 양분함(병렬환경 조성). -> t1.run() 호출(나뉘어진 다른 영역이므로 main과는 상관없이 실행). main, t1.run(), t2.run() 다 따로 실행
		 * main은 t1.start() t2.start() 를 호출했으므로 할 일 끝. -> 가장 먼저 종료.
		 * 
		 * start() : 스레드의 시작 (병렬환경, 멀티환경 조성)
		 *   1. 스택영역을 병렬화 함.
		 *   2. 새로운 스택영역에 run()메서드 호출.
		 */
		t1.run();
		t2.run();  //스레드가 아님, 일반 메서드 호출처럼 실행 됨. start()에 의해 스택영역이 양분화 되어야만 멀티가 가능.
		System.out.println("main 스레드 종료");
	}
}
