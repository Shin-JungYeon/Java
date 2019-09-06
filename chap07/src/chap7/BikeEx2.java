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
		System.out.println("페달을 밟고 움직인다.");
	}
	void stop() {
		System.out.println("브레이크를 잡고 멈춘다.");
	}
}
class AutoBike2 extends Bike2 {
	boolean power;
	AutoBike2(int wheel) {
		super(wheel);
	}
	void power() {
		power = !power;
		if(power) System.out.println("전원이 켜졌습니다.");
		else System.out.println("전원이 꺼졌습니다.");
	}
}
public class BikeEx2 {
	public static void main(String[] args) {
		AutoBike2 ab = new AutoBike2(2);  //객체
		AutoBike2 ab2;  //참조변수
		Bike2 b;  //참조변수
		ab.power();
		ab.drive();
		System.out.println(ab.wheel + "개의 바퀴가 굴러 간다.");
		ab.stop();
		
		System.out.println();
		b = (Bike2)ab;  //b는 Bike2 타입이다.
		//하나의 객체가 참조변수 타입에 따라 달라짐 -> 다형성. 객체 자체는 변하지 않음, 참조변수 타입에 따라 볼 수 있는 부분이 달라지는 것.
        /*
         * 작은 자료형(AutoBike2) -> 큰 자료형(Bike2), 형변환 연산자 생략 가능.  
		 * 접근할 수 있는 멤버들은 자손클래스가 더 많지만 자료형의 크기로 따지면 부모클래스가 더 큰 자료형이다.
		 */
//		b.power();  //Bike2의 멤버가 아님. 자손 클래스(AutoBike2)의 멤버에 접근할 수 없다.
		b.drive();
		System.out.println(ab.wheel + "개의 바퀴가 굴러 간다.");
		b.stop();
		
		System.out.println();
		ab2 = (AutoBike2)b;  //큰 자료형(Bike2) -> 작은 자료형(AutoBike2), 형변환 연산자 생략 불가능
		ab2.power();
		ab2.drive();
		System.out.println(ab.wheel + "개의 바퀴가 굴러 간다.");
		ab2.stop();
		
	}
}
