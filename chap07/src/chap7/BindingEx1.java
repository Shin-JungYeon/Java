package chap7;
/*
 * �θ�Ŭ������ �ڼ�Ŭ������ ������ ����� �����ϰ� ���� ��,
 * ��������� ���������� �ڷ����� ������,
 * ����޼���� ��ü�� ���� �������̵�(�ν��Ͻ� �޼��忡��)�� �޼��尡 ȣ�� �ȴ�.
 */
class Parent3 {
	int x = 10;
	void method() {
		System.out.println("Parent3 Ŭ������ method()"); 
	}
}
class Child3 extends Parent3 {
	int x = 20;
	void method() {
//		super.method();
		System.out.println("Chilsd3 Ŭ������ method()");
	}
}
public class BindingEx1 {
	public static void main(String[] args) {
		Parent3 p = new Child3();
		System.out.println(p.x);
		p.method();  //�θ��� method() �Ʒ� �ڼ�Ŭ�������� method()�������̵� �Ǹ� �� �޼��尡 ȣ�� ��(���� �޼��� ȣ��).
		             //�θ��� �� ȣ���ϰ� ������ �ڼ� Ŭ�������� super ����ؾ� ��. -> static�� ���� �޼��忡���� this, super ��� �Ұ�.
		Child3 c = (Child3)p;
		System.out.println(c.x);
		c.method();
	}
}
