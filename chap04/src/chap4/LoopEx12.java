package chap4;

import java.util.Scanner;

/*
 * ȭ�鿡�� ���ڷ� �̷���� ���ڸ� �Է¹޾� ������ �ڸ����� ���� ���ϱ�.
 * String length() �ż���
 * ��)
 * "12345"
 * 1+2+3+4+5 = 15
 * �ڸ����� �� : 15
 * 
 * "123*456"
 * ���ڰ� �ƴ�.
 */
public class LoopEx12 {
	private static final int String = 0;

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
//		int sum=0;
//		String str = scan.next().strip();
//		System.out.println(str);
//		for(int i=0;i<=str.length() ;i++) {
//			sum += (8);
//		}
//		System.out.println(sum);
		
		
		String val = scan.next();
		char ch;
		boolean isNum = true;
		for (int i=0 ; i<val.length(); i++) {  //���ڿ��� �ε����� 0���� ����
			ch = val.charAt(i);  //�Է¹��� ���ڿ��� i�ε��� ���� char������ ��ȯ.
			if(ch<'0' || ch>'9') {  //���� �ƴ�.
				isNum = false;
				break;
			}	
		}
		int sum2=0;
		if(isNum) {
			for (int i=0 ; i<val.length(); i++) {
				ch = val.charAt(i);
				sum2 += (ch-'0');
			}
			System.out.println("�� �ڸ��� �հ� : " + sum2);
		} else {
			System.out.println("���� �ƴ�.");
		}
		
	}
}
