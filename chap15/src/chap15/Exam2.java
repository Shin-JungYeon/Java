package chap15;

import java.util.HashSet;
import java.util.Set;

/*
 * Student 클래스 구현하기
 *   1. 멤버변수 : 학번(studno), 이름(name), 전공(major)
 *   2. toString() : 멤버 변수를 출력하기
 *   3. 학번과 이름이 같으면 같은 학생으로 인식하도록 관련 메서드 오버라이딩 하기
 *   4. 구동 클래스에 맞도록 생성자 구현하기
 */
class Student {
	String studno, name, major;
	Student(String studno, String name, String major){
		this.studno = studno;
		this.name = name;
		this.major = major;
	}
	@Override
	public int hashCode() {
		return studno.hashCode() + name.hashCode();  //major가 달라도 학번, 이름 같으면 같은 학생
	}
	@Override
	public boolean equals(Object obj) {  //오버라이딩 -> 중복검사는 클래스 안에서 오버라이딩 된 메서드 사용.
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return studno.equals(s.studno) && name.equals(s.name);
		}
		return false;
	}
	public boolean equals(Student s) {  //오버로딩 -> 직접 호출하면 오버로딩 된 메서드 사용.
		return studno.equals(s.studno) && name.equals(s.name) && major.equals(s.major);
	}
	@Override
	public String toString() {
		return "[" + "학번 : " + studno + ", 이름 : " + name + ", 전공 : " + major + "]";
	}
}
public class Exam2 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student("1234", "홍길동", "경영"));
		set.add(new Student("2345", "홍길순", "경영"));
		set.add(new Student("2345", "홍길순", "컴공"));
		set.add(new Student("1234", "홍길동", "통계"));
		set.add(new Student("3456", "김삿갓", "컴공"));
		set.add(new Student("4567", "홍길동", "경영"));  //동명이인, 학번이 다르므로 다른 학생.
		System.out.println("등록 학생 수 : " + set.size());
		for(Student s : set) {
			System.out.println(s);
		}
		
		Student s1 = new Student("1234", "홍길동", "경영");
		Student s2 = new Student("1234", "홍길동", "통계");
		System.out.println(s1.equals(s2));
		
	}
}
