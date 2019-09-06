package chap16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 * collection 객체의 기존 방식과 Stream 방식 비교
 */
public class StreamEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "김삿갓", "이몽룡");
		System.out.println("기존 방식 : Iterator 객체 사용");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.print(name + " ");
		}
		System.out.println();
		
		System.out.println("Stream 방식");
		Stream<String> st = list.stream();  //List -> Stream
		st.forEach(name -> System.out.print(name + " "));  //forEach() : Consumer 타입(매개변수 o, 리턴타입 x)
		System.out.println();
	}
}
