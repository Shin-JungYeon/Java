package chap5;

import java.util.Scanner;

/*
 * ������ ������ ������ ���� �����Ͽ�, ������ ������ŭ�� ������ �����ϱ�
 * 
 * 3600
 * 500 : 5��
 * 100 : 5��
 * 50  : 5��
 * 10  : 0��
 * 
 * ������ �����մϴ�.
 *
 */
public class ArrayEx10 {
	public static void main(String[] args) {
		int[] coin = {500, 100, 50, 10, 5, 1};
		int[] cnt = {5, 5, 5, 5, 5, 5};
		
		System.out.println("�������� �ٲ� �ݾ��� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int won = scan.nextInt();
		int divwon = won, index = 0;
		int arr[]= new int[6];
		
		while(divwon!=0) {
			if(divwon/coin[index]>cnt[index]) {
				arr[index]=cnt[index];
				index++;
			} else {
				arr[index]=divwon/coin[index];
				index++;
			}
			
		}
		
//		for(int i=0; i<coin.length; i++) { //1
//			if(divwon/coin[i] >= cnt[i]) { // 600/50 >= 5
//				System.out.println(coin[i] + "��\t: " + cnt[i] + "��");
//				divwon -= coin[i]*cnt[i];
//			} else {
//				System.out.println(coin[i] + "��\t: " + divwon/coin[i] + "��");
//				divwon %= coin[i];
//			}
//			if(won>divwon) {
//				System.out.println("������ �����մϴ�.");
//			} else {
//				
//			}
//		}
		
	}
}
