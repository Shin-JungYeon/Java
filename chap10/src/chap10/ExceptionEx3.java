package chap10;
/*
 * try catch finally ����
 * 
 * finally : ����ó��, ���ܹ߻��� ��� ����Ǵ� ��
 *           �߰��� return ������ ���� �ŵ� finally ������ ������ ���� �ǰ� �����.
 */
public class ExceptionEx3 {
	public static void main(String[] args) {
		try {
			System.out.println("�۾� ����");
			System.out.println("�۾� ��");
			int num = 10 / 0;
			System.out.println("�۾� �Ϸ�");
			return;
		} catch (Exception e) {
			System.out.println("�۾� �� ���� �߻�");
			return;  //main �޼��� ����, finally�� �� ������.
		} finally {
			System.out.println("�۾� ������ �ϱ�");  //���� �߻� ������ ��� ���� ����
		}
//		System.out.println("���α׷� ����");  //������ ������ ���� �޼���� ��� ����ǹǷ� ���ܹ߻� ������ ��� ���� �� ������ ���� ����� �� ����.
	}
}
