package chap3;
/*
 * 단항 연산자 : 부호 연산자 + -
 *   + : 현재 부호를 유지함.
 *   - : 현재 부호를 변경함.
 *   부호 자체를 나타내는 것이 아님. + 는 잘 쓰지 않음.
 * 단항 연산자 : 논리 연산자 !
 *   논리값을 변경
 */
public class OpEx2 {
	public static void main(String[] args) {
		int x = -10;
		System.out.println("x=" + +x); //x=-10
		System.out.println("x=" + -x); //x=10
		x = 10;
		System.out.println("x=" + +x); //x=10
		System.out.println("x=" + -x); //x=-10
		
		boolean b = true;
		System.out.println("b=" + !b); //b=false
		System.out.println("3 != 2 : " + (3 != 2)); //3 != 2 : true
	}
}