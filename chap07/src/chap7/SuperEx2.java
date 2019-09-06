package chap7;
/*
 * super() ������ : �θ� Ŭ������ �����ڸ� ȣ����.
 *                �ڼ� Ŭ������ ��ü ������ �θ� Ŭ������ ��ü�� ���� ������.
 *                �ڼ� Ŭ������ �����ڿ��� super()�� ȣ����.
 *                ���� �θ�Ŭ������ �����ڿ� �Ű������� ���� �����ڰ� ������ �ݵ�� super(�θ�Ŭ������ �Ű�����) �� �´� super �����ڸ� ȣ���ؾ� ��.
 */
class Parent2 {
	int x;
	Parent2(int x) {
		this.x = x;
	}
}
class Child2 extends Parent2 {
	int x = 20;
	public Child2() {
		super(0);
	}
	//�⺻�������� ����, �θ� Ŭ������ �����ڸ� ���� ȣ��, �θ� Ŭ������ �Ű������� �ִ� �����ڰ� �ִٸ� super()�� �ݵ�� ����� ��.
	
	void method() {
		int x = 30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}
public class SuperEx2 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}
