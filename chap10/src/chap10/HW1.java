package chap10;
/*
 * main 메서드에서 method1() 메서드를 호출하여
 * 
 * [결과]
 * 30
 * 20
 * 10
 * 
 * 이 나오도록 프로그램 작성하기
 */
class Outer {
	int value = 10;
	class Inner {
		int value = 20;
		void method1() {
			int value = 30;
			System.out.println(value);  //30
			System.out.println(this.value);  //20
			System.out.println(Outer.this.value);  //10
		}
	}
}
public class HW1 {
	public static void main(String[] args) {
		Outer ov = new Outer();
		Outer.Inner oiv = ov.new Inner();
		oiv.method1();
//		new Outer.new Inner().method1();  //한줄에 작성
	}
}
