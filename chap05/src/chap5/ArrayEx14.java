package chap5;
/*
 * 2���� �迭�� ����, ����, �ʱ�͸� �� �ٿ� �ϱ�
 */
public class ArrayEx14 {
	public static void main(String[] args) {
		int arr[][] = { {10, 20, 30}, {40, 50, 60, 70, 80} };
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "]=" + arr[i][j]);
			}
		}
		
	}
}