package chap3;
/*
 * ���� ������ : ���� ������, ������ ���� <----
 *   int a = 10;
 *       lvalue = rvalue;
 *       lvalue : �ݵ�� ����, ������� ��.
 *       rvalue : ��, ����, ���, ���� ����
 *       a + 10 = 100; (x)
 *       a = 100 + 10; (o)
 */
public class OpEx6 {
	public static void main(String[] args) {
		int num = 100;
		System.out.println(num);
		num += 10; //num = num + 10;
		System.out.println(num);
		num /= 10; //num = num/10;
		System.out.println(num);
		num += 2 + 3;
		System.out.println(num);
		
		byte b = 1;
		b *= 2; //b�� ��ü�� �ٲ�� ���̱� ������ �������� ����.
		//b = b * 2; ����
		System.out.println(b);
		b *= 2;
		System.out.println(b);
		b *= 2;
		System.out.println(b);
	}
}