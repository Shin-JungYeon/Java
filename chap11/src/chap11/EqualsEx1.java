package chap11;
/*
 * Object Ŭ������ equals �޼��� ���� : ����񱳸� ���� ����� ���� �޼���
 *        �⺻���� : ���� ��ü���θ� ���� == �������� ��ɰ� ����.
 *                 -> ����񱳸� ���ؼ��� �������̵� �ʿ�.
 */
class Equal {
	int vlaue;
	Equal(int value) {
		this.vlaue = value;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Equal) {
			Equal e = (Equal)obj;
			return this.vlaue == e.vlaue;  //��ü �񱳰� �ƴ� �� ��.
		}
		return false;
	}
}
public class EqualsEx1 {
	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		if(e1 == e2) {
			System.out.println("e1 ��ü�� e2 ��ü�� ���� ��ü��.");  //�� ���� ���������� ��� ���� ��ü�� �����ϰ� �ִ�.
		} else {
			System.out.println("e1 ��ü�� e2 ��ü�� �ٸ� ��ü��.");  //�� ���� ���������� ���� �ٸ� ��ü�� �����ϰ� �ִ�.
		}
		if(e1.equals(e2)) {  //���� : ������ �ƴ� �����ϰ� �ִ� ��ü�� ��. -> ���� ���ϰ� ������ �� �޼��带 �������̵� ����� ��.
			System.out.println("e1 ��ü�� e2 ��ü�� ���� ������ ���� ��ü��.");  //�����ϰ� �ִ� ��ü ��ü�� �ٸ� �� ����.
		} else {
			System.out.println("e1 ��ü�� e2 ��ü�� �ٸ� ������ ���� ��ü��.");
		}

	}
}
