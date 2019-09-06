package chap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * collection : ��ü���� ����, �������̽�.
 * 
 *   List ���� : ��ü�� �߰��� ������ ����ؼ� ������.
 *   		       �ε��� ��� ������. �����迭�̶�� ��.
 *   		       ���� Ŭ���� : ArrayList	: List�� ��ǥ Ŭ����, ��� �޼��尡 ����ȭ �Ǿ� ���� ����.(����ȭ�� ���� unsafe)
 *                       Vector		: ArrayList�� ���� ����� Ŭ����, ��� �޼��尡 ����ȭ �Ǿ� ����.(����ȭ�� ���� safe)
 *                       LinkedList	: FiFo�� ������ Ŭ����.
 */
public class ListEx1 {
	public static void main(String[] args) {
		// <Integer> : ���׸� ǥ��. Integer ��ü�鸸�� ����.
//		List<Integer> list = new ArrayList<Integer>();  //List�� �������̽���. new List �Ұ���. ���� Ŭ����(ArrayList)�� ���ؼ��� ��üȭ ����.
//		List<Integer> list = new Vector<Integer>();  //���� Ŭ����(Vector)�� ���ؼ��� ��üȭ ����.
		List<Integer> list = new LinkedList<Integer>();  //���� Ŭ����(LinkedList)�� ���ؼ��� ��üȭ ����.
		list.add(1);	list.add(2);	list.add(5);  //list.add(new Integer(1)); ������ �̷������� �ۼ��ؾ� ������ �ڵ����� ����ȯ(Boxing) ����.
		list.add(4);	list.add(3);	list.add(1);  //add���� ������� �ε��� �ڵ� �ο�.
		System.out.println(list);
		
		//�ε����� �̿��ؼ� ������ �ҷ��� �� ����.
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + "��° ��ü : " + list.get(i));
		}
		
		//������ for���� ��� ����.(��� �÷��� ��ü���� �� ����.)
		for(Integer i : list) {
			System.out.println(i);
		}
		
		//subList() : �κ� List ��ü ���ϱ�.
		List<Integer> list2 = new ArrayList<Integer>(list.subList(1, 4));
		//(1)���� (4-1)�ε����� ������ ��������. 1, 2, 3 �ε����� �ش��ϴ� ��ü�� ����.
		//list�� �ε��� 1~3 �κ��� ���� �����ͼ� ���ο� ��ü ����. -> list�� ���ϴ� �Ͱ� �ƹ� ��� ����.
		
//		List<Integer> list2 = list.subList(1, 4);
		//���ο� ��ü�� ���� ���� �ƴ϶� list2�� list�� �ε��� 1~3 �κи� �����ϰ� �ִ� ��. ���ٰ� �޸� �̷��� list2�� ����� list���� �ٲ� ���� ���� �ٲ�.
		
		System.out.println("sort ���� list2 : " + list2);
		
		//Collections : Ŭ����, Collection ��ü��(Collection�� ���� �������̽����� ������ Ŭ������ ��ü)�� ���� ����� �����ϰ� ����.
		//Collection : �������̽�
		Collections.sort(list);  //list ��ü �������� �����ϱ�. -> ���� ����.
		System.out.println("sort ���� list  : " + list);
		System.out.println("sort ���� list2 : " + list2);
		System.out.println("list ��ü �� �ִ밪 : " + Collections.max(list));
		System.out.println("list ��ü �� �ּҰ� : " + Collections.min(list));
		
		System.out.println("list2 ��ü �� �ִ밪 : " + Collections.max(list2));
		System.out.println("list2 ��ü �� �ִ밪�� �ε��� : " + list2.indexOf(Collections.max(list2)));
		System.out.println(list2.indexOf(6));  //-1 ���� : �ش� ��ü�� ���� ���. -> String�� ����.
	}
}
