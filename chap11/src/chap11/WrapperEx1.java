package chap11;
/*
 * Wrapper 클래스 : 8개의 기본자료형을 객체화 하기 위한 클래스
 * 
 * 		기본 자료형		Wrapper 클래스
 * 		 boolean	 Boolean
 * 		 byte		 Byte
 * 		 short	 	 Short
 *   	 int		 Integer
 *  	 long		 Long
 *  	 char		 Character
 *   	 float		 Float
 *   	 double		 Double
 *   
 *   기본적으로 기본자료형과 참조자료형 사이의 형변환은 불가
 *   단, 예외적으로 기본자료형과 Wrapper 클래스 간의 형변환은 가능하다.(jdk5.0 이후 부터)
 *   
 *   기본자료형 <- 참조자료형 : auto unBoxing
 *   참조자료형 <- 기본자료형 : auto Boxing
 */
public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i1 = 100;  //auto Boxing
		Integer i2 = 100;
		if(i1 == i2) {  //Integer 객체임. (Object 객체 포함)
			System.out.println("i1과 i2는 같다.");
		} else {
			System.out.println("i1과 i2는 다르다.");
		}
		if(i1.equals(i2)) {  //Object 안에 있기 때문에 equals() 메서드 사용 가능. 같은 Integer 객체임.
			System.out.println("i1과 i2는 같다.");
		} else {
			System.out.println("i1과 i2는 다르다.");
		}
		System.out.println();
		
		Integer i3 = new Integer(100);  //Deprecated : 가능하면 사용하지 마. 어차피 자동으로 형변환 해줌.
		Integer i4 = new Integer(100);  //객체 생성 방식이 위와 달라서 다른 객체가 됨.
		if(i3 == i4) {
			System.out.println("i3과 i4는 같다.");
		} else {
			System.out.println("i3과 i4는 다르다.");
		}
		if(i3.equals(i4)) {  //내용 비교
			System.out.println("i3과 i4는 같다.");
		} else {
			System.out.println("i3과 i4는 다르다.");
		}
		System.out.println();
		
		System.out.println("int형 값의 최대값 : " + Integer.MAX_VALUE);
		System.out.println("int형 값의 최소값 : " + Integer.MIN_VALUE);
		System.out.println("int의 bit 수 : " + Integer.SIZE);
		System.out.println();
		
		//byte형의 최대값, 최소값, bit 개수
		System.out.println("byte형 값의 최대값 : " + Byte.MAX_VALUE);
		System.out.println("byte형 값의 최소값 : " + Byte.MIN_VALUE);
		System.out.println("byte의 bit 수 : " + Byte.SIZE);
		System.out.println();
		
		//정수 문자열을 int값으로 변환
		int num = Integer.parseInt("123");
		System.out.println("10진수 : " + num);
		num = Integer.parseInt("123", 8);
		System.out.println("8진수 : 123 -> 10진수 : " + num);
		num = Integer.parseInt("123", 16);
		System.out.println("16진수 : 123 -> 10진수 : " + num);
		System.out.println();
		
		//10진수를 2, 8, 16진수로 변환
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toOctalString(83));
		System.out.println(Integer.toHexString(291));
		System.out.println();
		
		//실수 문자열을 float, double로 변환
		float f = Float.parseFloat("123.45");
		System.out.println(f+10);
		double d = Double.parseDouble("123.456");
		System.out.println(d+10);

	}
}
