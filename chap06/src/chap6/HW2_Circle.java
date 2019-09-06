package chap6;
/*
 * 2. Circle2 클래스 구현
 *   1) 멤버변수
 *      반지름, 원점x좌표, 원점y좌표, 원의 번호 no, 원의 번호를 생성시켜주는 count (static으로)
 *   2) 생성자 3개 
 *      a. 매개변수 없이 객체 생성하면 반지름 1, 중앙점 (1,1) 객체생성
 *      b. 매개변수가 1개(r)이면 반지름이 r이고  중앙점이 (1,1)인 객체 생성
 *      c. 매개변수가 3개(r, x, y)이면 반지름 r, 중앙점이 (x,y) 인 객체 생성
 *   3) 멤버 메소드
 *      a. double area : 원의 넓이를 계산하는 메소드      Math.PI
 *      b. double length : 원의 둘레를 계산하는 메소드      Math.PI
 *      c. String toString() : 현재 원의 모든 정보를 출력하기 
 *      
 * 구동 클래스 실행시
 * 
 * [결과]
 * 1번원=> 반지름:1(1,1), 넓이:3.14, 둘레:6.28
 * 2번원=> 반지름:50(1,1), 넓이:7853.98, 둘레:314.16
 * 3번원=> 반지름:100(10,20), 넓이:31415.93, 둘레:628.32
 * 
 * 출력하기
 */
class Circle2 {
	int r, x, y, no;
	static int count;
	
	Circle2(int r, int x, int y) {
		this.r = r;
		this.x = x;
		this.y = y;
		no = ++count;
	}
	Circle2(int r) {
		this(r, 1, 1);
	}
	Circle2() {
		this(1, 1, 1);
	}
	double area() {
		return ((Math.PI)*r*r);
	}
	double length() {
		return (2*(Math.PI)*r);
	}
	public String toString() {
		return no + "번원 => " + "반지름 : " + this.r + "(" + this.x + "," + this.y + "),  넓이 : "
	           + String.format("%.2f",area()) + ",  둘레 : " + String.format("%.2f",length());
	}
}
public class HW2_Circle {

	public static void main(String[] args) {
		 Circle2 c1 = new Circle2();
		 Circle2 c2 = new Circle2(50);
		 Circle2 c3 = new Circle2(100, 10, 20);

		 System.out.println(c1);
		 System.out.println(c2);
		 System.out.println(c3);
		
	}

}
