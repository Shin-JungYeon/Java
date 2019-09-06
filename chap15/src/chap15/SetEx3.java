package chap15;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * TreeSet : �ߺ��Ұ�, ���� ������ ������ �ִ� Set -> ������ ����� ���ϴ� ���� �߿�.
 * 			 Set �������̽��� ���� Ŭ���� -> TreeSet ��ü�� Set ��ü��.
 * 			   -> ��� Set�� ���� ������ ���� �ƴ϶� Set �������̽��� ���� ��ü�� SortedSet �������̽��� ������ ��.
 */
public class SetEx3 {
	public static void main(String[] args) {
//		TreeSet<String> set = new TreeSet<String>();
//		Set<String> set = new TreeSet<String>();  //subSet()�� Set�� ����� �ƴ�. -> HashSet(Set�� ���� ��ü)������ ��� �Ұ�.
		SortedSet<String> set = new TreeSet<String>();  //subSet()�� SortedSet�� �����.
		String from = "bat";
		String to = "d";
		
		set.add("abc"); set.add("bat"); set.add("azz");
		set.add("car"); set.add("Car"); set.add("disc");
		set.add("dance"); set.add("dZZZZ"); set.add("dzzzz");
		set.add("fan");
		
		System.out.println(set);  //�빮�� -> �ҹ��� : �⺻���� ���
		System.out.println("from:" + from + ", to:" + to);
		System.out.println(set.subSet(from, to));  //to�� ���� ���� ����.
		System.out.println("from:" + from + ", to:" + to + "zzzz");
		System.out.println(set.subSet(from, to + "zzzz"));
		System.out.println();
		
		/*
		 *  Comparator �������̽� ��ü -> ���� Ŭ������ �����ؾ� ��. Comparator<> c = new Comparator<>() {};
		 *   : compare �߻�޼��� ����
		 * 
		 * �⺻���� ���(��������)�� ������ �� ���Ǵ� ��ü.
		 */
		
		//��ҹ��� ���� ���� �������� �����ϱ�.
		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {  //���ϰ� int, ��ҹ��� ������� (s2-s1)����. -> ��� ����� s2�� �ڷ� ��.(������ ������)
				return s1.compareToIgnoreCase(s2);
			}
		};  // ; �ʼ�
		Set<String> set2 = new TreeSet<String>(c);  //��ȣ �ȿ� c������ ��ҹ��� ������. compareToIgnoreCase(s2) �� �ƴ϶� compareTo(s2)��.
		set2.add("car"); set2.add("Care"); set2.add("abc");
		System.out.println("set2=" + set2);
		
		//��ҹ��� ���� ���� �������� �����ϱ�.
		Set<String> set3 = new TreeSet<String>(c.reversed());
		//c.reversed() : ������. (jdk8.0 ���Ŀ� ���� -> default�޼���(������ ����, �ν��Ͻ����)�� �� �ֽ�.)
		set3.add("car"); set3.add("Care"); set3.add("abc");
		System.out.println("set3=" + set3);
		
		//�������� �����ϱ�.
		Set<String> set4 = new TreeSet<String>(Comparator.reverseOrder());
		//Comparator.reverseOrder() : ��ҹ��� ����, ��������. (jdk8.0 ���Ŀ� ���� -> static�޼���(������ ����, Ŭ�������)�� �� �ֽ�.)
		set4.add("car"); set4.add("Care"); set4.add("abc");
		System.out.println("set4=" + set4);
	}
}
