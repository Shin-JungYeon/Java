package chap10;
/*
 * throws ���� : ����ó��.
 * 
 * throws : �߻��� ���ܸ� ���� �޼��带 ȣ���� �޼���� ������ ó��.
 * 
 * ����ó��
 *   try catch ���
 *   throws ���
 */
public class ExceptionEx4 {
	public static void main(String[] args) {
		System.out.println("main �޼��� ����");
		try {
			first();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main �޼��� ����");
	}
	private static void first() throws Exception {
		System.out.println("first �޼��� ȣ��");
		second();
		System.out.println("first �޼��� ����");
	}
	private static void second() throws Exception {
		System.out.println("second �޼��� ȣ��");
		System.out.println(10/0);  //ArithmeticException ���� �߻�
		System.out.println("second �޼��� ����");
	}
}