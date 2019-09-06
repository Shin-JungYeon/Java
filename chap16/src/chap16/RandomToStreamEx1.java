package chap16;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/*
 * 난수를 스트림화 하기 : Random 클래스 이용.
 */
public class RandomToStreamEx1 {
	public static void main(String[] args) {
		//int형 난수
		System.out.println("int형 난수 스트림 : Random().ints");
		IntStream is = new Random().ints(3);  //정수형 난수 3개
		is.forEach(s -> System.out.print(s + " "));
		System.out.println();
		is = new Random().ints(10, 0, 3);  //0부터 2(3-1) 사이의 정수형 난수 10개
		is.forEach(s -> System.out.print(s + " "));
		System.out.println();
		is = new Random().ints(6, 1, 46);  //1 부터 45(46-1) 사이의 난수 6개 저장.
		is.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		//long형 난수
		System.out.println("\nlong형 난수 스트림 : Random().longs");
		LongStream ls = new Random().longs(3);
		ls.forEach(s -> System.out.print(s + " "));
		System.out.println();
		ls = new Random().longs(3, 0, 10);
		ls.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		//char형 난수
		System.out.println("\nchar형 난수 스트림 : IntStream 사용");
		is = new Random().ints(10, 'A', 'Z'+1);
		is.forEach(s -> System.out.print((char)s + " "));
		System.out.println();
		is = "Stream을 배우자.".chars();  //문자열 자체를 가져와서 char형으로 바꿀 수 있음.
		is.forEach(s -> System.out.print((char)s + " "));
		System.out.println();
		
		//double형 난수
		System.out.println("\ndouble형 난수 스트림 : Random().doubles");
		DoubleStream ds = new Random().doubles(3);
		ds.forEach(s -> System.out.print(s + " "));  //double형은 절대 1을 넘지 않는다.
		System.out.println();
	}
}
