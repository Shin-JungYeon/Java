package chap7;

public class BikeEx3 {
	public static void main(String[] args) {
		Bike2 b = new AutoBike2(2);
		
		//java.lang.ClassCastException : ���������� ��ü�� ���� ���� ��
		//instanceof ������ : ���������� ��ü���� ���� Ȯ��
		
		if(b instanceof Bike2) {  //b ��ü�� Bike2�� ���� ����� ���� ������?
			System.out.println("b ���������� �����ϴ� ��ü�� Bike2 ��ü��");
		}
		if(b instanceof AutoBike2) {
			System.out.println("b ���������� �����ϴ� ��ü�� AutoBike2 ��ü��");
			AutoBike2 ab = (AutoBike2)b;
			ab.power();
			ab.drive();
		}
		if(b instanceof Object) {
			System.out.println("b ���������� �����ϴ� ��ü�� Object ��ü��");
		}
		String s ="";
		if(s instanceof Object) {
			System.out.println("s ���������� �����ϴ� ��ü�� Object ��ü��");
		}
		//��� ��ü�� object Ÿ������ ���� ����. Object Ŭ���� : ��� Ŭ������ �ֻ��� Ŭ����
		
		
//		Bike2 b = new Bike2(2);
//		[���]
//		b ���������� �����ϴ� ��ü�� Bike2 ��ü��
		
//		Bike2 b = new AutoBike2(2);
//		[���]
//		b ���������� �����ϴ� ��ü�� Bike2 ��ü��
//		b ���������� �����ϴ� ��ü�� AutoBike2 ��ü��
//		������ �������ϴ�.
//		����� ��� �����δ�.

		
	}
}
