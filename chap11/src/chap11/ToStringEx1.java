package chap11;
/*
 * Object Ŭ������ �޼��� : toString() : ��ü�� ���ڿ�ȭ �ϴ� �޼���
 * 		-> �������� �̸��� ����ϸ� �ڵ� ȣ��Ǵ� �޼��� 
 * 		-> Ŭ������@16�����ؽ��ڵ� �� ���·� ���� ��. -> �⺻�޼����� ����
 * 		-> ��ü�� ������ ����ϱ� ���ؼ��� �������̵� �ʿ�.
 */
class ToString {
	int value;
	@Override
	public String toString() {
		return "ToString [value=" + value + "]";
	}
}
public class ToStringEx1 {
	public static void main(String[] args) {
		ToString t1 = new ToString();
		ToString t2 = new ToString();
		System.out.println(t1);
		System.out.println(t2);
	}
}
