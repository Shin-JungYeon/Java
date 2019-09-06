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
				new Student("홍길동", 90, Student.Gender.MALE, Student.City.BUSAN),
				new Student("이몽룡", 80, Student.Gender.MALE),
				new Student("성춘향", 95, Student.Gender.FEMALE),
				new Student("향단이", 85, Student.Gender.FEMALE, Student.City.BUSAN));
		
		//도시별로 학생의 평균 구하기 
		Map<Student.City, Double> map1 = list.stream()
				.collect(Collectors.groupingBy(Student::getCity, Collectors.averagingDouble(Student::getScore)));
		System.out.println("서울학생평균 : " + map1.get(Student.City.SEOUL));
		System.out.println("부산학생평균 : " + map1.get(Student.City.BUSAN));
		
		//서울학생, 부산학생의 이름 출력하기
//		Map<Student.City, String> map2 = list.stream()
//				.collect(Collectors.groupingBy(Student::getCity, Collectors.mapping(Student::getName, Collectors.joining(", "))));  //이름들을 문자열로 가져와서 ,로 연결.
		Map<Student.City, List<String>> map2 = list.stream()
				.collect(Collectors.groupingBy(Student::getCity, Collectors.mapping(Student::getName, Collectors.toList())));  //이름들을 모아서 List객체로 묶음.
		System.out.println("서울학생 목록 : " + map2.get(Student.City.SEOUL));  //key값 이용해서 value 가져오기.
		System.out.println("부산학생 목록 : " + map2.get(Student.City.BUSAN));
	}
}
