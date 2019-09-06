package chap7;
/*
 * �߻�Ŭ���� ���� ��ӵ� �����ϴ�.
 */
abstract class Abs1 {  //�̿ϼ� Ŭ����. �� Ŭ������ ��ü ���� �Ұ�.
	int a=10;
	int getA() {
		// TODO Auto-generated method stub
		return 0;
	}  //�޼��尡 �ϼ� ���� ����, ��üȭ ���� �ʴ´�.
}
abstract class Abs2 extends Abs1 {
	int b = 20;
	@Override
	int getA() {
		return 0;
	}
	//�߻�Ŭ���������� �θ�Ŭ������ �޼��� �������̵� ����(���� ���ص� ��). �ϰ� �Ǹ� �ڼ�Ŭ���������� �������̵� �ʿ� ����.
	abstract int getB();
}
class Normal extends Abs2 {
	int c = 30;
//	@Override
//	int getA() {  //�θ�Ŭ�������� �������̵� �߱⶧���� ���⼭�� �� �ʿ� ����.
//		return a;
//	}
	@Override
	int getB() {
		return b;
	}
	int getC() {
		return c;
	}
}

public class AbstractEx1 {
	public static void main(String[] args) {
		Normal n = new Normal();
		System.out.println(n.a + " -> " + n.getA());
		System.out.println(n.b + " -> " + n.getB());
		System.out.println(n.c + " -> " + n.getC());
		
		Abs2 a2 = n;
		System.out.println(a2.a + " -> " + a2.getA());
		System.out.println(a2.b + " -> " + a2.getB());
//		System.out.println(a2.c + " -> " + a2.getC());  //c, getC() ����� NormalŬ������ ���, Abs2�� �ڷ������δ� ������ �� ����.
		
		Abs1 a1 = a2;
		System.out.println(a1.a + " -> " + a1.getA());
//		System.out.println(a1.b + " -> " + a1.getB());
//		System.out.println(a1.c + " -> " + a1.getC());  //B, getB() ����� Abs2�� NormalŬ������ ���, Abs1�� �ڷ������δ� ������ �� ����.
		
		Object o = a1;
//		System.out.println(o.a + " -> " + o.getA());
//		System.out.println(o.b + " -> " + o.getB());
//		System.out.println(o.c + " -> " + o.getC());  //Object Ÿ���� ���������δ� a, b, c, getA, getB, getC ����� ������ �� ����.
	}
}
