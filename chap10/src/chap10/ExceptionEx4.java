package chap10;
/*
 * throws 예제 : 예외처리.
 * 
 * throws : 발생된 예외를 현재 메서드를 호출한 메서드로 던져서 처리.
 * 
 * 예외처리
 *   try catch 방식
 *   throws 방식
 */
public class ExceptionEx4 {
	public static void main(String[] args) {
		System.out.println("main 메서드 시작");
		try {
			first();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main 메서드 종료");
	}
	private static void first() throws Exception {
		System.out.println("first 메서드 호출");
		second();
		System.out.println("first 메서드 종료");
	}
	private static void second() throws Exception {
		System.out.println("second 메서드 호출");
		System.out.println(10/0);  //ArithmeticException 예외 발생
		System.out.println("second 메서드 종료");
	}
}
