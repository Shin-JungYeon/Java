package chap6;
/*
 * Student 클래스 구현하기
 * 멤버변수 : 이름(name), 반(ban), 번호(no), 국어점수(kor), 영어점수(eng), 수학점수(math)
 *          static int count;
 * 멤버메서드
 *  : 1. int getTotal()     : 학생별 점수의 총합을 리턴
 *    2. float getAverage() : 학생별 평균
 *    2. void info()        : 번호, 이름, 반, 국어, 영어, 수학 총점, 평균 출력
 * 생성자
 *  : 1. 매개변수(이름, 반, 번호) : 이름, 반, 번호 초기화하고 나머지는 0으로 초기화
 *                              번호는 count로 자동 생성
 *    2. 매개변수(이름, 반, 번호, 국어, 영어, 수학) : 이름, 반, 번호, 국어, 영어, 수학 초기화하기
 *                                            번호는 count로 자동 생성
 */
class Student {
	static int count;
	String name;
	int ban, no, kor, eng, math;

	Student(String name, int ban){
		this(name, ban, 0, 0, 0);
//		this.name = name;
//		this.ban = ban;
//		no = ++count;
	}
    Student(String name, int ban, int kor, int eng, int math){
    	this.name = name;
    	this.ban = ban;
    	this.kor = kor;
    	this.eng = eng;
    	this.math = math;
    	no = ++count;
	}
//	int getTotal(int k, int e, int m) {
//		return tot = k + e + m;
//	}
    int getTotal() {
		return kor + eng + math;
	}
//	float getAverage(int t) {
//		return ave = (float)tot/3;
//	}
    float getAverage() {
		return getTotal()/3f;
	}
	void info() {
		System.out.println(no + "번\t" + name + "\t" + ban + "반\t"
	                       + kor + "\t" + eng + "\t" +  math + "\t"
				           + getTotal() + "\t" + getAverage());
	}
}
public class StudentEx1 {
	public static void main(String[] args) {
		System.out.println("번호\t" + "이름\t" + "반\t" + "국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균");
		
		Student s1 = new Student("홍길동", 4, 85, 80, 90);
		s1.info();
		Student s2 = new Student("김삿갓", 4, 75, 80, 80);
		s2.info();
		Student s3 = new Student("이몽룡", 4);
		s3.info();
		
		
		
//		Student[] std = new Student[3];
//		std[0] = new Student("홍길동", 4, 85, 80, 90);
//		std[1] = new Student("김삿갓", 4, 75, 80, 80);
//		std[2] = new Student("이몽룡", 4);
//		for(int i=0; i<std.length; i++) {
//			std[i].getTotal();
//			std[i].getAverage();
//			std[i].info();
//		}
// 구구절절 할 필요 없구나~~~

	}
}
