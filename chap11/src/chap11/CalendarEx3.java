package chap11;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 년도 월을 입력하면 해당 월의 달력 출력하기.
 */
public class CalendarEx3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요.");
		int year = scan.nextInt();
		System.out.println("월을 입력하세요.");
		int month = scan.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, (month-1), 1);  //입력한 월의 1일 설정.
		int firstWeek = cal.get(Calendar.DAY_OF_WEEK);  //1일의 요일 값(1~7)
		int lastDay = cal.getActualMaximum(Calendar.DATE);  //입력한 월의 마지막 날
		int day = 1;
		
		System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "일", "월", "화", "수", "목", "금", "토");
		
		for(int i=1; day<=lastDay; i++) {
		//i<=lastDay 로 조건을 설정하면 마지막날까지 찍히지 않음.
			if(i < firstWeek) {
				System.out.printf("%3s", " ");
			} else {
				System.out.printf("%3d", day);
				day++;
			}
			if(i%7==0) {
				System.out.println();
			}
		}
		
//		for(int i=1, day1=1; day<=lastDay; i++) {  //for문 조건문에서 지역변수 선언 여러개 가능
//			if(i < firstWeek) {
//				System.out.printf("%3s", " ");
//			} else {
//				System.out.printf("%3d", day1++);
//			}
//			if(i%7==0) {
//				System.out.println();
//			}
//		}

	}
}
