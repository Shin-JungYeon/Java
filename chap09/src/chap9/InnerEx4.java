package chap9;
/*
 * 익명의 내부 클래스 예제
 * 지역내부클래스임.
 * 가장 많이 쓰임. (이벤트처리, ...)
 */
interface I {
	void test();
}
abstract class Abs {
	int x = 10;
	abstract void testmethod();
}
public class InnerEx4 {
	int x = 100;
	public static void main(String[] args) {  //main에는 static이 붙어있기 때문에 this를 사용할 수 없다.
		int num = 10;
		I i = new I() {
			@Override
			public void test() {
				int num1 = num;
				num1++;
				System.out.println("interface I 객체의 test 메서드임. num=" + num1);
			}
		};  //인터페이스는 직접 객체화가 되지 않지만 익명의내부클래스를 사용함으로써 객체생성 가능.
//		num++;  //변수는 상수화 되어야함.
		i.test();  //최종 오버라이딩 된 메서드 호출.
		Abs a = new Abs() {
			@Override
			void testmethod() {
				System.out.println("추상클래스 Abs 객체의 testmethod 메서드임. num=" + num);
				System.out.println("x=" + x);  //10
				System.out.println("x=" + new InnerEx4().x);  //100, this 사용불가하므로 객체 생성 후 사용해줄 수밖에 없다.
			}
		};
		a.testmethod();
		
	}
}
