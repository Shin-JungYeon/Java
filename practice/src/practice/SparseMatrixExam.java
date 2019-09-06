package practice;

public class SparseMatrixExam {
	public static void main(String[] args) {
		//a 행렬 설정.
		int[][] arrA = new int[7][4];
		int cnt=0;
		for(int i=0; i<arrA.length; i++) {
			for(int j=0; j<arrA[i].length; j++) {
				arrA[i][j] = ((Math.random()>0.9)?((int)(Math.random()*9)+1):0);  //랜덤하게 0이 아닌 숫자 넣어주기.
				if(arrA[i][j]!=0) cnt++;
			}
		}
		printarr(arrA, arrA.length, arrA[0].length);
		
		System.out.println("========");
		
		//b 행렬 구하기.
		int[][] arrB = new int[cnt+1][3];
		arrB[0][0] = arrA.length;
		arrB[0][1] = arrA[0].length;
		arrB[0][2] = cnt;
		int br=1, bc=0;
		for(int i=0; i<arrA.length; i++) {
//			bc = 0;
			for(int j=0; j<arrA[i].length; j++) {
				if(arrA[i][j]!=0) {
					arrB[br][0]=i;
					arrB[br][1]=j;
					arrB[br][2]=arrA[i][j];
					br++;
				}
			}
		}
		printarr(arrB, arrB.length, arrB[0].length);
		
		System.out.println("========");
  
		//b 행렬 이용해서 다시 a 행렬 구하기.
		int[][] arrAA = new int[arrB[0][0]][arrB[0][1]];
		for(int i=1; i<arrB.length; i++) {
			arrAA[arrB[i][0]][arrB[i][1]] = arrB[i][2];
		}
		printarr(arrAA, arrAA.length, arrAA[0].length);
	}
	
	static void printarr (int arr[][], int r, int c) {  //배열 출력 메서드.
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

