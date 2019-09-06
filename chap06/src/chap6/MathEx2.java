package chap6;
/*
 * Ŭ���� �޼��� : �޼����� ����ο��� static ���� ��� ��.
 *             Ŭ���� ������ �ε�� �� �ٷ� �޼����� ȣ���� ������.
 *             Ŭ������.�޼����(...) ȣ�� ����.
 * �ν��Ͻ� �޼��� : �޼����� ����ο��� static ���� ����.
 *              ��üȭ�� �ǿ��� �޼����� ȣ���� ������.
 *              ����������.�޼����(...) ȣ�� ����
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
//		Math2.add2(10, 30);  //��üȭ �ʿ� ���� ��� ����.
//		Math2.add1(10, 30);  //��üȭ�� �� �� ȣ�� ����.
		Math2 m = new Math2();
		m.a = 10;
		m.b = 20;
		System.out.println(m.add1());
		System.out.println(Math2.add2(10, 30));
	}
}
