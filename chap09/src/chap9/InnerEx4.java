package chap9;
/*
 * �͸��� ���� Ŭ���� ����
 * ��������Ŭ������.
 * ���� ���� ����. (�̺�Ʈó��, ...)
 */
interface I {
	void test();
}
abstract class Abs {
	int x = 10;
	abstract void testmethod();
}
public class InnerEx4 {
	int x = 100;
	public static void main(String[] args) {  //main���� static�� �پ��ֱ� ������ this�� ����� �� ����.
		int num = 10;
		I i = new I() {
			@Override
			public void test() {
				int num1 = num;
				num1++;
				System.out.println("interface I ��ü�� test �޼�����. num=" + num1);
			}
		};  //�������̽��� ���� ��üȭ�� ���� ������ �͸��ǳ���Ŭ������ ��������ν� ��ü���� ����.
//		num++;  //������ ���ȭ �Ǿ����.
		i.test();  //���� �������̵� �� �޼��� ȣ��.
		Abs a = new Abs() {
			@Override
			void testmethod() {
				System.out.println("�߻�Ŭ���� Abs ��ü�� testmethod �޼�����. num=" + num);
				System.out.println("x=" + x);  //10
				System.out.println("x=" + new InnerEx4().x);  //100, this ���Ұ��ϹǷ� ��ü ���� �� ������� ���ۿ� ����.
			}
		};
		a.testmethod();
		
	}
}
