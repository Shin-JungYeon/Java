package chap7;
/*
 * 오버라이딩 예제
 * 오버라이딩 : 부모클래스의 기능(메서드)을 자손클래스에서 재정의 하는 것. 반드시 상속관계에서 일어남.
 */
/*
 * 오버로딩 : 동일클래스 내에서(매개변수 달라야함),  메서드 이름 같음,  매개변수목록(자료형) 달라야 함,
 *         리턴타입 상관없음,  접근제어자 상관없음,  예외처리 상관없음.
 * 
 * 오버라이딩 : 상속관계에서,  메서드 이름 같음,  매개변수목록(자료형) 같아야 함,
 *           리턴타입 같아야 함(부모의 것을 가져다가 기능만을 바꿔줄 뿐 그대로 재정의 하는 것이기 때문),  접근제어자 같거나 넓은범위(덜 제한적)로 가능,  예외처리 같거나 좁은 범위로 가능.
 */
class Bike {
	int wheel;
	Bike(int wheel) {
		this.wheel = wheel;
	}
	String drive() {
		return "페달을 밟는다.";
	}
	String stop() {
		return "브레이크를 잡는다.";
	}
}
class AutoBike extends Bike {
	AutoBike(int wheel){
		super(wheel);
	}
	@Override  //어노테이션 : 오버라이딩이라는 것을 알려줌, 오버라이딩 조건을 잘 만족했는지 검증해줌.
	String drive() {
		return "시작버튼을 누른다.";
	}
//	@Override
	String stop() {
		return "멈춤 버튼을 누른다.";
	}
}
public class BikeEx1 {
	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		System.out.println(ab.drive());
		System.out.println(ab.wheel + "개의 바퀴가 굴러 갑니다.");
		System.out.println(ab.stop());
		
		System.out.println();
		Bike b = new Bike(4);
		System.out.println(b.drive());
		System.out.println(b.wheel + "개의 바퀴가 굴러 갑니다.");
		System.out.println(b.stop());
	
	}
}