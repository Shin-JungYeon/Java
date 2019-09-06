package chap18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * Scanner ����
 *   File ���� �м��ϱ�
 */
public class ScannerEx2 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("score.txt"));
		/*
		 * ȫ�浿,4.5,3.8,4.2
		 * ���,3.5,2.8,3.2
		 * �̸���,4.0,3.0,4.1
		 * �Ӳ���,3.0,3.3,3.1
		 * ������,3.1,3.5,3.8
		 */
		int cnt = 0;
		int totalSum = 0;
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			Scanner scan2 = new Scanner(line).useDelimiter(",");
			double sum = 0;
			int i = 0;
			String name = scan2.next();  //�� ���� , �� �������� �з���Ų �� ���� ���� ��(�̸�) ������.
			System.out.print(name + ":");
			while(scan2.hasNextDouble()) {  //�̸��� �̹� �о����Ƿ� �� ���� ������ double�� ����?
				double score = scan2.nextDouble();  //double�� �о��.
				sum += score;
				System.out.print(score + ",");
				i++;
			}
			System.out.printf(" sum=%.2f, avg=%.2f%n", sum, sum/i );
			totalSum += sum;
			cnt++;
		}
		System.out.println("�� �ο��� : " + cnt);
	}
}
