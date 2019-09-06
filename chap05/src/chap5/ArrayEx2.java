package chap5;

import java.util.Scanner;

/*
 * 화면에서 점수를 10 입력 받아서 score 배열에 저장하고, 점수의 합계와 평균, 최대 점수를 출력하기
 */
public class ArrayEx2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score = new int[10];
		int sum=0, max=0;
		
		System.out.println("점수를 10개 입력하세요.");
		
		for(int i=0 ; i<10 ; i++) {	
			score[i] = scan.nextInt();
			sum += score[i];
			if(max < score[i]) {
				max = score[i];
			}
		}
		System.out.println("점수의 합계 : " + sum + ", 점수의 평균 : " + (double)sum/score.length + ", 최대 점수 : " + max);
	    
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
//	    System.out.println("점수의 합계 : " + sum + ", 점수의 평균 : " + sum/score.length + ", 최대 점수 : " + max);
	    
	}
}