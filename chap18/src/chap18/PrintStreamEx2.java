package chap18;
/*
 * PrintStream 클래스 
 *   printf 메서드 : 서식지정 문자 사용 가능. jdk5.0(jdk1.5) 이후 버전
 */
public class PrintStreamEx2 {
	public static void main(String[] args) {
		//문자형(char) 서식 지정 문자 : %c, %n == \n
		System.out.printf("%c%n", 'A');		//문자 한 개 출력.
		System.out.printf("%5c%n", 'A');	//5자리 확보 후 출력. 우측정렬
		System.out.printf("%-5c%n", 'A');	//5자리 확보 후 출력. 좌측정렬
		System.out.println();
		
		//정수(byte, int, long) 서식 지정 문자 : %d(10진수), %o(8진수), %x(16진수, 소문자), %X(16진수, 대문자)
		System.out.printf("%d%n", 12345);		//10진수 출력
		System.out.printf("%,d%n", 12345);		//10진수 세 자리마다 , 출력
		System.out.printf("%10d%n", 12345);		//최소 10자리 확보 후 10진수 출력. 우측정렬
		System.out.printf("%3d%n", 12345);		//출력할 정수보다 지정한 자릿수가 작으면 그냥 전부 출력
		System.out.printf("%010d%n", 12345);	//10자리 확보 후 10진수 출력. 빈자리는 0으로 채움
		System.out.printf("%-10d%n", 12345);	//최소 10자리 확보 후 10진수 출력. 좌측정렬
		System.out.printf("%,10d%n", 12345);	//10자리 확보 수 10진수 출력. 세 자리마다 , 출력(,도 자리수 차지함)
		System.out.printf("%-,10d%n", 12345);	//10자리 확보 수 10진수 출력. 세 자리마다 , 출력. 좌측정렬 (서식지정 순서 지켜줘야 함.)
		System.out.printf("%,010d%n", 12345);	//10자리 확보 후 빈자리 0으로 채우고 세 자리마다 , 출력

		System.out.printf("%o%n", 12345);	//8진수 출력
		
		System.out.printf("%x%n", 255);		//16진수 출력. 소문자로
		System.out.printf("%X%n", 255);		//16진수 출력. 대문자로
		System.out.println();
		
		//실수(double, float) 서식 지정 문자 : %f, %e, %g
		System.out.printf("%f%n", 12345.12345);	
		System.out.printf("%.2f%n", 12345.12345);		//소수점 이하 2자리까지만(반올림해서) 출력
		System.out.printf("%10.2f%n", 12345.12345);		//10자리 확보 후 소수점 이하 2자리까지만(반올림해서) 출력 (.도 자리수 차지함)
		System.out.printf("%,10.2f%n", 12345.12345);	//10자리 확보 후 세 자리마다 , 출력. 소수점 이하 2자리까지만 출력. 우측정렬.
		System.out.printf("%-,10.2f%n", 12345.12345);	//10자리 확보 후 세 자리마다 , 출력. 소수점 이하 2자리까지만 출력. 좌측정렬.
		System.out.printf("%,010.2f%n", 12345.12345);	//10자리 확보 후  빈자리 0으로 채움. 세 자리마다 , 출력. 소수점 이하 2자리까지만 출력.
		
		System.out.printf("%e%n",12345.12345);	//지수형태로 출력(10^n)
		
		System.out.printf("%g%n", 12345.12345);  //근사실수로 출력. 가장 보기 좋은 형태로 알아서 출력. 거의 안씀.
		
		//논리형(boolean) 서식 지정 문자 : %b
		System.out.printf("%b != %b%n", true, false);
		
		
		//문자열(String) 서식 지정 문자 : %s
		System.out.printf("%s은 %s다.%n", "홍길동", "남자");
		System.out.printf("%10s은 %10s다.%n", "홍길동", "남자");		//10자리 확보 후 출력.
		
		
		//문제 : 10진수 255는 8진수 377이다. -> printf로 출력하기
		System.out.printf("%d진수 %d는 %d진수 %o이다.%n", 10, 255, 8, 255);  //값을 서식 지정 문자만큼 넣어줘야함. 순서대로 매칭.
		//문제 : 10진수 255는 16진수 FF이다. -> printf로 출력하기
		System.out.printf("%d진수 %d는 %d진수 %X이다.%n", 10, 255, 16, 255);
		//문제 : 홍길동의 급여는  1,500,000만원이다. 출력하기. 단 1500000은 10자리 확보하고 세 자리마다 , 출력. 우측정렬하기.
		System.out.printf("%s의 %s는 %,10d만원이다.%n", "홍길동", "급여", 1500000);
	}
}
