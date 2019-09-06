package chap3;
/*
 * 단항 연산자 : 증감 연산자 ++ --
 *   전위형 : ++피연산자, 증감 연산자를 먼저 실행한 후 다른 기능을 처리함.
 *   후위형 : 피연산자++, 다른 기능을 먼저 실행한 후 증감 연산자를 처리함.
 *   다른 연산과 함께 사용할 때 결과에 주의하여 코딩.
 */
public class OpEx1 {
	public static void main(String[] args) {
		int x=5, y=5;
		x = x + 1;
		System.out.println("x=" + x);
		x++;
		System.out.println("x=" + x);
		y++;
		System.out.println("y=" + y);
		++x;
		System.out.println("x=" + x);
		++y;
		System.out.println("y=" + y);
		y = x++;
		System.out.println("x=" + x + ",y=" + y); //x=9, y=8
		y = ++x;
		System.out.println("x=" + x + ",y=" + y); //x=10, y=10
		y = x--;
		System.out.println("x=" + x + ",y=" + y); //x=9, y=10
		y = --x;
		System.out.println("x=" + x + ",y=" + y); //x=8, y=8
		System.out.println("x=" + x++); //x=8, 출력이 먼저 된 후 증가
		System.out.println("x=" + ++x); //x=10, 값이 증가된 후 출력
	}
}
