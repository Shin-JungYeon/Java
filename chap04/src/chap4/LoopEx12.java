package chap4;

import java.util.Scanner;

/*
 * 화면에서 숫자로 이루어진 문자를 입력받아 각각의 자리수의 합을 구하기.
 * String length() 매서드
 * 예)
 * "12345"
 * 1+2+3+4+5 = 15
 * 자리수의 합 : 15
 * 
 * "123*456"
 * 숫자가 아님.
 */
public class LoopEx12 {
	private static final int String = 0;

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
//		int sum=0;
//		String str = scan.next().strip();
//		System.out.println(str);
//		for(int i=0;i<=str.length() ;i++) {
//			sum += (8);
//		}
//		System.out.println(sum);
		
		
		String val = scan.next();
		char ch;
		boolean isNum = true;
		for (int i=0 ; i<val.length(); i++) {  //문자열의 인덱스는 0부터 시작
			ch = val.charAt(i);  //입력받은 문자열의 i인덱스 값을 char값으로 변환.
			if(ch<'0' || ch>'9') {  //숫자 아님.
				isNum = false;
				break;
			}	
		}
		int sum2=0;
		if(isNum) {
			for (int i=0 ; i<val.length(); i++) {
				ch = val.charAt(i);
				sum2 += (ch-'0');
			}
			System.out.println("각 자리수 합계 : " + sum2);
		} else {
			System.out.println("숫자 아님.");
		}
		
	}
}
