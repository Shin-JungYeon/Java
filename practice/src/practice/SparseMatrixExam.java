package practice;

public class SparseMatrixExam {
	public static void main(String[] args) {
		//a ��� ����.
		int[][] arrA = new int[7][4];
		int cnt=0;
		for(int i=0; i<arrA.length; i++) {
			for(int j=0; j<arrA[i].length; j++) {
				arrA[i][j] = ((Math.random()>0.9)?((int)(Math.random()*9)+1):0);  //�����ϰ� 0�� �ƴ� ���� �־��ֱ�.
				if(arrA[i][j]!=0) cnt++;
			}
		}
		printarr(arrA, arrA.length, arrA[0].length);
		
		System.out.println("========");
		
		//b ��� ���ϱ�.
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
  
		//b ��� �̿��ؼ� �ٽ� a ��� ���ϱ�.
		int[][] arrAA = new int[arrB[0][0]][arrB[0][1]];
		for(int i=1; i<arrB.length; i++) {
			arrAA[arrB[i][0]][arrB[i][1]] = arrB[i][2];
		}
		printarr(arrAA, arrAA.length, arrAA[0].length);
	}
	
	static void printarr (int arr[][], int r, int c) {  //�迭 ��� �޼���.
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

