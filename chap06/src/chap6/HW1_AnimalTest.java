package chap6;
/*
 * 1. (1)����Ŭ����(Animal) �����ϱ�
 *       ������� : �̸�(name), ����(age)
 *       ����޼���: eat() 
 *       ��� :" ���ְ� ��� "  �����
 *    (2)����Ŭ����(AnimalTest.java) �����ϱ�
 *
 * [���]
 * 
 * ������:26��
 * ���ְ� ���
 */
class Animal {
	String name;
	int age;
	void eat() {
		System.out.println(name + ":" + age + "��\n" + "���ְ� ���");
	}
}
public class HW1_AnimalTest {
	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.name = "������";
		ani.age = 26;
		ani.eat();
	}
}
