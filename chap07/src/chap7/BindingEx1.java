package chap7;
/*
 * 부모클래스와 자손클래스가 동일한 멤버를 소유하고 있을 때,
 * 멤버변수는 참조변수의 자료형을 따르고,
 * 멤버메서드는 객체의 최종 오버라이딩(인스턴스 메서드에서)된 메서드가 호출 된다.
 */
class Parent3 {
	int x = 10;
	void method() {
		System.out.println("Parent3 클래스의 method()"); 
	}
}
class Child3 extends Parent3 {
	int x = 20;
	void method() {
//		super.method();
		System.out.println("Chilsd3 클래스의 method()");
	}
}
public class BindingEx1 {
	public static void main(String[] args) {
		Parent3 p = new Child3();
		System.out.println(p.x);
		p.method();  //부모의 method() 아래 자손클래스에서 method()오버라이딩 되면 그 메서드가 호출 됨(최종 메서드 호출).
		             //부모의 것 호출하고 싶으면 자손 클래스에서 super 사용해야 함. -> static이 붙은 메서드에서는 this, super 사용 불가.
		Child3 c = (Child3)p;
		System.out.println(c.x);
		c.method();
	}
}
