package chap11;

import java.util.Calendar;
import java.util.TimeZone;

/*
 * Calendar 객체를 이용하여 날짜 설정하기.
 */
public class CalendarEx2 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		today.set(2019, (3-1), 10);  //월은 설정할 때 -1 해줘야 함.
		String week = null;
		switch(today.get(Calendar.DAY_OF_WEEK)) {
		case 1 : week = "일"; break;
		case 2 : week = "월"; break;
		case 3 : week = "화"; break;
		case 4 : week = "수"; break;
		case 5 : week = "목"; break;
		case 6 : week = "금"; break;
		case 7 : week = "토"; break;
		}
		System.out.printf("날짜 : %d년 %02d월 %02d일 %s요일\n", today.get(Calendar.YEAR),
				          today.get(Calendar.MONTH)+1, today.get(Calendar.DATE), week);  //%02d 2자리로 출력하는데 빈자리는 0으로 채움.
		
		System.out.println("서울 : Timezone(-12~12) : " + today.get(Calendar.ZONE_OFFSET)/(60*60*1000));  //그리니치 천문대를 기준으로 현지와의 시간 차이
		//today.get(Calendar.ZONE_OFFSET) : 밀리초로 리턴
		TimeZone timezon = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar lacal = Calendar.getInstance(timezon);
		System.out.println("LA : Timezone(-12~12) : " + lacal.get(Calendar.ZONE_OFFSET)/(60*60*1000));
	}
}
