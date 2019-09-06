package chap18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/*
 * ���ϸ��� �Է¹޾Ƽ� �ش� ������ �����ϸ� �Էµ� ���ϸ��� Ȯ���ڸ� .bak ������ ������Ϸ� �Ͽ� �Էµ� ������ ������ .bak ���Ͽ� �����ϱ�
 * 
 * [���]
 * 
 * �������� �̸��� �Է��ϼ���.
 * aaa.txt
 * 
 * aaa.bak ������ ����
 * 
 * aaa.bak ������ ���� : 
 * �ȳ��ϼ���
 * �ݰ����ϴ�
 */
public class Exam2 {
	public static void main(String[] args) throws IOException {
		System.out.println("�������� �̸��� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		String filename = scan.nextLine();
		String rename = filename.substring(0, filename.lastIndexOf("."))+".bak";  //lastIndexOf(".") ���� �ڿ������� ã�ƾ� ��Ȯ.
		int len;	
		FileInputStream fis = new FileInputStream(filename);
		FileOutputStream fos = new FileOutputStream(rename);
		byte buf[] = new byte[fis.available()];
		while((len=fis.read(buf))!=-1) {  //len ������ �о�� ������ ũ�⸦ �״��(or �� ũ��) �����Դٸ� while�� �ʿ� ����.
			fos.write(buf, 0, len);
		}
		fos.flush();
		fis.close();
	
	}
}
