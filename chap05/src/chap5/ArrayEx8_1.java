package chap5;

import java.util.Scanner;

/*
 * 10진수를 입력 받아서 2진수, 8진수, 10진수, 16진수로 변경하기
 * 
 * 10진수를 입력하세요.
 * 10
 * 2진수   : 1010
 * 8진수   : 12
 * 10진수 : 10
 * 16진수 : A
 */
public class ArrayEx8_1 {
	public static void main(String[] args) {
		char data[] = {'0', '1', '2', '3', '4', '5', '6' ,'7',
			       '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		int[] digit = {2, 8, 10, 16};
		char[] arr = new char[32];
		
		System.out.println("10진수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num, index = 0;
		
		for(int d : digit) { //digit 배열의 처음부터 끝 값까지
			divnum = num;
			index = 0;
			while(divnum != 0) {
				arr[index++] = data[divnum%d];
				divnum /= d;
			}
			System.out.print(d + "진수\t: ");
			for(int i=index-1; i>=0; i--) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
	}
}
