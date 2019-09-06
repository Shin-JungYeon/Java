package chap11;
/*
 * 1. 한 곳만 수정하여 다음의 결과나 나오도록 수정하기
 * 
 * [결과]
 * basket
 * basketball
 */
public class HW1 {
	public static void main(String[] args) {
		String str = "base";
		str = str.replace('e','k')+"et";
		System.out.println(str);
		str += "ball";
		System.out.println(str);
	}
}