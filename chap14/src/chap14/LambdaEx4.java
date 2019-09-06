package chap14;
/*
 * 3. 매개변수 여러 개이고, 리턴값도 존재.
 */
interface FunctionalInterface4 {
	int method(int x, int y);
}
public class LambdaEx4 {
	public static void main(String[] args) {
		//1.
		FunctionalInterface4 f4 = (x, y) -> {
			return x*y;
		};
		System.out.println("두 수의 곱 : " + f4.method(10, 5));  //결과가 값으로 리턴되기 때문에 prtin메서드로 출력해줘야 볼 수 있음.
		
		//2.
		f4 = (x, y) -> x+y;
		System.out.println("두 수의 합 : " + f4.method(10, 20));
		
		//3.
		System.out.println("두 수의 차 : " + calc((x, y) -> x-y, 20, 10));
		
		//문제 : calc 함수를 이용하기. -> 표현방식은 매우 다양함.
		f4 = (x, y) -> {
//			return Math.max(x, y);
			return (x>y)?x:y;
		};
		System.out.println("두 수 중 큰값 : " + calc(f4, 20, 10));
//		System.out.println("두 수 중 큰값 : " + calc((x, y) -> Math.max(x, y), 20, 10));  //((x>y)?x:y), 20, 10));
		System.out.println("두 수 중 작은값 : " + calc((x, y) -> Math.min(x, y), 10, 20));  //((x>y)?y:x), 10, 20));
		System.out.println("x/y의 몫 : " + calc((x, y) -> x/y, 25, 10));
	}
	static int calc(FunctionalInterface4 f, int x, int y) {  //f : (x, y) -> x-y
		return f.method(x, y);
	}
}
