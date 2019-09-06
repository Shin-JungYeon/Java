package chap6;
/*
 * 생성자 예제
 *   생성자 : 객체 생성시 호출되는 메서드, 생성자 없는 객체 생성은 불가함.
 *          생성자의 이름은 클래스명과 같고, 리턴타입이 없다. void가 아니고 기술 자체를 하지 않음.
 *   기본 생성자 : 개발자가 생성자를 구현하지 않으면 컴파일러가 추가해주는 생성자.
 *             public 클래스명(){}
 */
class Number1 {   //기본생성자를 가진 클래스
	int num;
}
class Number2 {
	int num;
	Number2(int x) {   //클래스와 이름이 같고 리턴값이 없다 -> 생성자, 기본생성자(매개변수 없는 생성자)는 제공되지 않음
		num = x;
	}
}
public class ConstructorEx1 {
	public static void main(String[] args) {
		Number1 n1 = new Number1();
		/*
		 * new 연산자 기능
		 *   1. 힙영역에 메모리 할당
		 *   2. 기본값으로 멤버변수 초기화
		 *   3. 생성자( Numbwe1() ) 호출
		 */
		n1.num = 100;
		System.out.println("Number1.num = " + n1.num);
		Number2 n2 = new Number2(100);  //기본생성자가 아닌 생성자가 존재하기 때문에 매개변수 넣어줘야 함.
//		n2.num = 100;
		System.out.println("Number2.num = " + n2.num);
	}
}
