package chap3;
/*12345�ʰ� ��ð� ��� �������� ����ϱ�.
 * ��� : ??�ð� ??�� ??��
 */
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		int num = 12345;
		int h, m, s;
		h = num/3600;
		m = (num%3600)/60;
		s = (num%3600)%60; // num%3600 �� �� �ʿ� ����.
		System.out.println(h + "�ð� " + m + "�� " + s + "��");
		System.out.println((num/3600) + "�ð� " + ((num%3600)/60) + "�� " + (num%60) +"��");
		
		//���� �Է� �޾� ����ϱ�
		System.out.println("����� �ʸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt(); // �Է� �޾Ƽ� ������ ����
		System.out.println((num/3600) + "�ð� " + ((num%3600)/60) + "�� " + (num%60) +"��");
	}
}