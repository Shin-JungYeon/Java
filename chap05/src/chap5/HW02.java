package chap5;

import java.util.Scanner;

/*
 * 2. 두개의 수를 입력 받아 두수의 공약수를 구하기
 * 
 * [결과 1]
 * 
 * 두개의 정수를 입력하세요
 * 10 25
 * 10과25의 공약수 :1,5
 * 
 * 
 * [결과 2]
 * 
 * 두개의 정수를 입력하세요
 * 3 10
 * 3과10의 공약수 :1
 * 
 * 
 * [결과 3]
 * 
 * 두개의 정수를 입력하세요
 * 10 20
 * 10과20의 공약수 :1,2,5,10
 */
public class HW02 {
	public static void main(String[] args) {
		System.out.println("두 개의 정수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.print(num1 + "과 " + num2 + "의 공약수 : ");
		

		if(num1>num2) {
			for(int i=1; i<=num2; i++) {
				if(num1%i==0 && num2%i==0) {
					System.out.print(i + "   ");
				}
			}
		} else {
			for(int i=1; i<=num1; i++) {
				if(num1%i==0 && num2%i==0) {
					System.out.print(i + "   ");
				}
			}
		}
		
	}
}
