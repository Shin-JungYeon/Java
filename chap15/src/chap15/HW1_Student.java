package chap15;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 1. ������ ���õ� StudentŬ������ Comparable �������̽��� �����ϵ��� �����ؼ� �̸�(name)�� �⺻ ���� ������  �ǵ��� �Ͻÿ�.
 *    ��ȣ�� ������ �ǵ��� NoDesc Ŭ������ �ۼ��Ͻÿ�.
 */
class Student3 implements Comparable<Student3> {  //implements Comparable<Student3> : �⺻���Ĺ�� ����
	String name;   //�̸�
	int ban;       //��
	int no;        //��ȣ
	int kor,eng,math; //����, ����, ���� ����
	public Student3(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	int getTotal() {
		return kor + eng + math;
	}
	float getAverage() {
		return (int)((getTotal()/3f) *10 + 0.5)/10f;
	}
	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}
	@Override
	public int compareTo(Student3 s) {
		return name.compareTo(s.name);
	}
}
public class HW1_Student {
	public static void main(String[] args) {
		Student3[] st = {new Student3("ȫ�浿",1,1,100,100,100),
						new Student3("���",1,2,90,70,80),
						new Student3("�̸���",1,3,80,80,90),
						new Student3("�Ӳ���",1,4,70,90,70),
						new Student3("������",1,5,60,100,80)};
		Set set1 = new TreeSet<Student3>();  //Comparable �������� ������ �� ���� ��� �Ұ�.
		Set set2 = new TreeSet<Student3>(new NoDesc());  //Comparable �������� �ʾƵ� Comparator�� ������ Ŭ������ �ֱ� ������ ���� ����. -> Comparable ���� Ŭ������ ���ٸ� Comparator ����Ŭ������ ������ �ȴ�.
		for(Student3 s : st)  {
			set1.add(s);
			set2.add(s);
		}
		System.out.println(set1);  //�̸� ������ ����
		System.out.println(set2);  //��ȣ�� �������� ����
		
	}
}
class NoDesc implements Comparator<Student3> {  //���� Ŭ������ ������� static �ٿ������.		implements Comparator<Student3> : �⺻ ���� ���Ĺ�� ����
	@Override
	public int compare(Student3 s1, Student3 s2) {
		return s2.no - s1.no;  //������������ �Ϸ��� -> (ū) - (����)
	}
}

