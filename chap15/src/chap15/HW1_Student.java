package chap15;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 1. 다음에 제시된 Student클래스를 Comparable 인터페이스를 구현하도록 변경해서 이름(name)이 기본 정렬 기준이  되도록 하시오.
 *    번호의 역순이 되도록 NoDesc 클래스를 작성하시오.
 */
class Student3 implements Comparable<Student3> {  //implements Comparable<Student3> : 기본정렬방식 설정
	String name;   //이름
	int ban;       //반
	int no;        //번호
	int kor,eng,math; //국어, 영어, 수학 점수
	public Student3(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	int getTotal() {
		return kor + eng + math;
	}
	float getAverage() {
		return (int)((getTotal()/3f) *10 + 0.5)/10f;
	}
	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}
	@Override
	public int compareTo(Student3 s) {
		return name.compareTo(s.name);
	}
}
public class HW1_Student {
	public static void main(String[] args) {
		Student3[] st = {new Student3("홍길동",1,1,100,100,100),
						new Student3("김삿갓",1,2,90,70,80),
						new Student3("이몽룡",1,3,80,80,90),
						new Student3("임꺽정",1,4,70,90,70),
						new Student3("성춘향",1,5,60,100,80)};
		Set set1 = new TreeSet<Student3>();  //Comparable 구현하지 않으면 이 줄은 사용 불가.
		Set set2 = new TreeSet<Student3>(new NoDesc());  //Comparable 구현하지 않아도 Comparator을 구현한 클래스가 있기 때문에 정렬 가능. -> Comparable 구현 클래스가 없다면 Comparator 구현클래스가 있으면 된다.
		for(Student3 s : st)  {
			set1.add(s);
			set2.add(s);
		}
		System.out.println(set1);  //이름 순으로 정렬
		System.out.println(set2);  //번호의 역순으로 정렬
		
	}
}
class NoDesc implements Comparator<Student3> {  //내부 클래스로 만들려면 static 붙여줘야함.		implements Comparator<Student3> : 기본 외의 정렬방식 설정
	@Override
	public int compare(Student3 s1, Student3 s2) {
		return s2.no - s1.no;  //내림차순으로 하려면 -> (큰) - (작은)
	}
}

