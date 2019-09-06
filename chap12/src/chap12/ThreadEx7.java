package chap12;
/*
 * join() : 스레드가 종료할 때까지 대기.
 */
class JoinThread extends Thread {
	int sum=0;
	@Override
	public void run() {
		for(int i=0; i<=100; i++) {
			sum += i;
		}
		System.out.println();
	}
}
public class ThreadEx7 {
	public static void main(String[] args) {
		System.out.println("스레드를 이용하여 100까지의 합 구하기");
		JoinThread t1 = new JoinThread();
		t1.start();  //병렬환경 조성 후 t1.run() 호출하고 main은 그대로 흘러버림.
		try {
			t1.join();  //t1 스레드가 종료할 때까지(t1 Dead 상태 될 때까지) t1스레드가 아닌 main이 대기. 만약 t2가 더 있다면 순서는 정해줄 수 없음. 단지 먼저 실행된 스레드가 끝나길 기다려줄뿐임.
		} catch(InterruptedException e) {}
		System.out.println("결과 : " + t1.sum);  //t1.join() 없을 때 결과 : 0  -> main은 t1.start() 호출 하고, t1스레드를 기다려주지 않고 먼저 종료.
	}
}
