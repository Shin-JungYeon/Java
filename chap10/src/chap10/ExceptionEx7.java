package chap10;

public class ExceptionEx7 {
	public static void main(String[] args) {
		try {
			badmethod();  //(16 : throw e; ���� ���) badmethod���� ���ܸ� �߻� ��Ű�ڸ��� ó���ع����� main������ ���� �߻����θ� ���� ����.
		} catch (Exception e) {
			System.out.println("main���� ���� ó�� message = " + e.getMessage());
			//getMessage() : ���� �߻� �� �������� �Ű������� ����� �޼��� ����.
		}
	}
	private static void badmethod() throws Exception {
		try {
			throw new Exception("badmethod ������ ���� ��ü");
		} catch (Exception e) {  //�� �� ���� ���� ��ü e�� ��� ����� ����.
			System.out.println("badmethod���� ���� ó��. message = " + e.getMessage());
			throw e;  //���� ó�������� �ٽ� �߻� -> throws �� ���� main���� ���� ����.
		}
	}
}
