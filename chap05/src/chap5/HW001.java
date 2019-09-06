package chap5;

import java.util.Scanner;

/*
 * 1.
 * 
 * �ﰢ���� ���� n�� ���� m�� �Է¹��� �� ������ ���� �ﰢ�� ���·� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �� 2���� �迭�� ����Ͽ� *�� �Է��Ͽ� ����Ұ�
 * 
 * ���� 1                  ���� 2             ���� 3
 *  *                    *****                *
 *  **                   ****                ***
 *  ***                  ***                *****
 *  ****                 **                *******
 *  *****                *                *********
 *  
 * �ﰢ���� ũ�� n(n�� ������ 10 ������ �ڿ���)�� ����  m(m�� 1���� 3������ �ڿ���)�� �Է¹޴´�
 * 
 */
public class HW001 {
	public static void main(String[] args) {
		System.out.println("�ﰢ���� Ȧ�� ���̿� ����(1 2 3)�� �Է��ϼ���. ");
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
		    	System.out.println("������ �ٽ� �Է��ϼ���.");
		}
		
		
	}
}
