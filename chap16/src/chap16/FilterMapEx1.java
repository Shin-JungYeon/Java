package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * flatMapXXX 예제 : 다른 형태의 새로운 스트림으로 생성함.
 */
public class FilterMapEx1 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("자바8 버전에", "추가된 스트림을", "열심히 공부하자");
		/*
		 * flatMap(data -> Arrays.stream(data.split(" ")))
		 *  : data에 스트림을 하나씩 가져와서 공백을 기준으로 문자열을 나누고 새로운 배열 스트림으로 바꿔줌.
		 * 		-> "자바8", "버전에" -> "자바8", "버전에", "추가된", "스트림을" -> "자바8", ... , "공부하자"
		 * 		-> 3개였던 스트림이 6개가 됨. 
		 */
		list1.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(w -> System.out.println(w));
		System.out.println();
		list1.stream().flatMap(data -> {
			String[] s = data.split(" ");
			Stream<String> st = Arrays.stream(s); 
			return st;
		}).forEach(w -> System.out.println(w));  //위의 내용을 풀어쓴 것.
		System.out.println();
		
		/*
		 * flatMapToInt : 리턴값이 반드시 IntStream으로 나와야 함.
		 */
		List<String> list2 = Arrays.asList("10,20,30", "40,50,60");
		list2.stream().flatMapToInt(data -> {
			String[] arr = data.split(",");
			int[] intArr = new int[arr.length];
			for(int i=0; i<arr.length; i++) {
				intArr[i] = Integer.parseInt(arr[i]);
			}
			return Arrays.stream(intArr);  //int형 배열이니까 IntStream 타입 리턴.
		}).forEach(n -> System.out.println(n));
	}
}
