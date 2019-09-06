package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date 클래스 예제 : 날짜를 표현하는 클래스
 * 
 * SimpleDateFormat : 형식화 클래스. Date 객체 <-> 형식화 된 문자열
 *   format() : Date 형태의 객체를 내가 지정한 format으로 출력할 수 있는 기능. Date 객체 -> 형식화 된 문자열
 *   parse() : 형식화 된 문자열을 Date 객체로 변경할 수 있는 기능. 형식화 된 문자열 -> Date 객체
 *   
 * yyyy : 년도를 4자리로 출력
 * MM   : 월을 2자리로 출력
 * dd   : 일을 2자리로 출력
 * HH   : 시를 2자리로 출력
 * mm   : 분을 2자리로 출력
 * ss   : 초를 2자리로 출력
 * E    : 요일 출력
 * a    : 오전/오후 구분하여 출력
 */
public class DateEx1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");  //Date를 표현하는 형식을 지정해줌.
		System.out.println(sf.format(now));  //sf 객체를 만들 때 지정해준 형식으로 now를 출력.
		
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = "2019-03-09";  //형식에 맞게 문자열을 넣어줘야 함.
		Date d = null;
		try {
			d = sf2.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(d);
		
		//2019년 03월 09일의 요일 출력하기
		SimpleDateFormat sf3 = new SimpleDateFormat("E");
		System.out.println(strDate + "은 " + sf3.format(d) + "요일 입니다.");
//		SimpleDateFormat sf4 = new SimpleDateFormat("yyyy-MM-dd은 E요일 입니다.");  //형식에 내가 원하는 문장 넣어줘도 됨. 형식 지정만 잘 해주면 됩니당.
//		System.out.println(s33.format(d));
		
	}
}
