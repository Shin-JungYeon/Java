package chap5;
/*
 * 가변 배열 : 다차원 배열은 미리 배열의 갯수를 지정하지 않아도 됨. 단 첫번째 배열의 크기는 반드시 지정해야 한다.
 *   n차원 배열은 n-1의 배열의 참조변수의 크기는 반드시 지정해야 함.
 */
public class ArrayEx20 {
	public static void main(String[] args) {
		int[][] arr = new int[3][];  //가변 배열
		arr[0] = new int[] {1};
		arr[1] = new int[] {2, 3};
		arr[2] = new int[] {4, 5, 6};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
}
