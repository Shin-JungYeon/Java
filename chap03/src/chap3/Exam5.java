package chap3;

import java.util.Scanner;

/*
 * ���ڸ� �Է¹޾Ƽ� ����� ���, ������ ������ 0�̸� 0�� ����ϱ�
 */
public class Exam5 {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num + "�� " + ((num>0)?"���":(num<0)?"����":0) + "�Դϴ�.");
	}
}