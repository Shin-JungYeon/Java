package chap10;
/*
 * 컴파일에러는 실행 자체가 되지 않음. 예외가 발생해도 실행이 되긴 함. -> 예외 발생 전까지는 정상 작동. 예외 만나면 실행 종료.
 * 예외처리 예제
 * try catch
 * 
 *   정상 : 12346
 *   예외1 : 1256
 *   예외2 : 강제종료
 *   
 * try : 예외가 발생할 수 있는 구문들
 * catch : try 블럭 실행시 발생되는 예외를 처리하는 블럭 -> 예외 처리 후 정상 실행 유지.
 */
public class ExceptionEx1 {
	public static void main(String[] args) {
		System.out.print("예외2 : ");
		System.out.print(1/0);
		try {
			System.out.print(2);
			System.out.print(3/0);
			System.out.print(4);
		} catch (ArithmeticException e) {  //try 구문 안에서 예외가 발생했을 때 catch 구문으로 넘어감.
			System.out.print(5);
		}
		System.out.println(6);
	}
}
