package chap9;
/*
 * 내부클래스와 외부클래스의 멤버이름이 같은 경우 처리.
 */
class Outer4 {
	int iv = 10;
	int iv2 = 20;
	class InstanceInner {
		int iv = 100;
		void method() {
			int iv = 200;
			System.out.println("iv=" + iv);  //200, 지역변수가 가장 우선
			System.out.println("this.iv=" + this.iv);  //100, this -> InstanceInner클래스의 iv를 가져와라. -> 내가 속한 클래스의 멤버를 가져와라.
			System.out.println("Outer4.this.iv=" + Outer4.this.iv);  //10, Outer4.this -> 외부클래스에 있는 객체 iv를 가져와라.
		}
	}
}
public class InnerEx3 {
	public static void main(String[] args) {
		Outer4 out = new Outer4();
		Outer4.InstanceInner oic = out.new InstanceInner();
		oic.method();
	}
}
