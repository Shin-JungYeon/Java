package chap10;

public class ExceptionEx7 {
	public static void main(String[] args) {
		try {
			badmethod();  //(16 : throw e; 없는 경우) badmethod에서 예외를 발생 시키자마자 처리해버려서 main에서는 예외 발생여부를 알지 못함.
		} catch (Exception e) {
			System.out.println("main에서 예외 처리 message = " + e.getMessage());
			//getMessage() : 예외 발생 시 생성자의 매개값으로 사용한 메세지 리턴.
		}
	}
	private static void badmethod() throws Exception {
		try {
			throw new Exception("badmethod 생성한 예외 객체");
		} catch (Exception e) {  //한 번 들어온 예외 객체 e는 계속 붙잡고 있음.
			System.out.println("badmethod에서 예외 처리. message = " + e.getMessage());
			throw e;  //예외 처리했지만 다시 발생 -> throws 를 통해 main으로 예외 전달.
		}
	}
}
