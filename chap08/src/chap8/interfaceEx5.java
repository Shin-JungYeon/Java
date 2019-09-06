package chap8;
interface MyInterface1 {
	default void method1() {
		System.out.println("MyInterface1의 default 메서드 : method1()");
	}
	static void staticMethod() {
		System.out.println("MyInterface1의 static 메서드 : staticMethod()");
	}
}
interface MyInterface2 {
	default void method1() {
		System.out.println("MyInterface2의 default 메서드 : method1()");
	}
	static void staticMethod() {
		System.out.println("MyInterface2의 static 메서드 : staticMethod()");
	}
}
class ImpClass implements MyInterface1, MyInterface2 {  //다중구현
	@Override   //MyInterface1, MyInterface2 에 모두 method1() 메서드가 있기 때문에 강제로 오버 라이딩 해서 어느 것을 호출할 지 알려줘야 함.
	public void method1() {
		System.out.println("ImpClass 클래스의 method1() 메서드");
		MyInterface1.super.method1();
		MyInterface2.super.method1();
	}
}
public class interfaceEx5 {
	public static void main(String[] args) {
		ImpClass c = new ImpClass();
		c.method1();
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();  //static 메서드는 객체와 상관없이 인터페이스명을 사용하여 호출하기 때문에 오버라이딩 X
	}
}
