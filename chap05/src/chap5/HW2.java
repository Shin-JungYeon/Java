package chap5;

import java.util.Scanner;

/*
 * 2. 1부터 10까지의 임의의 수  10개를 배열 answer에 저장하고 
 *    데이터를 읽어 각 숫자의  개수만큼 ‘*’ 을 찍는  프로그램을 작성하라. 
 */
public class HW2 {
	public static void main(String[] args) {
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
//			int rdm =(int)(Math.random() * 10) + 1;
//			num[i] = rdm;
			num[i] = (int)(Math.random() * 10) + 1;  //굳이 따로 써줄 필요 ㄴㄴ
			
			System.out.print(num[i] + ((num[i]<10)?"  : ":" : "));
			for(int j=1; j<=num[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}