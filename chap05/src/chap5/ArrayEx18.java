package chap5;
/*
 *  17  16  15  14  13
 *      12  11  10
 *          9    
 *      8   7   6
 *  5   4   3   2   1
 *  
 * 출력하기
 */
import java.util.Scanner;

public class ArrayEx18 {
	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		int cnt=17;
		
		for(int i=0; i<matrix.length; i++) {
			if(i<=matrix.length/2) {
				for(int j=i; j<(matrix.length-i); j++) {
					matrix[i][j] = cnt--;
				}
			} else {
				for(int j=matrix.length-i-1; j<=i; j++) { //시작점의 규칙!!
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
