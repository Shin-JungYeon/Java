package chap4;

import java.util.Scanner;

/*
 * 농장에 강아지, 병아리의 합과 다리수를 입력받아서 강아지의 마리 수, 병아리의 마리 수를 출력하기.
 * 계산이 안될 경우는 '정답 없음' 출력하기
 * 강아지 x 병아리 y : x + y = sum, x*4 + y*2 = leg
 */
public class LoopEx11 {
	public static void main(String[] args) {
		System.out.println("마리의 합과 다리 수를 순서대로 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int sum=0, leg=0;
		int x=0, y=0;
		sum = scan.nextInt();
		leg = scan.nextInt();
		
		for(x=0 ; x<sum ; x++) {
			for(y=sum-x; y>=0 ;y--) {
				if(x*4 + y*2 == leg) break;
			}
			if(x*4 + y*2 == leg) break;
		}
		if(y<0) {
			System.out.println("정답없음");
		} else {
			System.out.println("강아지 : " + x + "," + "병아리 : " + y);
		}
		
		
		
		boolean search = false;
		for(x=0 ; x<=sum ; x++) {
			for(y=0 ; y<=sum ; y++) {
				if(((x+y)==sum) && (x*4+y*2==leg)) {
					System.out.println("강아지 : " + x + "," + "병아리 : " + y);
					search = true;
				}
			}
		}
		if(!search)
			System.out.println("정답없음");
	}
}