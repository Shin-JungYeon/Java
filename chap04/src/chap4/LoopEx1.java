package chap4;
/*
 * 반복문 예제
 * 반복문 종류 : for, while, do..while
 */
public class LoopEx1 {
	public static void main(String[] args) {
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.println(5);
		
		System.out.println("for 구문을 이용하여 1 ~ 5 까지 출력하기");
		for (int i = 1 ; i <= 5 ; i++) { //i : 지역변수, 메서드 안에서만 사용할 수 있음.  //반복횟수를 알고있을 때 사용.
			System.out.print(i);
		}
		//System.out.println(i);  구문 밖에서는 i 사용 불가, 컴파일 에러.
		System.out.println();
		
		System.out.println("while 구문을 이용하여 1 ~ 5 까지 출력하기");
		int i = 1;
		while (i <=5) {  //조건이 참인 경우에만 반복문 실행.
			System.out.print(i);
			i++;
		}
		System.out.println(i); //6
		
		System.out.println("do..while 구문을 이용하여 1 ~ 5 까지 출력하기");
		i = 1;
		do {
			System.out.print(i);
			i++;
		} while (i <= 5);  //일단 한 번은 무조건 실행한 후 조건문이 참이면 계속 실행.
		System.out.println();
		
	}
}
