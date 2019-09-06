package chap9;
/*
 * 3. Outer2클래스의 내부클래스 Inner의 멤버변수 iv값 출력
 */
class Outer3 {
	static class Inner { //내부클래스의 객체의 자료형
		 int iv = 200;
	}
}
public class HW3 {
	public static void main(String[] args) {
		Outer3.Inner oi = new Outer3.Inner();
		System.out.println(oi.iv);
	}
}
