package chap9;
/*
 * 2. OuterŬ������ ���� Ŭ���� Inner�� ������� iv�� �� ���
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