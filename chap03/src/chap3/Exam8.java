package chap3;

import java.util.Scanner;

/*
 * 10 ~ 99 사이의 수를 입력받아서 입력 받은 수보다 크거나 같은 가장 가까운 10의 배수를 구하여
 * 구해진 10의 배수와 입력받은 수의 차를 출력하기
 * 예1)
 * 10부터 99사이의 수를 입력하세요
 * 24
 * 30 - 24
 * 6
 */
public class Exam8 {
	public static void main(String[] args) {
		System.out.println("10부터 99사이의 수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result;
		result = ((num%10==0)?(num):(num/10+1)*10) - num;
		System.out.println(result);
		
		int num10 = (num/10)*10 + ((num%10==0)?0:10);
		System.out.println(num10 + "-" + num + "=" + (num10 - num));
	}
}