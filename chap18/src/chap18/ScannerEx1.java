package chap18;

import java.util.Scanner;

/*
 * Scanner ����
 *   String �� �Է¹޾� ����ϱ�.
 */
public class ScannerEx1 {
	public static void main(String[] args) {
		String str = "Java and   Jsp and  Spring and HTML and JanaScript";
		Scanner scan = new Scanner(str);
		scan.useDelimiter("\\s*and\\s*");  // \\s* : ����(\\s) 0�� �̻�(*) ���Խ�. 1�� �̻�(+), 0 �Ǵ� 1(?)
										   //useDelimiter(���Խ�) : ���Խ��� �������� �з�.(���Խ��� �������� ����.)
		while(scan.hasNext()) {
			System.out.println(scan.next());
		}
		
	}
}
