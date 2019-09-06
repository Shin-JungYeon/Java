package chap16;

import java.util.Arrays;
import java.util.List;

class Person {
	private String name;
	private String gender;
	private int age;
	public Person(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
}
public class FilterStreamEx2 {
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(  //<Person> : Person 객체임.
				new Person("홍길동", "남자", 35), new Person("성춘향", "여자", 16),
				new Person("이몽룡", "남자", 17), new Person("향단이", "여자", 20));
		//남자 나이의 평균
		double ageAvg = list.stream().filter(p -> p.getGender().equals("남자")).mapToInt(Person::getAge).average().getAsDouble();
		System.out.println("남자 나이 평균 : " + ageAvg);
		//여자 나이의 평균
		ageAvg = list.stream().filter(p -> p.getGender().equals("여자")).mapToInt(p -> p.getAge()).average().getAsDouble();  //(Person::getAge) == (p -> p.getAge())
		System.out.println("여자 나이 평균 : " + ageAvg);
		System.out.println();
		
		//나이가 20 이상인 사람의 이름과 나이를 출력하기.
		list.stream().filter(p -> p.getAge()>=20).forEach(p -> System.out.println("20살 이상인 사람의 이름 : " + p.getName() + ", 나이 : " + p.getAge()));
		System.out.println();
		
		//전체 나이의 합 구하기.
		System.out.println("나이 합 : " + list.stream().mapToInt(p -> p.getAge()).sum());
		System.out.println("나이 합 : " + list.stream().mapToInt(Person::getAge).sum());
		System.out.println();
		//이름출력하기.
		list.stream().forEach(s -> System.out.println(s.getName()));  //이름만 출력하기.
		list.stream().map(Person::getName).forEach(s -> System.out.println(s));  //이름만 모아서 스트림형태로 만들어서 출력.
	}
}
