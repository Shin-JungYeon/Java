package chap4;

import java.util.Scanner;

/*
 * switch ����
 * switch(��) {
 *    case ��1 : ����1;
 *    case ��2 : ����2;
 *    ...
 *    default : ����n;
 * }
 *  ���������� �� ��. ��Ȯ�� ���� �������� �־���� ��.
 */
public class SwitchEx1 {
	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String grade;
		
		switch (score / 10) {
		   case 10 : //break�� ���� ���� ������ �ʰ� 9�� ���� ����� ������.
		   case 9 : grade = "A";
		            break; //switch ������ ���. ������ ������� ��� ������ ���� ��.
		   case 8 : grade = "B";
		   			break;
		   case 7 : grade = "C";
		   			break;
		   case 6 : grade = "D";
		   			break;
		   default : grade = "F";
		   			 break;
		}
		System.out.println(score + "������ " + grade + "�����Դϴ�.");
	}
}