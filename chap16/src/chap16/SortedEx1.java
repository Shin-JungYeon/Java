package chap16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * sorted() : �������� ����.
 * sorted(Comparator.reverseOrder()) : ���� ����.
 */
public class SortedEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿", "���", "�̸���");
		System.out.println("�⺻ ����");
		list.stream().sorted().forEach(s -> System.out.println(s));
		System.out.println();
		System.out.println("�⺻�� ���� ����");
		list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));
		
	}
}
