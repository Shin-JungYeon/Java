package chap10;
/*
 * ���� catch ���� ���� : try �������� �߻� ���ɼ��� �ִ� ���ܰ� �������� ��� catch ������ ������ ����� �� �մ�.
 * 
 * catch �������� ���Ǵ� ���ܰ�ü�� �����ڷ����� �Ʒ��ʿ� ��ġ�ؾ� �Ѵ�.
 *  -> Exception ��ü�� ����ϴ� catch ������ ���� �Ʒ��ʿ� ��ġ �ȴ�. �׷��� ������ ���� �߻�.
 */
public class ExceptionEx2 {
	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
			System.out.println(Integer.parseInt(args[0]));  //���ڿ��� �״�� ���ڷ� �����϶�. ȫ�浿�� ���� ���� -> NumberFormatException �߻�
			System.out.println(10 / Integer.parseInt(args[0]));
			String str = null;
			System.out.println(str.trim());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("command ���ο� �Ķ���͸� �Է��ϼ���.");
		} catch (NumberFormatException e) {
			System.out.println("command ���ο� �Ķ���ʹ� ���ڸ� �����մϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("command ���ο� �Ķ���ʹ� 0�� �Է����� ������.");
//		} catch(NullPointerException e) {  //��ü ���� �޼��� ȣ���ؼ� �߻�
//			
		} catch (Exception e) {  //��� ���ܸ� �ϳ��ϳ� �������� �ۼ����� �� �����ϱ� �� �� ��� ���ܸ� ó���ϴ� ����, �� ������ �� ���� �÷������� �갡 ��� ���ܸ� ó��. �׷��� ������ �������� ���� ���� �Ʒ��ʿ� �ۼ��ϵ��� ��.
			e.printStackTrace();  //������ ������ ��� ������ �˷���.
			System.out.println("����η� �����ּ���. (��ȭ : 1234)");
		}
	}
}
