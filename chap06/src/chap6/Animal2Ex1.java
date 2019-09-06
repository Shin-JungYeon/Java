package chap6;
/*
 * ���� Ŭ������ ���������� ����Ǿ� �����
 * ������:26�� �� ��µǵ��� Animal2 Ŭ���� �����ϱ�
 */
class Animal2 {
	String name;
	int age;
	Animal2(String n, int a){
		name = n;
		age = a;
	}
	Animal2(String n){
		name = n;
		age = 1;
	}
	Animal2(int a){
		name = "���";
		age = a;
	}
	void info() {
		System.out.println(name + ":" + age + "��");
	}
}
public class Animal2Ex1 {
	public static void main(String[] args) {
		Animal2 a1 = new Animal2("������", 26);
		a1.info();  //������:26��;
		Animal2 a2 = new Animal2("������");
		a2.info();  //������:1��
		Animal2 a3 = new Animal2(20);
		a3.info();  //���:20��
	}
}