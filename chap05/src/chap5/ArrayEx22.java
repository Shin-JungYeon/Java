package chap5;

import java.util.Arrays;

/*
 * 배열의 복사
 * 1. for 구문을 이용하여 하나씩 복사
 * 2. System.arrayCopy() 메서드를 이용하기
 * 3. Arrays 클래스 이용
 */
public class ArrayEx22 {
	public static void main(String[] args) {
		//1. for 구문을 이용하여 하나씩 복사
		int score[] = {90, 80, 70};
		int score2[] = new int[5];
		for(int i=0; i<score.length; i++) {
			score2[i] = score[i];
		}
		for(int s : score2) {
			System.out.print(s + "\t");
		}
		System.out.println();
		
		
		//2. System.arrayCopy() 메서드를 이용하기
		score2 = new int[5];
		System.arraycopy(score, 0, score2, 1, score.length);
		/*
		 *  (원본배열,  복사 시작 인덱스, 복사배열,   복사 시작 인덱스, 요소의 갯수)
		 * (score,   0,           score2,   1,           score.length)
		 * score  = 90 80 70
		 * score2 =  0  0  0  0  0
		 * score의 0번지부터 3개(score.length)까지 score2의 1번지부터 복사해서 넣음.
		 */
		for(int s : score2) {
			System.out.print(s + "\t");
		}
		System.out.println();
		
		
		//3. Arrays 클래스 이용
		score2 = null; //score2가 참조하고 있는 배열(객체) 없음.
		score2 = Arrays.copyOf(score, 5);
		/*
		 * score 원본 배열을 5개의 방을 가진 배열에 복사
		 */
		for(int s : score2) {
			System.out.print(s + "\t");
		}
		System.out.println();
		
		
	}
}
