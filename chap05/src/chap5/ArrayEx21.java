package chap5;

import java.util.Scanner;

/*
 * �����迭�� ����Ͽ� ������ ����� �������� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * [���]
 *   46
 *   47 37
 *   48 38 29
 *   49 39 30 22
 *   50 40 31 23 16
 *   51 41 32 24 17 11
 *   52 42 33 25 18 12 7
 *   53 43 34 26 19 13 8  4
 *   54 44 35 27 20 14 9  5  2
 *   55 45 36 28 21 15 10 6  3  1
 *   
 *   �迭���������� ��Ģ�� ã�� ���� �߿�. ��, ��, ������ ���� ���輺
 */
public class ArrayEx21 {
	public static void main(String[] args) {
//		System.out.println("�迭�� ũ�⸦ �Է��ϼ���.");
//		Scanner scan = new Scanner(System.in);
//		int size = scan.nextInt();
//		int[][] arr = new int[size][];
		
		int[][] arr = new int[10][];  //���� �迭
		for(int i=0; i<arr.length; i++) {
			arr[i]= new int[i+1];
		}
		int data = arr.length;
		int sum = 0;
		for(int i=1; i<=arr.length; i++) {
			sum += i;
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=arr.length-1; j>=i; j--) {
				arr[j][i]= sum--;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {  //arr[i].length ���� �� ���� �ϳ��� ����.
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		data = 0;
		for(int j=arr.length; j>=0; j--) {
			for(int i=j; i<arr.length; i++) {
				arr[i][j] = ++data;
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
}
