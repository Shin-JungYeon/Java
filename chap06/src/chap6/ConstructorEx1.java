package chap6;
/*
 * ������ ����
 *   ������ : ��ü ������ ȣ��Ǵ� �޼���, ������ ���� ��ü ������ �Ұ���.
 *          �������� �̸��� Ŭ������� ����, ����Ÿ���� ����. void�� �ƴϰ� ��� ��ü�� ���� ����.
 *   �⺻ ������ : �����ڰ� �����ڸ� �������� ������ �����Ϸ��� �߰����ִ� ������.
 *             public Ŭ������(){}
 */
class Number1 {   //�⺻�����ڸ� ���� Ŭ����
	int num;
}
class Number2 {
	int num;
	Number2(int x) {   //Ŭ������ �̸��� ���� ���ϰ��� ���� -> ������, �⺻������(�Ű����� ���� ������)�� �������� ����
		num = x;
	}
}
public class ConstructorEx1 {
	public static void main(String[] args) {
		Number1 n1 = new Number1();
		/*
		 * new ������ ���
		 *   1. �������� �޸� �Ҵ�
		 *   2. �⺻������ ������� �ʱ�ȭ
		 *   3. ������( Numbwe1() ) ȣ��
		 */
		n1.num = 100;
		System.out.println("Number1.num = " + n1.num);
		Number2 n2 = new Number2(100);  //�⺻�����ڰ� �ƴ� �����ڰ� �����ϱ� ������ �Ű����� �־���� ��.
//		n2.num = 100;
		System.out.println("Number2.num = " + n2.num);
	}
}
