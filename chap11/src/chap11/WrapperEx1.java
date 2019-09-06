package chap11;
/*
 * Wrapper Ŭ���� : 8���� �⺻�ڷ����� ��üȭ �ϱ� ���� Ŭ����
 * 
 * 		�⺻ �ڷ���		Wrapper Ŭ����
 * 		 boolean	 Boolean
 * 		 byte		 Byte
 * 		 short	 	 Short
 *   	 int		 Integer
 *  	 long		 Long
 *  	 char		 Character
 *   	 float		 Float
 *   	 double		 Double
 *   
 *   �⺻������ �⺻�ڷ����� �����ڷ��� ������ ����ȯ�� �Ұ�
 *   ��, ���������� �⺻�ڷ����� Wrapper Ŭ���� ���� ����ȯ�� �����ϴ�.(jdk5.0 ���� ����)
 *   
 *   �⺻�ڷ��� <- �����ڷ��� : auto unBoxing
 *   �����ڷ��� <- �⺻�ڷ��� : auto Boxing
 */
public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i1 = 100;  //auto Boxing
		Integer i2 = 100;
		if(i1 == i2) {  //Integer ��ü��. (Object ��ü ����)
			System.out.println("i1�� i2�� ����.");
		} else {
			System.out.println("i1�� i2�� �ٸ���.");
		}
		if(i1.equals(i2)) {  //Object �ȿ� �ֱ� ������ equals() �޼��� ��� ����. ���� Integer ��ü��.
			System.out.println("i1�� i2�� ����.");
		} else {
			System.out.println("i1�� i2�� �ٸ���.");
		}
		System.out.println();
		
		Integer i3 = new Integer(100);  //Deprecated : �����ϸ� ������� ��. ������ �ڵ����� ����ȯ ����.
		Integer i4 = new Integer(100);  //��ü ���� ����� ���� �޶� �ٸ� ��ü�� ��.
		if(i3 == i4) {
			System.out.println("i3�� i4�� ����.");
		} else {
			System.out.println("i3�� i4�� �ٸ���.");
		}
		if(i3.equals(i4)) {  //���� ��
			System.out.println("i3�� i4�� ����.");
		} else {
			System.out.println("i3�� i4�� �ٸ���.");
		}
		System.out.println();
		
		System.out.println("int�� ���� �ִ밪 : " + Integer.MAX_VALUE);
		System.out.println("int�� ���� �ּҰ� : " + Integer.MIN_VALUE);
		System.out.println("int�� bit �� : " + Integer.SIZE);
		System.out.println();
		
		//byte���� �ִ밪, �ּҰ�, bit ����
		System.out.println("byte�� ���� �ִ밪 : " + Byte.MAX_VALUE);
		System.out.println("byte�� ���� �ּҰ� : " + Byte.MIN_VALUE);
		System.out.println("byte�� bit �� : " + Byte.SIZE);
		System.out.println();
		
		//���� ���ڿ��� int������ ��ȯ
		int num = Integer.parseInt("123");
		System.out.println("10���� : " + num);
		num = Integer.parseInt("123", 8);
		System.out.println("8���� : 123 -> 10���� : " + num);
		num = Integer.parseInt("123", 16);
		System.out.println("16���� : 123 -> 10���� : " + num);
		System.out.println();
		
		//10������ 2, 8, 16������ ��ȯ
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toOctalString(83));
		System.out.println(Integer.toHexString(291));
		System.out.println();
		
		//�Ǽ� ���ڿ��� float, double�� ��ȯ
		float f = Float.parseFloat("123.45");
		System.out.println(f+10);
		double d = Double.parseDouble("123.456");
		System.out.println(d+10);

	}
}
