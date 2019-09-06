package chap3;
/*
 * 이항 연산자 : 산술 연산자 * / % + -
 *   % : 나머지 연산자, 결과의 부호는 피젯수(나눠지는 수)의 부호를 따름.
 */
public class OpEx3 {
	public static void main(String[] args) {
		System.out.println(10%8); //2
		System.out.println(-10%8); //-2
		System.out.println(10%-8); //2
		System.out.println(-10%-8); //-2
		System.out.println(10/8); //1, 정수/정수=정수
		System.out.println(-10/8); //-1
		System.out.println(10/-8); //-1
		System.out.println(-10/-8); //1
	}
}
