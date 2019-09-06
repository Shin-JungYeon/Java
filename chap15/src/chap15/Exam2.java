package chap15;

import java.util.HashSet;
import java.util.Set;

/*
 * Student Ŭ���� �����ϱ�
 *   1. ������� : �й�(studno), �̸�(name), ����(major)
 *   2. toString() : ��� ������ ����ϱ�
 *   3. �й��� �̸��� ������ ���� �л����� �ν��ϵ��� ���� �޼��� �������̵� �ϱ�
 *   4. ���� Ŭ������ �µ��� ������ �����ϱ�
 */
class Student {
	String studno, name, major;
	Student(String studno, String name, String major){
		this.studno = studno;
		this.name = name;
		this.major = major;
	}
	@Override
	public int hashCode() {
		return studno.hashCode() + name.hashCode();  //major�� �޶� �й�, �̸� ������ ���� �л�
	}
	@Override
	public boolean equals(Object obj) {  //�������̵� -> �ߺ��˻�� Ŭ���� �ȿ��� �������̵� �� �޼��� ���.
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return studno.equals(s.studno) && name.equals(s.name);
		}
		return false;
	}
	public boolean equals(Student s) {  //�����ε� -> ���� ȣ���ϸ� �����ε� �� �޼��� ���.
		return studno.equals(s.studno) && name.equals(s.name) && major.equals(s.major);
	}
	@Override
	public String toString() {
		return "[" + "�й� : " + studno + ", �̸� : " + name + ", ���� : " + major + "]";
	}
}
public class Exam2 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student("1234", "ȫ�浿", "�濵"));
		set.add(new Student("2345", "ȫ���", "�濵"));
		set.add(new Student("2345", "ȫ���", "�İ�"));
		set.add(new Student("1234", "ȫ�浿", "���"));
		set.add(new Student("3456", "���", "�İ�"));
		set.add(new Student("4567", "ȫ�浿", "�濵"));  //��������, �й��� �ٸ��Ƿ� �ٸ� �л�.
		System.out.println("��� �л� �� : " + set.size());
		for(Student s : set) {
			System.out.println(s);
		}
		
		Student s1 = new Student("1234", "ȫ�浿", "�濵");
		Student s2 = new Student("1234", "ȫ�浿", "���");
		System.out.println(s1.equals(s2));
		
	}
}
