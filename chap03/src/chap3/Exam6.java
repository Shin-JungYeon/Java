package chap3;

import java.util.Scanner;
/*
 * ���ڸ� �Է¹޾Ƽ� �ҹ����� ��� �빮�ڷ� �����ϱ�
 * �����ڰ� �ƴ� ��� �ҹ��� �ƴ� ����ϱ�
 */
public class Exam6 {
	public static void main(String[] args) {
		System.out.println("�ҹ��ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
	    char c = scan.next().charAt(0); //���ڿ� �Է¹ޱ�, charAt(0) : 0�� ° �ε����� ���� c�� ����('dse' ��� ���� �Է��ϸ� d�� ����)
	    //System.out.println((c>=97 && c<=122)?(char)(c-32):(c<=90 && c>=65)?c:"�ҹ��� �ƴ�.");
	    System.out.println(c + (((c>='a')&&(c<='z'))?"�� �빮�ڴ� " + (char)(c-32):"���ڴ� �ҹ��� �ƴ�.")); //���ڳ��� ��� ���� ���� �� ����.
	}
}