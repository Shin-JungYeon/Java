package chap8;
interface MyInterface1 {
	default void method1() {
		System.out.println("MyInterface1�� default �޼��� : method1()");
	}
	static void staticMethod() {
		System.out.println("MyInterface1�� static �޼��� : staticMethod()");
	}
}
interface MyInterface2 {
	default void method1() {
		System.out.println("MyInterface2�� default �޼��� : method1()");
	}
	static void staticMethod() {
		System.out.println("MyInterface2�� static �޼��� : staticMethod()");
	}
}
class ImpClass implements MyInterface1, MyInterface2 {  //���߱���
	@Override   //MyInterface1, MyInterface2 �� ��� method1() �޼��尡 �ֱ� ������ ������ ���� ���̵� �ؼ� ��� ���� ȣ���� �� �˷���� ��.
	public void method1() {
		System.out.println("ImpClass Ŭ������ method1() �޼���");
		MyInterface1.super.method1();
		MyInterface2.super.method1();
	}
}
public class interfaceEx5 {
	public static void main(String[] args) {
		ImpClass c = new ImpClass();
		c.method1();
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();  //static �޼���� ��ü�� ������� �������̽����� ����Ͽ� ȣ���ϱ� ������ �������̵� X
	}
}
