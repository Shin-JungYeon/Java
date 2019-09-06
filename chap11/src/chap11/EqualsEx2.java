package chap11;
/*
 * 자바 API의 String 클래스도 equals 메서드가 오버라이딩 되어 있음. -> 자체적으로 내용 비교하는 메서드로 오버라이딩 되어 있음.
 * 문자열 객체의 내용비교 시 == 사용하지 말고, equals 메서드를 사용해야 함. -> String은 일반 자료형과 반대로  객체 자체 비교를 위해서는 == 사용.
 */
public class EqualsEx2 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		if(str1 == str2) {
			System.out.println("str1과 str는 같은 객체다.");
		} else {
			System.out.println("str1과 str는 다른 객체다.");
		}
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 같은 내용의 문자열 객체다.");
		} else {
			System.out.println("str1과 str2는 다른 내용의 문자열 객체다.");
		}
		if(str1.equals("abc")) {
			System.out.println("str1은 내용이 abc 인 문자열이다.");
		} else {
			System.out.println("str1은 내용이 abc 인 문자열이 아니다.");
		}
	}
}
