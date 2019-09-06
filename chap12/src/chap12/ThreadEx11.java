package chap12;
/*
 * ThreadEx10 예제에 wait(), notify(), notifyAll() 추가.
 *   1. 동기화 영역(동기화 블럭, 동기화 메서드)에서만 호출이 가능함. -> 그 외의 영역에서 호출하려고 하면 예외 발생.
 *   2. Thread가 아닌 Object 클래스의 멤버임. -> 모든 객체는 이 세 가지 메서드를 호출할 수 있다. (동기화 외 영역에서는 예외가 발생할 뿐.)
 *   3. wait() : 현재 실행 중인 스레드(동기화 영역에서 lock을 가지고 있던 스레드)를 대기상태로 변환. lock을 해제함.
 *      notify() : wait() 상태인 스레드 한 개를 Runnable 상태로 변환함. 단, 스레드 지정은 불가.
 *      notifyAll() : wait() 상태인 모든 스레드를 Runnable 상태로 변환함.
 */
class ATM2 implements Runnable {
	private int money = 100000;
	@Override
	public void run() {
		try {
			Thread.sleep((int)(Math.random()*1000));  //대기시간을 랜덤하게 줘서 누가 먼저 시잘할 지 모르게 해줌.
		} catch (InterruptedException e) {}
		synchronized (this) {  //mother, son이 atm이라는 하나의 객체를 공유하고 있기 때문에 가능.
			while(true) {
				if(money <= 0) {
					notifyAll();  //현재 객체가 스레드 객체가 아님에도 불구하고 사용 가능. -> Object의 멤버이기 때문.
					break;
				}
				withdraw();
				if(money%20000 == 0) {
					try {
						wait();  //현재 실행 중인 스레드가 대기상태로 들어가면서 lock에 붙여놓은 이름표 뗌.  현재 객체가 스레드 객체가 아님에도 불구하고 사용 가능. -> Object의 멤버이기 때문.
					} catch(InterruptedException e) {}
				} else {
					notifyAll();  //처음엔 notify 할 게 없음. 그 다음부턴 대기풀에 들어갔던 스레드를 꺼내서 Runnable 상태로 만들어줌.(하지만 현재 실행중인 스레드가 lock에 걸려있어 메서드에는  접근 못함.)
				}
			}
		}
	}
	private void withdraw() {
		if(money <= 0) return;
		money -= 10000;
		System.out.println(Thread.currentThread().getName() + " 출금, 잔액 : " + money);
	}
}
public class ThreadEx11 {
	public static void main(String[] args) {
		ATM2 atm = new ATM2();
		Thread mother = new Thread(atm, "MOTHER");
		Thread son = new Thread(atm, "SON");
		mother.start(); son.start();
	}
}