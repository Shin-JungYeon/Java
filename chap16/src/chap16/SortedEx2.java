package chap16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student3 implements Comparable<Student3> {  //implements Comparable : 기본정렬 방식 지정.
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
	public int compareTo(Student3 s) {  //기본정렬 : 학번순  제네릭표현에 써준 타입의 객체 가져옴.(안쓰면 Object로)
		return studno.compareTo(s.getStudno());
	}
}
public class SortedEx2 {
	public static void main(String[] args) {
		List<Student3> list = Arrays.asList(
				new Student3("1234", "홍길동", 1), new Student3("2345", "김삿갓", 2),
				new Student3("3456", "이몽룡", 3), new Student3("4567", "임꺽정", 4));
		//학번순으로 정렬(기본 정렬)되도록 프로그램 작성하기.
		System.out.println("학번순으로 정렬");
		list.stream().sorted().forEach(s -> System.out.println(s));
		System.out.println();
		
		//학번 역순으로 정렬.
		System.out.println("학번 역순으로 정렬");
		list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));
		System.out.println();
		
		//이름순으로 정렬.
		System.out.println("이름순으로 정렬");
//		list.stream().sorted(new Comparator<Student3>() {
//			@Override
//			public int compare(Student3 s1, Student3 s2) {
//				return s1.getName().compareTo(s2.getName());
//			}
//		}).forEach(s -> System.out.println(s));  //sorted() 메서드 안에 직접적으로 Comparator 객체 넣어줌.
		list.stream().sorted((s1, s2) -> s1.getName().compareTo(s2.getName())).forEach(s -> System.out.println(s));
		//Comparator도 FunctionalInterface임. -> 람다식으로 표현 가능.
	}
}
