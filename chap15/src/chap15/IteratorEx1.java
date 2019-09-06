package chap15;

import java.util.List;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

/*
 * Iterator �������̽� : ��ȸ ���� ��ü. �ݺ���. -> ó������ ������ ��ü�� �ϳ��ϳ� �о.
 *   Collection ��ü�� Iterator ��ü�� ��ȯ�� �����ϴ�. -> iterator() �޼��带 �̿�
 *   �޼���
 *     1. boolean hasNext() : ��ȸ ��� ��ü ���� ��(true)/��(false) ����.
 *     2. Object next()		: ��ȸ�Ͽ� ��ü ����.
 *     3. void remove()	: ��ȸ�� ��ü�� ����. next() ���Ŀ� ��� ����.
 *     
 * Enumeration �������̽� : Iterator�� ������. Collection �����ӿ�ũ ������ ���Ǵ� �ݺ���. Vector(List ��ü), Hashtable(Map ��ü) Ŭ���������� ��� ����.
 *   �޼���
 *     1. boolean hasNextElement() : ��ȸ ��� ��ü ���� ��(true)/��(false) ����.
 *     2. Object nextElement()	   : ��ȸ�Ͽ� ��ü ����.
 *     remove() �޼���� �������� ����.
 */
public class IteratorEx1 {
	public static void main(String[] args) {
		Iterator it = null;
		List list = new ArrayList();
		Set set = new HashSet();
		for(int i=1; i<=5; i++) {
			list.add(i*10);
			set.add(i*100);
		}
		it = list.iterator();  //List ��ü�� Iterator ��ü�� ��ȯ
		print(it);
		it = set.iterator();  //Set ��ü�� Iterator ��ü�� ��ȯ
		print(it);
		System.out.println(list);  //print() �޼���� ���� remove �ؼ� ���� ������ ����.
		System.out.println(set);
		System.out.println();
		
		Vector vlist = new Vector();
		for(int i=1; i<=5; i++) {
			vlist.add(i*10);
		}
		System.out.println("Enumeration �ݺ��� ����");
		Enumeration e = vlist.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		e = vlist.elements();
		System.out.println(e.nextElement());  //������ �о �� �ٽ� ó������ ���ư��� ������ ��ü �ٽ� �ҷ��;� ��.
		it = vlist.iterator();  //Vector�� List��ü��. -> Iteration ��ü�� ��ȯ ����. 
		
	}
	private static void print(Iterator it) {
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
	}
}
