package chap10;
/*
 * ����ó�� ���ص� ������ ���� �ʵ��� �����ϱ�.
 * RuntimeException : ����ó�� ���� ������ ����.
 */
public class ExceptionEx8 {
	public static void main(String[] args) {
		badmethod();
	}
	private static void badmethod() {
		throw new RuntimeException("���� ���� �߻�");
	}
}
