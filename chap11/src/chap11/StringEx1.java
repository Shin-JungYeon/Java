package chap11;
/*
 * String 클래스 예제 : 정적문자열 클래스 : 변경 불가 객체
 *   클래스 중 유일하게 대입 연산자로 객체생성 가능. (기존 방식과 메모리 할당이 다름. 주의.)
 *   클래스 중 유일하게 + 연산자를 사용할 수 있음.
 *   
 * StringBuffer, StringBuilder 클래스 : 동적문자열 클래스 : 변경 가능 객체
 *   
 */
public class StringEx1 {
	public static void main(String[] args) {
		String s1 = "abc";  //클래스 영역에 abc 문자열객체를 만들어서 참조시킴.
		String s2 = "abc";  //클래스 영역을 뒤져서 같은 문자열객체가 있으면 그 객체의 참조값을 전달. -> 같은 객체가 됨.
		if(s1 == s2) {
			System.out.println("s1과  s2는 같은 객체임");
		} else {
			System.out.println("s1과  s2는 다른 객체임");
		}
		if(s1.equals(s2)) {
			System.out.println("s1과  s2는 같은 내용임");
		} else {
			System.out.println("s1과  s2는 다른 내용임");
		}
		System.out.println();
		
		String s3 = new String("abc");
		String s4 = new String("abc");  //힙영역에 각각의 객체를 생성. -> 서로 다른 객체가 됨.
		if(s3 == s4) {
			System.out.println("s3과  s4는 같은 객체임");
		} else {
			System.out.println("s3과  s4는 다른 객체임");
		}
		if(s3.equals(s4)) {
			System.out.println("s3과  s4는 같은 내용임");
		} else {
			System.out.println("s3과  s4는 다른 내용임");
		}
	}
}
