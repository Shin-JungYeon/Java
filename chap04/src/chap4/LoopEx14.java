package chap4;

import java.util.Scanner;

/*
 * ȭ�鿡�� ���ڸ� 99999 ���� �Էµ� ������ �Է¹޾Ƽ� �Էµ� ������ �հ� ��� ���ϱ�.
 */
public class LoopEx14 {
	public static void main(String[] args) {
//		System.out.println("���ڸ� �Է��ϼ���.(����:99999");
//		Scanner scan = new Scanner(System.in);
//		int num=0, sum=0, i=0;
//		float ave=0;
//		
//		while(num!=99999) {
//			i++;
//			num = scan.nextInt();
//			if(num==99999) break;
//			sum += num;
//			ave = (float)sum/i;
//		}
//		System.out.println("���� : " + sum + ", " + "��� : " + ave);
		
		
		
		Scanner scan = new Scanner(System.in);
		int sum=0, cnt=0;
		while(true) {
			System.out.println("���ڸ� �Է��ϼ���.(����:99999");
			int num = scan.nextInt();
			if(num==99999) break;
			sum += num;
			cnt++;
		}
		System.out.println("���� : " + sum + ", " + "��� : " + (double)sum/cnt);
		
	}
}