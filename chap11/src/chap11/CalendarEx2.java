package chap11;

import java.util.Calendar;
import java.util.TimeZone;

/*
 * Calendar ��ü�� �̿��Ͽ� ��¥ �����ϱ�.
 */
public class CalendarEx2 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		today.set(2019, (3-1), 10);  //���� ������ �� -1 ����� ��.
		String week = null;
		switch(today.get(Calendar.DAY_OF_WEEK)) {
		case 1 : week = "��"; break;
		case 2 : week = "��"; break;
		case 3 : week = "ȭ"; break;
		case 4 : week = "��"; break;
		case 5 : week = "��"; break;
		case 6 : week = "��"; break;
		case 7 : week = "��"; break;
		}
		System.out.printf("��¥ : %d�� %02d�� %02d�� %s����\n", today.get(Calendar.YEAR),
				          today.get(Calendar.MONTH)+1, today.get(Calendar.DATE), week);  //%02d 2�ڸ��� ����ϴµ� ���ڸ��� 0���� ä��.
		
		System.out.println("���� : Timezone(-12~12) : " + today.get(Calendar.ZONE_OFFSET)/(60*60*1000));  //�׸���ġ õ���븦 �������� �������� �ð� ����
		//today.get(Calendar.ZONE_OFFSET) : �и��ʷ� ����
		TimeZone timezon = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar lacal = Calendar.getInstance(timezon);
		System.out.println("LA : Timezone(-12~12) : " + lacal.get(Calendar.ZONE_OFFSET)/(60*60*1000));
	}
}
