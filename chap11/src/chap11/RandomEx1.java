package chap11;

import java.util.Random;

/*
 * Random 클래스 : 난수 발생 기능
 *   1. 자료형 별로 난수 발생 가능
 *      nextInt() : 정수형 난수
 *      nextInt(n) : 0 <= x < n 정수형 난수
 *      nextDouble() : 0.0 <= x < 1.0 실수형 난수
 *      nextBoolean() : true, false 중 하나 리턴
 *   2. seed 설정 가능.
 */
public class RandomEx1 {
	public static void main(String[] args) {
		Random rand = new Random();
		//System.currentTimeMillis() : 1970년 시작부터 현재까지의 시간을 밀리초로 리턴. -> seed값으로 넣어 난수일 확률을 높혀줌.
		rand.setSeed(System.currentTimeMillis());  //long타입의 매개변수를 넣어줌. 
		for(int i=0; i<5; i++) {
			System.out.print(rand.nextInt(10) + ", ");
		}
		System.out.println();
		
		Random rand1 = new Random();
		Random rand2 = new Random();
		rand1.setSeed(0L);
		rand2.setSeed(1L);
		for(int i=0; i<10; i++) {
			System.out.print(rand1.nextInt(10) + ", ");
			//nextInt(10) : 0 ~ 9까지의 정수값 리턴
		}
		System.out.println();
		for(int i=0; i<10; i++) {
			System.out.print(rand2.nextInt(10) + ", ");
		}
		//seed 값이 같으면 발생되는 난수가 같다. 조작 가능. 그렇기 때문에 System.currentTimeMillis() 사용해서 완벽한 난수를 만들어줌.
		System.out.println();
		
		//true 또는 false 값을 난수로 발생하기
		Random rand3 = new Random();
		rand3.setSeed(System.currentTimeMillis());
		for(int i=0; i<10; i++) {
			System.out.print(rand3.nextBoolean() + ", ");
		}
		System.out.println();
		
	}
}
