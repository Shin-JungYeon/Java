package chap3;
/*
 * 예) 세자리 정수를 입력하세요
 *     199
 *     101
 */
import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		int num, ans;
		System.out.println("세자리 정수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		ans = (num/100)*100;
	    System.out.println((num/100)*100 + 1);
	    System.out.println(++ans);
	}
}