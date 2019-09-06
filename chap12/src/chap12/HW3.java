package chap12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

/*
 * 3. 화면으로부터 날짜를 "2019/05/11"의 형태로 입력받아서 무슨요일인지 출력하는 프로그램을 작성하시오.
 *    단 입력된 날짜의 형식이 잘못된 경우 메세지를 보여주고 다시 입력받아야 한다.
 */
public class HW3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("다음의 형식에 맞춰 날짜를 입력하세요.(yyyy/MM/dd)");
//		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
//	
//		Date d = null;
//		Calendar day = Calendar.getInstance();
//		String week = null;
//		
//		do {
//			String strdate = scan.next();
//			
//			String[] sub = strdate.split("/");
//			int yy = Integer.parseInt(sub[0]);
//			int mm = Integer.parseInt(sub[1]);
//			int dd = Integer.parseInt(sub[2]);
//			
//			try {
//				d = sf.parse(strdate);  //문자열을 Date 타입으로 저장.
//				day.set(yy, (mm-1), dd);
//				switch(day.get(Calendar.DAY_OF_WEEK)) {
//				case 1 : week = "일"; break;
//				case 2 : week = "월"; break;
//				case 3 : week = "화"; break;
//				case 4 : week = "수"; break;
//				case 5 : week = "목"; break;
//				case 6 : week = "금"; break;
//				case 7 : week = "토"; break;
//				}
//				System.out.println(strdate + "은 " + week + "요일 입니다.");
//				break;
//			} catch (ParseException e) {
//				System.out.println("잘못 입력하였습니다. 다시 입력해 주세요.(yyyy/MM/dd)");
//				continue;
//			}
//		} while(true);
		
		SimpleDateFormat sfin = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sfout = new SimpleDateFormat("E요일");
		while(true) {
			System.out.println("다음 형식에 맞춰 날짜를 입력해주세요.(yyyy/MM/dd)");
			String input = scan.next();
			try {
				Date day = sfin.parse(input);  //parse() : 형식에 맞는 문자열 -> Date타입, 예외처리 필수(RuntimeException의 하위 객체 아님.)
				System.out.println(sfout.format(day));  //format() : 지정된 형식으로 설정된 문자열 리턴. (Date -> 문자열)
				System.out.println("계속 입력하시겠습니까?(Y/N)");
				input = scan.next();
//				if(input.toUpperCase().equals("Y")) continue;
				if(input.equalsIgnoreCase("Y")) continue;  //대소문자 상관 없음.
				else break;
			}catch(ParseException e) {
				continue;
			}
		}
		
	}
}
