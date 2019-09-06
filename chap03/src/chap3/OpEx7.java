package chap3;

import java.util.Scanner;

/*
 * 삼항 연산자 : 조건 연산자 ?
 * (조건문)?참:거짓
 */
public class OpEx7 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.(0~100)");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String result = (score>=60)?"합격":"불합격";
		System.out.println(score + "점수는 " + result + "입니다.");
		System.out.println(score + "점수는 " + ((score>=60)?"합격":"불합격") + "입니다."); //삼항 연산자는 우선순위가 낮아서 괄호 해주는 것이 좋음.
		int i = 1;
		String error = (true)?"참":"거짓"; //String error = (i)?"참":"거짓"; 에러, 조건문의 결과는 반드시 boolean이어야 함.
		System.out.println(error);
	}
}