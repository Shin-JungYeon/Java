package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student {
	private String name;
	private int eng;
	private int math;
	Student(String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {return name;}
	public int getEng() {return eng;}
	public int getMath() {return math;}
	
	@Override
	public String toString() {
		return "name=" + name + ", eng=" + eng + ", math=" + math;
	}
	
}
public class StreamEx2 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("ȫ�浿", 60, 70), new Student("���", 65, 55),
				new Student("�̸���", 80, 75), new Student("�Ӳ���", 85, 65));
		Stream<Student> st = list.stream();  //list.stream() : list ��ü ���� ��ҵ��� Stream ��ü�� ����. ������ �ϳ��� ������ �ʿ� ���� �Ѳ����� ó������.
		st.forEach(s -> {  //st.forEach(Consumer) : ��ҵ��� ��ȸ, ó��. ���ιݺ���. �˾Ƽ� �ϳ��� ������.
			System.out.print(s);
			int sum = s.getEng() + s.getMath();
			double avg = sum/2.0;
			System.out.printf(", ����=%-5d, ���=%.2f\n", sum, avg);
		});
		
		//st ������ forEach�� �̿��ؼ� �� �о��� ������ �ٽ� ����� ��� ��� ����.
		System.out.println("�������� ���� : " + list.stream().mapToInt(Student :: getMath).sum());  //stream �� ��������(int��)�� �����ͼ� �հ� ����.
		System.out.println("�������� ���� : " + list.stream().mapToInt(Student :: getEng).sum());
		System.out.println("���� ���� �л��� : " + list.stream().mapToInt(Student :: getMath).count());  //stream �� ��������(int��)�� �����ͼ� ���� ����.
		System.out.println("���� ���� �л��� : " + list.stream().mapToInt(Student :: getEng).count());
		System.out.println("�������� ��� : " + list.stream().mapToInt(Student :: getMath).average().getAsDouble());  //stream �� ��������(int��)�� �����ͼ� ��� ���ؼ� double������ ��ȯ.
		System.out.println("�������� ��� : " + list.stream().mapToInt(Student :: getEng).average().getAsDouble());
	}
}