package chap6;
//클래스 : 사용자 정의 자료형
class Phone {  //변수명 메서드명 같아도 됨.
	String color;    //멤버 변수
	boolean power;   //멤버 변수
	String no;       //멤버 변수 : 내가 필요한 정보
	void power() {   //멤버 메서드 : 기능
		power = !power;
	}
	void send(String no) {   //멤버 메서드
		System.out.println(no + "로 전화 송신 중~");  //no -> 지역변수, 위의 멤버변수 no와는 다름.
	}
	void receive(String no) {   //멤버 메서드
		System.out.println(no + "에서 전화 수신 중~");
	}
	//멤버끼리는 바로 호출 가능(변수 메서드 상관 ㄴㄴ)
}

//구동 클래스(public class) : main 메서드를 가지고 있는 클래스, main 메서드가 프로그램 실행의 시작점
public class PhoneEx1 {
	public static void main(String[] args) {
		Phone p1 = new Phone();  //객체화(new), 인스턴스화. String만 대입연산자로 객체화 가능
//		Phone p1;   //참조변수의 선언,  main이라는 메서드 안에서 선언했기 때문에 지역변수
//		p1 = new Phone();  //객체화
		
		/*
		 * new 연산자 : 객체의 메모리 할당. 객체를 하나 만들어 줌. 힙영역에 객체 생성
		 *   1. 힙영역에 메모리 할당
		 *   2. 멤버들을 기본값으로 초기화 해줌.
		 *        참조변수 : null
		 *        boolean : false
		 *        숫자 : byte, short, int, long, float, double : 0
		 *        문자 : char : \u0000 (유니코드 0)   (String은 클래스형)
		 *   3. 생성자 호출
		 */
		p1.color = "검정";
		p1.power = true;
		p1.no = "01012345678";
		System.out.println(p1.color + ", " + p1.power + ", " + p1.no);
		p1.send("01012341234");
		p1.receive("01012341234");
		
		System.out.println();
		
		Phone p2 = new Phone();  //소괄호 있으면 메서드 없으면 변수
		p2 = p1;  //객체가 복사되는 것이 아님. 하나의 객체로 두 개의 참조변수가 참조하고 있는 것.
		System.out.println(p2.color + ", " + p2.power + ", " + p2.no);
	}
}