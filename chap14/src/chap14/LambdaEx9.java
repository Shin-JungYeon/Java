package chap14;

import java.util.function.IntBinaryOperator;

/*
 * Operator FunctionInterface 예제
 *   Function 인터페이스의 하위 인터페이스.
 *   매개변수 있고, 리턴값도 존재.
 *   Function과 비슷하지만 두 매개변수 사이의 대소관계 등의 연산에 쓰임.
 *   
 *   1. IntBinaryOperator : int applyAsInt(int, int) : int형인 매개변수 두 개를 받아 int형 값을 리턴.
 *   ...
 */
public class LambdaEx9 {
	private static int[] score = {92, 85, 87};
	public static void main(String[] args) {
		System.out.println("최대값 : " + maxOrMin((a, b) -> (a>=b)?a:b));
		System.out.println("최소값 : " + maxOrMin((a, b) -> (a<=b)?a:b));
	}
	//op : (a, b) -> (a>=b)?a:b)  //둘 중 큰 값 전달.
	//op : (a, b) -> (a<=b)?a:b)  //둘 중 작은 값 전달.
	private static int maxOrMin(IntBinaryOperator op) {
		int result = score[0];
		for(int s : score) {
			result = op.applyAsInt(result, s);
		}
		return result;
	}
}
