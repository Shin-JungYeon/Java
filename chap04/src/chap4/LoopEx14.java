package chap4;

import java.util.Scanner;

/*
 * 화면에서 숫자를 99999 값이 입력될 때까지 입력받아서 입력된 숫자의 합과 평균 구하기.
 */
public class LoopEx14 {
	public static void main(String[] args) {
//		System.out.println("숫자를 입력하세요.(종료:99999");
//		Scanner scan = new Scanner(System.in);
//		int num=0, sum=0, i=0;
//		float ave=0;
//		
//		while(num!=99999) {
//			i++;
//			num = scan.nextInt();
//			if(num==99999) break;
//			sum += num;
//			ave = (float)sum/i;
//		}
//		System.out.println("총합 : " + sum + ", " + "평균 : " + ave);
		
		
		
		Scanner scan = new Scanner(System.in);
		int sum=0, cnt=0;
		while(true) {
			System.out.println("숫자를 입력하세요.(종료:99999");
			int num = scan.nextInt();
			if(num==99999) break;
			sum += num;
			cnt++;
		}
		System.out.println("총합 : " + sum + ", " + "평균 : " + (double)sum/cnt);
		
	}
}