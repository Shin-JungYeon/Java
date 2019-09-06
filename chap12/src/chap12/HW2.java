package chap12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * 2. Calendar클래스와 SimpleDateFormat클래스를 이용해서 2019년의 매월 두번째 일요일의 날짜를 출력하시오.
 * Calendar.DAY_OF_WEEK_IN_MONTH  : 해당요일이 몇번째
 * Calendar.DAY_OF_WEEK   : 요일 1:일요일
 * Date cal.getTime()
 */
public class HW2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//		Date sunday = new Date();
		
		System.out.println("년도를 입력하세요.");
		int year = scan.nextInt();
		
		Calendar cal = Calendar.getInstance();  //현재날짜
		
		System.out.println(year + "년의 매월 두 번째 일요일은 ");
		for(int i=0; i<12; i++) {
			cal.set(year, i, 1);  //lastday 구하기 위해 날짜 재설정.
			int lastday = cal.getActualMaximum(Calendar.DATE);
			for(int j=1; j<=lastday; j++) {
				cal.set(year, i, j);
				if((cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)==2)&&(cal.get(Calendar.DAY_OF_WEEK)==1)) {
//					Date day = cal.getTime();
//					System.out.println(sf.format(day) + "은 두번째 일요일 입니다.");
					System.out.printf("%02d월 %02d일\n", (cal.get(Calendar.MONTH)+1), cal.get(Calendar.DATE));
				}
			}
		}
		
	}
}
