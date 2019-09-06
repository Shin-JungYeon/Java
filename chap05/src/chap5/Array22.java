package chap5;

import java.util.Scanner;

public class Array22 {
	public static void main(String[] args) {
		System.out.println("배열의 크기를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int[][] arr = new int[len][];
		for(int i=0; i<len; i++) {
			arr[i]= new int[i+1]; 
		}
		int data = 0;
		for(int j=len; j>=0; j--) {
			for(int i=j; i<len; i++) {
				arr[i][j] = ++data;
			}
		}
		for(int i=0; i<len; i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
