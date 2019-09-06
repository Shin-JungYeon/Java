package chap4;

import java.util.Scanner;

/*
 * switch 구문
 * switch(값) {
 *    case 값1 : 문장1;
 *    case 값2 : 문장2;
 *    ...
 *    default : 문장n;
 * }
 *  범위지정이 안 됨. 정확한 값을 조건으로 넣어줘야 함.
 */
public class SwitchEx1 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String grade;
		
		switch (score / 10) {
		   case 10 : //break가 없어 빠져 나가지 않고 9과 같은 결과를 보여줌.
		   case 9 : grade = "A";
		            break; //switch 구문을 벗어남. 없으면 순서대로 모든 문장이 실행 됨.
		   case 8 : grade = "B";
		   			break;
		   case 7 : grade = "C";
		   			break;
		   case 6 : grade = "D";
		   			break;
		   default : grade = "F";
		   			 break;
		}
		System.out.println(score + "점수는 " + grade + "학점입니다.");
	}
}
