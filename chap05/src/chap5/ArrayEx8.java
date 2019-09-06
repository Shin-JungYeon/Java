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
public class ArrayEx8 {
	public static void main(String[] args) {
		System.out.println("10������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num;
		int index = 0;
		
		int binary[] = new int[32];
		
		int octa[] = new int[32];
		
		char hexa[] = new char[8];
		char data[] = {'0', '1', '2', '3', '4', '5', '6' ,'7',
			       '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		
		//2����
		while(divnum != 0) {
			binary[index++] = divnum % 2;  //index++ : ���� ���� �ְ� ����.
			divnum /= 2;
		}
		System.out.print("2����\t: ");
		for(int i=index-1; i>=0; i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
		
		//8����
		divnum = num;
		index = 0;
		while(divnum != 0) {
			octa[index++] = divnum % 8;
			divnum /= 8;
		}
		System.out.print("8����\t: ");
		for(int i=index-1; i>=0; i--) {
			System.out.print(octa[i]);
		}
		System.out.println();
		
		//10����
		System.out.println("10����\t: " + num);
		
		//16����
		divnum = num;
		index = 0;
		while(divnum != 0) {
			hexa[index++] = data[divnum%16];
			divnum /= 16;
		}
		System.out.print("16����\t: ");
		for(int i=index-1; i>=0; i--) {
			System.out.print(hexa[i]);
		} 
		
	}
}
