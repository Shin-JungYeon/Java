package chap10;

import java.util.Scanner;

/*
 * Exception 클래스를 상속 받아 MyException을 만들 수 있다. -> 자바에 있는 예외가 아닌 새로운 예외를 만들 수 있음.
 */
class LoginFailException extends Exception {
	private int code;
	LoginFailException(String msg) {
		super(msg);
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
}
public class ExceptionEx9 {
	public static void main(String[] args) {
		try {
			String id = "ssjy";
			String pw = "0401";
			Scanner scan = new Scanner(System.in);
			System.out.println("아이디를 입력하세요.");
			String inputid = scan.nextLine();
			System.out.println("비밀번호를 입력하세요.");
			String inputpw = scan.nextLine();
			if(id.contentEquals(inputid) && pw.equals(inputpw)) {
				System.out.println("로그인 성공");
			} else if(!id.equals(inputid)) {
				LoginFailException e = new LoginFailException("아이디가 틀립니다.");
				e.setCode(100);
				throw e;  //예외발생
			} else {
				LoginFailException e = new LoginFailException("비밀번호가 틀립니다.");
				e.setCode(200);
				throw e;
			}
		} catch(LoginFailException e) {
			System.out.println("오류 코드 : " + e.getCode());
			System.out.println("오류 메세지 : " + e.getMessage());  //LoginFailException 클래스가 상속받은 Exception 클래스에 있는 메서드.
			e.printStackTrace();
		}
	}
}
