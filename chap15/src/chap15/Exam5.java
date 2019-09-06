package chap15;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * Student2 Ŭ���� �����ϱ�
 * ������� : �̸�, ����, ����, ����
 * ����޼��� : toString() : �� ������� ��, ����, ��� ���.
 *          getTotal() : ������ �� ����.
 *          compareTo() : �̸��� ������������ ���ĵǵ��� ����.
 */
class Student2 implements Comparable<Student2> {  //implements Comparable<Student2> : �⺻ ���� ��� �������� �� ����
	String name;
	int kor, eng, math;
	Student2(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getTotal() {
		return kor + eng + math;
	}
	@Override
	public String toString() {
		return "�̸�:" + name + ", ����:" + kor + ", ����:" + eng + ", ����:" + math
				+ ", ����:" + getTotal() + ", ���:" + getTotal()/3.0;
	}
	@Override
	public int compareTo(Student2 s) {  //�⺻ ���� ���
		return name.compareTo(s.name);  //s.name : ���� ��� �� name ������ ��.
	}
}
public class Exam5 {
	public static void main(String[] args) {
		Student2[] arr = {
				new Student2("ȫ�浿", 90, 80, 70),
				new Student2("���", 95, 85, 75),
				new Student2("�̸���", 80, 95, 95),
				new Student2("�Ӳ���", 60, 75, 100)
		};
		
		System.out.println("�̸��� �������� ����");
		TreeSet<Student2> set1 = makeTreeSet(arr, null);  //�⺻ ��� ����(�̸�)
		System.out.println();
		
		System.out.println("���� ���� �������� ����");
		TreeSet<Student2> set2 = makeTreeSet(arr, new Comparator<Student2>() {
			@Override
			public int compare(Student2 s1, Student2 s2) {
				return s2.getTotal() - s1.getTotal();  //�ڿ��� �տ��� ���ָ� ������������ ����.
			}
		});  //���� ���� �������� ����
//		TreeSet<Student2> set2 = makeTreeSet(arr, (o1, o2) -> ((Student2)o2).getTotal()-((Student2)o1).getTotal());  //���ٽ� jdk8.0 ����
		
		System.out.println();
		
		System.out.println("�������� ���� �������� ����");
		TreeSet<Student2> set3 = makeTreeSet(arr, new Comparator<Student2>() {
			@Override
			public int compare(Student2 s1, Student2 s2) {
				return s2.kor - s1.kor;
			}
		});  //�������� ���� �������� ����
		System.out.println();
		
		System.out.println("�������� ���� �������� ����");
		TreeSet<Student2> set4 = makeTreeSet(arr, new Comparator<Student2>() {
			@Override
			public int compare(Student2 s1, Student2 s2) {
				return s2.eng - s1.eng;
			}
		});  //�������� ���� �������� ����
		System.out.println();
		
		System.out.println("�������� ���� �������� ����");
		TreeSet<Student2> set5 = makeTreeSet(arr, new Comparator<Student2>() {
			@Override
			public int compare(Student2 s1, Student2 s2) {
				return s2.math - s1.math;
			}
		});  //�������� ���� �������� ����
	}
	
	private static TreeSet<Student2> makeTreeSet(Student2[] arr, Comparator c) {
		TreeSet<Student2> set;
		if(c == null) {
			set = new TreeSet<Student2>();  //Student2 Ŭ������ ���ǵ� �⺻ ���� ��Ĵ�� ����.
		} else {
			set = new TreeSet<Student2>(c);  //Comparator�� ���� ���� ��� ���.
		}
		for(Student2 s : arr) {
			set.add(s);
		}
		for(Student2 s : set) {
			System.out.println(s);
		}
		return set;
	}
	
}
