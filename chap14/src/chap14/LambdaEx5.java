package chap14;
/*
 * ���� ��ü ������ this ���� ���� ����ϱ�.
 */
interface FunctionalInterface5 {
	void method();  //�߻�޼���
}
public class LambdaEx5 {
	public int iv = 5;  //�������
	void method() {  //����޼���
		FunctionalInterface5 f5 = () -> {
			int iv = 100;
			System.out.println("LambdaEx5.this.iv=" + LambdaEx5.this.iv);  //����Ŭ��������ó�� Ŭ������.this.��������� ���� ���� ����.
			System.out.println("this.iv=" + this.iv);  //this.������ ���� Ŭ������ ��������� �ٷ� ���� ����.
			System.out.println("iv=" + iv);  //���� �޼��� ���� ��������. (���� ���� ������ Ŭ������ ��������� ����)
		};
		f5.method();
	}
	
	void method(int pv) {  //����޼��� �����ε�
//		pv += 10;  //�Լ� ��ü�� ���� �޼��� ���� ���������� ���ȭ�� �Ǿ�� ��. ���� �Ǹ� ���� �߻�.
		FunctionalInterface5 f5 = () -> {
			int iv = 100;
			iv += 10;
			System.out.println("LambdaEx5.this.iv=" + LambdaEx5.this.iv);
			System.out.println("this.iv=" + this.iv);
			System.out.println("iv=" + iv);
			System.out.println("pv=" + pv);
		};
		f5.method();
	}
	
	public static void main(String[] args) {
		LambdaEx5 lbd = new LambdaEx5();
		lbd.method();
		lbd.method(10);
	}
}
