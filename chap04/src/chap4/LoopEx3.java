package chap4;
/*
 * ��ø �ݺ��� : �ݺ��� ���ο� �ݺ����� ����
 * ������ ����ϱ�
 */
public class LoopEx3 {
	public static void main(String[] args) {
		for (int i=2 ; i<=9 ; i++) {
			System.out.println("\n" + i + "��");
			for(int j=1 ; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
		
		System.out.print("\n");
		
		for (int i=2 ; i<=9 ; i++) {
			System.out.print(i + "��\t");
		}
		System.out.print("\n");
		for (int i=1 ; i<=9 ; i++) {
			for (int j=2 ; j<=9 ; j++) {
				System.out.print(j + "*" + i + "=" + (i*j) + "\t");
			}
			System.out.print("\n");
		}
		
	}
}
