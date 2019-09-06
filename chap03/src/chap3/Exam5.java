package chap3;

import java.util.Scanner;

/*
 * 숫자를 입력받아서 양수면 양수, 음수면 음수를 0이면 0을 출력하기
 */
public class Exam5 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num + "은 " + ((num>0)?"양수":(num<0)?"음수":0) + "입니다.");
	}
}