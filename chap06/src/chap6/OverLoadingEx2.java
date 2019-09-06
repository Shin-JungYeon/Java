package chap6;
/*
 * 오버로딩된 메서드의 선택 기준
 *   1. 호출 시 입력된 매개변수 값의 자료형과 선언된 매개변수의 자료형이 동일.
 *   2. 1의 기준이 없는 경우, 최소갯수로 자동형변환이 되는 매개변수를 가진 메서드를 선택.
 *       *주의*  동일한 선택 기준이 되는 경우 에러 발생 
 */
class Math4 {
	int add(int a, int b) {
		System.out.print("1 : ");
		return a + b;
	}
	long add(long a, int b) {
		System.out.print("2 : ");
		return a + b;
	}
	long add(int a, long b) {
		System.out.print("3 : ");
		return a + b;
	}
	long add(long a, long b) {
		System.out.print("4 : ");
		return a + b;
	}
}
public class OverLoadingEx2 {
	public static void main(String[] args) {
		Math4 m = new Math4();
		System.out.println(m.add(10, 10));
		System.out.println(m.add(10, 10L));
		System.out.println(m.add(10L, 10));
		System.out.println(m.add(10L, 10L));
	}
}
