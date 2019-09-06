package chap14;
/*
 * 람다 객체 내부의 this 참조 변수 사용하기.
 */
interface FunctionalInterface5 {
	void method();  //추상메서드
}
public class LambdaEx5 {
	public int iv = 5;  //멤버변수
	void method() {  //멤버메서드
		FunctionalInterface5 f5 = () -> {
			int iv = 100;
			System.out.println("LambdaEx5.this.iv=" + LambdaEx5.this.iv);  //내부클래스예제처럼 클래스명.this.멤버변수명 으로 접근 가능.
			System.out.println("this.iv=" + this.iv);  //this.변수명 으로 클래스의 멤버변수에 바로 접근 가능.
			System.out.println("iv=" + iv);  //현재 메서드 내의 지역변수. (지역 변수 없으면 클래스의 멤버변수로 접근)
		};
		f5.method();
	}
	
	void method(int pv) {  //멤버메서드 오버로딩
//		pv += 10;  //함수 객체가 속한 메서드 내의 지역변수는 상수화가 되어야 함. 변경 되면 오류 발생.
		FunctionalInterface5 f5 = () -> {
			int iv = 100;
			iv += 10;
			System.out.println("LambdaEx5.this.iv=" + LambdaEx5.this.iv);
			System.out.println("this.iv=" + this.iv);
			System.out.println("iv=" + iv);
			System.out.println("pv=" + pv);
		};
		f5.method();
	}
	
	public static void main(String[] args) {
		LambdaEx5 lbd = new LambdaEx5();
		lbd.method();
		lbd.method(10);
	}
}
