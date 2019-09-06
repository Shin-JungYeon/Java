package chap12;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 4. 년도와 월을 입력받아서 달력을 출력하기. 년도가 9999이면 종료하도록 구현하기.
 *    단 2차원 배열을 사용할 것.
 *    
 *    일(1)				토(7)
 *    0  0  0  0  0  0  0   <- 1번째 주
 *    0  0  0  0  0  0  0
 *    0  0  0  0  0  0  0
 *    0  0  0  0  0  0  0
 *    0  0  0  0  0  0  0
 *    0  0  0  0  0  0  0
 *    0  0  0  0  0  0  0   <- 7번째 주
 *    
 *    첫째주 화요일 -> 1행 3열
 */
public class HW4 {
	public static void main(String[] args) {
		int[][] calendar = new int[7][7];
		Scanner scan = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		while (true) {
			System.out.println("년도를 입력하세요.(종료를 원할 시 9999를 입력하세요.)");
			int year = scan.nextInt();
			if(year==9999) break;
			System.out.println("월을 입력하세요.");
			int month = scan.nextInt();
			if(month<1 || month>12) {
				System.out.println("유효하지 않는 월입니다. 다시 입력하세요.");
				continue;
			}
			
			cal.set(year, month-1, 1);
			int firstWeek = cal.get(Calendar.DAY_OF_WEEK);
			int lastDay = cal.getActualMaximum(Calendar.DATE);
			int day = 1;
			
			String[] week = {"일","월","화","수","목","금","토"};
			
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
