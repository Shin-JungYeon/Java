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
				new Student("홍길동", 60, 70), new Student("김삿갓", 65, 55),
				new Student("이몽룡", 80, 75), new Student("임꺽정", 85, 65));
		Stream<Student> st = list.stream();  //list.stream() : list 객체 내의 요소들을 Stream 객체로 변경. 일일히 하나씩 꺼내올 필요 없이 한꺼번에 처리해줌.
		st.forEach(s -> {  //st.forEach(Consumer) : 요소들을 조회, 처리. 내부반복자. 알아서 하나씩 가져옴.
			System.out.print(s);
			int sum = s.getEng() + s.getMath();
			double avg = sum/2.0;
			System.out.printf(", 총점=%-5d, 평균=%.2f\n", sum, avg);
		});
		
		//st 위에서 forEach를 이용해서 다 읽었기 때문에 다시 만들어 줘야 사용 가능.
		System.out.println("수학점수 총점 : " + list.stream().mapToInt(Student :: getMath).sum());  //stream 중 수학점수(int형)만 가져와서 합계 구함.
		System.out.println("영어점수 총점 : " + list.stream().mapToInt(Student :: getEng).sum());
		System.out.println("수학 응시 학생수 : " + list.stream().mapToInt(Student :: getMath).count());  //stream 중 수학점수(int형)만 가져와서 갯수 구함.
		System.out.println("영어 응시 학생수 : " + list.stream().mapToInt(Student :: getEng).count());
		System.out.println("수학점수 평균 : " + list.stream().mapToInt(Student :: getMath).average().getAsDouble());  //stream 중 수학점수(int형)만 가져와서 평균 구해서 double형으로 변환.
		System.out.println("영어점수 평균 : " + list.stream().mapToInt(Student :: getEng).average().getAsDouble());
	}
}