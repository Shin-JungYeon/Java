package chap5;

import java.util.Scanner;

/*
 * 2. �ΰ��� ���� �Է� �޾� �μ��� ������� ���ϱ�
 * 
 * [��� 1]
 * 
 * �ΰ��� ������ �Է��ϼ���
 * 10 25
 * 10��25�� ����� :1,5
 * 
 * 
 * [��� 2]
 * 
 * �ΰ��� ������ �Է��ϼ���
 * 3 10
 * 3��10�� ����� :1
 * 
 * 
 * [��� 3]
 * 
 * �ΰ��� ������ �Է��ϼ���
 * 10 20
 * 10��20�� ����� :1,2,5,10
 */
public class HW02 {
	public static void main(String[] args) {
		System.out.println("�� ���� ������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.print(num1 + "�� " + num2 + "�� ����� : ");
		

		if(num1>num2) {
			for(int i=1; i<=num2; i++) {
				if(num1%i==0 && num2%i==0) {
					System.out.print(i + "   ");
				}
			}
		} else {
			for(int i=1; i<=num1; i++) {
				if(num1%i==0 && num2%i==0) {
					System.out.print(i + "   ");
				}
			}
		}
		
	}
}
