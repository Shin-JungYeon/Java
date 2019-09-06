package chap5;

import java.util.Scanner;

/*
 * 동전의 종류와 동전의 갯수 지정하여, 지정된 갯수만큼만 동전을 변경하기
 * 
 * 3600
 * 500 : 5개
 * 100 : 5개
 * 50  : 5개
 * 10  : 0개
 * 
 * 동전이 부족합니다.
 *
 */
public class ArrayEx10 {
	public static void main(String[] args) {
		int[] coin = {500, 100, 50, 10, 5, 1};
		int[] cnt = {5, 5, 5, 5, 5, 5};
		
		System.out.println("동전으로 바꿀 금액을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int won = scan.nextInt();
		int divwon = won, index = 0;
		int arr[]= new int[6];
		
		while(divwon!=0) {
			if(divwon/coin[index]>cnt[index]) {
				arr[index]=cnt[index];
				index++;
			} else {
				arr[index]=divwon/coin[index];
				index++;
			}
			
		}
		
//		for(int i=0; i<coin.length; i++) { //1
//			if(divwon/coin[i] >= cnt[i]) { // 600/50 >= 5
//				System.out.println(coin[i] + "원\t: " + cnt[i] + "개");
//				divwon -= coin[i]*cnt[i];
//			} else {
//				System.out.println(coin[i] + "원\t: " + divwon/coin[i] + "개");
//				divwon %= coin[i];
//			}
//			if(won>divwon) {
//				System.out.println("동전이 부족합니다.");
//			} else {
//				
//			}
//		}
		
	}
}
