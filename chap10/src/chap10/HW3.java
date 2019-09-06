package chap10;

import java.util.InputMismatchException;  //Scanner���� �߻��� �����̱� ������ import �ʿ�
import java.util.Scanner;

/*
 * ������ ������ ���ڸ� ���ߴ� ������ �����ϴ� ���߿� ���ڰ� �ƴ� �����ڸ� �־ �߻��� �����̴�.
 * ����ó���� �ؼ� ���ڰ� �ƴ� ���� �Է����� ���� �ٽ� �Է��� �޵��� ���α׷� �ۼ��ϱ�.
 * 
 * 1�� 100 ������ ���� �Է��ϼ��� : 50
 * �� ���� ���� �Է��ϼ���.
 * 1�� 100 ������ ���� �Է��ϼ��� : aaa
 * Exception in thread "main" java.util.InputMismatchException
 * at java.util.Scanner.throwFor(Scanner.java:819)
 * ....
 * 
 * 1���� 100 ������ ���� �ƴ� ��� InputNumberException ���ܸ� �߻��ϰ�,
 * 1 ���� 100 ������ ���� �Է� �����մϴ�. �޼��� ��� �� �ٽ� �Է¹޵��� ���α׷� �����ϱ�.
 */
class InputNumberException extends Exception {
	InputNumberException(String msg) {
		super(msg);
	}
}
public class HW3 {
	public static void main(String[] args) {
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
//		do {
//			try {
//				count++;
//				System.out.print("1�� 100 ������ ���� �Է��ϼ���. : ");
//				input = new Scanner(System.in).nextInt();
//				if(answer > input) {
//					System.out.println("�� ū ���� �Է��ϼ���.");
//				} else if (answer < input) {
//					System.out.println("�� ���� ���� �Է��ϼ���.");
//				} else {
//					System.out.println("������ϴ�.");
//					System.out.println("�õ� Ƚ���� " + count + "�� �Դϴ�.");
//					break;
//				}
//			} catch (InputMismatchException e) {
//				System.out.println("���ڴ� �Է��� �� �����ϴ�.");
//			}
//			
//		} while(true);
		
		do {
			count++;
			System.out.print("1�� 100 ������ ���� �Է��ϼ���. : ");
			try {
				input = new Scanner(System.in).nextInt();
				if(input<0 || input>100) {
					InputNumberException e = new InputNumberException("1 ���� 100 ������ ���ڸ� �Է��� �ּ���.");
					throw e;
//					throw new InputNumberException("1 ���� 100 ������ ���ڸ� �Է��� �ּ���.");  //���ٿ� �ۼ�.
				}
			} catch (InputMismatchException e) {
				System.out.println("���ڴ� �Է��� �� �����ϴ�.");
				continue;
			} catch (InputNumberException e) {
				System.out.println(e.getMessage());
				continue;
			}
			if(answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else if (answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else {
				System.out.println("������ϴ�.");
				System.out.println("�õ� Ƚ���� " + count + "�� �Դϴ�.");
				break;
			}
		} while(true);
	}
}
