package chap11;
/*
 * String 객체는 정적인 문자열이다.
 */
public class StringEx3 {
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println("main : " + str);
		change(str);
		System.out.println("main : change() 이후 str : " + str);
	}
	private static void change(String str) {
		str += "456";
		System.out.println("change() : str = " + str);
	}
	
}
