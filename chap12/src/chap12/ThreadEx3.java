package chap12;
/*
 * Thread 우선순위 : 스케줄러에게 빠른 선택을 받을 수 있도록 설정이 가능하다.
 *                단 우선순위가 높다고 무조건 먼저 선택을 받을 수 있는 것은 아니다. 확률이 높아질 뿐.
 *                
 * garbage collector도 스레드임.(우선순위 2) 메인 스레드가 끝나도 객체들 버려지지 않음. 다른 스레드에서 this로 참조하고 있기 때문.
 */
class ThreadPriority extends Thread {
	ThreadPriority(String name) {
		this(name, Thread.NORM_PRIORITY);
	}
	ThreadPriority(String name, int p) {
		super(name);
		this.setPriority(p);  //우선순위 설정. 1 ~ 10, 숫자가 높을 수록 우선순위 높음.
	}
	@Override
	public void run() {
		try {
			sleep(20);  //0.02초
		} catch (InterruptedException e) {}
		for(int i=0; i<50; i++) {
			System.out.println(this.toString());  //(메서드 생략되어있으면 toString) (오버라이딩 하지 않았기 때문에) Thread에 있는 toString() 메서드 호출.
			/*
			 * Thread의 toString()메서드 :
			 * Thread[First,1,main]
			 *   First	: 스레드 이름. 
			 *   1		: 우선순위 값.
			 *   main	: 스레드 그룹 이름.
			 */
		}
		
	}
}
public class ThreadEx3 {
	public static void main(String[] args) {
		System.out.println("높은 우선순위 : " + Thread.MAX_PRIORITY);
		System.out.println("기본 우선순위 : " + Thread.NORM_PRIORITY);
		System.out.println("낮은 우선순위 : " + Thread.MIN_PRIORITY);
		Thread t1 = new ThreadPriority("First", 1);
		Thread t2 = new ThreadPriority("Second");
		Thread t3 = new ThreadPriority("Third", 10);
		t1.start();
//		try {
//			t1.sleep(500);  //t1이 아니라 main이 대기, 객체와는 상관없는 메서드, 이 메서드가 포함 되어 있는 스레드가 대기하는 것.
//		} catch(InterruptedException e) {}
		t2.start(); t3.start();
	}
}
