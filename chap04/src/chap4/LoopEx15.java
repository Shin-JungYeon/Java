package chap4;

import java.util.Scanner;

/*
 * 1부터 100까지의 임의의 숫자 맞추기 프로그램 작성하기
 */
public class LoopEx15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num =(int)(Math.random() * 100 + 1); // 1부터 100까지의 임의의 수 저장
		int cnt=0; //cnt : 입력받은 횟수 저장
		
		while(true) {
			System.out.println("1 부터 100사이의 숫자를 입력하세요.");
			int input = scan.nextInt();
			cnt++;
			if(input > num) {
				System.out.println("\n더 작은 수를 입력하세요.");
			} else if(input < num) {
				System.out.println("\n더 큰 수를 입력하세요.");
			} else {
				System.out.println("\n정답입니다.");
				System.out.println("\n시도 횟수 : " + cnt);
				break;
			}
		}
		
	}
}