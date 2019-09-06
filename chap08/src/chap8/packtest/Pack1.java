package chap8.packtest;

public class Pack1 {
	private int num;
	void method() {  //접근제어가가 생략되어져 있음 (default), 다른 패키지의 클래스에서 method()접근 불가능
		num = 100;
		System.out.println("chap8.packtest.Pack1 클래스의 method() 메서드임.");
//		chap8.Single s = chap8.Single.getInstance();  //Single 클래스의 접근 제어자가 public이면 가능
	}
	protected void method2() {  //
		num = 200;
		System.out.println("chap8.packtest.Pack1 클래스의 method() 메서드임.");
	}
}


class Pack2 {
	void method() {
		System.out.println("chap8.packtest.Pack1 클래스의 method() 메서드임.");
		Pack1 p = new Pack1();
		p.method();  //Pack2 클래스에서 Pack1클래스의 method()에 접근 가능
		p.method2();  //Pack2 클래스에서 Pack1클래스의 method2()에 접근 가능
//		p.num = 300;  //num 멤버의 접근제어자가 private 이므로 Pack1 클래스가 아니면 접근 불가능
	}
}