package chap5;

import java.util.Scanner;

/*
 * ȭ�鿡�� 1 ���� 10������ ���� 10�� �Է� �޾Ƽ� �Է� ���� ����ŭ ��ǥ�� ���.
 * 1 2 3 4 5 6 7 8 9 10
 * 1  : *
 * 2  : **
 * 3  : ***
 * ...
 * 10 : **********
 */
public class ArrayEx3 {
	public static void main(String[] args) {
		System.out.println("1���� 10������ �� �� 10���� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i] = scan.nextInt();
			if(num[i]<10) {
				System.out.print(num[i] + "  : ");
			} else {
				System.out.print(num[i] + " : ");
			}
			for(int j=1; j<=num[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
//		for(int i=0; i<num.length; i++) {
//			num[i] = scan.nextInt();
//			System.out.print(num[i] + ((num[i]<10)?"  : ":" : "));
//			for(int j=1; j<=num[i]; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	}
}
