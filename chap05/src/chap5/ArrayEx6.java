package chap5;

import java.util.Scanner;

/*
 * 10������ �������� �����ϱ�
 */
public class ArrayEx6 {
	public static void main(String[] args) {
		int[] binary = new int[32];
		System.out.println("2������ ������ 10������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num;
		int index = 0;
	
		while(divnum != 0) {
			binary[index++] = divnum % 2;  //index++ : ���� ���� �ְ� ����.
			divnum /= 2;
		}

		System.out.print(num + "�� 2���� : ");
		for(int i=index-1; i>=0; i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
		
	}
}