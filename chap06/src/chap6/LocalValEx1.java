package chap6;
/*
 * ���� ���� ���� : ���� ������ �޼���(�Լ�) ���ο��� ����� ������.
 *              �Ű� ������ ���� ������.
 *              ��� ���� ������ �ʱ�ȭ �Ǿ�� �Ѵ�.
 */
/*
 * void main(String[] args)
 * ���ϰ� �̸�(�ڷ��� �Ű�����)
 */
public class LocalValEx1 {
	public static void main(String[] args) {
		int num;
		boolean b = true;
		if(b) {
			num = 100;
		} else {
			num = 200;
		}  //else ������ ����, num�� �ʱ�ȭ �ȵ� ���ɼ� �ֱ� ������. ó���� 0���� �ʱ�ȭ �Ǿ��ٸ� �����߻����� ����.
		System.out.println(num);
		
		String grade;
		int score = 80;
		switch(score/10) {
			case 9 : grade = "A"; break;
			case 8 : grade = "B"; break;
			case 7 : grade = "C"; break;
			case 6 : grade = "D"; break;
			default : grade = "F"; //default ������ ����, �ݵ�� �ʱ�ȭ �ʿ�.
		}
		System.out.println(grade + "����");
		
		
	}
}
