package chap7;
/*
 * 추상클래스 간의 상속도 가능하다.
 */
abstract class Abs1 {  //미완성 클래스. 이 클래스의 객체 생성 불가.
	int a=10;
	int getA() {
		// TODO Auto-generated method stub
		return 0;
	}  //메서드가 완성 되지 않음, 객체화 되지 않는다.
}
abstract class Abs2 extends Abs1 {
	int b = 20;
	@Override
	int getA() {
		return 0;
	}
	//추상클래스에서도 부모클래스의 메서드 오버라이딩 가능(굳이 안해도 됨). 하게 되면 자손클래스에서는 오버라이딩 필요 없음.
	abstract int getB();
}
class Normal extends Abs2 {
	int c = 30;
//	@Override
//	int getA() {  //부모클래스에서 오버라이딩 했기때문에 여기서는 할 필요 없음.
//		return a;
//	}
	@Override
	int getB() {
		return b;
	}
	int getC() {
		return c;
	}
}

public class AbstractEx1 {
	public static void main(String[] args) {
		Normal n = new Normal();
		System.out.println(n.a + " -> " + n.getA());
		System.out.println(n.b + " -> " + n.getB());
		System.out.println(n.c + " -> " + n.getC());
		
		Abs2 a2 = n;
		System.out.println(a2.a + " -> " + a2.getA());
		System.out.println(a2.b + " -> " + a2.getB());
//		System.out.println(a2.c + " -> " + a2.getC());  //c, getC() 멤버는 Normal클래스의 멤버, Abs2의 자료형으로는 접근할 수 없음.
		
		Abs1 a1 = a2;
		System.out.println(a1.a + " -> " + a1.getA());
//		System.out.println(a1.b + " -> " + a1.getB());
//		System.out.println(a1.c + " -> " + a1.getC());  //B, getB() 멤버는 Abs2와 Normal클래스의 멤버, Abs1의 자료형으로는 접근할 수 없음.
		
		Object o = a1;
//		System.out.println(o.a + " -> " + o.getA());
//		System.out.println(o.b + " -> " + o.getB());
//		System.out.println(o.c + " -> " + o.getC());  //Object 타입의 참조변수로는 a, b, c, getA, getB, getC 멤버를 참조할 수 없음.
	}
}
