package chap8.packtest;

public class Pack1 {
	private int num;
	void method() {  //��������� �����Ǿ��� ���� (default), �ٸ� ��Ű���� Ŭ�������� method()���� �Ұ���
		num = 100;
		System.out.println("chap8.packtest.Pack1 Ŭ������ method() �޼�����.");
//		chap8.Single s = chap8.Single.getInstance();  //Single Ŭ������ ���� �����ڰ� public�̸� ����
	}
	protected void method2() {  //
		num = 200;
		System.out.println("chap8.packtest.Pack1 Ŭ������ method() �޼�����.");
	}
}


class Pack2 {
	void method() {
		System.out.println("chap8.packtest.Pack1 Ŭ������ method() �޼�����.");
		Pack1 p = new Pack1();
		p.method();  //Pack2 Ŭ�������� Pack1Ŭ������ method()�� ���� ����
		p.method2();  //Pack2 Ŭ�������� Pack1Ŭ������ method2()�� ���� ����
//		p.num = 300;  //num ����� ���������ڰ� private �̹Ƿ� Pack1 Ŭ������ �ƴϸ� ���� �Ұ���
	}
}