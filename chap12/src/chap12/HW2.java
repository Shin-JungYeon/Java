package chap12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * 2. CalendarŬ������ SimpleDateFormatŬ������ �̿��ؼ� 2019���� �ſ� �ι�° �Ͽ����� ��¥�� ����Ͻÿ�.
 * Calendar.DAY_OF_WEEK_IN_MONTH  : �ش������ ���°
 * Calendar.DAY_OF_WEEK   : ���� 1:�Ͽ���
 * Date cal.getTime()
 */
public class HW2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//		Date sunday = new Date();
		
		System.out.println("�⵵�� �Է��ϼ���.");
		int year = scan.nextInt();
		
		Calendar cal = Calendar.getInstance();  //���糯¥
		
		System.out.println(year + "���� �ſ� �� ��° �Ͽ����� ");
		for(int i=0; i<12; i++) {
			cal.set(year, i, 1);  //lastday ���ϱ� ���� ��¥ �缳��.
			int lastday = cal.getActualMaximum(Calendar.DATE);
			for(int j=1; j<=lastday; j++) {
				cal.set(year, i, j);
				if((cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)==2)&&(cal.get(Calendar.DAY_OF_WEEK)==1)) {
//					Date day = cal.getTime();
//					System.out.println(sf.format(day) + "�� �ι�° �Ͽ��� �Դϴ�.");
					System.out.printf("%02d�� %02d��\n", (cal.get(Calendar.MONTH)+1), cal.get(Calendar.DATE));
				}
			}
		}
		
	}
}
