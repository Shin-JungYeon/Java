package chap14;

import java.util.function.BinaryOperator;
import java.util.function.ToIntFunction;

/* 
 * Operator 인터페이스를 이용하여 최고의 영어 점수를 가진 학생정보와 
 * Operator 인터페이스를 이용하여 최고의 수학 점수를 가진 학생정보 출력하기 
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
			new Student2("홍길동", 75, 80), new Student2("김삿갓", 85, 85),
			new Student2("이몽룡", 80, 70), new Student2("임꺽정", 90, 95)
	};
	public static void main(String[] args) {
		System.out.println("영어 최고점 학생 : " + getMaxOrMin((a, b) -> (a.getEng()>=b.getEng())?a:b));  //int, int 값 받아서 Student2 타입의 객체 리턴
		System.out.println("영어 최저점 학생 : " + getMaxOrMin((a, b) -> (a.getEng()<=b.getEng())?a:b));
		System.out.println();
		
		System.out.println("수학 최고점 학생 : " + getMaxOrMin((a, b) -> (a.getMath()>=b.getMath())?a:b));
		System.out.println("수학 최저점 학생 : " + getMaxOrMin((a, b) -> (a.getMath()<=b.getMath())?a:b));
		System.out.println();
		
		System.out.println("합계 최고점 학생 : " + getMaxOrMin((a, b) -> (a.getTotal()>=b.getTotal())?a:b));
		System.out.println("합계 최저점 학생 : " + getMaxOrMin((a, b) -> (a.getTotal()<=b.getTotal())?a:b));
		
//		BinaryOperator<Student2> f = (a, b) -> {  //매개변수 2개 모두 Student2 타입.
//			int suma = a.getEng() + a.getMath();
//			int sumb = b.getEng() + b.getMath();
//			return ((suma>=sumb)?a:b);  //리턴타입도 Student2 타입.
//		};
//		System.out.println("합계 최고점 학생 : " + getMaxOrMin(f));
//		f = (a, b) -> {
//			int suma = a.getEng() + a.getMath();
//			int sumb = b.getEng() + b.getMath();
//			return ((suma<=sumb)?a:b);
//		};
//		System.out.println("합계 최저점 학생 : " + getMaxOrMin(f));
		
	}
	private static Student2 getMaxOrMin(BinaryOperator<Student2> f) {
		Student2 result = list[0];
		for(Student2 s : list) {
			result = f.apply(result, s);  //매개변수 2개 모두 Student2 타입.
		}
		return result;  //리턴타입도 Student2 타입.
	}
}
