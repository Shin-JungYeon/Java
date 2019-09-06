package chap10;
/*
 * 다음 소스의 결과를 쓰시오.
 * 실행 후의 결과를 쓰시오.
 */
public class HW2 {
	static void method(boolean b) {  //2. ture 입력 받음  //10. false 입력 받음
		try {
			System.out.print(1);  //3. 1 출력  //11. 1출력
			if(b)  
				throw new ArithmeticException();  //4. true 이므로 예외 발생, catch 구문으로 넘어감.  //12. false 이므로 예외 발생시키지 않음.
			System.out.print(2);  //13. 예외 발생하지 않았으므로 2 출력
		} catch (RuntimeException r) {  //5. 예외가 발생했으므로 2 출력하지 못하고 catch 구문으로 넘어옴.
			System.out.print(3);  //6. ArithmeticException은 RuntimeException의 하위 개념이므로 이 구문에서 예외 처리 가능. 3출력
			return;  //7. method()메서드 종료, main메서드로 돌아감.
		} catch (Exception e) {
			System.out.print(4);
			return;
		} finally {  //8. 메서드는 종료하였지만 finally구문은 반드시 실행. 따라서 5 출력  //14. 예외 발생 유무와 상관없이 finally 구문 실행. 따라서 5 출력
			System.out.print(5);
		}
		System.out.print(6);  //15. 예외 발생하지 않았으므로 try catch 구문 빠져나와서 6 출력
	}
	public static void main(String[] args) {
		method(true);  //1. 메서드 호출   -> 135
		method(false);  //9. 메서드 호출  -> 1256
	}
}
