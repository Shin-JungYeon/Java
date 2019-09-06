package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
	public enum Gender {MALE, FEMALE};
	public enum City {SEOUL, BUSAN};
	private String name;
	private int score;
	private Gender gender;
	private City city;
	public Student (String name, int score, Gender gender, City city) {
		this.name = name;
		this.score = score;
		this.gender = gender;
		this.city = city;
	}
	public Student (String name, int score, Gender gender) {
		this(name, score, gender, City.SEOUL);
	}
	public String getName() {return name;}
	public int getScore() {return score;}
	public Gender getGender() {return gender;}
	public City getCity() {return city;}
}
public class StudentAvgExam {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("ȫ�浿", 90, Student.Gender.MALE, Student.City.BUSAN),
				new Student("�̸���", 80, Student.Gender.MALE),
				new Student("������", 95, Student.Gender.FEMALE),
				new Student("�����", 85, Student.Gender.FEMALE, Student.City.BUSAN));
		
		//���ú��� �л��� ��� ���ϱ� 
		Map<Student.City, Double> map1 = list.stream()
				.collect(Collectors.groupingBy(Student::getCity, Collectors.averagingDouble(Student::getScore)));
		System.out.println("�����л���� : " + map1.get(Student.City.SEOUL));
		System.out.println("�λ��л���� : " + map1.get(Student.City.BUSAN));
		
		//�����л�, �λ��л��� �̸� ����ϱ�
//		Map<Student.City, String> map2 = list.stream()
//				.collect(Collectors.groupingBy(Student::getCity, Collectors.mapping(Student::getName, Collectors.joining(", "))));  //�̸����� ���ڿ��� �����ͼ� ,�� ����.
		Map<Student.City, List<String>> map2 = list.stream()
				.collect(Collectors.groupingBy(Student::getCity, Collectors.mapping(Student::getName, Collectors.toList())));  //�̸����� ��Ƽ� List��ü�� ����.
		System.out.println("�����л� ��� : " + map2.get(Student.City.SEOUL));  //key�� �̿��ؼ� value ��������.
		System.out.println("�λ��л� ��� : " + map2.get(Student.City.BUSAN));
	}
}
