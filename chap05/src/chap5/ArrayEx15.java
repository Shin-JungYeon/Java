package chap5;
/*
 * �л� 5���� ����, ����, ���� ������ �л� �� ����, ����� ����ϰ� ���� ������ ���
 * [���]
 *         ����     ����    ����    ����     ���
 * 1�� �л� : 100   80   90   270   90.0
 * ...
 * ===================================
 * ���� ���� : 450  370 ...
 */
public class ArrayEx15 {
	public static void main(String[] args) {
		int[][] score = {{100, 80, 90},
				         {80, 80, 70},
				         {80, 75, 90},
				         {90, 75, 95},
				         {100, 60, 75}};
		
		System.out.println("\t����\t����\t����\t����\t���");
		int[] stdt = new int[5]; 
		int[] stdy = new int[5];
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1) + "�� �л� : ");
			for(int j=0; j<score[i].length; j++) {
				stdt[i] += score[i][j];
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(stdt[i] + "\t" + (double)stdt[i]/score[i].length);
			System.out.println();
		}
		System.out.println("==========================================================");
		
		System.out.print("���� ���� : ");
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length; j++) {
//				stdy[i] += score[j][i];   ������ �����ϱ��
			}
			System.out.print(stdy[i] + "\t");
		}
		

		System.out.println("\n");
		int total[] = new int[3];
		System.out.println("\t����\t����\t����\t����\t���");
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1)+"���л� : ");
			int sum = 0;
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
				total[j] += score[i][j];
			}
			System.out.println(sum + "\t" + (double)sum/score[i].length);
		}
		System.out.print("�������� :\t");
		for(int t : total) {
			System.out.print(t + "\t");
		}
		System.out.println();
	
	}
}
