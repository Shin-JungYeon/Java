package chap5;

import java.util.Scanner;

/*
 * 10������ �Է� �޾Ƽ� 2����, 8����, 10����, 16������ �����ϱ�
 * 
 * 10������ �Է��ϼ���.
 * 10
 * 2����   : 1010
 * 8����   : 12
 * 10���� : 10
 * 16���� : A
 */
public class ArrayEx8_1 {
	public static void main(String[] args) {
		char data[] = {'0', '1', '2', '3', '4', '5', '6' ,'7',
			       '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		int[] digit = {2, 8, 10, 16};
		char[] arr = new char[32];
		
		System.out.println("10������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num, index = 0;
		
		for(int d : digit) { //digit �迭�� ó������ �� ������
			divnum = num;
			index = 0;
			while(divnum != 0) {
				arr[index++] = data[divnum%d];
				divnum /= d;
			}
			System.out.print(d + "����\t: ");
			for(int i=index-1; i>=0; i--) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
	}
}
