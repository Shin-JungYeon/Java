package chap5;

import java.util.Scanner;

/*
 * 1.
 * 
 * 삼각형의 높이 n과 종류 m을 입력받은 후 다음과 같은 삼각형 형태로 출력하는 프로그램을 작성하시오.
 * 단 2차원 배열을 사용하여 *를 입력하여 출력할것
 * 
 * 종류 1                  종류 2             종류 3
 *  *                    *****                *
 *  **                   ****                ***
 *  ***                  ***                *****
 *  ****                 **                *******
 *  *****                *                *********
 *  
 * 삼각형의 크기 n(n의 범위는 10 이하의 자연수)과 종류  m(m은 1부터 3사이의 자연수)을 입력받는다
 * 
 */
public class HW001 {
	public static void main(String[] args) {
		System.out.println("삼각형의 홀수 높이와 종류(1 2 3)를 입력하세요. ");
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt();
		int num = scan.nextInt();
		int[][] arr = new int[high][];
		
		switch(num) {
		    case 1 :
		    	for(int i=0; i<arr.length; i++) {
		    		arr[i]= new int[i+1];
		    	}
		    	for(int i=0; i<arr.length; i++) {
		    		for(int j=1; j<=arr[i].length; j++) {
		    			System.out.print('*');
		    		}
		    		System.out.println();
		    	}
		    	break;
		    case 2 : 
		    	for(int i=0; i<arr.length; i++) {
		    		arr[i]= new int[arr.length-i];
		    	}
		    	for(int i=0; i<arr.length; i++) {
		    		for(int j=1; j<=arr[i].length; j++) {
		    			System.out.print('*');
		    		}
		    		System.out.println();
		    	}
		    	break;
		    case 3 : 
		    	for(int i=0; i<arr.length; i++) {
		    		arr[i]= new int[arr.length];
		    	}
		    	for(int i=1; i<=arr.length; i++) {
					for(int j=1; j<=arr.length*2-1; j++) {
						if((arr.length-i+1==j)) {
							for(int k=1; k<=(i*2-1); k++) {
								System.out.print("*");
							}
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
		    	}
		    	break;
		    default :
		    	System.out.println("종류를 다시 입력하세요.");
		}
		
		
	}
}
