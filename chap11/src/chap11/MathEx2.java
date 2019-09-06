package chap11;
/*
 * getRand() 메서드 구현하기.
 *   주어진 범위(-3 ~ 1)에 속한 임의의 정수값을 반환. 양쪽 경계값이 모두 범위에 포함됨.
 *   두 개의 숫자는 어느 쪽이 커도 상관 없음.
 *   반환타입 : int
 */
public class MathEx2 {
	public static void main(String[] args) {
		for(int i=0; i<20; i++) {
			System.out.print(getRand(1, -3) + ", ");
		}
		System.out.println();
	}

	private static int getRand(int i, int j) {
		int max = Math.max(i, j);
		int min = Math.min(i, j);
		return (int)(Math.random()*(max-min+1)) + min;
	}
	
}
