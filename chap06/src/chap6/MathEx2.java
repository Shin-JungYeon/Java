package chap6;
/*
 * 클래스 메서드 : 메서드의 선언부에서 static 예약어가 기술 됨.
 *             클래스 정보가 로드될 때 바로 메서드의 호출이 가능함.
 *             클래스명.메서드명(...) 호출 가능.
 * 인스턴스 메서드 : 메서드의 선언부에서 static 예약어가 없음.
 *              객체화가 되여야 메서드의 호출이 가능함.
 *              참조변수명.메서드명(...) 호출 가능
 */
class Math2 {
	long a, b;
	static int c;
	long add1() {
		System.out.println(c);
		return a + b;
	}
	static long add2(int a, int b) {
		return a + b;
	}
}
public class MathEx2 {
	public static void main(String[] args) {
//		Math2.add2(10, 30);  //객체화 필요 없이 사용 가능.
//		Math2.add1(10, 30);  //객체화를 한 후 호출 가능.
		Math2 m = new Math2();
		m.a = 10;
		m.b = 20;
		System.out.println(m.add1());
		System.out.println(Math2.add2(10, 30));
	}
}
