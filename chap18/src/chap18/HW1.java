package chap18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 1. ���ϸ��� �Է¹޾Ƽ� �ش� �����ϸ�  �Էµ� ���ϸ��� Ȯ���ڸ� .line ������ ������Ϸ� �Էµ� ������ ������ .line ���Ͽ� �����ϱ�. �� �����Ҷ� ���μ��� �߰��ϱ�.
 * 
 * [���]
 * 
 * ���������̸��� �Է��ϼ���
 * aaa.txt
 * aaa.line ������ ����.
 * aaa.line ������ ����
 * 1:�ȳ��ϼ���
 * 2:�ݰ����ϴ�.
 * 
 */
public class HW1 {
	public static void main(String[] args) throws IOException {
		System.out.println("���� ���� �̸��� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		String originfile = scan.nextLine();
		String newfile = originfile.substring(0, originfile.lastIndexOf(".")) + ".line";
		
		FileInputStream fr = new FileInputStream(originfile);
		FileOutputStream fw = new FileOutputStream(newfile);
		BufferedReader br = new BufferedReader(new InputStreamReader(fr));
		
		String content = null;
		int i=0;
		while((content = br.readLine()) != null) {
			fw.write(((++i) + ":" + content + "\n").getBytes());  //���پ� �޾ƿ��� ������ ���� �߰��� ���پ� ��.
		}
		fw.flush();
		fw.close();
	}
}
