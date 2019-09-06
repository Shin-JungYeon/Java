package chap6;
/*
 * Student Ŭ���� �����ϱ�
 * ������� : �̸�(name), ��(ban), ��ȣ(no), ��������(kor), ��������(eng), ��������(math)
 *          static int count;
 * ����޼���
 *  : 1. int getTotal()     : �л��� ������ ������ ����
 *    2. float getAverage() : �л��� ���
 *    2. void info()        : ��ȣ, �̸�, ��, ����, ����, ���� ����, ��� ���
 * ������
 *  : 1. �Ű�����(�̸�, ��, ��ȣ) : �̸�, ��, ��ȣ �ʱ�ȭ�ϰ� �������� 0���� �ʱ�ȭ
 *                              ��ȣ�� count�� �ڵ� ����
 *    2. �Ű�����(�̸�, ��, ��ȣ, ����, ����, ����) : �̸�, ��, ��ȣ, ����, ����, ���� �ʱ�ȭ�ϱ�
 *                                            ��ȣ�� count�� �ڵ� ����
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
		System.out.println(no + "��\t" + name + "\t" + ban + "��\t"
	                       + kor + "\t" + eng + "\t" +  math + "\t"
				           + getTotal() + "\t" + getAverage());
	}
}
public class StudentEx1 {
	public static void main(String[] args) {
		System.out.println("��ȣ\t" + "�̸�\t" + "��\t" + "����\t" + "����\t" + "����\t" + "����\t" + "���");
		
		Student s1 = new Student("ȫ�浿", 4, 85, 80, 90);
		s1.info();
		Student s2 = new Student("���", 4, 75, 80, 80);
		s2.info();
		Student s3 = new Student("�̸���", 4);
		s3.info();
		
		
		
//		Student[] std = new Student[3];
//		std[0] = new Student("ȫ�浿", 4, 85, 80, 90);
//		std[1] = new Student("���", 4, 75, 80, 80);
//		std[2] = new Student("�̸���", 4);
//		for(int i=0; i<std.length; i++) {
//			std[i].getTotal();
//			std[i].getAverage();
//			std[i].info();
//		}
// �������� �� �ʿ� ������~~~

	}
}
