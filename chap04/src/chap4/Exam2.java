package chap4;

import java.util.Scanner;

/*
 * 년도를 4자리로 입력받아 윤년 구하기
 * 4의 배수 중
 * 100의 배수이면서 400의 배수 : 윤년
 * 100의 배수이지만 400의 배수가 아님 : 평년
 * 100의 배수 아님 : 윤년
 * 
 */
public class Exam2 {
	public static void main(String[] args) {
		System.out.println("년도를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if (year%100 == 0) {
			if (year%400 == 0) {
				System.out.println("윤년입니다.");
			} else {
				System.out.println("평년입니다.");
			}
		} else if (year%4 == 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
		
		if (year%4 == 0) {
			if (year%400 == 0) {
				System.out.println("윤년입니다.");
			} else if (year%100 == 0) {
				System.out.println("평년입니다.");
			} else {
				System.out.println("윤년입니다.");
			}
		} else {
			System.out.println("평년입니다.");
		}
		
	}
}
