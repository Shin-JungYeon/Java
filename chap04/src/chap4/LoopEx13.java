package chap4;

import java.util.Scanner;

/*
 * ȭ�鿡�� ������ �Է¹޾Ƽ� ������ �ڸ����� �� ���ϱ�, �� ���ڿ��� ���� �ʱ�
 * ��)
 * ���ڸ� �Է��ϼ���.
 * 123
 * �ڸ����� �� : 9
 */
public class LoopEx13 {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum=0;
		
		while(num!=0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println("�� �ڸ��� �հ� : " + sum);
		
	}
}
