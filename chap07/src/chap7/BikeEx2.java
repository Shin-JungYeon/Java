package chap7;
/*
 * 
 */
class Bike2 {
	int wheel;
	Bike2(int wheel) {
		this.wheel = wheel;
	}
	void drive() {
		System.out.println("����� ��� �����δ�.");
	}
	void stop() {
		System.out.println("�극��ũ�� ��� �����.");
	}
}
class AutoBike2 extends Bike2 {
	boolean power;
	AutoBike2(int wheel) {
		super(wheel);
	}
	void power() {
		power = !power;
		if(power) System.out.println("������ �������ϴ�.");
		else System.out.println("������ �������ϴ�.");
	}
}
public class BikeEx2 {
	public static void main(String[] args) {
		AutoBike2 ab = new AutoBike2(2);  //��ü
		AutoBike2 ab2;  //��������
		Bike2 b;  //��������
		ab.power();
		ab.drive();
		System.out.println(ab.wheel + "���� ������ ���� ����.");
		ab.stop();
		
		System.out.println();
		b = (Bike2)ab;  //b�� Bike2 Ÿ���̴�.
		//�ϳ��� ��ü�� �������� Ÿ�Կ� ���� �޶��� -> ������. ��ü ��ü�� ������ ����, �������� Ÿ�Կ� ���� �� �� �ִ� �κ��� �޶����� ��.
        /*
         * ���� �ڷ���(AutoBike2) -> ū �ڷ���(Bike2), ����ȯ ������ ���� ����.  
		 * ������ �� �ִ� ������� �ڼ�Ŭ������ �� ������ �ڷ����� ũ��� ������ �θ�Ŭ������ �� ū �ڷ����̴�.
		 */
//		b.power();  //Bike2�� ����� �ƴ�. �ڼ� Ŭ����(AutoBike2)�� ����� ������ �� ����.
		b.drive();
		System.out.println(ab.wheel + "���� ������ ���� ����.");
		b.stop();
		
		System.out.println();
		ab2 = (AutoBike2)b;  //ū �ڷ���(Bike2) -> ���� �ڷ���(AutoBike2), ����ȯ ������ ���� �Ұ���
		ab2.power();
		ab2.drive();
		System.out.println(ab.wheel + "���� ������ ���� ����.");
		ab2.stop();
		
	}
}
