package chap3;
/*
 * 화면에서 3자리 정수를 입력받아 100자리 미만을 버리고 출력하기
 * 예2) 세자리 정수를 입력하세요
 *      321
 *      300
 * 예2) 세자리 정수를 입력하세요
 *      101
 *      100
 */
import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		int num;
		System.out.println("세자리 정수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
	    System.out.println((num/100)*100);
	    System.out.println(num-(num%100));
	}
}