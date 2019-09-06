package chap5;

import java.util.Scanner;

/*
 * 1. 삼각형의 높이를 입력받아 이등변 삼각형을 출력하기
 * [예1]
 * 삼각형의 높이를 입력하세요
 * 5   
 *      *
 *     ***
 *    *****
 *   *******
 *  *********
 *  가장 밑바닥 : 9개 = 높이*2-1
 *  규칙성을 잘 찾아 생각생각~
 */
public class HW1 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt();
		for(int i=1; i<=high; i++) {
			for(int j=1; j<=high*2-1; j++) {
				if((high-i+1==j)) {
					for(int k=1; k<=(i*2-1); k++) {
						System.out.print("*");
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
//		int len = scan.nextInt();
//		int max = len*2 - 1;  //밑바닥 * 갯수
//		for (int i=0; i<len; i++) {
//			for(int j=0; j<max; j++) {
//				if(j>=(max/2 - i) && j<= (max/2+i)) {
//					System.out.print("*");
//				} else if(j < (max/2-i) || j>(max/2+i)) {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
	}
}
