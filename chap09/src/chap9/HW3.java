package chap9;
/*
 * 3. Outer2Ŭ������ ����Ŭ���� Inner�� ������� iv�� ���
 */
class Outer3 {
	static class Inner { //����Ŭ������ ��ü�� �ڷ���
		 int iv = 200;
	}
}
public class HW3 {
	public static void main(String[] args) {
		Outer3.Inner oi = new Outer3.Inner();
		System.out.println(oi.iv);
	}
}
