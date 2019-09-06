package chap12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

/*
 * 3. ȭ�����κ��� ��¥�� "2019/05/11"�� ���·� �Է¹޾Ƽ� ������������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *    �� �Էµ� ��¥�� ������ �߸��� ��� �޼����� �����ְ� �ٽ� �Է¹޾ƾ� �Ѵ�.
 */
public class HW3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("������ ���Ŀ� ���� ��¥�� �Է��ϼ���.(yyyy/MM/dd)");
//		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
//	
//		Date d = null;
//		Calendar day = Calendar.getInstance();
//		String week = null;
//		
//		do {
//			String strdate = scan.next();
//			
//			String[] sub = strdate.split("/");
//			int yy = Integer.parseInt(sub[0]);
//			int mm = Integer.parseInt(sub[1]);
//			int dd = Integer.parseInt(sub[2]);
//			
//			try {
//				d = sf.parse(strdate);  //���ڿ��� Date Ÿ������ ����.
//				day.set(yy, (mm-1), dd);
//				switch(day.get(Calendar.DAY_OF_WEEK)) {
//				case 1 : week = "��"; break;
//				case 2 : week = "��"; break;
//				case 3 : week = "ȭ"; break;
//				case 4 : week = "��"; break;
//				case 5 : week = "��"; break;
//				case 6 : week = "��"; break;
//				case 7 : week = "��"; break;
//				}
//				System.out.println(strdate + "�� " + week + "���� �Դϴ�.");
//				break;
//			} catch (ParseException e) {
//				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է��� �ּ���.(yyyy/MM/dd)");
//				continue;
//			}
//		} while(true);
		
		SimpleDateFormat sfin = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sfout = new SimpleDateFormat("E����");
		while(true) {
			System.out.println("���� ���Ŀ� ���� ��¥�� �Է����ּ���.(yyyy/MM/dd)");
			String input = scan.next();
			try {
				Date day = sfin.parse(input);  //parse() : ���Ŀ� �´� ���ڿ� -> DateŸ��, ����ó�� �ʼ�(RuntimeException�� ���� ��ü �ƴ�.)
				System.out.println(sfout.format(day));  //format() : ������ �������� ������ ���ڿ� ����. (Date -> ���ڿ�)
				System.out.println("��� �Է��Ͻðڽ��ϱ�?(Y/N)");
				input = scan.next();
//				if(input.toUpperCase().equals("Y")) continue;
				if(input.equalsIgnoreCase("Y")) continue;  //��ҹ��� ��� ����.
				else break;
			}catch(ParseException e) {
				continue;
			}
		}
		
	}
}
