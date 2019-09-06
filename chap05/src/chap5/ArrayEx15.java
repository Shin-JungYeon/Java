package chap5;
/*
 * 학생 5명의 국어, 영어, 수학 점수를 학생 별 총점, 평균을 출력하고 과목별 총점을 출력
 * [결과]
 *         국어     영어    수학    총점     평균
 * 1번 학생 : 100   80   90   270   90.0
 * ...
 * ===================================
 * 과목 총점 : 450  370 ...
 */
public class ArrayEx15 {
	public static void main(String[] args) {
		int[][] score = {{100, 80, 90},
				         {80, 80, 70},
				         {80, 75, 90},
				         {90, 75, 95},
				         {100, 60, 75}};
		
		System.out.println("\t국어\t영어\t수학\t총점\t평균");
		int[] stdt = new int[5]; 
		int[] stdy = new int[5];
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1) + "번 학생 : ");
			for(int j=0; j<score[i].length; j++) {
				stdt[i] += score[i][j];
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(stdt[i] + "\t" + (double)stdt[i]/score[i].length);
			System.out.println();
		}
		System.out.println("==========================================================");
		
		System.out.print("과목 총점 : ");
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length; j++) {
//				stdy[i] += score[j][i];   무엇이 문제일까용
			}
			System.out.print(stdy[i] + "\t");
		}
		

		System.out.println("\n");
		int total[] = new int[3];
		System.out.println("\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1)+"번학생 : ");
			int sum = 0;
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
				total[j] += score[i][j];
			}
			System.out.println(sum + "\t" + (double)sum/score[i].length);
		}
		System.out.print("과목총점 :\t");
		for(int t : total) {
			System.out.print(t + "\t");
		}
		System.out.println();
	
	}
}
