package chap11;

import java.text.DecimalFormat;
import java.text.ParseException;

/*
 * DecimalFormat 클래스 예제 : 숫자를 형식화 하여 출력하기
 * 
 * parse() : 문자열을 숫자값으로 변경.
 * format() : 숫자값을 형식화 된 문자열로 변경.
 */
public class DecimalFormatEx1 {
	public static void main(String[] args) {
		DecimalFormat df1 = new DecimalFormat("#,###.##");  //숫자를 3자리마다 , 출력하고 소숫점 이하 2자리만 표시. # : 숫자 한 자리
		DecimalFormat df2 = new DecimalFormat("#.###E0");  //E0 : 십의 ?승 
		try {
			Number num = df1.parse("1,234,567.89");  //Number 클래스 : 숫자를 표시해 주는 것의 최상위 클래스
			double d = num.doubleValue();
			System.out.print(d + " -> ");
			System.out.println(df2.format(num));			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.println(df1.format(12345.67));
		System.out.printf("%,.2f\n", 12345.67);
		System.out.println();
		
		//str + 123 의 결과를 세자리마다 , 넣어 출력하기.
		String str = "123,456";
		DecimalFormat df3 = new DecimalFormat("#,###");
		try {
			Number num;
			num = df3.parse(str);
			int i = num.intValue() + 123;  //intValue() : int값으로 리턴.
			System.out.println(df3.format(i));
			System.out.printf("%,d\n", i);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
