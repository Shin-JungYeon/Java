package chap2;

public class VarEx1 {
	public static void main(String[] args) {
		//���� : �޸� ���� �Ҵ� > �ּҸ� ������ �ִ�. ���� ����� �޸� �Ҵ� ��.
		byte b1;   //������ ����
		b1 = 100;  //������ �ʱ�ȭ
		byte b2 = 100;   //1byte : -128 ~ 127
		short s1 = 200;  //2byte
		int i1 = 300;    //4byte
		long l1 = 400;   //8byte
		System.out.println("b1=" + b1);
		System.out.println("b2=" + b2);
		System.out.println("s1=" + s1);
		System.out.println("i1=" + i1);
		System.out.println("l1=" + l1);
		//�Ǽ���
		/*
		 * �Ǽ��� ���ͳ��� �⺻ �ڷ����� double ��.
		 * ���� ���ͳο� �ٴ� �ڷ��� ǥ�� ���̻�
		 *   f, F : float �� ���ͳ�
		 *   d, D : double �� ���ͳ�
		 *   l, L : long �� ���ͳ�
		 */
		float f1 = 10;  //10.0 �̶�� �ϸ� ����, 10.0f ��� �ؾ� ��.
		double d1 = 10.0;  //10d ��� �ᵵ ��.
		System.out.println("f1=" + f1);
		System.out.println("d1=" + d1);
		//����
		System.out.println(3000l*3000*3000);  //������ ���ʿ� l �ٿ��ֱ�
		System.out.println("(b1+b2)=" + (b1+b2));  //byte + byte �� ����� int �̴�. int ���� ���� �ڷ����� ������ ����� int ��.
		byte sum = (byte)(b1 + b2);  //����ȯ ���� ������ ����.
		System.out.println("(b1+b2)=" + sum);  //2���� �����ϸ鼭 ��ȣ�� �ٲ�
		i1 = s1;  //int <- short, s1�տ� (int)�� ���� �Ǿ� ���� : �ڵ� ����ȯ
		s1 = (short)l1;  //short <- long : ����� ����ȯ
		// ū �Ϳ��� ���� ������ �ٲ� ���� ���Ƿ� �ڸ� �� ��� ����ȯ ������ ������ ����.
		/*
		 * String s = 'a,b,c';
		 * s = 'a';  //�⺻���� ������ ������ ����ȯ �Ұ�/ �� Wrapper Ŭ������ ����.
		 */
	}
}