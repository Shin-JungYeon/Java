package practice;
/*
 * Animal2 Ŭ������ ������ ����. ���� Ŭ������ ���������� ������ ����� �������� ���α׷� �����ϱ�  
 * Flyable �������̽�, Dove,Monkey,Eagle Ŭ���� �����ϱ�
 * 
 * [���]
 * ��ѱ�� ���� ������ ��� �Դ´�.
 * ��ѱ�� ���� �ٴϴ� ���Դϴ�.
 * �����̴� �������� ���Ÿ� ���� �Դ´�
 * �������� ���� ���� ��� �Դ´�.
 * �������� ��û ���� ���� �ٴѴ�.
 */
abstract class Animal {
	String name;
	Animal(String name){
		this.name = name;
	}
	abstract void eat();
}
interface Flyable {
	void fly();
}
class Dove extends Animal implements Flyable {
	Dove() {
		super("��ѱ�");
	}
	@Override
	void eat() {
		System.out.println(name + "�� ���� ������ ��� �Դ´�.");
	}
	@Override
	public void fly() {
		System.out.println(name + "�� ���� �ٴϴ� ���Դϴ�.");
	}
}
class Monkey extends Animal {
	Monkey() {
		super("������");
	}
	@Override
	void eat() {
		System.out.println(name + "�� �������� ���Ÿ� ���� �Դ´�.");
	}
}
class Eagle extends Animal implements Flyable {
	Eagle(){
		super("������");
	}
	@Override
	public void fly() {
		System.out.println(name + "�� ��û ���� ���� �ٴѴ�.");
	}
	@Override
	void eat() {
		System.out.println(name + "�� ���� ���� ��� �Դ´�.");
	}
}
public class AnimalExam {
	public static void main(String[] args) {
		Animal[] arr = new Animal[3];
		arr[0] = new Dove();
		arr[1] = new Monkey();
		arr[2] = new Eagle();
		for(Animal a : arr) {
			a.eat();
			if(a instanceof Flyable) {
				((Flyable)a).fly();
			}
		}
		
	}
}
