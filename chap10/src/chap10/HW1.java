package chap10;
/*
 * main �޼��忡�� method1() �޼��带 ȣ���Ͽ�
 * 
 * [���]
 * 30
 * 20
 * 10
 * 
 * �� �������� ���α׷� �ۼ��ϱ�
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
//		new Outer.new Inner().method1();  //���ٿ� �ۼ�
	}
}
