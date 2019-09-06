package chap3;
/*12345초가 몇시간 몇분 몇초인지 출력하기.
 * 결과 : ??시간 ??분 ??초
 */
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		int num = 12345;
		int h, m, s;
		h = num/3600;
		m = (num%3600)/60;
		s = (num%3600)%60; // num%3600 을 할 필요 없음.
		System.out.println(h + "시간 " + m + "분 " + s + "초");
		System.out.println((num/3600) + "시간 " + ((num%3600)/60) + "분 " + (num%60) +"초");
		
		//숫자 입력 받아 계산하기
		System.out.println("계산할 초를 입력하세요");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt(); // 입력 받아서 정수로 대입
		System.out.println((num/3600) + "시간 " + ((num%3600)/60) + "분 " + (num%60) +"초");
	}
}