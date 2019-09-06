package chap16;

import java.util.Arrays;
import java.util.List;

/*
 * ��Ʈ���� Filter ����
 */
public class FilterStreamEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿", "���", "ȫ�浿", "�Ӳ���", "ȫ�浿");
		list.stream().distinct().forEach(s -> System.out.println(s));  //distinct() : �ߺ� ����.
		System.out.println();
		
		list.stream().filter(s -> s.startsWith("ȫ")).forEach(s -> System.out.println(s));
		System.out.println();
		
		list.stream().distinct().filter(s -> s.startsWith("ȫ")).forEach(s -> System.out.println(s));
		System.out.println();
	}
}
