package chap5;

import java.util.Scanner;

/*
 * 2. 1���� 10������ ������ ��  10���� �迭 answer�� �����ϰ� 
 *    �����͸� �о� �� ������  ������ŭ ��*�� �� ���  ���α׷��� �ۼ��϶�. 
 */
public class HW2 {
	public static void main(String[] args) {
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
//			int rdm =(int)(Math.random() * 10) + 1;
//			num[i] = rdm;
			num[i] = (int)(Math.random() * 10) + 1;  //���� ���� ���� �ʿ� ����
			
			System.out.print(num[i] + ((num[i]<10)?"  : ":" : "));
			for(int j=1; j<=num[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}