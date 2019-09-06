package chap7;
/*
 * final 제어자 예제
 * (abstract(꼭 다시 써서 변경해줘야 함)와 반대)
 * final class : 종단 클래스, 상속 불가 클래스
 *               다른 클래스의 부모클래스가 될 수 없다.
 * final method : 종단 메서드, 재정의(오버라이딩) 불가 메서드
 * final value : 상수, 변경 불가 변수
 *               인스턴스 변수일 경우 생성자에서 딱 한 번 변경(초기화) 가능. 단 명시적 초기화 되어있지 않아야 함.
 *               
 * final 제어자와 abstract 제어자는 함께 사용할 수 없다. 반대 의미를 가졌기 때문.
 */
//final class Parent4 {
class Parent4 {
//	final void method() {
	void method() {
		System.out.println("Parent4 클래스의 메서드");
	}
}
class Child4 extends Parent4 {
//	final int val = 100;  //자바에서는 const 예약어 사용하지 않음.
	int val = 100;
	void method() {
		System.out.println("Child4 클래스의 메서드");
		System.out.println(val += 10);
	}
}

public class FinalEx1 {
	public static void main(String[] args) {
		
	}
}
