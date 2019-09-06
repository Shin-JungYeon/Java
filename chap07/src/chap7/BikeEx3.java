package chap7;

public class BikeEx3 {
	public static void main(String[] args) {
		Bike2 b = new AutoBike2(2);
		
		//java.lang.ClassCastException : 참조변수와 객체가 맞지 않을 때
		//instanceof 연산자 : 참조변수와 객체와의 관계 확인
		
		if(b instanceof Bike2) {  //b 객체가 Bike2가 가진 멤버에 접근 가능해?
			System.out.println("b 참조변수가 참조하는 객체는 Bike2 객체임");
		}
		if(b instanceof AutoBike2) {
			System.out.println("b 참조변수가 참조하는 객체는 AutoBike2 객체임");
			AutoBike2 ab = (AutoBike2)b;
			ab.power();
			ab.drive();
		}
		if(b instanceof Object) {
			System.out.println("b 참조변수가 참조하는 객체는 Object 객체임");
		}
		String s ="";
		if(s instanceof Object) {
			System.out.println("s 참조변수가 참조하는 객체는 Object 객체임");
		}
		//모든 객체는 object 타입으로 참조 가능. Object 클래스 : 모든 클래스의 최상위 클래스
		
		
//		Bike2 b = new Bike2(2);
//		[결과]
//		b 참조변수가 참조하는 객체는 Bike2 객체임
		
//		Bike2 b = new AutoBike2(2);
//		[결과]
//		b 참조변수가 참조하는 객체는 Bike2 객체임
//		b 참조변수가 참조하는 객체는 AutoBike2 객체임
//		전원이 켜졌습니다.
//		페달을 밟고 움직인다.

		
	}
}
