package chap4;

import java.util.Scanner;

/*
 * if 구문 예제
 * if (조건식1 : boolean) {
 *    문장1 : 조건식1의 결과가 참인 경우 실행되는 부분
 *    ....
 * } else if (조건식2) {
 *    문장2 : 조건식1의 결과가 거짓이고 조건식2의 결과가 참인 경우 실행되는 부분
 *    ....
 * } else {
 *    문장3 : 모든 조건식이 거짓인 경우 실행되는 부분
 * }
 *  if, if ~ else, if ~ else if ~ ... ~ else 모두 가능하지만 if는 꼭 있어야 함.
 *  실행해야 하는 문장이 한 개인 경우 {} 생략 가능.
 */
public class IfEx1 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(score >= 60) {
			System.out.println("합격을 축하합니다.");
		} else {
			System.out.println("불합격 입니다.");
		}
		
		if (score >= 90) {
			System.out.println("A학점입니다.");
		} else if (score >= 80) {
			System.out.println("B학점입니다.");
		} else if (score >= 70) {
			System.out.println("C학점입니다.");
		} else if (score >= 60) {
			System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		} 
	}
}