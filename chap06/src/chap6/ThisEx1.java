package chap6;
/*
 * this �����
 * this ������ : ���� Ŭ������ �ٸ� �����ڸ� ȣ��
 *             �ݵ�� ������ ������ ù�ٿ� �����ؾ� ��.
 * this �������� : �ڱ� ���� ����, �ν��Ͻ� �޼��忡�� ���� �ν��Ͻ� ����� ��Ī�� �� ����.
 *              �ν��Ͻ� �޼��� ���ο� ���������� �ڵ� �����.
 *              this.������
 */
class Car {
	String color;
	int number;
	Car(String color, int number) {
		System.out.println("Car(String c, int n) ������ ȣ��");
//		color = c;
//		number = n;
		this.color = color;  //this ��������   color = color;  ��� �ڵ��ϸ� ���� ���������� ��.
		this.number = number;
	}
	Car(String c) {
//		color = c;
//		number = 1;
		this(c, 1);   //this ������ -> ������ �������� ù��°�ٿ� ����� ��.
		System.out.println("Car(String c) ������ ȣ��");
	}
	Car(int n) {
//		color = "white";
//		number = n;
		this("white", n);   //this ������
		System.out.println("Car(int n) ������ ȣ��");
	}
	public String toString() {
		return this.color + ":" + this.number;
	}
}
public class ThisEx1 {
	public static void main(String[] args) {
		Car c1 = new Car("black", 1234);
		System.out.println(c1);
		Car c2 = new Car("red");
		System.out.println(c2);
		Car c3 = new Car(5678);
		System.out.println(c3);
		
		//���ο����� this ��� ������ ����.
	}
}
