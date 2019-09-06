package chap6;
/*
 * 메서드 오버 로딩 예제
 *   동일 클래스 내에 같은 이름의 메서드가 여러개 존재할 수 있음.
 *   단 매개변수 목록이 달라야 함. 입력되는 매개변수의 종류에 따라 호출되는 메서드가 달라지기 때문.
 *   1. 메서드 이름이 같다.
 *   2. 매개변수가 다르다. (매개변수 이름이 아니고 자료형이 달라야 한다. 개수, 순서 상관 없다.)
 *   3. 리턴타입이나, 접근제어자는 상관없다.
 */
class Math3 {
	int a = 10;
	public int add(int b) {
		System.out.print("1 : ");
		return a + b;
	}
	double add(double b) {
		System.out.print("2 : ");
		return a + b;
	}
	String add(String b) {
		System.out.print("3 : ");
		return a + b;
	}
}
public class OverLoadingEx1 {
	public static void main(String[] args) {
		Math3 m = new Math3();
		System.out.println(m.add(10));
		System.out.println(m.add(10.0));
		System.out.println(m.add("번"));
	}
}
