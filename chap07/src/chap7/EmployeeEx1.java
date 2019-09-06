package chap7;
/*
 * ���� Ŭ���� (Employee)
 *   1. ���� : ��������, �̸�, �ҼӺμ�
 *   2. ������ : ��� ��� ������ �Ű������� ���� 
 * �������� Ŭ���� (FormalEmployee)
 *   1. ������ȣ
 *   2. ������ : ������ȣ, �̸�, �ҼӺμ��� �Ű������� ����
 * ���������� Ŭ���� (InFormalEmployee)
 *   1. ��ุ����
 *   2. ������ : �̸�, ��ุ������ �Ű������� ����
 */
class Employee1 extends Object {
	String type, name, dept;
	Employee1(String type, String name, String dept) {
		this.type = type;
		this.name = name;
		this.dept = dept;
	}
	public String toString() {
		return "���� : " + type + ", �̸� : " + name + ",  �μ� : " + dept;  //super.toString() ���� �Ǿ� �ִ� ��(Object�� toString)
	}
}
class FormalEmployee1 extends Employee1 {
	String empno;
	FormalEmployee1(String empno, String name, String dept) {
		super("������", name, dept);
		this.empno = empno;
	}
	public String toString() {
//		return type + " " + empno + "�� " + name + "�� �μ��� " + dept + "�Դϴ�.";
		return super.toString() + ", ������ȣ : " + empno;  //�θ� �ִ� toString ȣ�� ����
	}
}
class InFormalEmployee1 extends Employee1 {
	String expireDate;
	InFormalEmployee1(String name, String expireDate) {
		super("��������", name, "");
		this.expireDate = expireDate;
	}
	public String toString() {
//		return type + " " + name + "�� ��ุ������ " + expireDate +"�Դϴ�.";
		return super.toString() +",  ��� ������ : " + expireDate;
	}
}
public class EmployeeEx1 {
	public static void main(String[] args) {
		FormalEmployee1 fe = new FormalEmployee1("0001", "ȫ�浿", "���ߺ�");
		InFormalEmployee1 ife = new InFormalEmployee1("ȫ�浿", "20191231");
		System.out.println(fe); //����, ������ȣ, �̸�, �μ� ����ϱ�
		System.out.println(ife); //����, �̸�, ��ุ���� ����ϱ�
	}
}
