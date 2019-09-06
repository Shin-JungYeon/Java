package chap2;

public class VarEx1 {
	public static void main(String[] args) {
		//변수 : 메모리 공간 할당 > 주소를 가지고 있다. 변수 선언시 메모리 할당 됨.
		byte b1;   //변수의 선언
		b1 = 100;  //변수의 초기화
		byte b2 = 100;   //1byte : -128 ~ 127
		short s1 = 200;  //2byte
		int i1 = 300;    //4byte
		long l1 = 400;   //8byte
		System.out.println("b1=" + b1);
		System.out.println("b2=" + b2);
		System.out.println("s1=" + s1);
		System.out.println("i1=" + i1);
		System.out.println("l1=" + l1);
		//실수형
		/*
		 * 실수형 리터널의 기본 자료형은 double 임.
		 * 숫자 리터널에 붙는 자료형 표시 접미사
		 *   f, F : float 형 리터널
		 *   d, D : double 형 리터널
		 *   l, L : long 형 리터널
		 */
		float f1 = 10;  //10.0 이라고 하면 오류, 10.0f 라고 해야 함.
		double d1 = 10.0;  //10d 라고 써도 됨.
		System.out.println("f1=" + f1);
		System.out.println("d1=" + d1);
		//문제
		System.out.println(3000l*3000*3000);  //가급적 앞쪽에 l 붙여주기
		System.out.println("(b1+b2)=" + (b1+b2));  //byte + byte 의 결과는 int 이다. int 보다 작은 자료형의 연산의 결과는 int 임.
		byte sum = (byte)(b1 + b2);  //형변환 하지 않으면 오류.
		System.out.println("(b1+b2)=" + sum);  //2진수 덧셈하면서 부호가 바뀜
		i1 = s1;  //int <- short, s1앞에 (int)가 생략 되어 있음 : 자동 형변환
		s1 = (short)l1;  //short <- long : 명시적 형변환
		// 큰 것에서 작은 것으로 바꿀 때는 임의로 자를 수 없어서 형변환 해주지 않으면 오류.
		/*
		 * String s = 'a,b,c';
		 * s = 'a';  //기본형과 참조형 사이의 형변환 불가/ 단 Wrapper 클래스는 가능.
		 */
	}
}