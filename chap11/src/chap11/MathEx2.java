package chap11;
/*
 * getRand() �޼��� �����ϱ�.
 *   �־��� ����(-3 ~ 1)�� ���� ������ �������� ��ȯ. ���� ��谪�� ��� ������ ���Ե�.
 *   �� ���� ���ڴ� ��� ���� Ŀ�� ��� ����.
 *   ��ȯŸ�� : int
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
