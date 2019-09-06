package chap5;

import java.util.Arrays;

/*
 * �迭�� ����
 * 1. for ������ �̿��Ͽ� �ϳ��� ����
 * 2. System.arrayCopy() �޼��带 �̿��ϱ�
 * 3. Arrays Ŭ���� �̿�
 */
public class ArrayEx22 {
	public static void main(String[] args) {
		//1. for ������ �̿��Ͽ� �ϳ��� ����
		int score[] = {90, 80, 70};
		int score2[] = new int[5];
		for(int i=0; i<score.length; i++) {
			score2[i] = score[i];
		}
		for(int s : score2) {
			System.out.print(s + "\t");
		}
		System.out.println();
		
		
		//2. System.arrayCopy() �޼��带 �̿��ϱ�
		score2 = new int[5];
		System.arraycopy(score, 0, score2, 1, score.length);
		/*
		 *  (�����迭,  ���� ���� �ε���, ����迭,   ���� ���� �ε���, ����� ����)
		 * (score,   0,           score2,   1,           score.length)
		 * score  = 90 80 70
		 * score2 =  0  0  0  0  0
		 * score�� 0�������� 3��(score.length)���� score2�� 1�������� �����ؼ� ����.
		 */
		for(int s : score2) {
			System.out.print(s + "\t");
		}
		System.out.println();
		
		
		//3. Arrays Ŭ���� �̿�
		score2 = null; //score2�� �����ϰ� �ִ� �迭(��ü) ����.
		score2 = Arrays.copyOf(score, 5);
		/*
		 * score ���� �迭�� 5���� ���� ���� �迭�� ����
		 */
		for(int s : score2) {
			System.out.print(s + "\t");
		}
		System.out.println();
		
		
	}
}
