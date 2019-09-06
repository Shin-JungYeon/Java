package chap7;
/*
 * 1. Animal Ŭ���� -> �߻�Ŭ����
 *     ������� : ������ ����, �ٸ���
 *     ������ : ��������� �Է¹޾Ƽ� ����
 *     ����޼��� : void eat(); -> �߻�޼���
 *               String sound();
 * 2. Dog Ŭ����
 *     ����޼��� : void eat(); -> "������ �ִ´�� �Դ´�."
 *               String sound(); -> "�۸�"
 * 3. Lion Ŭ���� : void eat(); -> "�ʽĵ����� ����ؼ� �Դ´�."
 *               String sound(); -> "����"
 */
abstract class Animal {
	String type;
	int leg;
	Animal(String type, int leg){
		this.type = type;
		this.leg = leg;
	}
	abstract void eat();
	abstract String sound();
}

class Dog extends Animal {

	Dog() {
		super("������", 4);
	}

	@Override
	void eat() {
		System.out.println("������ �ִ´�� �Դ´�.");
	}

	@Override
	String sound() {
		return "�۸�";
	}
}

class Lion extends Animal {
	Lion() {
		super("����", 4);
	}
	
	@Override
	void eat() {
		System.out.println("�ʽĵ����� ����ؼ� �Դ´�.");		
	}

	@Override
	String sound() {
		return "����";
	}
}
/*
 * ������ �迭�� �����ϰ�, �������� eat() �޼���� sound() �޼��带 ȣ���ϱ�
 */
public class AnimalEx1 {
	public static void main(String[] args) {
		//�߻�Ŭ������ ���� ��ü ���� �ȵ�.
		//Animal ani = new Animal("����", 0);
		Animal[] animals = new Animal[2];
		animals[0] = new Dog();
		animals[1] = new Lion();
		for(Animal a : animals) {
			a.eat();
			System.out.println(a.type + "�� " + a.sound() + "�ϰ� ���.");
		}
		
	}
}
