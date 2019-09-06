package chap7;
/*
 * super : 부모 객체를 참조하는 변수. 부모객체참조변수
 *         모든 클래스는 Object 클래스를 상속받음 -> 인스턴스 메서드에서만 사용이 가능.
 * super() : 부모 클래스의 생성자를 호출
 */
class Parent {
	int x = 10;
	public Parent() {
		super();
	}
	//원래 기본생성자의 형태, 생략되어 있는 것임.
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
		//main메서드는 인스턴스 메서드가 아님. 따라서 부모 객체가 없음. super 메서드는 stasic 멤버임.
	}
}