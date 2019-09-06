package chap6;
/*
 * 메서드 예제
 * 메서드의 구성 (접근제어자는 옵션사항)
 * [접근제어자] 리턴타입 메서드명(매개변수목록)  <= 선언부
 * {
 *      ...                         <= 구현부
 * }
 * 
 * 리턴타입 : 메서드 종료 시 전달되는 값의 자료형을 지정, void인 경우는 '전달할 값이 없다'라는 의미
 * 매개변수목록 : 메서드를 호출 시 전달되는 값의 자료형과 변수명을 지정, 반드시 지정해준대로 값을 넣어줘야 함
 *            매개변수는 해당 메서드의 지역변수로 처리됨, 해당 메서드 내에서만 사용이 가능한 변수, 메서드 호출할 때 전달되는 값이 초기화 값
 * return 구문 : 메서드의 구현부에서 작성됨, 해당 메서드를 종료
 *              리턴타입이 void인 경우는 생략 가능, 그 외의 경우에는 반드시   return 값;  작성해줘야 함.
 *              값의 자료형이 리턴타입과 같거나, 리턴타입으로 자동형변환 되는 경우여야 함.
 */
class Math1{
	int add1(int a, int b) {   //인스턴스 메서드
		return a + b;
	}
	long add2(int a, int b) {
		return a + b;
	}
	double add3(int a, int b) {
		return a + b;
	}
	//리턴값과 리턴타입이 같아야 하지만 자동형변환이 되는 경우는 가능함. 그 외는 명시적형변환 해줘야 함.
}
public class MathEx1 {
	public static void main(String[] args) {   //클래스 메서드
		Math1 m = new Math1();
		System.out.println(m.add1(10, 20));
		System.out.println(m.add2(10, 20));
		System.out.println(m.add3(10, 20));
	}
}
