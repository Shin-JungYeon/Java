package chap3;

import java.util.Scanner;

/*
 * ȭ�鿡�� ������ �Է� �޾Ƽ� 90�� �̻��̸� A, 80�� �̻��̸� B...����
 */
public class Exam9 {
	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		char grade = ((score>=90)?'A':
			         ((score>=80)?'B':
			         ((score>=70)?'C':
			         ((score>=60)?'D':'F'))));
		System.out.println(score + "���� " + grade + "�����Դϴ�.");
	}
}