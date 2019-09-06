package chap4;

import java.util.Scanner;

/*
 * 한 개의 문자를 입력 받아서 대문자인지, 소문자인지, 기타 문자인지 출력하기
 */
public class Exam1 {
	public static void main(String[] args) {
		System.out.println("문자 한 개를 입력하세요.");
		Scanner scan = new Scanner(System.in);
	    char ch = scan.next().charAt(0);
	    
	    if (ch >= 'A' && ch <= 'Z') {
	    	System.out.println("대문자입니다.");
	    } else if (ch >= 'a' && ch <= 'z') {
	    	System.out.println("소문자입니다.");
	    } else if (ch >= '0' && ch <= '9' ) {
	    	System.out.println("숫자입니다.");
	    } else {
	    	System.out.println("기타문자입니다.");
	    }
	}
}
