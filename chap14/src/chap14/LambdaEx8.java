package chap14;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/*
 * Function FunctionInterface ����
 *   �Ű������� �ְ�, ���ϰ��� ����.
 *   applyXXX(...) �޼��带 ����.
 *   
 *   1. Function<T, R> : R apply(T) : TŸ���� �Ű������� �޾� R Ÿ���� ���� ����.
 *   2. ToIntFunction<T> : int applyAsInt(T) : TŸ���� �Ű������� �޾� intŸ���� ���� ����.
 *   3. ToDoubleFunction<T> : double applyAsDouble(T) : TŸ���� �Ű������� �޾� DoubleŸ���� ���� ����.
 *   ...
 */
class Student {
	private String name;
	private int eng;
	private int math;
	public Student (String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {return name;}
	public int getEng() {return eng;}
	public int getMath() {return math;}
}
public class LambdaEx8 {
	private static Student[] list = {  //�迭
			new Student("ȫ�浿", 80, 90), new Student("���", 85, 90),
			new Student("�̸���", 80, 70), new Student("�Ӳ���", 90, 95)
	};
	
	//1.
	public static void printString(Function<Student, String> f) {  //Student Ÿ�� �޾Ƽ� String Ÿ�� ����.
		//t -> t.getName()  t��ü�� ��� �� �̸��� ����
		for(Student s : list)
			System.out.print(f.apply(s) + " ");
		System.out.println();
	}
	public static void printInt(Function<Student, Integer> f) {  //Student Ÿ�� �޾Ƽ�  Integer Ÿ�� ����.
		//t -> t.getEng()  t��ü�� ��� �� ���������� ����
		//t -> t.getMath()  t��ü�� ��� �� ���������� ����
		for(Student s : list)
			System.out.print(f.apply(s) + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		//1.
		System.out.print("�л��̸� : ");
//		printString(t -> t.getName());  //�Ű����� -> ����Ÿ��
		printString(Student :: getName);  //�Ű�����Ÿ�� :: ����Ÿ��  //���ٽ��� �޼��� �������.
		System.out.print("�������� : ");
//		printInt(t -> t.getEng());
		printInt(Student :: getEng);
		System.out.print("�������� : ");
//		printInt(t -> t.getMath());
		printInt(Student :: getMath);
		
		//2.
		System.out.print("�������� �հ� : ");
		getTotal(t -> t.getEng());
		System.out.print("�������� �հ� : ");
		getTotal(t -> t.getMath());
		
		//3.
		System.out.printf("�������� ��� : %.2f\n", getAvg(t -> t.getEng()));
		System.out.printf("�������� ��� : %.2f\n", getAvg(t -> t.getMath()));
		//getAvg()�޼��忡 �Ű������� t -> t.getMath() ����. t -> t.getEng() : �Ű����� t��, ���ϰ� ��������. ��, ���������� �̾Ƽ� �޼��忡 ����.
	}
	
	//2.
	public static void getTotal(ToIntFunction<Student> f) {
		int sum = 0;
		for(Student s : list) {
			sum += f.applyAsInt(s);  //Student Ÿ���� �Ű����� s�� �޾Ƽ� int��(����, ��������) ����.
		}
		System.out.println(sum);		
	}
	
	//3.
	public static double getAvg(ToDoubleFunction<Student> f) {
		double sum = 0;
		for(Student s : list) {
			sum += f.applyAsDouble(s);  //double������ ����.
		}
		return sum/list.length;  //print �ȿ� ���ϱ� void Sysotem.out.println() �� �ƴ϶� ���� return ����� ��.
	}
}
