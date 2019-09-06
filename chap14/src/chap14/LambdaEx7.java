package chap14;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
 * Supplier FunctionInterface 예제
 *   매개변수값은 없고, 리턴값만 존재함.
 *   getXXX() 메서드
 *   
 *   1. Supplier<T> : 리턴값의 타입이 T(Object)인 get() 메서드를 가짐.
 *   2. IntSupplier : 리턴값의 타입이 int인 getAsInt() 메서드를 가짐.
 *   3. DoubleSupplier : 리턴값의 타입이 double인 getAsDouble() 메서드를 가짐.
 *   ...
 */
public class LambdaEx7 {
	public static void main(String[] args) {
		//1.
		Supplier<String> s1 = () -> "Java";  //리턴 내용이 한줄일 땐 return 생략 가능.
		System.out.println(s1.get());
		
		//2.
		IntSupplier s2 = () -> {
			int num = (int)(Math.random()*10) + 1;
			return num;
		};
		System.out.println("1 부터 10사이의 임의의 수 : " + s2.getAsInt());
		
		//문제 : s2를 이용해서 1부터 100까지의 합 구하기.
		s2 = () -> {
			int sum = 0;
			for(int i=1; i<=100; i++) {
				sum += i;
			}
			return sum;
		};
		System.out.println("1 부터 100까지의 합 : " + s2.getAsInt());
		
		//3.
		double[] arr = {1, 2, 5, 5.6, 10, 20, 30.5};
		DoubleSupplier s3 = () -> {
			double arrsum = 0;
			for(double d : arr) {
				arrsum += d;
			}
			return arrsum;
		};
		System.out.println("arr 배열의 요소들의 합 : " + s3.getAsDouble());
	}
}
