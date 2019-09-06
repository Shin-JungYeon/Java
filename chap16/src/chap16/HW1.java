package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * 1. Stream 을 이용하여 배열의 합,갯수, 평균 구하기 
 */
public class HW1 {
	 public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(5, 3, 2, 1, 4);
		 System.out.println("합계 : " + list.stream().mapToInt(Integer::intValue).sum());  //intValue() : int 값의 stream으로 바꿔줌.
		 System.out.println("평균 : " + list.stream().mapToInt(Integer::intValue).average().getAsDouble());
		 System.out.println("갯수 : " + list.stream().count());
	 }
}
