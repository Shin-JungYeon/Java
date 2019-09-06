package chap11;
/*
 * Object 클래스의 메서드 : toString() : 객체의 문자열화 하는 메서드
 * 		-> 참조변수 이름을 출력하면 자동 호출되는 메서드 
 * 		-> 클래스명@16진수해쉬코드 의 형태로 구현 됨. -> 기본메서드의 형태
 * 		-> 객체의 내용을 출력하기 위해서는 오버라이딩 필요.
 */
class ToString {
	int value;
	@Override
	public String toString() {
		return "ToString [value=" + value + "]";
	}
}
public class ToStringEx1 {
	public static void main(String[] args) {
		ToString t1 = new ToString();
		ToString t2 = new ToString();
		System.out.println(t1);
		System.out.println(t2);
	}
}
