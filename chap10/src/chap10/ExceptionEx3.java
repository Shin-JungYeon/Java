package chap10;
/*
 * try catch finally 구문
 * 
 * finally : 정상처리, 예외발생시 모두 실행되는 블럭
 *           중간에 return 구문이 실행 돼도 finally 구문은 무조건 실행 되고 종료됨.
 */
public class ExceptionEx3 {
	public static void main(String[] args) {
		try {
			System.out.println("작업 시작");
			System.out.println("작업 중");
			int num = 10 / 0;
			System.out.println("작업 완료");
			return;
		} catch (Exception e) {
			System.out.println("작업 중 오류 발생");
			return;  //main 메서드 종료, finally는 꼭 실행함.
		} finally {
			System.out.println("작업 마무리 하기");  //예외 발생 유무와 상관 없이 실행
		}
//		System.out.println("프로그램 종료");  //리턴을 만나면 메인 메서드는 즉시 종료되므로 예외발생 유무와 상관 없이 이 구문은 절대 실행될 수 없음.
	}
}
