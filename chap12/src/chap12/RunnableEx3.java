package chap12;
/*
 * ThreadEx3 예제를 Runnable 인터페이스를 구현한 형태로 바꿔줌.
 */
class RunnablePriority implements Runnable {
	
	@Override
	public void run() {  //Runnable 인터페이스에 추상메서드 run()이 있기 때문에 반드시 오버라이딩 필요.
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {}
		for(int i=0; i<50; i++) {
			System.out.println(Thread.currentThread());  //this 넣을 수 없음. 여기에서 this는 RunnablePriority 객체임.
		}	
	}
}
public class RunnableEx3 {
	public static void main(String[] args) {
		RunnablePriority r = new RunnablePriority();
		Thread t1 = new Thread(r, "First");  //Runnable을 구현한 클래스는 스레드가 아니기 때문에 스레드 객체를 생성해준 후 위의 클래스의 객체를 넣어줘서 그 클래스가 가진 메서드를 가져오게 하기 위함.
		Thread t2 = new Thread(r, "Second");
		Thread t3 = new Thread(r, "Third");
		t1.setPriority(1);  //Thread에 존재하는 메서드이므로 따로 해줘야 함.
		t2.setPriority(5);
		t3.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
	}
}
