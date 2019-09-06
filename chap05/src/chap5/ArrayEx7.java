package chap5;

import java.util.Scanner;

/*
 * 10진 자연수를 16진수로 변경하기
 * 
 * 10진수 : 10
 * 16진수 : A
 * 
 * 10진수 : 255
 * 16진수 : FF
 */
public class ArrayEx7 {
	public static void main(String[] args) {
		char[] hexa = new char[8];
		char[] data = {'0', '1', '2', '3', '4', '5', '6' ,'7',
				       '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println("16진수로 변경할 10진수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num;
		int index = 0;
		
		while(divnum!=0) {
			hexa[index++] = data[divnum%16];
			divnum /= 16;
		}
		System.out.println(num + "의 16진수 : ");
		for(int i=index-1; i>=0; i--) {
			System.out.print(hexa[i]);
		}
		System.out.println();
		
//		char[] charr = new char[16];
//		char c = 'A';
//		for(int i=0; i<16; i++) {
//			if(i<10) {
//				charr[i] = (char)i;
//			} else {
//				charr[i] = (char)c++;
//			}
//		}
		
	}
}
