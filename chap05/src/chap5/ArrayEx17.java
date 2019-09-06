package chap5;

import java.util.Scanner;

/*
 * 홍수개의 배열의 크기를 입력받아 matrix(2차원배열)를 생성하고 *문자를 이용하여 모래시계 출력하기
 * 
 * [결과]
 * 배열의 크기를 홀수로 입력하세요.
 * 5
 * 
 * *****
 *  ***
 *   *
 *  ***
 * *****
 * 9
 * 
 *0  0 8 *********
 *1  1 7  *******
 *2  2 6   *****
 *3  3 5    ***
 *4  4 4     *     
 *5  3 5    ***
 *6  2 6   *****
 *7  1 7  *******
 *8  0 8 *********
 */
public class ArrayEx17 {
	public static void main(String[] args) {
		System.out.println("배열의 크기를 홀수로 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		char[][] matrix = new char[num][num];
		
		for(int i=0; i<matrix.length; i++) {
			if(i<=matrix.length/2) {
				for(int j=i; j<(matrix.length-i); j++) {
					matrix[i][j] = '*';
				}
			} else {
				for(int j=matrix.length-i-1; j<=i; j++) { //시작점의 규칙!!
					matrix[i][j] = '*';
				}
			}
			System.out.println(matrix[i]);
		}			
		
        System.out.println();
        
		int size = num;
		char[][] matrix1 = new char[size][size];
		for(int i=0; i<=matrix1.length/2;i++) {
			for(int j=i; j<matrix1.length-i;j++) {
				matrix1[i][j]='*';
			}
		}
		for(int i =matrix1.length/2+1; i<matrix1.length; i++) {
			for(int j=matrix1.length-1-i; j<=i;j++) {
				matrix1[i][j]='*';
			}
		}
		//matrix 출력하기
		for(int i=0; i<matrix1.length; i++) {
			for(int j=0; j<matrix1[i].length;j++) {
				System.out.print(matrix1[i][j]);
			}
			System.out.println();
		}
		
	}
}
