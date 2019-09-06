package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx2 {
	public static void main(String[] args) {
		String tel = "{HP:010-1111-1111,HOME:02-999-9999,OFF:02-2345-5678";
		String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		/*
		 * ()가 그룹 하나 -> 3개의 그룹, 1부터 시작.
		 * 그룹1 : (0\\d{1,2}) : 0으로 시작하고 뒤에 \\d(숫자)가 {1,2}(1개 또는 2개)인 경우
		 * 그룹2 : (\\d{3,4})  : 숫자가 3개 또는 4개인 경우
		 * 그룹3 : (\\d{4})    : 숫자가 4개인 경우
		 */
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(tel);  //패턴을 매칭 시킴.
		int i = 0;
		while(m.find()) {  //tel 문자열에서 패턴이 맞는 문자열을 찾아서 가지고 있음.
			System.out.println(++i + " : " + m.group() + " -> " + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
	}
}
