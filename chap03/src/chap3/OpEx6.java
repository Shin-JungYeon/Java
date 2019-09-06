package chap3;
/*
 * 이항 연산자 : 대입 연산자, 연산의 방향 <----
 *   int a = 10;
 *       lvalue = rvalue;
 *       lvalue : 반드시 변수, 상수여야 함.
 *       rvalue : 값, 변수, 상수, 수식 가능
 *       a + 10 = 100; (x)
 *       a = 100 + 10; (o)
 */
public class OpEx6 {
	public static void main(String[] args) {
		int num = 100;
		System.out.println(num);
		num += 10; //num = num + 10;
		System.out.println(num);
		num /= 10; //num = num/10;
		System.out.println(num);
		num += 2 + 3;
		System.out.println(num);
		
		byte b = 1;
		b *= 2; //b값 자체가 바뀌는 것이기 때문에 에러나지 않음.
		//b = b * 2; 에러
		System.out.println(b);
		b *= 2;
		System.out.println(b);
		b *= 2;
		System.out.println(b);
	}
}