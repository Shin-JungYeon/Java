package chap11;
/*
 * 1. �� ���� �����Ͽ� ������ ����� �������� �����ϱ�
 * 
 * [���]
 * basket
 * basketball
 */
public class HW1 {
	public static void main(String[] args) {
		String str = "base";
		str = str.replace('e','k')+"et";
		System.out.println(str);
		str += "ball";
		System.out.println(str);
	}
}