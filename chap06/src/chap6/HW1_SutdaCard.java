package chap6;
/*
 * 1. 1.SutdaCard 카드 구현하기
 *  변수 : int number, boolean isKwang 
 *  메서드 : String info()
 *  아래 구동클래스에 호출되는 생성자에 맞도록 생성자도 구현하기 
 *  
 *  구동 클래스의 실행 결과
 *  [결과]
 *   3
 *   1K
 */

class SutdaCard {
	boolean isKwang;
	int number;
	SutdaCard(int number, boolean isKwang) {   //생성자
		this.number = number;
		this.isKwang = isKwang;
	}
	SutdaCard() {   //생성자
		this(1, true);
	}
	String info() {
		return this.number + ((this.isKwang==true)?"K":"");
	}
}
public class HW1_SutdaCard {
	public static void main(String[] args) {
		  SutdaCard card1 = new SutdaCard(3,false);
		  SutdaCard card2 = new SutdaCard();

		  System.out.println(card1.info()); //3, 리턴값이 있어야 화면 출력이 가능(void 안 됨)
		  System.out.println(card2.info()); //1K
	}
}