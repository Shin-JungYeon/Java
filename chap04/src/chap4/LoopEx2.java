package chap4;
/*
 * �ݺ����� �̿��Ͽ� 10������ ���� ���ϱ�
 */
public class LoopEx2 {
	public static void main(String[] args) {
		System.out.println(1+2+3+4+5+6+7+8+9+10);
		
		int i = 0;
		int sum = 0;
		for (i = 1 ; i <= 100 ; i++) {
			sum += i;
		}
		System.out.println("for ������ �̿��� �� : " + sum);
		
		i = 1;
		sum = 0;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("while ������ �̿��� �� : " + sum);
		
		i = 1;
		sum = 0;
		do {
			sum += i;
			i++;
		} while (i <= 100);
		System.out.println("do while ������ �̿��� �� : " + sum);
		
		sum = 0;
		for(i = 0 ; i <= 100 ; i += 2) {
			sum += i;
		}
		System.out.println("for ������ �̿��� ¦���� �� : " + sum);
		
		i = 0;
		sum = 0;
		while (i <= 100) {
			sum += i;
			i += 2;
		}
		System.out.println("while ������ �̿��� ¦���� �� : " + sum);
		
		i = 0;
		sum = 0;
		do {
			sum += i;
			i += 2;
		} while (i <= 100);
		System.out.println("do while ������ �̿��� ¦���� �� : " + sum);
	}
}
