package chap6;
/*
 * 클래스 변수, 인스턴스 변수 : 클래스 내부에서 선언 됨, 자동으로 초기화됨(기본값으로)
 * 
 *   클래스 변수 : 선언 방법 : static 자료형 변수명;
 *             메모리 할당 위치 : 클래스 영역
 *             메모리 할당 시기 : 클래스 정보가 로드될 때(가장 먼저 메모리 할당)
 *             특징 : 객체화 필요 없음
 *                   모든 객체의 공통변수로 사용됨(하나의 객체에서 바꿔도 모든 객체의 값도 전부 바뀜, 한정적으로 사용될 수밖에 없음.)
 *             사용법 : 클래스명.변수명
 *             
 *   인스턴스 변수 : 선언 방법 : 자료형 변수명;
 *   (객체 변수)    메모리 할당 위치 : 힙 영역
 *               메모리 할당 시기 : 객체화될 때
 *               특징 : 반드시 객체화 필요(객체화가 되어야 메모리 할당 후 변수처럼 사용 가능)
 *                     객체별로 다른 메모리 영역을 가짐
 *               사용법 : 참조변수명.변수명
 */
class Card {
	String type;  //멤버변수 중 인스턴스변수, 객체화 될 때 변수가 된다. 그 전엔 자료형일뿐.
	int number;   //인스턴스 변수
	static int width = 150;
	static int height = 250;
	//static : 멤버변수 중  클래스변수, main 메서드보다 먼저 메모리 할당 받음. 객체화 되지 않고 바로 사용 가능. 다른 변수는 객체화 되어야 사용 가능.
	public String toString() {
		//toString() : 객체를 문자열화 하는 메서드, 참조변수이름을 출력하면 자동 호출되는 메서드.
		return type + " : " + number + " (" + width + ", " + height + ")";
	}
}
public class CardEx1 {
	public static void main(String[] args) {
		System.out.println("Card의 크기 : " + Card.width + ", " + Card.height);
//		System.out.println(Card.type + ":" + Card.number);  //인스턴스 변수는 객체화 되어야 사용가능
		
		Card c1 = new Card();
		c1.type = "Space";
		c1.number = 1;
		
		Card c2 = new Card();
		c2.type = "Clover";
		c2.number = 10;
		
		System.out.println(c1.toString());
		System.out.println(c2);
		//같은 결과, c2는 toString() 메서드를 자동으로 호출한 것.
		
		c1.width = 50;
		c1.height = 80;
		Card.width = 50;
		Card.height = 80;
		
		System.out.println(c1.toString());
		System.out.println(c2);
		//c1만 값을 변경했는데 c2도 함께 변경 됨, Card 클래스에 있는 static int 값이 변경된 것이기 때문.
		
		
		
	}
}