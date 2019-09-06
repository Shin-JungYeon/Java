package chap10;
/*
 * 컴파일 오류가 없도록 프로그램 수정하기.
 * main 메서드와 badmethod에서 각각 예외처리하기.
 */
class MyException extends Exception {  //1. extends RuntimeException {  으로 바꿔주기 -> 각 메서드에서 예외처리 불가
	MyException(String msg) {
		super(msg);
	}	
}
public class ExceptionEx10 {
	public static void main(String[] args) {
		try {
			badmethod();
		} catch (MyException e) {
			System.out.println("main 메서드에서 예외 처리");
		}
	}
	static void badmethod() throws MyException {
		try {
			throw new MyException("내가 만든 예외 클래스로 예외 강제 발생");
		} catch (MyException e) {
			System.out.println("badmethod 메서드에서 예외 처리");
			throw e;
		}
	}
}
