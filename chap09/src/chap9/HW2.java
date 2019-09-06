package chap9;
/*
 * 2. Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값 출력
 */
class Outer {
	class Inner {
		int iv=100;
	}
}
public class HW2 {
	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();
		System.out.println(oi.iv);
	}
}