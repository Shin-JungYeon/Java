package chap11;
/*
 * String 클래스의 주요 메서드
 */
public class StringEx2 {
	public static void main(String[] args) {
	String s = new String("ABCDEFGH");
	
	System.out.println("s.charAt(4) : " + s.charAt(4));  //(인덱스가 4인)5번째 문자 하나를 리턴
	
	System.out.println("s.compareTo('abc') : " + s.compareTo("abc"));
	//현재 문자열에서 소문자 abc를 빼 (ABCDEFGH - abc = -32) : 정렬관련 메서드
	//객체가 가진 문자열에서 비교할 문자열을 뺌. -> 음수:객체가 앞, 양수:비교문자열이 앞.
	
	System.out.println("s.compareToIgnoreCese('ABC') : " + s.compareToIgnoreCase("abcdefgh"));  //IgnoreCese : 대소문자 상관없이 순서 비교.
	
	System.out.println("s.concat('abc') : " + s.concat("abc"));  //두 개의 문자열을 붙여 s + "abc" 와 같음.
	
	System.out.println("s.endsWith('FGH') : " + s.endsWith("FGH"));  //s 문자열의 끝 문자열이 "FGH" ?
	
	System.out.println("s.startsWith('ABC') : " + s.startsWith("ABC"));  //s 문저열의 시작 문자열이 "ABC" ?
	
	System.out.println("s.equalsIgnoreCase('abcdefgh') : " + s.equalsIgnoreCase("abcdefgh"));  //대소문자 상관없이 같은지 다른지 확인.
	
	
	System.out.println();
	
	
	s = "This is a String";
	System.out.println("s.indexOf('i') : " + s.indexOf('i'));
	System.out.println("s.indexOf('is') : " + s.indexOf("is"));
	//indexof(문자) : 문자의 위치를 정수값으로 리턴
	
	System.out.println("s.indexOf('is', 3) : " + s.indexOf("is", 3));
	//indexof(문자, 인덱스) : 인덱스(포함)부터 문자를 찾아서 그 문자의 시작 위치 리턴
	
	System.out.println("s.lastindexOf('is') : " + s.lastIndexOf("is"));
	System.out.println("s.lastindexOf('i') : " + s.lastIndexOf("i"));  //13
	//lastindexOf() : 뒤쪽 문자를 우선으로 위치 리턴. 위치 인덱스는 그대로 앞부터 시작.
	
	System.out.println("s.length() : " + s.length());  //문자열 길이
	
	System.out.println("s.replace('is', 'IS') : " + s.replace("is", "IS"));  //치환
	
	System.out.println("s.substring(5) : " + s.substring(5));  //substring(인덱스) : 부분문자열, 인덱스 이후 문자를 모두 리턴
	System.out.println("s.substring(5,  13) : " + s.substring(5,  13));
	//substring(시작인덱스, 끝인덱스) : 시작인덱스부터 끝인덱스 앞(끝인덱스-1)까지의 문자만 리턴
	
	System.out.println("s.toLowerCase() : " + s.toLowerCase());  //전부 소문자로 바꿔줌.
	System.out.println("s.toUpperCase() : " + s.toUpperCase());  //전부 대문자로 바꿔줌.
	
	s = "        문자열의 trim 메서드            ";
	System.out.println("s.trim() : " + s.trim());  //양쪽 공백을 제거, 중간에 있는 공백은 제거되지 않음.
	
	//토큰 : 의미있는 문자열. -> 토큰화 : 의미있는 문자열로 분류. (split이 이것은 아님.)
	s = "HTML,CSS,JavaScript,Java,JSP,Spring";
	String[] subject = s.split(",");  //split(Regex) : Regex를 기준으로 문자열을 나눠서 배열에 저장.
	for(int i=0; i<subject.length; i++) {
		System.out.println((i+1) + " : " + subject[i]);
	}
	
	//문자열 <- 기본형
	s = "" + 123;  //이렇게 써도 ㄱㅊㄱㅊ
	s = String.valueOf(123);  //이게 원래 맞는 것.
	
	//기본형 <- 문자열  (String 클래스 아니고 사실 Wrapper 클래스)
	int i = Integer.parseInt("123");
	double d = Double.parseDouble("123.5");
	
	//format() : 서식문자를 사용하여 형식화 할 수 있는 기능
	s = String.format("%.2f", d);
	System.out.println(s);
	s = String.format("%-10d", i);
	System.out.println(s);
	
	}
}
