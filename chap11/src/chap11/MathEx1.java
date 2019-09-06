package chap11;
/*
 * Math Ŭ���� ����
 *   1. ��ġ ������ static �޼���� ����� ���� Ŭ����. (��� ����� static)
 *   2. ��üȭ �Ұ���. -> �������� ���� �����ڰ� private��.
 *   3. final Ŭ������. -> ��� �Ұ� Ŭ����.
 *   
 * Math.����� ���� ȣ���Ѵ�.
 */
public class MathEx1 {
	public static void main(String[] args) {
		//�ﰢ�Լ�
		System.out.println("Math.sin(Math.PI/2) : " + Math.sin(Math.PI/2));  //���� ������ �־���� ��.
		System.out.println("Math.cos(60) : " + Math.cos(Math.toRadians(60)));  //�� -> ����
		System.out.println("Math.tan(Math.PI/4) : " + Math.tan(Math.PI/4));
		System.out.println("Math.toDegrees(Math.PI/4) : " + Math.toDegrees(Math.PI/4));  //���� -> ��
		System.out.println();
		
		//������, ����
		System.out.println("Math.sqrt(25) : " + Math.sqrt(25));
		System.out.println("Math.pow(5, 3) : " + Math.pow(5, 3));  //5*5*5
		System.out.println();
		
		//�ٻ� ���� : ���� ���� ����� ����
		System.out.println("Math.ceil(3.4) : " + Math.ceil(3.4));  //�����ٴ� ũ�� ���� ����� ����
		System.out.println("Math.ceil(-3.4) : " + Math.ceil(-3.4));
		System.out.println("Math.floor(3.4) : " + Math.floor(3.4));  //�����ٴ� �۰� ���� ����� ����
		System.out.println("Math.floor(-3.4) : " + Math.floor(-3.4));
		System.out.println("Math.rint(3.4) : " + Math.rint(3.4));  //������ ũ�� �۴� ������� �׳� ���� ����� ����
		System.out.println("Math.rint(-3.4) : " + Math.rint(-3.4));
		System.out.println();
		
		//�ݿø�
		System.out.println("Math.round(3.7) : " + Math.round(3.7));  //����Ÿ�� lng -> �Ҽ����ڸ� ����X, ���� ������ �ٲ���.
		System.out.println();
		
		//���밪
		System.out.println("Math.abs(-3.4) : " + Math.abs(-3.4));
		System.out.println();
		
		//ū��, ������
		System.out.println("Math.max(3, 4) : " + Math.max(3, 4));
		System.out.println("Math.min(3, 4) : " + Math.min(3, 4));
		System.out.println();
		
		//������ ��
		System.out.println("Math.random() : " + Math.random());  //1�� ���� ���� ����.		
	}
}