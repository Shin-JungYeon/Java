package chap9;
/*
 * ������ : enum ����.
 * ����Ŭ������ Ưȭ�� �� ����. �̸� ��ü�� ����� ���� �� �� �ܿ� ������� ���ϵ��� �ϴ� ��.
 */
public class EnumEx1 {
	public enum Car {
		AVANTE, SONATA, GRANDURE
	}
	public static void main(String[] args) {
		Car car = Car.AVANTE;
		System.out.println("Car1 : " + car);
		car = Car.SONATA;
		System.out.println("Car2 : " + car);
//		car = Car.K9;
		if(car instanceof Object) {
			System.out.println(car.toString());
			System.out.println(car.getClass().getName());  //chap9.EnumEx1$Car  $�� ������ ����Ŭ����
		}
		Car[] cars = Car.values();
		for(Car c : cars) {
			System.out.println(c + ":" + c.ordinal());
		}
	}
}
