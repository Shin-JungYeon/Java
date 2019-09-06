package chap11;
/*
 * Math 클래스 예제
 *   1. 수치 계산관련 static 메서드와 상수를 가진 클래스. (모든 멤버가 static)
 *   2. 객체화 불가능. -> 생성자의 접근 제어자가 private임.
 *   3. final 클래스임. -> 상속 불가 클래스.
 *   
 * Math.멤버명 으로 호출한다.
 */
public class MathEx1 {
	public static void main(String[] args) {
		//삼각함수
		System.out.println("Math.sin(Math.PI/2) : " + Math.sin(Math.PI/2));  //라디안 단위로 넣어줘야 함.
		System.out.println("Math.cos(60) : " + Math.cos(Math.toRadians(60)));  //도 -> 라디안
		System.out.println("Math.tan(Math.PI/4) : " + Math.tan(Math.PI/4));
		System.out.println("Math.toDegrees(Math.PI/4) : " + Math.toDegrees(Math.PI/4));  //라디안 -> 도
		System.out.println();
		
		//제곱근, 제곱
		System.out.println("Math.sqrt(25) : " + Math.sqrt(25));
		System.out.println("Math.pow(5, 3) : " + Math.pow(5, 3));  //5*5*5
		System.out.println();
		
		//근사 정수 : 나와 가장 가까운 정수
		System.out.println("Math.ceil(3.4) : " + Math.ceil(3.4));  //나보다는 크고 가장 가까운 정수
		System.out.println("Math.ceil(-3.4) : " + Math.ceil(-3.4));
		System.out.println("Math.floor(3.4) : " + Math.floor(3.4));  //나보다는 작고 가장 가까운 정수
		System.out.println("Math.floor(-3.4) : " + Math.floor(-3.4));
		System.out.println("Math.rint(3.4) : " + Math.rint(3.4));  //나보다 크던 작던 상관없이 그냥 가장 가까운 정수
		System.out.println("Math.rint(-3.4) : " + Math.rint(-3.4));
		System.out.println();
		
		//반올림
		System.out.println("Math.round(3.7) : " + Math.round(3.7));  //리턴타입 lng -> 소숫점자리 포함X, 전부 정수로 바꿔줌.
		System.out.println();
		
		//절대값
		System.out.println("Math.abs(-3.4) : " + Math.abs(-3.4));
		System.out.println();
		
		//큰값, 작은값
		System.out.println("Math.max(3, 4) : " + Math.max(3, 4));
		System.out.println("Math.min(3, 4) : " + Math.min(3, 4));
		System.out.println();
		
		//임의의 수
		System.out.println("Math.random() : " + Math.random());  //1은 절대 넘지 않음.		
	}
}