package chap3;

import java.util.Scanner;

/*
 * ȭ�鿡�� ���ڸ� �Է¹޾Ƽ� ¦������ Ȧ������ ����ϱ�
 */
public class Exam4 {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String result = (num%2==0)?"¦��":"Ȧ��";
		System.out.println(num + "�� " + result + "�Դϴ�.");
		System.out.println(num + "�� " + ((num%2==0)?"¦��":"Ȧ��") + "�Դϴ�.");
	}
}