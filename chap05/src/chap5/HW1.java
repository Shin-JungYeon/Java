package chap5;

import java.util.Scanner;

/*
 * 1. �ﰢ���� ���̸� �Է¹޾� �̵ �ﰢ���� ����ϱ�
 * [��1]
 * �ﰢ���� ���̸� �Է��ϼ���
 * 5   
 *      *
 *     ***
 *    *****
 *   *******
 *  *********
 *  ���� �عٴ� : 9�� = ����*2-1
 *  ��Ģ���� �� ã�� ��������~
 */
public class HW1 {
	public static void main(String[] args) {
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt();
		for(int i=1; i<=high; i++) {
			for(int j=1; j<=high*2-1; j++) {
				if((high-i+1==j)) {
					for(int k=1; k<=(i*2-1); k++) {
						System.out.print("*");
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
//		int len = scan.nextInt();
//		int max = len*2 - 1;  //�عٴ� * ����
//		for (int i=0; i<len; i++) {
//			for(int j=0; j<max; j++) {
//				if(j>=(max/2 - i) && j<= (max/2+i)) {
//					System.out.print("*");
//				} else if(j < (max/2-i) || j>(max/2+i)) {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
	}
}
