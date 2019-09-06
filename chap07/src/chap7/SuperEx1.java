package chap7;
/*
 * super : �θ� ��ü�� �����ϴ� ����. �θ�ü��������
 *         ��� Ŭ������ Object Ŭ������ ��ӹ��� -> �ν��Ͻ� �޼��忡���� ����� ����.
 * super() : �θ� Ŭ������ �����ڸ� ȣ��
 */
class Parent {
	int x = 10;
	public Parent() {
		super();
	}
	//���� �⺻�������� ����, �����Ǿ� �ִ� ����.
}
class Child extends Parent {
	int x = 20;
	
//	public Child() {
//		super();
//	}
	
	void method() {
		int x = 30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		System.out.println(super.toString());
	}
}
public class SuperEx1 extends Object {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
//		System.out.println(super.toString());  
		//main�޼���� �ν��Ͻ� �޼��尡 �ƴ�. ���� �θ� ��ü�� ����. super �޼���� stasic �����.
	}
}