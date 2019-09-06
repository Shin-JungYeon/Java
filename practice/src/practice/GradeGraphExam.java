package practice;

import java.util.Scanner;

/*
국어, 영어, 수학, 물리, 화학, 사회, 컴퓨터 점수를  입력받은 후, 총점, 평균을 구하고 이들 모두에 대한 막대그래프를 아래 조건에 맞게 그릴 수 있는 프로그램을 작성하시오.

(1) 국어, 영어, 수학, 물리, 화학, 사회, 컴퓨터 점수를  각각 A, B, C, D, E, F, G 로 대표하여,  점수를 입력받은 후, 이에 대한 총점, 평균, 최대 점수, 최소 점수를 구한다. 

(2) 평균은 정수로 출력해야하며, 소수점은 모두 버린다.

(3) 위에서 구한 점수들을 출력 후에는 이들 값을 기준으로모두 막대그래프로 표현한다. 과목별 점수와, 평균, 최대점수, 최소점수가 그래프를 그려야할 대상이며 막대그래프는 10 점 당 '*' 하나로 대표하며,
    10 의 단위이하의 자리숫자는 고려하지 않는다. 

(4) 그래프를 그릴 때, 각 과목에 해당하는 값은 위에서 언급한 영문자 한자로 대표하며, 최대점수는 H, 최소점수는 I, 평균은 J로 대표한다.


입력 예

78 56 87 92 47 56 77

출력예

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
 
 10 * 11 배열
 10행은 대표 알파벳
 1열~11열
 0행~ 10열

A:국어, B:영어, C:수학, D:물리, E:화학,F:사회, G:컴퓨터, H:최대점수, I:최소점수, J:평균

*/
public class GradeGraphExam {
	public static void main(String[] args) {
		System.out.println("국어, 영어, 수학, 물리, 화학, 사회, 컴퓨터 점수를 순서대로 입력하세요.");
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

		System.out.println("A:국어, B:영어, C:수학, D:물리, E:화학,F:사회, G:컴퓨터, H:최대점수, I:최소점수, J:평균");
	}
}
