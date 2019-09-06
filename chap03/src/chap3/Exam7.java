package chap3;

import java.util.Scanner;

/*
 * 사과를 사과 상자에 담기 위한 상자의 갯수를 출력하기
 * 상자에는 사과를 10개씩 담을 수 있음
 * 
 * 예1)
 * 사과의 갯수를 입력하세요
 * 22
 * 필요한 상자의 갯수 : 3
 * 예2)
 * 30
 * 3
 */
public class Exam7 {
	public static void main(String[] args) {
		System.out.println("사과의 갯수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("필요한 상자의 갯수 : " + ((num%10==0)?(num/10):(num/10+1)));
		
		int box = (num/10) + ((num%10==0)?0:1);
		System.out.println("필요한 상자의 갯수 : " + box);
	}
}