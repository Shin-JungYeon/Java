package chap8;
/*
 * 1. ��ü ������ ���ϵ��� �������� ���� �����ڸ� private���� ������ �� �ִ�. -> calendar Ŭ������ �����ڰ� private ���������ڸ� ����.
 *   Math Ŭ������ �����ڰ� private ��. -> ��� ����� static ��. ��ü ���� ���ʿ�.
 * 2. ��ü�� ������ ������ �� �ִ�.
 */
class Single {
	private static Single s = new Single();  //Single Ŭ���� ���ο����� ��ü ���� ����
	private Single() {}  //������
	private int value;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public static Single getInstance() {
		return s;
	}
}
public class PackageEx2 {
	public static void main(String[] args) {
//		Math math = new Math();  //��ü ���� �Ұ�.
//		Single s1 = new Single();  //��ü ���� �Ұ�.
		Single s1 = Single.getInstance();  //�������� ���������ڰ� private�̹Ƿ� �޼��带 ���ؼ��� ��ü ���� ����.
		Single s2 = Single.getInstance();
		Single s3 = Single.getInstance();
		System.out.println(s1.getValue() + ", " + s2.getValue() + ", " + s3.getValue());
		s1.setValue(100);
		System.out.println(s1.getValue() + ", " + s2.getValue() + ", " + s3.getValue());  //��ü�� �� ������.
		//�� ��ü���� ������ value ���� �����س� ���� �ƴ�. Single.getInstance() �� ������ ��ü�� Single Ÿ���� s ��ü �� �ϳ� ��.
	}
}
