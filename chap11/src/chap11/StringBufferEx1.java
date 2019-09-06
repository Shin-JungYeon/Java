package chap11;
/*
 * StringBuffer 클래스 예제
 *   1. 동적 문자열, 값을 변경하는 메서드를 사용할 때 새로운 객체를 만들 지 않음. -> String 클래스는 새로운 객체를 생성 후 새로운 내용 만들어 냄.
 *   2. equals 메서드가 오버라이딩 되어 있지 않음. -> 내용 비교를 할 수 없다. 내용비교를 위해서는 String 으로 변경 후 내용 비교를 해야 함.
 *   
 */
public class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		if(sb1.equals(sb2)) {  //같은 객체인지 아닌지 비교해줌.
			System.out.println("sb1과 sb2 의 내용이 같다.");
		} else {
			System.out.println("sb1과 sb2 의 내용이 다르다.");
		}
		
		if(sb1.toString().equals(sb2.toString())) {  //.toSring() -> 문자열로 바꿔 줌. String 객체로 변경 후 내용 비교 가능.
			System.out.println("sb1과 sb2 의 내용이 같다.");
		} else {
			System.out.println("sb1과 sb2 의 내용이 다르다.");
		}
		
	}
}
