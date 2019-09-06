package chap12;
class ATM implements Runnable {
	private int money = 100000;
	@Override
	public void run() {
		try {
			Thread.sleep((int)(Math.random()*1000));  //대기시간을 랜덤하게 줘서 누가 먼저 시잘할 지 모르게 해줌.
		} catch (InterruptedException e) {}
		synchronized (this) {  //mother, son이 atm이라는 하나의 객체를 공유하고 있기 때문에 가능.
		while(true) {
			if(money<=0) break;
			withdraw();
			}
		}
	}
	private void withdraw() {
		if(money <=0) return;
		money -=10000;
		System.out.println(Thread.currentThread().getName() + " 출금, 잔액 : " + money);
	}
}
public class ThreadEx10 {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mother = new Thread(atm, "MOTHER");
		Thread son = new Thread(atm, "SON");
		mother.start(); son.start();
	}
}
