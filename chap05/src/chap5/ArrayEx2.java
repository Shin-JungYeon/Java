package chap5;

import java.util.Scanner;

/*
 * ȭ�鿡�� ������ 10 �Է� �޾Ƽ� score �迭�� �����ϰ�, ������ �հ�� ���, �ִ� ������ ����ϱ�
 */
public class ArrayEx2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score = new int[10];
		int sum=0, max=0;
		
		System.out.println("������ 10�� �Է��ϼ���.");
		
		for(int i=0 ; i<10 ; i++) {	
			score[i] = scan.nextInt();
			sum += score[i];
			if(max < score[i]) {
				max = score[i];
			}
		}
		System.out.println("������ �հ� : " + sum + ", ������ ��� : " + (double)sum/score.length + ", �ִ� ���� : " + max);
	    
//	    int i=1;
//	    max = 0;
//	    while(true) {
//	    	if(score[i-1]>=score[i]) {
//	    		max = score[i];
//	    	} else {
//	    		max = score[i-1];
//	    	}
//	    	i++;
//	    	if(i==score.length) break;
//	    }
//	    System.out.println("������ �հ� : " + sum + ", ������ ��� : " + sum/score.length + ", �ִ� ���� : " + max);
	    
	}
}