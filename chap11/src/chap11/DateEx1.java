package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date Ŭ���� ���� : ��¥�� ǥ���ϴ� Ŭ����
 * 
 * SimpleDateFormat : ����ȭ Ŭ����. Date ��ü <-> ����ȭ �� ���ڿ�
 *   format() : Date ������ ��ü�� ���� ������ format���� ����� �� �ִ� ���. Date ��ü -> ����ȭ �� ���ڿ�
 *   parse() : ����ȭ �� ���ڿ��� Date ��ü�� ������ �� �ִ� ���. ����ȭ �� ���ڿ� -> Date ��ü
 *   
 * yyyy : �⵵�� 4�ڸ��� ���
 * MM   : ���� 2�ڸ��� ���
 * dd   : ���� 2�ڸ��� ���
 * HH   : �ø� 2�ڸ��� ���
 * mm   : ���� 2�ڸ��� ���
 * ss   : �ʸ� 2�ڸ��� ���
 * E    : ���� ���
 * a    : ����/���� �����Ͽ� ���
 */
public class DateEx1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");  //Date�� ǥ���ϴ� ������ ��������.
		System.out.println(sf.format(now));  //sf ��ü�� ���� �� �������� �������� now�� ���.
		
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = "2019-03-09";  //���Ŀ� �°� ���ڿ��� �־���� ��.
		Date d = null;
		try {
			d = sf2.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(d);
		
		//2019�� 03�� 09���� ���� ����ϱ�
		SimpleDateFormat sf3 = new SimpleDateFormat("E");
		System.out.println(strDate + "�� " + sf3.format(d) + "���� �Դϴ�.");
//		SimpleDateFormat sf4 = new SimpleDateFormat("yyyy-MM-dd�� E���� �Դϴ�.");  //���Ŀ� ���� ���ϴ� ���� �־��൵ ��. ���� ������ �� ���ָ� �˴ϴ�.
//		System.out.println(s33.format(d));
		
	}
}
