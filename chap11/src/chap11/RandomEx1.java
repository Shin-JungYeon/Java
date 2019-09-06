package chap11;

import java.util.Random;

/*
 * Random Ŭ���� : ���� �߻� ���
 *   1. �ڷ��� ���� ���� �߻� ����
 *      nextInt() : ������ ����
 *      nextInt(n) : 0 <= x < n ������ ����
 *      nextDouble() : 0.0 <= x < 1.0 �Ǽ��� ����
 *      nextBoolean() : true, false �� �ϳ� ����
 *   2. seed ���� ����.
 */
public class RandomEx1 {
	public static void main(String[] args) {
		Random rand = new Random();
		//System.currentTimeMillis() : 1970�� ���ۺ��� ��������� �ð��� �и��ʷ� ����. -> seed������ �־� ������ Ȯ���� ������.
		rand.setSeed(System.currentTimeMillis());  //longŸ���� �Ű������� �־���. 
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
			//nextInt(10) : 0 ~ 9������ ������ ����
		}
		System.out.println();
		for(int i=0; i<10; i++) {
			System.out.print(rand2.nextInt(10) + ", ");
		}
		//seed ���� ������ �߻��Ǵ� ������ ����. ���� ����. �׷��� ������ System.currentTimeMillis() ����ؼ� �Ϻ��� ������ �������.
		System.out.println();
		
		//true �Ǵ� false ���� ������ �߻��ϱ�
		Random rand3 = new Random();
		rand3.setSeed(System.currentTimeMillis());
		for(int i=0; i<10; i++) {
			System.out.print(rand3.nextBoolean() + ", ");
		}
		System.out.println();
		
	}
}
