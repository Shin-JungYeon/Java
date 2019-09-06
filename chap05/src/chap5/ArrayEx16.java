package chap5;
/*
 * 2���� �迭�� ���� �հ� ���� �� ���ϱ�
 * int arr[][] = {{10, 20}, {30, 40}, {50, 60, 70}};
 * 
 * 0���� �� : 
 * 1���� �� : 
 * 2���� �� : 
 * 0���� �� : 
 * 1���� �� : 
 * 2���� �� : 
 */
public class ArrayEx16 {
	public static void main(String[] args) {
		int arr[][] = {{10, 20},
				       {30, 40},
				       {50, 60, 70, 80}};
		
//		int[] total = new int[3];  // ���� �� �÷��ָ� ���� �߻�.
//		for(int i=0; i<arr.length; i++) {
//			int sum = 0;
//			for(int j=0; j<arr[i].length; j++) {
//				sum += arr[i][j];
//				total[j] += arr[i][j];
//			}
//			System.out.println(i + "���� �� : " + sum);
//		}
//		for(int j=0; j<total.length; j++) {
//			System.out.println(j + "���� �� : " + total[j]);
//		}
		
		
		System.out.println();
		int maxcol = 0; //������ �ִ� ��迭 �� ���� �� �� ���� �����Ͽ� ���
		//a : arr ���������� 1�����迭�� ���������� �迭 -> int[] a ��� ����� ��.
		for(int[] a : arr) {
			if(maxcol < a.length) {
				maxcol = a.length;
			}
		}
		//�迭�� �� �� ������ �Ǹ� ���� ������ ������ �� ����.
		int tot[] = new int[maxcol]; //���� ���� ������ �迭
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
				tot[j] += arr[i][j];
			}
			System.out.println(i + "���� �� : " + sum);
		}
		for(int j=0; j<tot.length; j++) {
			System.out.println(j + "���� �� : " + tot[j]);
		}
		
	}
}