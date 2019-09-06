package chap6;
/*
 * 2. (1)원(Circle) 클래스 구현
 * ① 멤버변수 :
 * 반지름r, 원점x좌표, 원점y좌표, 원의 번호 no, 원의 번호를 생성시켜주는 count (static으로)
 * ② 멤버 메소드
 * a. area : 원의 넓이를 계산하는 메소드. Math.PI 상수 사용
 * b. length : 원의 둘레를 계산하는 메소드. Math.PI 상수 사용
 * c. toString : 현재 중심점과 반지름을 출력하는 메소드
 * 
 * (2)구동 클래스(CircleEx) 구현
 * - 원 객체들을 여러개 생성
 * - 각 원의 번호, 반지름, x좌표, y좌표를 출력하기 
 */
class Circle {
	int radius, xaxis, yaxis, no;
	static int cnt;
	double area(int r) {
		return ((Math.PI)*r*r);
		//return (((Math.PI)*radius*radius)+0.005)-(((Math.PI)*r*r)+0.005)%0.01;
	}
	double length(int r) {
		return (2*(Math.PI)*r);
		//return ((2*(Math.PI)*r)+0.005)-((2*(Math.PI)*r)+0.005)%0.01;
	}
	public String toString() {
		return  no + "번 원\n" + "중심점의 좌표 : " + "(" + xaxis + ", " + yaxis + ")\t" + "반지름 : " + radius ;
	}
}
public class HW2_CircleEx {
	public static void main(String[] args) {
		System.out.printf("%X\n", 15);  //16진수 출력
		System.out.printf("%o\n", 15);  //8진수 출력
		System.out.printf("%3d%3d\n", 5, 5);  //10진수를 3자리로 출력
		
		Circle[] cir = new Circle[3];
		
			cir[0] = new Circle();
			cir[0].radius = 3;
			cir[0].xaxis = 2;
			cir[0].yaxis = 4;
			cir[0].no = ++Circle.cnt;
			
			cir[1] = new Circle();
			cir[1].radius = 1;
			cir[1].xaxis = 3;
			cir[1].yaxis = 5;
			cir[1].no = ++Circle.cnt;
			
			cir[2] = new Circle();
			cir[2].radius = 4;
			cir[2].xaxis = 4;
			cir[2].yaxis = 3;
			cir[2].no = ++Circle.cnt;
			
			for(Circle c : cir) {
				System.out.println(c);
			}
			
			System.out.println();
			for(int i=0; i<cir.length; i++) {
				System.out.print(cir[i].no + "번 원\n넓이 : " + cir[i].area(cir[i].radius));
				System.out.println("\t둘레 : " + cir[i].length(cir[i].radius));
				System.out.println(String.format("%.2f", cir[i].area(cir[i].radius)));
			}
			
			
			System.out.println();
			for(int i=0; i<cir.length; i++) {
				System.out.print(cir[i].no + "번 원\n넓이 : " + String.format("%.2f", cir[i].area(cir[i].radius)));
				System.out.println("\t둘레 : " + String.format("%.2f", cir[i].length(cir[i].radius)));
			}
			/*
			 * String.format("%.2f, area())  지정된 포멧에 맞는 문자열로 바꿔줌.
			 * %.2f :   % : 형식지정문자
			 *        .2f : 소수점 이하 2자리만 출력 지정, 소수점 이하 3자리에서 반올림 됨.
			 */
			
		
	}
}
