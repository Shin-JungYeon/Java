package chap4;

import java.util.Scanner;

/*
 * �� ���� ���ڸ� �Է� �޾Ƽ� �빮������, �ҹ�������, ��Ÿ �������� ����ϱ�
 */
public class Exam1 {
	public static void main(String[] args) {
		System.out.println("���� �� ���� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
	    char ch = scan.next().charAt(0);
	    
	    if (ch >= 'A' && ch <= 'Z') {
	    	System.out.println("�빮���Դϴ�.");
	    } else if (ch >= 'a' && ch <= 'z') {
	    	System.out.println("�ҹ����Դϴ�.");
	    } else if (ch >= '0' && ch <= '9' ) {
	    	System.out.println("�����Դϴ�.");
	    } else {
	    	System.out.println("��Ÿ�����Դϴ�.");
	    }
	}
}
