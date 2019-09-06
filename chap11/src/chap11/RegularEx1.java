package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규 표현식 예제 : 문자의 형식을 지정하여 선택활 수 있는 기능.
 */
public class RegularEx1 {
	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus", "cA", "ca", "cp", "c.",
				         "car","combat","count", "cTT", "data", "disk", "c"};
		Pattern p = Pattern.compile("c[a-zA-Z]*");
		/*
		 * c[a-z]* : 첫 번째 문자가 c이면서 다음 문자가 [a-z](소문자)가 *개(0개 이상, 없어도 됨)인 문자열 선택.
		 * c[a-z]+ : c 다음 소문자가 1개 이상.
		 * c[a-z]? : c 다음 소문자 1개 또는 없어도 됨.
		 */
		for(String s : data) {
			Matcher m = p.matcher(s);  //data의 값이 p의 형식에 일치하는 지 판단.
			if(m.matches()) {
				System.out.print(s + ", ");
			}
		}
		
		System.out.println();
		
		String names = "홍길동,     김삿갓,이몽룡    ,   성춘향  ,   임꺽정";
		String[] arr = names.split("\\s*,\\s*");
		//  \\s*, \\s* : , 앞 뒤로 *(0개 이상)의 \\s(공백)으로 구분해서 나누기.
		// split(String regex) : regex 정규식 표현 사용.
		for(String s : arr) {
//			System.out.println(s.trim());  //앞 뒤 공백 삭제.
			System.out.println(s);
		}
	}
}
