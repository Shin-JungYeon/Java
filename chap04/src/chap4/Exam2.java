package chap4;

import java.util.Scanner;

/*
 * �⵵�� 4�ڸ��� �Է¹޾� ���� ���ϱ�
 * 4�� ��� ��
 * 100�� ����̸鼭 400�� ��� : ����
 * 100�� ��������� 400�� ����� �ƴ� : ���
 * 100�� ��� �ƴ� : ����
 * 
 */
public class Exam2 {
	public static void main(String[] args) {
		System.out.println("�⵵�� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if (year%100 == 0) {
			if (year%400 == 0) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("����Դϴ�.");
			}
		} else if (year%4 == 0) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("����Դϴ�.");
		}
		
		if (year%4 == 0) {
			if (year%400 == 0) {
				System.out.println("�����Դϴ�.");
			} else if (year%100 == 0) {
				System.out.println("����Դϴ�.");
			} else {
				System.out.println("�����Դϴ�.");
			}
		} else {
			System.out.println("����Դϴ�.");
		}
		
	}
}
