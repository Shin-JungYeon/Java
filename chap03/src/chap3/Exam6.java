package chap3;

import java.util.Scanner;
/*
 * 문자를 입력받아서 소문자인 경우 대문자로 변경하기
 * 영문자가 아닌 경우 소문자 아님 출력하기
 */
public class Exam6 {
	public static void main(String[] args) {
		System.out.println("소문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
	    char c = scan.next().charAt(0); //문자열 입력받기, charAt(0) : 0번 째 인덱스의 값을 c에 대입('dse' 라는 값을 입력하면 d를 대입)
	    //System.out.println((c>=97 && c<=122)?(char)(c-32):(c<=90 && c>=65)?c:"소문자 아님.");
	    System.out.println(c + (((c>='a')&&(c<='z'))?"의 대문자는 " + (char)(c-32):"문자는 소문자 아님.")); //문자끼리 대소 관계 따질 수 있음.
	}
}