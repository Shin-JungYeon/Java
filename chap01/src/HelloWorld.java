/* 여러줄 주석
 * 주석 : 컴파일러의 번역 대상이 아님. 자바 문법과 관련이 없는 부분.
 * 1. 자바는 대소문자를 구분함.
 * 2. public class HelloWorld 인 경우 파일의 이름은 반드시 HelloWorld.java 여야 함. (클래스명 == 파일명)
 *    (하나의 파일 안에 class 는 여러개일 수 있지만 public class 는 단 하나)
 * 3. 자바 컴파일러 javac 를 이용하여 확장자가 .class 인 바이트 코드 파일 생성 됨.
 * 4. 자바 인터프리터 java 를 이용하여 실행 됨.
*/
public class HelloWorld {
   public static void main (String[] args) {
      // 한줄 주석 : 이후 부분이 주석.
	  // 표준 출력 : 화면에 내용을 출력
	  System.out.println("HelloWorld");
	  //syso ctrl+space > 자동완성
   }
}