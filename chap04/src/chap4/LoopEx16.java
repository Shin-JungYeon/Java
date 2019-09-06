package chap4;

import java.util.Scanner;

/*
 * 입력받은 숫자가 회문수인지 판단하는 프로그램
 * 12321 : 회문수
 * 12345 : 회문수아님
 */
public class LoopEx16 {
	public static void main(String[] args) {
//		System.out.println("숫자를 입력하세요.");
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		int result=0;
//		while(true) {
//			result += num%10;
//			num /= 10;
//			if(num==0) {
//				if(result==num) {
//					System.out.println("회문수입니다.");
//					break;
//				} else {
//					System.out.println("회문수가 아닙니다.");
//					break;
//				}
//			} else;
//		}
		
		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int tmp = num;
		int result=0;
		while(tmp!=0) {
			result *= 10;
			result += tmp%10;
			tmp /=10;
		}
		if(num == result) {
			System.out.println(num + "는 회문수입니다.");
		} else {
			System.out.println(num + "는 회문수가 아닙니다.");
		}
		
	}
}
