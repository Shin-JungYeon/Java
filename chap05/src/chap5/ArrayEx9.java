package chap5;

import java.util.Scanner;

/*
 * 화면으로부터 금액을 입력받아 최소 개의 동전으로 바꿔주는 프로그램 작성.
 * 
 * 동전의 종류 : 500, 100, 50, 10, 5, 1
 * 
 * 금액을 입력하세요.
 * 3600
 * 
 * 500원 : 7개
 * 100원 : 1개
 * ... : 0개
 * 
 */
public class ArrayEx9 {
	public static void main(String[] args) {
		int coin[]= {500, 100, 50, 10, 5, 1};
		
		System.out.println("동전으로 바꿀 금액을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int won = scan.nextInt();
		int divwon = won, index = 0;
		int[] arr = new int[6];
				
		for(int i=0; i<coin.length; i++) {
			arr[i] = divwon/coin[i];
			divwon -= arr[i]*coin[i];
			}
		for(int i=0; i<arr.length; i++) {
			System.out.println(coin[i] + "원\t: " + arr[i] + "개");
		}
		System.out.println();
		
		for(int c : coin) {
			System.out.println(c + "원\t: " + won/c + "개");
			won %= c;
		}
		
	}
}
