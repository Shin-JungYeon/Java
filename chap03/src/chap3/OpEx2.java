package chap3;
/*
 * ���� ������ : ��ȣ ������ + -
 *   + : ���� ��ȣ�� ������.
 *   - : ���� ��ȣ�� ������.
 *   ��ȣ ��ü�� ��Ÿ���� ���� �ƴ�. + �� �� ���� ����.
 * ���� ������ : �� ������ !
 *   ������ ����
 */
public class OpEx2 {
	public static void main(String[] args) {
		int x = -10;
		System.out.println("x=" + +x); //x=-10
		System.out.println("x=" + -x); //x=10
		x = 10;
		System.out.println("x=" + +x); //x=10
		System.out.println("x=" + -x); //x=-10
		
		boolean b = true;
		System.out.println("b=" + !b); //b=false
		System.out.println("3 != 2 : " + (3 != 2)); //3 != 2 : true
	}
}