package chap12;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1. 1���� 99������ ���ڸ� 5���� �Է¹޾� �̵��� ��հ� �߾Ӱ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *    �߾Ӱ��� �־��� ���� ũ�� ������� �þ� ������ �� ���� �߾ӿ� ���� ���̴�.
 *   
 *    10, 40, 30, 60, 30�� ���, ũ�� ������� �þ� ������
 *    10 30 30 40 60
 *    �� �ǰ� ���� �߾Ӱ��� 30 �� �ȴ�.
 */
public class HW1 {
	public static void main(String[] args) {
		 System.out.println("1���� 99������ �� �� 5���� �Է��Ͻÿ�.");
		 Scanner scan = new Scanner(System.in);
		 int[] num = new int[5];
		 int sum=0;
		 for(int i=0; i<num.length; i++) {
			 num[i] = scan.nextInt();
			 sum += num[i];
		 }
		 
		 Arrays.sort(num);  //�������� ����
		 
//		 int sum=0;
//		 for(int i=0; i<num.length; i++) {
//			 sum += num[i];
//		 }  //���� ���� ������� �ʿ� ����!
		 
		 System.out.println("�߾Ӱ� : " + num[num.length/2]);
		 System.out.println("��հ� : " + (double)sum/num.length);
	}
}
