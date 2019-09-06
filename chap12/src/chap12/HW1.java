package chap12;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1. 1부터 99까지의 숫자를 5개를 입력받아 이들의 평균과 중앙값을 구하는 프로그램을 작성하시오.
 *    중앙값은 주어진 수를 크기 순서대로 늘어 놓았을 때 가장 중앙에 놓인 값이다.
 *   
 *    10, 40, 30, 60, 30의 경우, 크기 순서대로 늘어 놓으면
 *    10 30 30 40 60
 *    이 되고 따라서 중앙값은 30 이 된다.
 */
public class HW1 {
	public static void main(String[] args) {
		 System.out.println("1부터 99까지의 수 중 5개를 입력하시오.");
		 Scanner scan = new Scanner(System.in);
		 int[] num = new int[5];
		 int sum=0;
		 for(int i=0; i<num.length; i++) {
			 num[i] = scan.nextInt();
			 sum += num[i];
		 }
		 
		 Arrays.sort(num);  //오름차순 정렬
		 
//		 int sum=0;
//		 for(int i=0; i<num.length; i++) {
//			 sum += num[i];
//		 }  //굳이 따로 만들어줄 필요 없지!
		 
		 System.out.println("중앙값 : " + num[num.length/2]);
		 System.out.println("평균값 : " + (double)sum/num.length);
	}
}
