package chap3;
/*
 * ��) ���ڸ� ������ �Է��ϼ���
 *     199
 *     101
 */
import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		int num, ans;
		System.out.println("���ڸ� ������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		ans = (num/100)*100;
	    System.out.println((num/100)*100 + 1);
	    System.out.println(++ans);
	}
}