package chap3;

import java.util.Scanner;

/*
 * 10 ~ 99 ������ ���� �Է¹޾Ƽ� �Է� ���� ������ ũ�ų� ���� ���� ����� 10�� ����� ���Ͽ�
 * ������ 10�� ����� �Է¹��� ���� ���� ����ϱ�
 * ��1)
 * 10���� 99������ ���� �Է��ϼ���
 * 24
 * 30 - 24
 * 6
 */
public class Exam8 {
	public static void main(String[] args) {
		System.out.println("10���� 99������ ���� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result;
		result = ((num%10==0)?(num):(num/10+1)*10) - num;
		System.out.println(result);
		
		int num10 = (num/10)*10 + ((num%10==0)?0:10);
		System.out.println(num10 + "-" + num + "=" + (num10 - num));
	}
}