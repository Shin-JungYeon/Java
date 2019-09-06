package chap3;

import java.util.Scanner;

/*
 * 화면에서 숫자를 입력받아서 짝수인지 홀수인지 출력하기
 */
public class Exam4 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String result = (num%2==0)?"짝수":"홀수";
		System.out.println(num + "은 " + result + "입니다.");
		System.out.println(num + "은 " + ((num%2==0)?"짝수":"홀수") + "입니다.");
	}
}