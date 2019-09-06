package chap4;

import java.util.Scanner;

/*
 * 점수를 입력받아서 60점 이상이면 합격, 아니면 불합격 출력하기
 * 반드시 switch 구문 이용.
 */
public class Exam3 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		switch(score/60) {
		case 1 :
			System.out.println("합격"); break;
		default :
			System.out.println("불합격");
		}
		
		switch(score/10) {
		case 10 :
		case 9 :
		case 8 :
		case 7 :
		case 6 :
			System.out.println("합격"); break; //한 case에 대해서 구문이 여러 개여도 중괄호 쓰지 않음.
		default :
			System.out.println("불합격");
		}
	}
}
