package chap4;

import java.util.Scanner;

/*
 * ������ �Է¹޾Ƽ� 60�� �̻��̸� �հ�, �ƴϸ� ���հ� ����ϱ�
 * �ݵ�� switch ���� �̿�.
 */
public class Exam3 {
	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		switch(score/60) {
		case 1 :
			System.out.println("�հ�"); break;
		default :
			System.out.println("���հ�");
		}
		
		switch(score/10) {
		case 10 :
		case 9 :
		case 8 :
		case 7 :
		case 6 :
			System.out.println("�հ�"); break; //�� case�� ���ؼ� ������ ���� ������ �߰�ȣ ���� ����.
		default :
			System.out.println("���հ�");
		}
	}
}
