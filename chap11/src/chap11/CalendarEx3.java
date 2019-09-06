package chap11;

import java.util.Calendar;
import java.util.Scanner;

/*
 * �⵵ ���� �Է��ϸ� �ش� ���� �޷� ����ϱ�.
 */
public class CalendarEx3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���.");
		int year = scan.nextInt();
		System.out.println("���� �Է��ϼ���.");
		int month = scan.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, (month-1), 1);  //�Է��� ���� 1�� ����.
		int firstWeek = cal.get(Calendar.DAY_OF_WEEK);  //1���� ���� ��(1~7)
		int lastDay = cal.getActualMaximum(Calendar.DATE);  //�Է��� ���� ������ ��
		int day = 1;
		
		System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "��", "��", "ȭ", "��", "��", "��", "��");
		
		for(int i=1; day<=lastDay; i++) {
		//i<=lastDay �� ������ �����ϸ� ������������ ������ ����.
			if(i < firstWeek) {
				System.out.printf("%3s", " ");
			} else {
				System.out.printf("%3d", day);
				day++;
			}
			if(i%7==0) {
				System.out.println();
			}
		}
		
//		for(int i=1, day1=1; day<=lastDay; i++) {  //for�� ���ǹ����� �������� ���� ������ ����
//			if(i < firstWeek) {
//				System.out.printf("%3s", " ");
//			} else {
//				System.out.printf("%3d", day1++);
//			}
//			if(i%7==0) {
//				System.out.println();
//			}
//		}

	}
}
