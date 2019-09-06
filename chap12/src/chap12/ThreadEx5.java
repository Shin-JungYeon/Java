package chap12;
/*
 * 동기화 예제 : synchronized 예약어를 사용함.
 *   1. 동기화 블럭 이용
 */
class PrintThread2 extends Thread {
	char ch;
	PrintThread2(char ch) {
		this.ch = ch;
	}
	/*
	 * Lock 객체는 모든 스레드가 공유하는 객체여야 한다.(static) -> 각자만의 Lock을 가지고 있으면 동기화는 되고 있지만 각각 되기때문에 효과가 없음.
	 * Lock 객체는 반드시 객체(Object객체)여야 한다. 기본자료형(int, char, ...)의 변수는 Lock 객체로 사용할 수 없다.
	 */
//	static Object Lock = new Object();  //static 없으면 동기화 안됨.(사실 동기화 되고 있지만 의미가 없음. -> 각각의 객체가 Lock을 갖게 됨. 각자 자신에 있는 Lock에 이름표 붙이는거니까 동기화의 의미가 없음.)
//	static Integer Lock = 100;  //Integer는 Object의 하위 객체이므로 가능.
	static String Lock = "";  //String, 배열, ... Object의 하위 객체이면 됨. this도 가능(단, 그 this가 유일해야함. 현재 예제에서는 this가 세 개여서 안됨.) 참조변수명도 상관 없음. final도 상관 없음. 유일하기만 하면 됨!
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			synchronized(Lock) {  //임계영역. 동기화 영역(동기화 블럭 방식), 동기화 영역 시작 -> 현재 Running 객체로 lock 걸림.
			//t1(or t2 or t3)이 Running 상태이면 Lock 객체에 t1(or t2 or t3) 이름표 붙여. -> 80칸 다 찍기 전엔 풀리지 않음. 다른 객체가 오면 대기상태로 보내버림.
				for(int j=0; j<80; j++) {
					System.out.print(ch);
				}
				System.out.println();
			}  //동기화 영역 끝 -> lock 풀림. -> 다른 객체의 대기가 풀리고, Runnable상태가 됨(Running 상태가 될 수 있음).
		}
	}
}
public class ThreadEx5 {
	public static void main(String[] args) {
		PrintThread2 t1 = new PrintThread2('A');
		PrintThread2 t2 = new PrintThread2('B');
		PrintThread2 t3 = new PrintThread2('C');
		t1.start(); t2.start(); t3.start();
	}
}
