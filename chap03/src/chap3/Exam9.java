package chap3;

import java.util.Scanner;

/*
 * 화면에서 점수를 입력 받아서 90점 이상이면 A, 80점 이상이면 B...학점
 */
public class Exam9 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		char grade = ((score>=90)?'A':
			         ((score>=80)?'B':
			         ((score>=70)?'C':
			         ((score>=60)?'D':'F'))));
		System.out.println(score + "점은 " + grade + "학점입니다.");
	}
}