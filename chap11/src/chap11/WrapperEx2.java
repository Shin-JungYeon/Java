package chap11;
/*
 * Character 클래스 예제
 */
public class WrapperEx2 {
	public static void main(String[] args) {
		char[] data = {'A', 'a', '9', '&'};
		for(char c : data) {
			if(Character.isUpperCase(c)) {
				System.out.println(c + "는 대문자 입니다.");
			} else if (Character.isLowerCase(c)) {
				System.out.println(c + "는 소문자 입니다.");
			} else if (Character.isDigit(c)) {
				System.out.println(c + "는 숫자 입니다.");
			} else {
				System.out.println(c + "는 일반 문자 입니다.");
			}
		}
		Character ch = new Character('A');
		if(ch == 'A') {  //auto unBoxing, 자신과 대응되는 기본자료형과 비교 가능.
			System.out.println("ch는 A문자 입니다.");
		}
		if(ch.equals('A')) {
			System.out.println("ch는 A문자 입니다.");
		}
		
	}
}
