package chap15;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * Student2 클래스 구현하기
 * 멤버변수 : 이름, 국어, 영어, 수학
 * 멤버메서드 : toString() : 각 멤버변수 값, 총점, 평균 출력.
 *          getTotal() : 점수의 합 리턴.
 *          compareTo() : 이름의 오름차순으로 정렬되도록 구현.
 */
class Student2 implements Comparable<Student2> {  //implements Comparable<Student2> : 기본 정렬 방식 지정해줄 수 있음
	String name;
	int kor, eng, math;
	Student2(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getTotal() {
		return kor + eng + math;
	}
	@Override
	public String toString() {
		return "이름:" + name + ", 국어:" + kor + ", 영어:" + eng + ", 수학:" + math
				+ ", 총점:" + getTotal() + ", 평균:" + getTotal()/3.0;
	}
	@Override
	public int compareTo(Student2 s) {  //기본 정렬 방식
		return name.compareTo(s.name);  //s.name : 현재 들어 온 name 이전의 값.
	}
}
public class Exam5 {
	public static void main(String[] args) {
		Student2[] arr = {
				new Student2("홍길동", 90, 80, 70),
				new Student2("김삿갓", 95, 85, 75),
				new Student2("이몽룡", 80, 95, 95),
				new Student2("임꺽정", 60, 75, 100)
		};
		
		System.out.println("이름순 오름차순 정렬");
		TreeSet<Student2> set1 = makeTreeSet(arr, null);  //기본 방식 정렬(이름)
		System.out.println();
		
		System.out.println("총점 기준 내림차순 정렬");
		TreeSet<Student2> set2 = makeTreeSet(arr, new Comparator<Student2>() {
			@Override
			public int compare(Student2 s1, Student2 s2) {
				return s2.getTotal() - s1.getTotal();  //뒤에서 앞에꺼 빼주면 내림차순으로 정렬.
			}
		});  //총점 기준 내림차순 정렬
//		TreeSet<Student2> set2 = makeTreeSet(arr, (o1, o2) -> ((Student2)o2).getTotal()-((Student2)o1).getTotal());  //람다식 jdk8.0 이후
		
		System.out.println();
		
		System.out.println("국어점수 기준 내림차순 정렬");
		TreeSet<Student2> set3 = makeTreeSet(arr, new Comparator<Student2>() {
			@Override
			public int compare(Student2 s1, Student2 s2) {
				return s2.kor - s1.kor;
			}
		});  //국어점수 기준 내림차순 정렬
		System.out.println();
		
		System.out.println("영어점수 기준 내림차순 정렬");
		TreeSet<Student2> set4 = makeTreeSet(arr, new Comparator<Student2>() {
			@Override
			public int compare(Student2 s1, Student2 s2) {
				return s2.eng - s1.eng;
			}
		});  //영어점수 기준 내림차순 정렬
		System.out.println();
		
		System.out.println("수학점수 기준 내림차순 정렬");
		TreeSet<Student2> set5 = makeTreeSet(arr, new Comparator<Student2>() {
			@Override
			public int compare(Student2 s1, Student2 s2) {
				return s2.math - s1.math;
			}
		});  //수학점수 기준 내림차순 정렬
	}
	
	private static TreeSet<Student2> makeTreeSet(Student2[] arr, Comparator c) {
		TreeSet<Student2> set;
		if(c == null) {
			set = new TreeSet<Student2>();  //Student2 클래스에 정의된 기본 정렬 방식대로 만듦.
		} else {
			set = new TreeSet<Student2>(c);  //Comparator로 만든 정렬 방식 사용.
		}
		for(Student2 s : arr) {
			set.add(s);
		}
		for(Student2 s : set) {
			System.out.println(s);
		}
		return set;
	}
	
}
