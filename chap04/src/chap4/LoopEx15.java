package chap4;

import java.util.Scanner;

/*
 * 1���� 100������ ������ ���� ���߱� ���α׷� �ۼ��ϱ�
 */
public class LoopEx15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num =(int)(Math.random() * 100 + 1); // 1���� 100������ ������ �� ����
		int cnt=0; //cnt : �Է¹��� Ƚ�� ����
		
		while(true) {
			System.out.println("1 ���� 100������ ���ڸ� �Է��ϼ���.");
			int input = scan.nextInt();
			cnt++;
			if(input > num) {
				System.out.println("\n�� ���� ���� �Է��ϼ���.");
			} else if(input < num) {
				System.out.println("\n�� ū ���� �Է��ϼ���.");
			} else {
				System.out.println("\n�����Դϴ�.");
				System.out.println("\n�õ� Ƚ�� : " + cnt);
				break;
			}
		}
		
	}
}