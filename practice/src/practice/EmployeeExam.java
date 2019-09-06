package practice;
/*
 * ȸ�翡�� ���� ������ �������� �ִ�.
 * ������ ���������� ���������� ���� ������.
 * ������������ �ӽ������� ���� ������� ������.
 * 
 * ��� ������ ��������(type), �̸�(name) ������ ������.
 * ���������� ������ȣ(empNo), ����(position),  ����(salary)�� ����� ������.
 * ������������ ��ุ����(expireDate), �⺻�ӱ�(primaryPay)�� ����� ������.
 * �ӽ������� �ð��� �ӱ�(timePay), �ٹ��ð�(empTime)�� ����� ������.
 * ���ϻ���� �ӱ�������(payRate)�� ����� ������.
 * 
 * ����Ŭ����(Employee)
 * ��������(FormalEmployee)
 * ����������(InformalEmployee)
 * �ӽ����� (TempEmployee)
 * ��������(InternEmployee) Ŭ������  �Ѵ�.
 * 
 * Ŭ������ ��ü ������ ������ ��������� �Է¹޾� ��ü�� �����Ѵ�.
 * 
 * ��� ������ �޿��� �޴´�. getPay() �޼���.
 * ���������� �޿��� ���� / 12 �� 
 * ������������ �⺻�Ա�
 * �ӽ����� �⺻�ӱ� + (�ð��� �ӱ� * �ٹ��ð�)
 * ���ϻ���� �⺻�ӱ� * �ӱ�������
 * 
 * ������ Ŭ������ �����ϱ�
 *
 * [���]
 * ��������� :�������� �޿� : 416
 * ����������� :�̺����� �޿� : 1000
 * �ӽ������ :���ӽ��� �޿� : 50
 * ���ϻ����� :�������� �޿� : 1600
 */
abstract class Employee {
	String name, type;
	Employee(String name, String type){
		this.name = name;
		this.type = type;
	}
	abstract int getPay();
}

class FormalEmployee extends Employee {
	int salary;
	String empNo, position;
	FormalEmployee(String name, String empNo, int salary, String position) {
		super(name, "������");
		this.empNo = empNo;
		this.salary = salary;
		this.position = position;
	}
	@Override
	int getPay() {
		return this.salary/12;
	}
}

class InformalEmployee extends Employee {
	int primaryPay;
	String expireDate;
	InformalEmployee(String name, String expireDate, int primaryPay){
		super(name, "��������");
		this.expireDate = expireDate;
		this.primaryPay = primaryPay;
	}
	@Override
	int getPay() {
		return primaryPay;
	}
	
}

class TempEmployee extends InformalEmployee {
	int timePay, empTime;
	TempEmployee(String name, String expireDate, int primaryPay, int empTime, int timePay){
		super(name, expireDate, primaryPay);
		this.type = "�ӽ���";
		this.empTime = empTime;
		this.timePay = timePay;
	}
	@Override
	int getPay() {
		return primaryPay + (timePay*empTime);
	}
}

class InternEmployee extends InformalEmployee {
	float payRate;
	InternEmployee(String name, String expireDate, int primaryPay,float payRate) {
		super(name, expireDate, primaryPay);
		this.type = "����";
		this.payRate = payRate;
	}
	@Override
	int getPay() {
		return (int)(primaryPay * payRate);
	}
}
public class EmployeeExam {
	public static void main(String[] args) {
		Employee[] emps = new Employee[4];
		emps[0] = new FormalEmployee("������", "1", 5000, "����");
		emps[1] = new InformalEmployee("�̺���", "20191231", 1000);
		emps[2] = new TempEmployee("���ӽ�", "20191231", 0, 1, 50);
		emps[3] = new InternEmployee("������", "20191231", 2000, 0.8f);

		for (Employee e : emps) {
			System.out.println(e.type + "���(" + e.name + ")�� �޿� : " + e.getPay());
		}
	}
}
