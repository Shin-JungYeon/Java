package chap14;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/*
 * Function FunctionInterface 예제
 *   매개변수도 있고, 리턴값도 존재.
 *   applyXXX(...) 메서드를 가짐.
 *   
 *   1. Function<T, R> : R apply(T) : T타입의 매개변수를 받아 R 타입의 값을 리턴.
 *   2. ToIntFunction<T> : int applyAsInt(T) : T타입의 매개변수를 받아 int타입의 값을 리턴.
 *   3. ToDoubleFunction<T> : double applyAsDouble(T) : T타입의 매개변수를 받아 Double타입의 값을 리턴.
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
	private static Student[] list = {  //배열
			new Student("홍길동", 80, 90), new Student("김삿갓", 85, 90),
			new Student("이몽룡", 80, 70), new Student("임꺽정", 90, 95)
	};
	
	//1.
	public static void printString(Function<Student, String> f) {  //Student 타입 받아서 String 타입 리턴.
		//t -> t.getName()  t객체의 멤버 중 이름만 리턴
		for(Student s : list)
			System.out.print(f.apply(s) + " ");
		System.out.println();
	}
	public static void printInt(Function<Student, Integer> f) {  //Student 타입 받아서  Integer 타입 리턴.
		//t -> t.getEng()  t객체의 멤버 중 영어점수만 리턴
		//t -> t.getMath()  t객체의 멤버 중 수학점수만 리턴
		for(Student s : list)
			System.out.print(f.apply(s) + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		//1.
		System.out.print("학생이름 : ");
//		printString(t -> t.getName());  //매개변수 -> 리턴타입
		printString(Student :: getName);  //매개변수타입 :: 리턴타입  //람다식의 메서드 참조방식.
		System.out.print("영어점수 : ");
//		printInt(t -> t.getEng());
		printInt(Student :: getEng);
		System.out.print("수학점수 : ");
//		printInt(t -> t.getMath());
		printInt(Student :: getMath);
		
		//2.
		System.out.print("영어점수 합계 : ");
		getTotal(t -> t.getEng());
		System.out.print("수학점수 합계 : ");
		getTotal(t -> t.getMath());
		
		//3.
		System.out.printf("영어점수 평균 : %.2f\n", getAvg(t -> t.getEng()));
		System.out.printf("수학점수 평균 : %.2f\n", getAvg(t -> t.getMath()));
		//getAvg()메서드에 매개변수로 t -> t.getMath() 대입. t -> t.getEng() : 매개변수 t의, 리턴값 수학점수. 즉, 수학점수만 뽑아서 메서드에 대입.
	}
	
	//2.
	public static void getTotal(ToIntFunction<Student> f) {
		int sum = 0;
		for(Student s : list) {
			sum += f.applyAsInt(s);  //Student 타입의 매개변수 s를 받아서 int값(영어, 수학점수) 리턴.
		}
		System.out.println(sum);		
	}
	
	//3.
	public static double getAvg(ToDoubleFunction<Student> f) {
		double sum = 0;
		for(Student s : list) {
			sum += f.applyAsDouble(s);  //double형으로 리턴.
		}
		return sum/list.length;  //print 안에 들어가니까 void Sysotem.out.println() 이 아니라 값을 return 해줘야 함.
	}
}
