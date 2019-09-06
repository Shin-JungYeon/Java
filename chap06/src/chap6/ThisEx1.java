package chap6;
/*
 * this 예약어
 * this 생성자 : 동일 클래스의 다른 생성자를 호출
 *             반드시 생성자 내부의 첫줄에 구현해야 함.
 * this 참조변수 : 자기 참조 변수, 인스턴스 메서드에서 같은 인스턴스 멤버를 지칭할 때 사용됨.
 *              인스턴스 메서드 내부에 지역변수로 자동 선언됨.
 *              this.변수명
 */
class Car {
	String color;
	int number;
	Car(String color, int number) {
		System.out.println("Car(String c, int n) 생성자 호출");
//		color = c;
//		number = n;
		this.color = color;  //this 참조변수   color = color;  라고 코딩하면 전부 지역변수가 됨.
		this.number = number;
	}
	Car(String c) {
//		color = c;
//		number = 1;
		this(c, 1);   //this 생성자 -> 무조건 생성자의 첫번째줄에 써줘야 함.
		System.out.println("Car(String c) 생성자 호출");
	}
	Car(int n) {
//		color = "white";
//		number = n;
		this("white", n);   //this 생성자
		System.out.println("Car(int n) 생성자 호출");
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
		
		//메인에서는 this 라는 개념이 없다.
	}
}
