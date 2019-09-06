package chap10;

import java.util.InputMismatchException;  //Scanner에서 발생한 예외이기 때문에 import 필요
import java.util.Scanner;

/*
 * 다음은 사이의 숫자를 맞추는 게임을 싱행하던 도중에 숫자가 아닌 영문자를 넣어서 발생한 예외이다.
 * 예외처리를 해서 숫자가 아닌 값을 입력했을 때는 다시 입력을 받도록 프로그램 작성하기.
 * 
 * 1과 100 사이의 값을 입력하세요 : 50
 * 더 작은 수를 입력하세요.
 * 1과 100 사이의 값을 입력하세요 : aaa
 * Exception in thread "main" java.util.InputMismatchException
 * at java.util.Scanner.throwFor(Scanner.java:819)
 * ....
 * 
 * 1부터 100 사이의 수가 아닌 경우 InputNumberException 예외를 발생하고,
 * 1 부터 100 사이의 수만 입력 가능합니다. 메세지 출력 후 다시 입력받도록 프로그램 수정하기.
 */
class InputNumberException extends Exception {
	InputNumberException(String msg) {
		super(msg);
	}
}
public class HW3 {
	public static void main(String[] args) {
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
//		do {
//			try {
//				count++;
//				System.out.print("1과 100 사이의 값을 입력하세요. : ");
//				input = new Scanner(System.in).nextInt();
//				if(answer > input) {
//					System.out.println("더 큰 수를 입력하세요.");
//				} else if (answer < input) {
//					System.out.println("더 작은 수를 입력하세요.");
//				} else {
//					System.out.println("맞췄습니다.");
//					System.out.println("시도 횟수는 " + count + "번 입니다.");
//					break;
//				}
//			} catch (InputMismatchException e) {
//				System.out.println("문자는 입력할 수 없습니다.");
//			}
//			
//		} while(true);
		
		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요. : ");
			try {
				input = new Scanner(System.in).nextInt();
				if(input<0 || input>100) {
					InputNumberException e = new InputNumberException("1 부터 100 사이의 숫자를 입력해 주세요.");
					throw e;
//					throw new InputNumberException("1 부터 100 사이의 숫자를 입력해 주세요.");  //한줄에 작성.
				}
			} catch (InputMismatchException e) {
				System.out.println("문자는 입력할 수 없습니다.");
				continue;
			} catch (InputNumberException e) {
				System.out.println(e.getMessage());
				continue;
			}
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("맞췄습니다.");
				System.out.println("시도 횟수는 " + count + "번 입니다.");
				break;
			}
		} while(true);
	}
}
