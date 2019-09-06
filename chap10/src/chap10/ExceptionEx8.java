package chap10;
/*
 * 예외처리 안해도 오류가 나지 않도록 수정하기.
 * RuntimeException : 예외처리 생략 가능한 예외.
 */
public class ExceptionEx8 {
	public static void main(String[] args) {
		badmethod();
	}
	private static void badmethod() {
		throw new RuntimeException("예외 강제 발생");
	}
}
