package chap3;

import java.util.Scanner;

/*
 * ���� ������ ����
 * �� ���� ���ڸ� �Է¹޾Ƽ� �� ū ���� ����ϱ�
 */
public class OpEx8 {
	public static void main(String[] args) {
		System.out.println("���� �� ���� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		//System.in : ǥ���Է�, Ű���� �Է��� ��ٸ�.
		int num1 = scan.nextInt(); //������ �Է����� ������ ����.
		int num2 = scan.nextInt();
		
		int result = (num1>num2)?num1:num2;
		System.out.println("�Էµ� �� �� �� �� ū �� : " + result);
		System.out.println("�Էµ� �� �� �� �� ū �� : " + ((num1>num2)?num1:(num1<num2)?num2:"�� ���� ����.")); //���� �����ڸ� ���ῡ�� ��� ����.
	}
}