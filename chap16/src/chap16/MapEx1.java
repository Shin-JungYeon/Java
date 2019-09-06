package chap16;

import java.util.Arrays;
import java.util.List;

/*
 * mapXXX 메서드 예제 : 스트림의 요소를 치환하는 메서드. 새로운 스트림을 만들어내는 것이 아님.
 */
public class MapEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동전", "춘향전", "구운몽", "전우치전", "사씨남정기");
		
		list.stream().mapToInt(String::length).forEach(l -> System.out.print(l + " "));  //문자열을 그 문자열의 길이(int)로 값을 치환. mapToInt() : int값을 리턴값으로 가짐.
		System.out.println();
		
		list.stream().mapToInt(s -> s.length()).forEach(l -> System.out.print(l + " "));
	}
}
