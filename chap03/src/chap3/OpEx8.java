package chap3;

import java.util.Scanner;

/*
 * 조건 연산자 예제
 * 두 개의 숫자를 입력받아서 더 큰 수를 출력하기
 */
public class OpEx8 {
	public static void main(String[] args) {
		System.out.println("숫자 두 개를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		//System.in : 표준입력, 키보드 입력을 기다림.
		int num1 = scan.nextInt(); //정수를 입력하지 않으면 에러.
		int num2 = scan.nextInt();
		
		int result = (num1>num2)?num1:num2;
		System.out.println("입력된 두 수 중 더 큰 수 : " + result);
		System.out.println("입력된 두 수 중 더 큰 수 : " + ((num1>num2)?num1:(num1<num2)?num2:"두 수는 같다.")); //조건 연산자를 연결에서 사용 가능.
	}
}