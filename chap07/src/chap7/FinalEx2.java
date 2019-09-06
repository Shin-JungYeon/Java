package chap7;
/*
 * final 변수는 생성자에서 딱 한 번 변경이 가능함.
 *   -> 객체별로 다른 상수값을 가질 수 있다.
 */
class Card {
	final String type;
	final int number; // = 0;  명시적 초기화
	Card() {
		this("Spade", 1);  //내 클래스 내의 다른 클래스 호출
	}
	Card(String type, int number) {
		this.type = type;
		this.number = number;
//		this.number = 100;  //인스턴스 변수일 때 딱 한 번만 값 변경 가능, 그 이후로는 안됨.
	}
}

public class FinalEx2 {
	public static void main(String[] args) {
		Card c1 = new Card();
		System.out.println(c1.type + ", " + c1.number);
		Card c2 = new Card("Clover", 1);
		System.out.println(c2.type + ", " + c2.number);
//		c2.number = 2;  //number는 상수이므로 변경 불가.
		Card c3 = new Card("Heart", 6);
		System.out.println(c3.type + ", " + c3.number);
	}
}