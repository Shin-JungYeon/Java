package chap5;

import java.util.Scanner;

/*
 * ȭ�����κ��� �ݾ��� �Է¹޾� �ּ� ���� �������� �ٲ��ִ� ���α׷� �ۼ�.
 * 
 * ������ ���� : 500, 100, 50, 10, 5, 1
 * 
 * �ݾ��� �Է��ϼ���.
 * 3600
 * 
 * 500�� : 7��
 * 100�� : 1��
 * ... : 0��
 * 
 */
public class ArrayEx9 {
	public static void main(String[] args) {
		int coin[]= {500, 100, 50, 10, 5, 1};
		
		System.out.println("�������� �ٲ� �ݾ��� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int won = scan.nextInt();
		int divwon = won, index = 0;
		int[] arr = new int[6];
				
		for(int i=0; i<coin.length; i++) {
			arr[i] = divwon/coin[i];
			divwon -= arr[i]*coin[i];
			}
		for(int i=0; i<arr.length; i++) {
			System.out.println(coin[i] + "��\t: " + arr[i] + "��");
		}
		System.out.println();
		
		for(int c : coin) {
			System.out.println(c + "��\t: " + won/c + "��");
			won %= c;
		}
		
	}
}
