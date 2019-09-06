package chap11;
/*
 * �ڹ� API�� String Ŭ������ equals �޼��尡 �������̵� �Ǿ� ����. -> ��ü������ ���� ���ϴ� �޼���� �������̵� �Ǿ� ����.
 * ���ڿ� ��ü�� ����� �� == ������� ����, equals �޼��带 ����ؾ� ��. -> String�� �Ϲ� �ڷ����� �ݴ��  ��ü ��ü �񱳸� ���ؼ��� == ���.
 */
public class EqualsEx2 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		if(str1 == str2) {
			System.out.println("str1�� str�� ���� ��ü��.");
		} else {
			System.out.println("str1�� str�� �ٸ� ��ü��.");
		}
		if(str1.equals(str2)) {
			System.out.println("str1�� str2�� ���� ������ ���ڿ� ��ü��.");
		} else {
			System.out.println("str1�� str2�� �ٸ� ������ ���ڿ� ��ü��.");
		}
		if(str1.equals("abc")) {
			System.out.println("str1�� ������ abc �� ���ڿ��̴�.");
		} else {
			System.out.println("str1�� ������ abc �� ���ڿ��� �ƴϴ�.");
		}
	}
}
