package chap9;
/*
 * 열거형 : enum 예제.
 * 내부클래스의 특화된 한 종류. 미리 객체를 만들어 놓고 그 것 외엔 사용하지 못하도록 하는 것.
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
			System.out.println(car.getClass().getName());  //chap9.EnumEx1$Car  $가 붙으면 내부클래스
		}
		Car[] cars = Car.values();
		for(Car c : cars) {
			System.out.println(c + ":" + c.ordinal());
		}
	}
}
