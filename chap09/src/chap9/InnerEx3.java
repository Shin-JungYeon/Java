package chap9;
/*
 * ����Ŭ������ �ܺ�Ŭ������ ����̸��� ���� ��� ó��.
 */
class Outer4 {
	int iv = 10;
	int iv2 = 20;
	class InstanceInner {
		int iv = 100;
		void method() {
			int iv = 200;
			System.out.println("iv=" + iv);  //200, ���������� ���� �켱
			System.out.println("this.iv=" + this.iv);  //100, this -> InstanceInnerŬ������ iv�� �����Ͷ�. -> ���� ���� Ŭ������ ����� �����Ͷ�.
			System.out.println("Outer4.this.iv=" + Outer4.this.iv);  //10, Outer4.this -> �ܺ�Ŭ������ �ִ� ��ü iv�� �����Ͷ�.
		}
	}
}
public class InnerEx3 {
	public static void main(String[] args) {
		Outer4 out = new Outer4();
		Outer4.InstanceInner oic = out.new InstanceInner();
		oic.method();
	}
}
