package chap4;

import java.util.Scanner;

/*
 * 화면에서 정수로 입력받아서 각각의 자리수의 합 구하기, 단 문자열로 하지 않기
 * 예)
 * 숫자를 입력하세요.
 * 123
 * 자리수의 합 : 9
 */
public class LoopEx13 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum=0;
		
		while(num!=0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println("각 자리수 합계 : " + sum);
		
	}
}
