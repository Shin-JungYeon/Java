package chap3;
/*
 * ȭ�鿡�� 3�ڸ� ������ �Է¹޾� 100�ڸ� �̸��� ������ ����ϱ�
 * ��2) ���ڸ� ������ �Է��ϼ���
 *      321
 *      300
 * ��2) ���ڸ� ������ �Է��ϼ���
 *      101
 *      100
 */
import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		int num;
		System.out.println("���ڸ� ������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
	    System.out.println((num/100)*100);
	    System.out.println(num-(num%100));
	}
}