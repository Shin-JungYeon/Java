package chap14;

import java.util.function.BinaryOperator;
import java.util.function.ToIntFunction;

/* 
 * Operator �������̽��� �̿��Ͽ� �ְ��� ���� ������ ���� �л������� 
 * Operator �������̽��� �̿��Ͽ� �ְ��� ���� ������ ���� �л����� ����ϱ� 
 */ 

class Student2 {
	private String name;
	private int eng;
	private int math;
	public Student2 (String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {return name;}
	public int getEng() {return eng;}
	public int getMath() {return math;}
	public int getTotal() {return eng + math;}
	
	@Override
	public String toString() {
		return "[name=" + name + ", eng=" + eng + ", math=" + math + ", total=" + getTotal() + "]";
	}
}
public class Exam1 {
	private static Student2[] list = {
			new Student2("ȫ�浿", 75, 80), new Student2("���", 85, 85),
			new Student2("�̸���", 80, 70), new Student2("�Ӳ���", 90, 95)
	};
	public static void main(String[] args) {
		System.out.println("���� �ְ��� �л� : " + getMaxOrMin((a, b) -> (a.getEng()>=b.getEng())?a:b));  //int, int �� �޾Ƽ� Student2 Ÿ���� ��ü ����
		System.out.println("���� ������ �л� : " + getMaxOrMin((a, b) -> (a.getEng()<=b.getEng())?a:b));
		System.out.println();
		
		System.out.println("���� �ְ��� �л� : " + getMaxOrMin((a, b) -> (a.getMath()>=b.getMath())?a:b));
		System.out.println("���� ������ �л� : " + getMaxOrMin((a, b) -> (a.getMath()<=b.getMath())?a:b));
		System.out.println();
		
		System.out.println("�հ� �ְ��� �л� : " + getMaxOrMin((a, b) -> (a.getTotal()>=b.getTotal())?a:b));
		System.out.println("�հ� ������ �л� : " + getMaxOrMin((a, b) -> (a.getTotal()<=b.getTotal())?a:b));
		
//		BinaryOperator<Student2> f = (a, b) -> {  //�Ű����� 2�� ��� Student2 Ÿ��.
//			int suma = a.getEng() + a.getMath();
//			int sumb = b.getEng() + b.getMath();
//			return ((suma>=sumb)?a:b);  //����Ÿ�Ե� Student2 Ÿ��.
//		};
//		System.out.println("�հ� �ְ��� �л� : " + getMaxOrMin(f));
//		f = (a, b) -> {
//			int suma = a.getEng() + a.getMath();
//			int sumb = b.getEng() + b.getMath();
//			return ((suma<=sumb)?a:b);
//		};
//		System.out.println("�հ� ������ �л� : " + getMaxOrMin(f));
		
	}
	private static Student2 getMaxOrMin(BinaryOperator<Student2> f) {
		Student2 result = list[0];
		for(Student2 s : list) {
			result = f.apply(result, s);  //�Ű����� 2�� ��� Student2 Ÿ��.
		}
		return result;  //����Ÿ�Ե� Student2 Ÿ��.
	}
}
