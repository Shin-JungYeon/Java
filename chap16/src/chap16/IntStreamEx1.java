package chap16;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * IntStream ����
 */
public class IntStreamEx1 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("Arrays.stream �޼��带 �̿��Ͽ� IntStream �����ϱ�.");
		IntStream is1 = Arrays.stream(arr);  //arr�� ������ �迭�̱� ������ IntStream������ ���� �� ����.
		is1.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		System.out.println("IntStream.of �޼��带 �̿��Ͽ� IntStream �����ϱ�.");
		IntStream is2 = IntStream.of(arr);
		is2.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		System.out.println("IntStream.range(1, 5) �޼��带 �̿��Ͽ� IntStream �����ϱ�.");
		IntStream is3 = IntStream.range(1, 5);  //range(1, 5) ����ϸ� �迭�� ������ ������ �ʾƵ� 1 ~ 4(5-1) ���� �迭 ����.
		is3.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		System.out.println("IntStream.rangeClosed(1, 5) �޼��带 �̿��Ͽ� IntStream �����ϱ�.");
		IntStream is4 = IntStream.rangeClosed(1, 5);  //������ ���ڵ� ����.
		is4.forEach(s -> System.out.print(s + " "));
		System.out.println();
	}
}
