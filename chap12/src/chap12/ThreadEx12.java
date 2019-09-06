package chap12;
/*
 * 생산자 스레드 : 데이터를 만들어 내는 기능
 * 소비자 스레드 : 생산자가 만들어 놓은 데이터를 사용하는 기능
 * 
 * 하나의 계좌를 엄마와 아들이 공유함.
 * 계좌에 금액이 0이 되면 아들은 wait 상태로 변경, 엄마가 입금하면 깨어나도록 프로그램 구현하기.
 * 계좌에 금액이 존재하면, 엄마는  wait 상태로 변경, 아들이 돈을 꺼낼 때까지
 * 단, 아들은 무조건 잔액을 0으로 만든다. 엄마는 10000 ~ 30000 까지 만 단위로 임의로 입금.
 *    둘은 실행 시 무작위로 sleep 한다.
 */
class Account {  //input은 mother, output은 son만 호출하기 때문에 이름표 붙이고 말고는 의미가 없음.
	int money;
	synchronized void output() {
		while(money == 0) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		notifyAll();  //자기가 살아나면 엄마 스레드 먼저 깨움.
		System.out.println(Thread.currentThread().getName() + " : " + money + "원 출금");
		money = 0;
	}
	synchronized void input() {
		while(money > 0) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		money = ((int)(Math.random()*3) + 1)*10000;
		notifyAll();
		System.out.println();
		System.out.println(Thread.currentThread().getName() + " : " + money + "원 입금");
	}
}
class Mother extends Thread {  //생산자 스레드
	Account account;
	Mother(Account account) {
		super("Mother");
		this.account = account;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			account.input();
			try {
				sleep((int)(Math.random()*3000));
			} catch (InterruptedException e) {}
		}
	}
}
class Son extends Thread {  //소비자 스레드
	Account account;
	Son(Account account) {
		super("Son");
		this.account = account;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			account.output();
			try {
				sleep((int)(Math.random()*300));
			} catch (InterruptedException e) {}
		}
	}
}
public class ThreadEx12 {
	public static void main(String[] args) {
		Account a = new Account();
		Thread mother = new Mother(a);
		Thread son = new Son(a);
		son.start(); mother.start();  //각각의 스레드에 있는 run 메서드 호출. 무조건 mother부터 실행
	}
}
