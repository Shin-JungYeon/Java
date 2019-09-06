package chap16;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/*
 * ������ ��Ʈ��ȭ �ϱ� : Random Ŭ���� �̿�.
 */
public class RandomToStreamEx1 {
	public static void main(String[] args) {
		//int�� ����
		System.out.println("int�� ���� ��Ʈ�� : Random().ints");
		IntStream is = new Random().ints(3);  //������ ���� 3��
		is.forEach(s -> System.out.print(s + " "));
		System.out.println();
		is = new Random().ints(10, 0, 3);  //0���� 2(3-1) ������ ������ ���� 10��
		is.forEach(s -> System.out.print(s + " "));
		System.out.println();
		is = new Random().ints(6, 1, 46);  //1 ���� 45(46-1) ������ ���� 6�� ����.
		is.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		//long�� ����
		System.out.println("\nlong�� ���� ��Ʈ�� : Random().longs");
		LongStream ls = new Random().longs(3);
		ls.forEach(s -> System.out.print(s + " "));
		System.out.println();
		ls = new Random().longs(3, 0, 10);
		ls.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		//char�� ����
		System.out.println("\nchar�� ���� ��Ʈ�� : IntStream ���");
		is = new Random().ints(10, 'A', 'Z'+1);
		is.forEach(s -> System.out.print((char)s + " "));
		System.out.println();
		is = "Stream�� �����.".chars();  //���ڿ� ��ü�� �����ͼ� char������ �ٲ� �� ����.
		is.forEach(s -> System.out.print((char)s + " "));
		System.out.println();
		
		//double�� ����
		System.out.println("\ndouble�� ���� ��Ʈ�� : Random().doubles");
		DoubleStream ds = new Random().doubles(3);
		ds.forEach(s -> System.out.print(s + " "));  //double���� ���� 1�� ���� �ʴ´�.
		System.out.println();
	}
}
