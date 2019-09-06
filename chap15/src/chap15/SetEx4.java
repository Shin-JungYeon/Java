package chap15;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet ��ü�� ������ ���(��ü)�� �ݵ�� Comparable �������̽��� �����ؾ� �Ѵ�.
 * 
 * ���Ŀ� ���õ� �������̽� -> �߻�޼��� ����
 *   Comparable	->	compareTo(Object)		: ��ü�� �⺻ ���Ĺ���� ����.
 *   Comparator	->	compare(Object, Object)	: ���� ����� ���� ����.
 */
class Phone implements Comparable {  //Comparable �������̽� �ȿ��� compareTo() �߻�޼��� ���� -> ���� ����� �˷���� ��.
	int number;
	String model;
	Phone(int number, String model){
		this.number = number;
		this.model = model;
	}
	@Override
	public String toString() {
		return "[number=" + number + ", model=" + model + "]";
	}
	
	//��ȭ��ȣ ������ ���� : 
	@Override
	public int compareTo(Object o) {  //��� : ���, this�� o��ü���� �� �� / ����, this�� o��ü���� �� ��
		Phone p = (Phone)o;
		return number - p.number;  //��ȣ�� �������� ������������ ����. -> �⺻���Ĺ��
	}
}
public class SetEx4 {
	public static void main(String[] args) {
		TreeSet<Phone> set = new TreeSet<Phone>();
		set.add(new Phone(1234, "�Ｚ"));  //ClassCastException, ���� ������ TreeSet ��ü���� �ƹ� �ڷ����̳� ���� �� ����.
		set.add(new Phone(5678, "LG"));
		set.add(new Phone(2345, "����"));
		System.out.println("��ȭ��ȣ ������ �����ϱ�.");
		for(Phone p : set) {
			System.out.println(p);
		}
		System.out.println();
		
		System.out.println("��ȭ��ȣ�� �������� �����ϱ�.");
		TreeSet<Phone> set2 = new TreeSet<Phone>(Comparator.reverseOrder());  //�⺻���Ĺ���� �������� ����.
		set2.add(new Phone(1234, "�Ｚ"));
		set2.add(new Phone(5678, "LG"));
		set2.add(new Phone(2345, "����"));
		for(Phone p : set2) {
			System.out.println(p);
		}
		System.out.println();
		
		System.out.println("���� ������������ �����ϱ�.");
//		TreeSet<Phone> set3 = new TreeSet<Phone>(new ModelAsc());  //class�� ���� ���� �� �ȿ��� �ۼ��ϴ� ��.
		TreeSet<Phone> set3 = new TreeSet<Phone>(new Comparator<Phone>() {  //����Ŭ������ �ۼ��ϴ� ��
			@Override
			public int compare(Phone p1, Phone p2) {
				return p1.model.compareTo(p2.model);  //���� �ִ� ��ü�� ��ο� �� �� �ؼ� ����. p1�� ���� p2�� ���� �� �ʿ� ���� ���α׷��� �˾Ƽ� ���ִ� ����.
			}
		});
		set3.add(new Phone(1234, "�Ｚ"));
		set3.add(new Phone(5678, "����"));
		set3.add(new Phone(2345, "����"));
		for(Phone p : set3) {
			System.out.println(p);
		}
		System.out.println();
	}
}
class ModelAsc implements Comparator<Phone> {

	@Override
	public int compare(Phone p1, Phone p2) {
		return p1.model.compareTo(p2.model);
	}
	
}