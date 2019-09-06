package chap16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student3 implements Comparable<Student3> {  //implements Comparable : �⺻���� ��� ����.
	private String studno;
	private String name;
	private int grade;
	Student3(String stuno, String name, int grade) {
		this.studno = stuno;
		this.name = name;
		this.grade = grade;
	}
	
	public String getStudno() {return studno;}
	public String getName() {return name;}
	public int getGrade() {return grade;}

	@Override
	public String toString() {
		return "stuno=" + studno + ", name=" + name + ", grade=" + grade;
	}
	@Override
	public int compareTo(Student3 s) {  //�⺻���� : �й���  ���׸�ǥ���� ���� Ÿ���� ��ü ������.(�Ⱦ��� Object��)
		return studno.compareTo(s.getStudno());
	}
}
public class SortedEx2 {
	public static void main(String[] args) {
		List<Student3> list = Arrays.asList(
				new Student3("1234", "ȫ�浿", 1), new Student3("2345", "���", 2),
				new Student3("3456", "�̸���", 3), new Student3("4567", "�Ӳ���", 4));
		//�й������� ����(�⺻ ����)�ǵ��� ���α׷� �ۼ��ϱ�.
		System.out.println("�й������� ����");
		list.stream().sorted().forEach(s -> System.out.println(s));
		System.out.println();
		
		//�й� �������� ����.
		System.out.println("�й� �������� ����");
		list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));
		System.out.println();
		
		//�̸������� ����.
		System.out.println("�̸������� ����");
//		list.stream().sorted(new Comparator<Student3>() {
//			@Override
//			public int compare(Student3 s1, Student3 s2) {
//				return s1.getName().compareTo(s2.getName());
//			}
//		}).forEach(s -> System.out.println(s));  //sorted() �޼��� �ȿ� ���������� Comparator ��ü �־���.
		list.stream().sorted((s1, s2) -> s1.getName().compareTo(s2.getName())).forEach(s -> System.out.println(s));
		//Comparator�� FunctionalInterface��. -> ���ٽ����� ǥ�� ����.
	}
}
