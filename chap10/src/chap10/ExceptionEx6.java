package chap10;
/*
 * throws : 예외처리. 발생된 예외를 제거.
 * throw new 예외명() : 예외발생. 없는 예외를 강제로 만들어 냄.
 */
public class ExceptionEx6 {
	public static void main(String[] args) {
		try {
			badmethod();
		} catch (Exception e) {
			System.out.println("main 메이서드에서 badmethod 예외 처리");
			e.printStackTrace();
		}
	}
	private static void badmethod() throws Exception {
		throw new Exception("예외 강제 발생");
	}
}
