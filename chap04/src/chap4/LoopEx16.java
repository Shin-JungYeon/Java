package chap4;

import java.util.Scanner;

/*
 * �Է¹��� ���ڰ� ȸ�������� �Ǵ��ϴ� ���α׷�
 * 12321 : ȸ����
 * 12345 : ȸ�����ƴ�
 */
public class LoopEx16 {
	public static void main(String[] args) {
//		System.out.println("���ڸ� �Է��ϼ���.");
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		int result=0;
//		while(true) {
//			result += num%10;
//			num /= 10;
//			if(num==0) {
//				if(result==num) {
//					System.out.println("ȸ�����Դϴ�.");
//					break;
//				} else {
//					System.out.println("ȸ������ �ƴմϴ�.");
//					break;
//				}
//			} else;
//		}
		
		System.out.println("���ڸ� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int tmp = num;
		int result=0;
		while(tmp!=0) {
			result *= 10;
			result += tmp%10;
			tmp /=10;
		}
		if(num == result) {
			System.out.println(num + "�� ȸ�����Դϴ�.");
		} else {
			System.out.println(num + "�� ȸ������ �ƴմϴ�.");
		}
		
	}
}
