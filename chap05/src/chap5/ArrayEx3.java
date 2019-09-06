package chap5;

import java.util.Scanner;

/*
 * 화면에서 1 부터 10까지의 수를 10개 입력 받아서 입력 받은 수만큼 별표를 출력.
 * 1 2 3 4 5 6 7 8 9 10
 * 1  : *
 * 2  : **
 * 3  : ***
 * ...
 * 10 : **********
 */
public class ArrayEx3 {
	public static void main(String[] args) {
		System.out.println("1부터 10까지의 수 중 10개를 입력하세요.");
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
