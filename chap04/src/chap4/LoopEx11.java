package chap4;

import java.util.Scanner;

/*
 * ���忡 ������, ���Ƹ��� �հ� �ٸ����� �Է¹޾Ƽ� �������� ���� ��, ���Ƹ��� ���� ���� ����ϱ�.
 * ����� �ȵ� ���� '���� ����' ����ϱ�
 * ������ x ���Ƹ� y : x + y = sum, x*4 + y*2 = leg
 */
public class LoopEx11 {
	public static void main(String[] args) {
		System.out.println("������ �հ� �ٸ� ���� ������� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int sum=0, leg=0;
		int x=0, y=0;
		sum = scan.nextInt();
		leg = scan.nextInt();
		
		for(x=0 ; x<sum ; x++) {
			for(y=sum-x; y>=0 ;y--) {
				if(x*4 + y*2 == leg) break;
			}
			if(x*4 + y*2 == leg) break;
		}
		if(y<0) {
			System.out.println("�������");
		} else {
			System.out.println("������ : " + x + "," + "���Ƹ� : " + y);
		}
		
		
		
		boolean search = false;
		for(x=0 ; x<=sum ; x++) {
			for(y=0 ; y<=sum ; y++) {
				if(((x+y)==sum) && (x*4+y*2==leg)) {
					System.out.println("������ : " + x + "," + "���Ƹ� : " + y);
					search = true;
				}
			}
		}
		if(!search)
			System.out.println("�������");
	}
}