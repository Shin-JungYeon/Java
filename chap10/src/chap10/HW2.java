package chap10;
/*
 * ���� �ҽ��� ����� ���ÿ�.
 * ���� ���� ����� ���ÿ�.
 */
public class HW2 {
	static void method(boolean b) {  //2. ture �Է� ����  //10. false �Է� ����
		try {
			System.out.print(1);  //3. 1 ���  //11. 1���
			if(b)  
				throw new ArithmeticException();  //4. true �̹Ƿ� ���� �߻�, catch �������� �Ѿ.  //12. false �̹Ƿ� ���� �߻���Ű�� ����.
			System.out.print(2);  //13. ���� �߻����� �ʾ����Ƿ� 2 ���
		} catch (RuntimeException r) {  //5. ���ܰ� �߻������Ƿ� 2 ������� ���ϰ� catch �������� �Ѿ��.
			System.out.print(3);  //6. ArithmeticException�� RuntimeException�� ���� �����̹Ƿ� �� �������� ���� ó�� ����. 3���
			return;  //7. method()�޼��� ����, main�޼���� ���ư�.
		} catch (Exception e) {
			System.out.print(4);
			return;
		} finally {  //8. �޼���� �����Ͽ����� finally������ �ݵ�� ����. ���� 5 ���  //14. ���� �߻� ������ ������� finally ���� ����. ���� 5 ���
			System.out.print(5);
		}
		System.out.print(6);  //15. ���� �߻����� �ʾ����Ƿ� try catch ���� �������ͼ� 6 ���
	}
	public static void main(String[] args) {
		method(true);  //1. �޼��� ȣ��   -> 135
		method(false);  //9. �޼��� ȣ��  -> 1256
	}
}
