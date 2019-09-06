package chap12;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 4. �⵵�� ���� �Է¹޾Ƽ� �޷��� ����ϱ�. �⵵�� 9999�̸� �����ϵ��� �����ϱ�.
 *    �� 2���� �迭�� ����� ��.
 *    
 *    ��(1)				��(7)
 *    0  0  0  0  0  0  0   <- 1��° ��
 *    0  0  0  0  0  0  0
 *    0  0  0  0  0  0  0
 *    0  0  0  0  0  0  0
 *    0  0  0  0  0  0  0
 *    0  0  0  0  0  0  0
 *    0  0  0  0  0  0  0   <- 7��° ��
 *    
 *    ù°�� ȭ���� -> 1�� 3��
 */
public class HW4 {
	public static void main(String[] args) {
		int[][] calendar = new int[7][7];
		Scanner scan = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		while (true) {
			System.out.println("�⵵�� �Է��ϼ���.(���Ḧ ���� �� 9999�� �Է��ϼ���.)");
			int year = scan.nextInt();
			if(year==9999) break;
			System.out.println("���� �Է��ϼ���.");
			int month = scan.nextInt();
			if(month<1 || month>12) {
				System.out.println("��ȿ���� �ʴ� ���Դϴ�. �ٽ� �Է��ϼ���.");
				continue;
			}
			
			cal.set(year, month-1, 1);
			int firstWeek = cal.get(Calendar.DAY_OF_WEEK);
			int lastDay = cal.getActualMaximum(Calendar.DATE);
			int day = 1;
			
			String[] week = {"��","��","ȭ","��","��","��","��"};
			
			for(int i=0; i<calendar.length; i++) {
				for(int j=0; j<calendar[i].length; j++) {
					
					if(i==0) {
						System.out.printf("%2s", week[j]);
					} else if (i==1 && j<firstWeek-1) {
						calendar[i][j] = 0;
					} else if (day<=lastDay) {
						calendar[i][j] = day++;
					}
					
					if (calendar[i][j]==0) {
						System.out.print("   ");
					} else {
						System.out.printf("%3d", calendar[i][j]);
					}
				}
				System.out.println();
			}
		}
		
	}
}
