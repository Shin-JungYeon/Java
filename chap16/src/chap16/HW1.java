package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * 1. Stream �� �̿��Ͽ� �迭�� ��,����, ��� ���ϱ� 
 */
public class HW1 {
	 public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(5, 3, 2, 1, 4);
		 System.out.println("�հ� : " + list.stream().mapToInt(Integer::intValue).sum());  //intValue() : int ���� stream���� �ٲ���.
		 System.out.println("��� : " + list.stream().mapToInt(Integer::intValue).average().getAsDouble());
		 System.out.println("���� : " + list.stream().count());
	 }
}
