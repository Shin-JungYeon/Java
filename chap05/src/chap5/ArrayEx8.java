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
public class ArrayEx8 {
	public static void main(String[] args) {
		System.out.println("10진수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num;
		int index = 0;
		
		int binary[] = new int[32];
		
		int octa[] = new int[32];
		
		char hexa[] = new char[8];
		char data[] = {'0', '1', '2', '3', '4', '5', '6' ,'7',
			       '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		
		//2진수
		while(divnum != 0) {
			binary[index++] = divnum % 2;  //index++ : 값을 먼저 넣고 증가.
			divnum /= 2;
		}
		System.out.print("2진수\t: ");
		for(int i=index-1; i>=0; i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
		
		//8진수
		divnum = num;
		index = 0;
		while(divnum != 0) {
			octa[index++] = divnum % 8;
			divnum /= 8;
		}
		System.out.print("8진수\t: ");
		for(int i=index-1; i>=0; i--) {
			System.out.print(octa[i]);
		}
		System.out.println();
		
		//10진수
		System.out.println("10진수\t: " + num);
		
		//16진수
		divnum = num;
		index = 0;
		while(divnum != 0) {
			hexa[index++] = data[divnum%16];
			divnum /= 16;
		}
		System.out.print("16진수\t: ");
		for(int i=index-1; i>=0; i--) {
			System.out.print(hexa[i]);
		} 
		
	}
}
