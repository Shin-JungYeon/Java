package chap16;

import java.util.Arrays;
import java.util.List;

/*
 * mapXXX �޼��� ���� : ��Ʈ���� ��Ҹ� ġȯ�ϴ� �޼���. ���ο� ��Ʈ���� ������ ���� �ƴ�.
 */
public class MapEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿��", "������", "�����", "����ġ��", "�羾������");
		
		list.stream().mapToInt(String::length).forEach(l -> System.out.print(l + " "));  //���ڿ��� �� ���ڿ��� ����(int)�� ���� ġȯ. mapToInt() : int���� ���ϰ����� ����.
		System.out.println();
		
		list.stream().mapToInt(s -> s.length()).forEach(l -> System.out.print(l + " "));
	}
}
