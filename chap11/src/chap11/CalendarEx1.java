package chap11;

import java.util.Calendar;

/*
 * Calendar 클래스 : 추상클래스임. getInstance() 클래스 메서드를 이용하여 객체 생성함. -> 생성자가 private(동일 클래스 내에서만 접근 가능)임.
 * 
 */
public class CalendarEx1 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println("년도 : " + today.get(Calendar.YEAR));
		System.out.println("월 : " + (today.get(Calendar.MONTH)+1));  //today.get(Calendar.MONTH) : 0(1월) ~ 11(12월)
		System.out.println("일 : " + today.get(Calendar.DATE));
		System.out.println("일 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("년도기준 몇째주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("월기준 몇째주 : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("년기준 일자 : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일 : " + today.get(Calendar.DAY_OF_WEEK));  //1:일, 2:월, ..., 7:토
		System.out.println("월기준 몇번째요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("오전(0)오후(1) : " + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));  //12시가 되면 오후 0시로 표시.
		System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : " + today.get(Calendar.MINUTE));
		System.out.println("초 : " + today.get(Calendar.SECOND));
		System.out.println("밀리초 : " + today.get(Calendar.MILLISECOND));
		
		System.out.println("이달의 마지막날 : " + today.getActualMaximum(Calendar.DATE));
	}
}
