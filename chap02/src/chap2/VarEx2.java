package chap2;
/*
 * 형변환 예제
 * 1. 기본자료형 8가지 중 boolean 을 제외한 7개의 자료형은 형변환이 가능하다.
 *    자동 형변환 : 형변환 연산자 생략 가능
 *    명시적 형변환 : 형변환 연산자를 기술함.
 *    
 *    ----> 자동 형변환 가능
 *    <---- 명시적 형변환(형변환 연산자 사용)
 *    byte  short  int  long  float  double
 *          char
 *          
 * 2. 기본자료형과 참조자료형 간의 형변환은 불가함. 단 Wrapper 클래스는 예외임.
 * 3. String 클래스는 참조형 중 유일하게 + 연산자를 이용하여 String 형으로 형변환이 가능함.
 * 
 *    String <- String + 기본형
 */
public class VarEx2 {
	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte) (b1 + b2);  //명시적 형변환(자동 형변환 대상자가 아니면 해 줘야 오류가 나지 않음)
		long l1 = 100, l2 = 200;
		long l3 = l1 + l2;
		//float > long : float 자료형이 long 보다 큰 자료형임.
		float f1 = l3;  //자동 형변환, long 보다 float 가 (논리적으로)더 큰 자료 저장 가능
		l1 = (long)f1;  //명시적 형변환
		
	    char c1 = 'A';
	    int i1 = c1;  //문자도 내부적으로는 2진수 값(아스키값)
	    System.out.println("c1=" + c1);  //c1=A
	    System.out.println("i1=" + i1);  //i1=65 : 아스키 코드 값.
	    
	    //문제 : 대문자와 소문자는 32만큼 차이가 난다. c1변수를 이용하여 소문자 a 출력하기
	    System.out.println("c2=" + (char)(c1 + 32));
	    System.out.println(1 + 2 + 3 + "번");
	    System.out.println("번호 :" + 1 + 2 + 3);
	}
}
