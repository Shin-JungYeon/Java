package chap3;

import java.util.Scanner;

/*
 * ����� ��� ���ڿ� ��� ���� ������ ������ ����ϱ�
 * ���ڿ��� ����� 10���� ���� �� ����
 * 
 * ��1)
 * ����� ������ �Է��ϼ���
 * 22
 * �ʿ��� ������ ���� : 3
 * ��2)
 * 30
 * 3
 */
public class Exam7 {
	public static void main(String[] args) {
		System.out.println("����� ������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("�ʿ��� ������ ���� : " + ((num%10==0)?(num/10):(num/10+1)));
		
		int box = (num/10) + ((num%10==0)?0:1);
		System.out.println("�ʿ��� ������ ���� : " + box);
	}
}