package chap6;
/*
 * 초기화 블럭 예제
 *     static 초기화 블럭 : 클래스 변수의 초기화 담당
 *     인스턴스 초기화 블럭 : 인스턴스 변수의 초기화 담당. 생성자와 기능이 겹침(거의 안씀).
 *                      생성자보다 먼저 호출됨.
 * 
 * 클래스의 구조
 * -변수(상수)
 * -초기화 블럭
 * -생성자
 * -메서드
 */
public class InitEx1 {
	static int cv;   //클래스 변수
	int iv;          //인스턴스 변수
	InitEx1() {      //생성자
		System.out.println("5./8. 생성자 호출됨");
	}
	static {    //static(클래스) 초기화 블럭
		cv = (int)(Math.random()*100);
		System.out.println("1. static 초기화 블럭 실행 cv = " + cv);
	}
	{    //인스턴스 초기화 블럭
		System.out.println("4./7. 인스턴스 초기화 블럭 실행. 생성자보다 먼저 실행됨");
	}
	public static void main(String[] args) {
		System.out.println("2. main 메서드 시작");
		System.out.println("3. main 에서 init1 객체 생성함");
		InitEx1 init1 = new InitEx1();
		System.out.println("6. main 에서 init2 객체 생성함");
		InitEx1 init2 = new InitEx1();
	}
}