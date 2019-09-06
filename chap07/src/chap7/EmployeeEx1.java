package chap7;
/*
 * 직원 클래스 (Employee)
 *   1. 변수 : 직원구분, 이름, 소속부서
 *   2. 생성자 : 모든 멤버 변수를 매개변수로 가짐 
 * 정규직원 클래스 (FormalEmployee)
 *   1. 직원번호
 *   2. 생성자 : 직원번호, 이름, 소속부서를 매개변수로 가짐
 * 비정규직원 클래스 (InFormalEmployee)
 *   1. 계약만료일
 *   2. 생성자 : 이름, 계약만료일을 매개변수로 가짐
 */
class Employee1 extends Object {
	String type, name, dept;
	Employee1(String type, String name, String dept) {
		this.type = type;
		this.name = name;
		this.dept = dept;
	}
	public String toString() {
		return "구분 : " + type + ", 이름 : " + name + ",  부서 : " + dept;  //super.toString() 생략 되어 있는 것(Object의 toString)
	}
}
class FormalEmployee1 extends Employee1 {
	String empno;
	FormalEmployee1(String empno, String name, String dept) {
		super("정규직", name, dept);
		this.empno = empno;
	}
	public String toString() {
//		return type + " " + empno + "번 " + name + "의 부서는 " + dept + "입니다.";
		return super.toString() + ", 직원번호 : " + empno;  //부모에 있는 toString 호출 가능
	}
}
class InFormalEmployee1 extends Employee1 {
	String expireDate;
	InFormalEmployee1(String name, String expireDate) {
		super("비정규직", name, "");
		this.expireDate = expireDate;
	}
	public String toString() {
//		return type + " " + name + "의 계약만료일은 " + expireDate +"입니다.";
		return super.toString() +",  계약 만료일 : " + expireDate;
	}
}
public class EmployeeEx1 {
	public static void main(String[] args) {
		FormalEmployee1 fe = new FormalEmployee1("0001", "홍길동", "개발부");
		InFormalEmployee1 ife = new InFormalEmployee1("홍길동", "20191231");
		System.out.println(fe); //구분, 직원번호, 이름, 부서 출력하기
		System.out.println(ife); //구분, 이름, 계약만료일 출력하기
	}
}
