package chap18;

import java.io.File;

/*
 * 2. C:/Windows ������ ������ ����ϱ�
 * 
 * [���]
 * ���� ���� ���� : 89
 * ���� ���� ���� : 45
 * ���� ������ �� ũ�� : 15,638,717 byte
 */
public class HW2 {
	public static void main(String[] args) {
		String filePath = "C:/Windows/";  // or "C:\\Windows\\";
		File file = new File(filePath);  //Windows ��� ������ ����Ŵ.
		String[] files = file.list();  //���� ����, ���� ������ ����(�̸�)�� �迭�� �Ѱ���.
		int direcnum = 0, filenum = 0, filesum = 0;
		for(String f : files) {
			File file2 = new File(filePath, f);  //f�� ���� �̸� ����. filepath �ȿ� �ִ� f��� �̸��� ���� ���ϰ�ü�� ������.
			if(file2.isDirectory()) {
				direcnum++;
			} else if(file2.isFile()) {
				filenum++;
				filesum += file2.length();
			}
		}
		System.out.println("���� ���� ���� : " + direcnum);
		System.out.println("���� ���� ���� : " + filenum);
		System.out.printf("���� ������ �� ũ�� : %,d byte", filesum);
//		System.out.println("���� ������ �� ũ�� : " + String.format("%,d", filesum) + "byte");
	}
}