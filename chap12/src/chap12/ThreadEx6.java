package chap12;
/*
 * 동기화 예제 : synchronized 예약어를 사용함.
 *   1. 동기화 블럭 이용
 *   2. 동기화 메서드 이용
 *   
 * 동기화 메서드 사용시 공유 객체에 존재해야 한다. 
 */
class PrintThread3 extends Thread {
	Printer ptr;  //공유 객체 -> 동기화 블럭 방식에서 Lock으로 사용 가능.
	char ch;
	PrintThread3(char ch, Printer ptr) {
		this.ch = ch;
		this.ptr = ptr;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			ptr.printChar(ch);  //현재 Running 상태인 스레드 객체가 Printer 클래스에 있는 동기화 메서드 호출
//			printChar(ch);
		}	
	}
//	public synchronized void printChar(char ch) {
//		for(int i=0; i<80; i++) {
//			System.out.print(ch);
//		}
//		System.out.println();
//	}  //현재 클래스에서 코딩할 때 static 없으면 메서드가 유일하지 않고, 객체별로 메서드 호출하기 때문에 동기화는 되고 있지만 효과가 없음.
	   // 때문에 아예 다른 클래스에서 작성하거나 static 붙어줘야 함.
}
class Printer {
	//t1(or t2 or t3)이라는 이름표를 붙이고 메서드 호출
	public synchronized void printChar(char ch) {  //동기화 메서드. 
		for(int i=0; i<80; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}  //메서드 종료 후 현재 실행 중이던 객체 lock 풀리고, 다른 객체가 대기에서 Runnable 상태로 돌아감.
}
public class ThreadEx6 {
	public static void main(String[] args) {
		Printer ptr = new Printer();
		PrintThread3 t1 = new PrintThread3('A', ptr);
		PrintThread3 t2 = new PrintThread3('B', ptr);
		PrintThread3 t3 = new PrintThread3('C', ptr);
		t1.start(); t2.start(); t3.start();
	}
}
