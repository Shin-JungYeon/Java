package chap5;

import java.util.Scanner;

/*
 * 10�� �ڿ����� 16������ �����ϱ�
 * 
 * 10���� : 10
 * 16���� : A
 * 
 * 10���� : 255
 * 16���� : FF
 */
public class ArrayEx7 {
	public static void main(String[] args) {
		char[] hexa = new char[8];
		char[] data = {'0', '1', '2', '3', '4', '5', '6' ,'7',
				       '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println("16������ ������ 10������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num;
		int index = 0;
		
		while(divnum!=0) {
			hexa[index++] = data[divnum%16];
			divnum /= 16;
		}
		System.out.println(num + "�� 16���� : ");
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
