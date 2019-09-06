package chap18;

import java.util.Scanner;

/*
 * Scanner 예제
 *   String 을 입력받아 사용하기.
 */
public class ScannerEx1 {
	public static void main(String[] args) {
		String str = "Java and   Jsp and  Spring and HTML and JanaScript";
		Scanner scan = new Scanner(str);
		scan.useDelimiter("\\s*and\\s*");  // \\s* : 공백(\\s) 0개 이상(*) 정규식. 1개 이상(+), 0 또는 1(?)
										   //useDelimiter(정규식) : 정규식을 기준으로 분류.(정규식은 포함하지 않음.)
		while(scan.hasNext()) {
			System.out.println(scan.next());
		}
		
	}
}
