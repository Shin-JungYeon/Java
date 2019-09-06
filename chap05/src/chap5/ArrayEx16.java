package chap5;
/*
 * 2차원 배열의 행의 합과 열의 합 구하기
 * int arr[][] = {{10, 20}, {30, 40}, {50, 60, 70}};
 * 
 * 0행의 합 : 
 * 1행의 합 : 
 * 2행의 합 : 
 * 0열의 합 : 
 * 1열의 합 : 
 * 2열의 합 : 
 */
public class ArrayEx16 {
	public static void main(String[] args) {
		int arr[][] = {{10, 20},
				       {30, 40},
				       {50, 60, 70, 80}};
		
//		int[] total = new int[3];  // 열을 더 늘려주면 오류 발생.
//		for(int i=0; i<arr.length; i++) {
//			int sum = 0;
//			for(int j=0; j<arr[i].length; j++) {
//				sum += arr[i][j];
//				total[j] += arr[i][j];
//			}
//			System.out.println(i + "행의 합 : " + sum);
//		}
//		for(int j=0; j<total.length; j++) {
//			System.out.println(j + "열의 합 : " + total[j]);
//		}
		
		
		System.out.println();
		int maxcol = 0; //가지고 있는 행배열 중 가장 긴 열 값을 저장하여 사용
		//a : arr 참조변수는 1차원배열의 참조변수의 배열 -> int[] a 라고 해줘야 함.
		for(int[] a : arr) {
			if(maxcol < a.length) {
				maxcol = a.length;
			}
		}
		//배열은 한 번 생성이 되면 방의 개수를 변경할 수 없다.
		int tot[] = new int[maxcol]; //열의 합을 저장할 배열
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
				tot[j] += arr[i][j];
			}
			System.out.println(i + "행의 합 : " + sum);
		}
		for(int j=0; j<tot.length; j++) {
			System.out.println(j + "열의 합 : " + tot[j]);
		}
		
	}
}