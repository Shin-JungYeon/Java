package chap6;
/*
 * �Ű����� ����
 *    �⺻�� �Ű����� : ��ȸ�� ����
 *                 ���� ����Ǿ� ȣ��Ǳ� ������ ���� ��ü�� ���� ����
 *    ������ �Ű����� : ��ȸ�� ���� ����
 *                 �������� ����Ǳ� ������ ������ ��ü���� ����� �� ����.
 */
class ParamVal {
	int val;
}
public class ParameterEx1 {
	public static void main(String[] args) {
		ParamVal pv = new ParamVal();
		pv.val = 100;  //ParamVal Ŭ������ val ���� 100���� �ʱ�ȭ.
		change1(pv.val);  //���� �־���.
		System.out.println("main => change1() ���� : " + pv.val); //����� 100���� ���� ������ ����.
		change2(pv);  //��ü ��ü�� �־���.
		System.out.println("main => change2() ���� : " + pv.val); //200
	}

	private static void change1(int val) {  //val�� pv.val(100) ����
		val += 100;
		System.out.println("change1() : val = " + val); //200
	}

	private static void change2(ParamVal pv) {
		pv.val += 100;  //��ü�� �ٽ� val�� �����ؼ� 100�� ������ �� �ű⿡ 100�� ������.
		System.out.println("change2() : val = " + pv.val); //200
	}
	
}
