package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * flatMapXXX ���� : �ٸ� ������ ���ο� ��Ʈ������ ������.
 */
public class FilterMapEx1 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("�ڹ�8 ������", "�߰��� ��Ʈ����", "������ ��������");
		/*
		 * flatMap(data -> Arrays.stream(data.split(" ")))
		 *  : data�� ��Ʈ���� �ϳ��� �����ͼ� ������ �������� ���ڿ��� ������ ���ο� �迭 ��Ʈ������ �ٲ���.
		 * 		-> "�ڹ�8", "������" -> "�ڹ�8", "������", "�߰���", "��Ʈ����" -> "�ڹ�8", ... , "��������"
		 * 		-> 3������ ��Ʈ���� 6���� ��. 
		 */
		list1.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(w -> System.out.println(w));
		System.out.println();
		list1.stream().flatMap(data -> {
			String[] s = data.split(" ");
			Stream<String> st = Arrays.stream(s); 
			return st;
		}).forEach(w -> System.out.println(w));  //���� ������ Ǯ� ��.
		System.out.println();
		
		/*
		 * flatMapToInt : ���ϰ��� �ݵ�� IntStream���� ���;� ��.
		 */
		List<String> list2 = Arrays.asList("10,20,30", "40,50,60");
		list2.stream().flatMapToInt(data -> {
			String[] arr = data.split(",");
			int[] intArr = new int[arr.length];
			for(int i=0; i<arr.length; i++) {
				intArr[i] = Integer.parseInt(arr[i]);
			}
			return Arrays.stream(intArr);  //int�� �迭�̴ϱ� IntStream Ÿ�� ����.
		}).forEach(n -> System.out.println(n));
	}
}
