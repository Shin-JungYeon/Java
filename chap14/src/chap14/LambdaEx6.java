package chap14;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

/*
 * Consumer FunctionInterface 예제
 *   매개변수가 있고, 리턴타입이 없는 추상 메서드를 멤버로 가지고 있는 인터페이스.
 *   accept(객체) 메서드.
 *   
 *   1. Consumer<T> : 매개변수로 T 타입의 Object(객체)만 받는 accept 메서드를 가짐.
 *   2. BiConsumer<T, U> : 매개변수가 2개인 accept 메서드를 가짐.
 *   3. DoubleConsumer : 매개변수가 double 타입인 accept 메서드를 가짐. 자동형변환 가능.
 *   4. ObjIntConsumer<T> : 매개변수로 T타입의 Object(객체)와 int 타입의 변수를 받는 accept 메서드를 가짐.
 *   ...
 */
public class LambdaEx6 {
	static Integer[] arr = {1, 2, 3, 4, 5};
	public static void main(String[] args) {
		//1.
		Consumer<String> c1 = t -> System.out.println(t + "8.0");
		c1.accept("Java");  //t라는 매개변수에 문자열(객체) 전달.
		
		Consumer<Integer[]> c2 = t -> {
			int sum = 0;
			for(int i : t) sum += i;
			System.out.println("배열의 합 : " + sum);
		};
		c2.accept(arr);
		
		//2.
		BiConsumer<String, String> c3 = (t, u) -> System.out.println(t + u);  //매개변수가 2개
		c3.accept("Jave", "8.0");
		
		//3.
		DoubleConsumer c4 = d -> System.out.println("Java" + d);
		c4.accept(8.0);  //8이라고 넣어도 자동형변환 되어 8.0으로 출력됨.
		
		//4.
		ObjIntConsumer<String> c5 = (t, i) -> System.out.println(t + i);
		c5.accept("jave", 8);
	}
}