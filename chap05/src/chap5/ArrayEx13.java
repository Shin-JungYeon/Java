package chap5;
/*
 * ������ �迭 ����
 * 2���� �迭 : 1���� �迭�� ���� ������ �迭�̴�.
 */
public class ArrayEx13 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		arr[0][0] = 10;	arr[0][1] = 20;	arr[0][2] = 30;
		arr[1][0] = 40;	arr[1][1] = 50;	arr[1][2] = 60;
		for(int i=0; i<arr.length; i++) {  //arr.length = 2
			for(int j=0; j<arr[i].length; j++) {  //arr[i].length = 3
				System.out.println("arr[" + i + "][" + j + "]=" + arr[i][j]);
			}
		}
		
		System.out.println();
		System.out.println("arr[1] �迭�� �ٸ� ���� ����");
		int num[] = arr[0];
		num[1] = 200;
		arr[1] = new int[] {1, 2, 3, 4, 5};
		for(int i=0; i<arr.length; i++) {  //arr.length = 2
			for(int j=0; j<arr[i].length; j++) {  //arr[0].length = 3, arr[1].length = 5  �ݵ�� ���� ������ �ʿ�� ����.
				System.out.println("arr[" + i + "][" + j + "]=" + arr[i][j]);
			}
		}
		
		System.out.println();
		for(int n : num) {
			System.out.print(n + ",");
		}
		System.out.println();
		
	}
}
