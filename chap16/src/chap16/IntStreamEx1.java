package chap16;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * IntStream 예제
 */
public class IntStreamEx1 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("Arrays.stream 메서드를 이용하여 IntStream 생성하기.");
		IntStream is1 = Arrays.stream(arr);  //arr이 정수형 배열이기 때문에 IntStream형으로 만들 수 있음.
		is1.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		System.out.println("IntStream.of 메서드를 이용하여 IntStream 생성하기.");
		IntStream is2 = IntStream.of(arr);
		is2.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		System.out.println("IntStream.range(1, 5) 메서드를 이용하여 IntStream 생성하기.");
		IntStream is3 = IntStream.range(1, 5);  //range(1, 5) 사용하면 배열을 일일히 만들지 않아도 1 ~ 4(5-1) 숫자 배열 생성.
		is3.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		System.out.println("IntStream.rangeClosed(1, 5) 메서드를 이용하여 IntStream 생성하기.");
		IntStream is4 = IntStream.rangeClosed(1, 5);  //마지막 숫자도 포함.
		is4.forEach(s -> System.out.print(s + " "));
		System.out.println();
	}
}
