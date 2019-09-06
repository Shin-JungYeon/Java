package chap18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Exam2.java�� FileReader, FileWriterŬ������ �̿��Ͽ� �����ϱ�.
 */
public class Exam3 {
	public static void main(String[] args) throws IOException {
		System.out.println("�������� �̸��� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		String filename = scan.nextLine();
		String rename = filename.substring(0, filename.lastIndexOf("."))+".bak";  //lastIndexOf(".") ���� �ڿ������� ã�ƾ� ��Ȯ.
		
		FileReader fr = new FileReader(filename);  //���� ��α��� �� ���� �ʿ� ����.
		int len;
		char[] buf = new char[1024];  //Reader, Writer �� 2byte(1char)�����̹Ƿ� char�� �迭 �ʿ�.
		len=fr.read(buf);
		
		FileWriter fw = new FileWriter(rename);  //Output
		fw.write(buf, 0, len);
		fw.flush();
		fw.close();
	}
}
