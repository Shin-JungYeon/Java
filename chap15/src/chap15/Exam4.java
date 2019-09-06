package chap15;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 1 ~ 99 ������ ������ �Է� �޾Ƽ�, �Էµ� ���� 999�� �Ǹ� �Է��� ����. �ߺ��� ���ڴ� ����.
 * set1 �������� ����
 * set2 �������� ����
 */
public class Exam4 {
	public static void main(String[] args) {
		System.out.println("1 ~ 99������ ������ �Է��� �ּ���.(�׸� �Է��ϰ� ������ 999�� �Է��ϼ���.)");
		Scanner scan = new Scanner(System.in);
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		int input=0;
		while(input!=999) {
			try {
				input = scan.nextInt();
				if(input<1 || input>99 && input!=999) {
					throw new Exception();
				}
				set1.add(input);
				//set2.add(input);  //�̷��� �ϸ� �� ���ܾ�
			} catch (Exception e) {
				System.out.println("������ ������ϴ�. 1 ~ 99 ������ ������ �Է��� �ּ���.");
				continue;
			}
		}  //do while �� ���� 0���� ������ �� �ֳ�!
		set1.remove(999);
		System.out.println("�������� ���� : " + set1);
		
		TreeSet<Integer> set2 = new TreeSet<Integer>(Comparator.reverseOrder());
		for(Integer i : set1) {
			set2.add(i);
		}
		System.out.println("�������� ���� : " + set2);
	}
}
