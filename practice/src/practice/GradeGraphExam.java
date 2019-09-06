package practice;

import java.util.Scanner;

/*
����, ����, ����, ����, ȭ��, ��ȸ, ��ǻ�� ������  �Է¹��� ��, ����, ����� ���ϰ� �̵� ��ο� ���� ����׷����� �Ʒ� ���ǿ� �°� �׸� �� �ִ� ���α׷��� �ۼ��Ͻÿ�.

(1) ����, ����, ����, ����, ȭ��, ��ȸ, ��ǻ�� ������  ���� A, B, C, D, E, F, G �� ��ǥ�Ͽ�,  ������ �Է¹��� ��, �̿� ���� ����, ���, �ִ� ����, �ּ� ������ ���Ѵ�. 

(2) ����� ������ ����ؾ��ϸ�, �Ҽ����� ��� ������.

(3) ������ ���� �������� ��� �Ŀ��� �̵� ���� �������θ�� ����׷����� ǥ���Ѵ�. ���� ������, ���, �ִ�����, �ּ������� �׷����� �׷����� ����̸� ����׷����� 10 �� �� '*' �ϳ��� ��ǥ�ϸ�,
    10 �� ���������� �ڸ����ڴ� ������� �ʴ´�. 

(4) �׷����� �׸� ��, �� ���� �ش��ϴ� ���� ������ ����� ������ ���ڷ� ��ǥ�ϸ�, �ִ������� H, �ּ������� I, ����� J�� ��ǥ�Ѵ�.


�Է� ��

78 56 87 92 47 56 77

��¿�

TOT : 493
MAX : 92
MIN : 47
AVG : 70

100                             
 90           *           *      
 80        *  *           *      
 70  *     *  *        *  *     *
 60  *     *  *        *  *     *
 50  *  *  *  *     *  *  *     *
 40  *  *  *  *  *  *  *  *  *  *
 30  *  *  *  *  *  *  *  *  *  *
 20  *  *  *  *  *  *  *  *  *  *
 10  *  *  *  *  *  *  *  *  *  *
     A  B  C  D  E  F  G  H  I  J
 
 10 * 11 �迭
 10���� ��ǥ ���ĺ�
 1��~11��
 0��~ 10��

A:����, B:����, C:����, D:����, E:ȭ��,F:��ȸ, G:��ǻ��, H:�ִ�����, I:�ּ�����, J:���

*/
public class GradeGraphExam {
	public static void main(String[] args) {
		System.out.println("����, ����, ����, ����, ȭ��, ��ȸ, ��ǻ�� ������ ������� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int[] score = new int[10];
		int rate[] = {100, 90, 80, 70, 60, 50, 40 ,30, 20, 10};
		char rep[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		int tot=0, max=0, min=100, avg=0;
		
		for(int i=0; i<score.length-3; i++) {
			score[i] = scan.nextInt();
			System.out.print(score[i] + " ");
			tot += score[i];
			max = (max<score[i])?score[i]:max;
			min = (min>score[i])?score[i]:min;
		}
		avg = tot/score.length;
		int score1[] = {max, min, avg};
		for(int i=score.length-3; i<score.length; i++) {
			score[i] = score1[i-(score.length-3)];
		}
		System.out.println("\nTOT : " + tot + "\nMAX : " + max + "\nMIN : " + min + "\nAVG : " + avg);
		System.out.println();
		
		char[][] graph = new char[11][10];
	
		for(int j=0; j<graph[9].length; j++) {
			graph[9][j] = rep[j];
		}
		for(int i=0; i<score.length; i++) {
			for(int j=(10-score[i]/10); j<graph[i].length-1; j++) {
				graph[j][i] = '*';
			}
		}
		
		for(int i=0; i<graph.length; i++) {
			for(int j=0; j<graph[i].length; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	
//		for(int i=0; i<graph.length; i++) {
//			
//		}
//		
//		for(int i=0; i<score.length; i++) {
//			graph[i] = graph[score[i]/10];
//		}

		System.out.println("A:����, B:����, C:����, D:����, E:ȭ��,F:��ȸ, G:��ǻ��, H:�ִ�����, I:�ּ�����, J:���");
	}
}
