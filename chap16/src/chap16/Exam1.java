package chap16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

class Employee {
	private String name;  //�̸�
	private String work;  //����
	private String position;  //����
	private int age;  //����
	public Employee(String name, String work, String position, int age) {
		this.name = name;
		this.work = work;
		this.position = position;
		this.age = age;
	}
	public String getName() {return name;}
	public String getWork() {return work;}
	public String getPosition() {return position;}
	public int getAge() {return age;}
	@Override
	public String toString() {
		return "name=" + name + ", work=" + work + ", position=" + position + ", age=" + age;
	}
}
public class Exam1 {
	public static void main(String[] args) throws IOException {
		//1. emp.txt ������ �о, st ��ü�� ����.
		BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
		Stream<Employee> st = br.lines().map(data -> {  //������ ������ �� �پ� �ҷ��ͼ� data�� �־���. br.lines() : Stream<String>
			String[] emp = data.split(",");  //"," �� �������� �з��ؼ� �迭��ü�� ����.
			Employee e = new Employee(emp[0], emp[1], emp[2], Integer.parseInt(emp[3]));  //���̸� ���������� ��ȯ�ؼ� Employee ��ü ����.
			return e;  //���ο� Employee Ÿ���� ��Ʈ�� �ϳ� �ϼ�.
		});
		st.forEach(s -> System.out.println(s));
		System.out.println();
		
		//2. emp.txt ������ �о, ���� �������� ���� ���� ����(�ߺ�����) ����ϱ�.
		br = new BufferedReader(new FileReader("emp.txt"));  //������ �� �� �� �о����� ���� �о�;� ��.
		Stream<String> po = br.lines().map(data -> {
			String[] emp = data.split(",");
			return emp[2];
		});
		System.out.println("�������� ���� ���� ���� : ");
		po.distinct().forEach(e -> System.out.println(e));

		//���� ���� ���ٿ� ������
//		new BufferedReader(new FileReader("emp.txt")).lines().map(data -> data.split(",")[2]).distinct().forEach(s -> System.out.println(s));
		
	}
}
