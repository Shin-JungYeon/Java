package chap15;

import java.util.List;
import java.util.Vector;

/*
 * Vector ���� : List ���� Ŭ����.
 *             Collection �����ӿ�ũ ������ ���Ǵ� Ŭ����.
 *             List �������̽��� �޼���� ������ ���Ǵ� �޼��尡 ȥ�� �Ǿ� ����.
 */
public class ListEx2 {
	public static void main(String[] args) {
		Vector<Double> list = new Vector();
		list.add(0.3);
		list.add(Math.PI);  //add() List �� �ִ� �߻� �޼���
		list.addElement(5.0);  //addElement() : Vector Ŭ������ �ִ� ���. ����� ����. List�� ����� �ƴϹǷ� List Ÿ���� ��ü�� ����(����)�� �� ����.
		System.out.println(list);
		double num = 5.0;
		int index = list.indexOf(num);
		if(index<0) System.out.println(num + "�� list�� ���� ����Դϴ�.");
		else System.out.println(num + "�� ��ġ�� " + index + "�Դϴ�.");
		if(list.contains(num)) {  //list �ȿ� num �̶�� ��Ұ� �־�? true/false
//			list.removeElement(num);  //num�̶�� ��Ҹ� ����. remove() �޼��� �����ε� �Ǿ� ����.
			list.remove(num);  //num�̶�� ��Ҹ� ����. remove() �޼��� �����ε� �Ǿ� ����. num�� �ڷ����� Integer �̸� �ε����� �켱.
			System.out.println(num + " ���� ��.");
		}
		list.remove(0);  //�ε��� 0�� ���� -> ���� ��ҵ��� ������ ������� �ٽ� 0��° ��Ұ� ����. remove() �޼��� �����ε� �Ǿ� ����.
		System.out.println(list);
		System.out.println(list.get(0));
		List<Integer> list2 = new Vector<Integer>();
		for(int i=0; i<=5; i++) {
			list2.add(i*10);
		}
		System.out.println(list2.remove(0));
		System.out.println(list2.remove(30));  //�ڷ����� Integer �̸� �ε����� �켱. -> ArrayIndexOutOfBoundsException ���� �߻�.
		System.out.println(list2.remove(new Integer(30)));  //��ü�� �־���� ��.
		
	}
}
