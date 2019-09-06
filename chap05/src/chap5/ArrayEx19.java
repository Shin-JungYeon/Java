package chap5;

import java.util.Scanner;

public class ArrayEx19 {
	public static void main(String[] args) {
		System.out.println("배열의 크기를 홀수로 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[][] matrix = new int[size][size];
		
		int cnt=0;
		for(int i=1; i<=size; i+=2) {
			cnt += i;
		}
		cnt = cnt*2-1;
		
		for(int i=0; i<matrix.length; i++) {
			if(i<=matrix.length/2) {
				for(int j=i; j<(matrix.length-i); j++) {
					matrix[i][j] = cnt--;
				}
			} else {
				for(int j=matrix.length-i-1; j<=i; j++) {
					matrix[i][j] = cnt--;
				}
			}
		}
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length;j++) {
				System.out.print(((matrix[i][j]==0)?" ":matrix[i][j]) + "\t");
			}
			System.out.println();
		}
	}
}
