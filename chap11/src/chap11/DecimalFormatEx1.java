package chap11;

import java.text.DecimalFormat;
import java.text.ParseException;

/*
 * DecimalFormat Ŭ���� ���� : ���ڸ� ����ȭ �Ͽ� ����ϱ�
 * 
 * parse() : ���ڿ��� ���ڰ����� ����.
 * format() : ���ڰ��� ����ȭ �� ���ڿ��� ����.
 */
public class DecimalFormatEx1 {
	public static void main(String[] args) {
		DecimalFormat df1 = new DecimalFormat("#,###.##");  //���ڸ� 3�ڸ����� , ����ϰ� �Ҽ��� ���� 2�ڸ��� ǥ��. # : ���� �� �ڸ�
		DecimalFormat df2 = new DecimalFormat("#.###E0");  //E0 : ���� ?�� 
		try {
			Number num = df1.parse("1,234,567.89");  //Number Ŭ���� : ���ڸ� ǥ���� �ִ� ���� �ֻ��� Ŭ����
			double d = num.doubleValue();
			System.out.print(d + " -> ");
			System.out.println(df2.format(num));			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.println(df1.format(12345.67));
		System.out.printf("%,.2f\n", 12345.67);
		System.out.println();
		
		//str + 123 �� ����� ���ڸ����� , �־� ����ϱ�.
		String str = "123,456";
		DecimalFormat df3 = new DecimalFormat("#,###");
		try {
			Number num;
			num = df3.parse(str);
			int i = num.intValue() + 123;  //intValue() : int������ ����.
			System.out.println(df3.format(i));
			System.out.printf("%,d\n", i);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
