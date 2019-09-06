package chap10;
/*
 * 다중 catch 구문 예제 : try 구문에서 발생 가능성이 있는 예외가 여러개인 경우 catch 구문을 여러개 사용할 수 잇다.
 * 
 * catch 구문에서 사용되는 예외객체는 상위자료형은 아래쪽에 배치해야 한다.
 *  -> Exception 객체를 사용하는 catch 구문은 제일 아래쪽에 배치 된다. 그렇지 않으면 에러 발생.
 */
public class ExceptionEx2 {
	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
			System.out.println(Integer.parseInt(args[0]));  //문자열을 그대로 숫자로 변경하라. 홍길동은 변경 못해 -> NumberFormatException 발생
			System.out.println(10 / Integer.parseInt(args[0]));
			String str = null;
			System.out.println(str.trim());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 파라미터를 입력하세요.");
		} catch (NumberFormatException e) {
			System.out.println("command 라인에 파라미터는 숫자만 가능합니다.");
		} catch (ArithmeticException e) {
			System.out.println("command 라인에 파라미터는 0은 입력하지 마세요.");
//		} catch(NullPointerException e) {  //객체 없이 메서드 호출해서 발생
//			
		} catch (Exception e) {  //모든 예외를 하나하나 구문으로 작성해줄 수 없으니까 그 외 모든 예외를 처리하는 구문, 이 구문을 맨 위로 올려버리면 얘가 모든 예외를 처리. 그렇기 때문에 계층도에 따라 제일 아래쪽에 작성하도록 함.
			e.printStackTrace();  //예외의 종류가 어느 것인지 알려줌.
			System.out.println("전산부로 연락주세요. (전화 : 1234)");
		}
	}
}
