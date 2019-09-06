package chap18;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
 * File Ŭ������ �ֿ� �޼��� ����
 */
public class FileEx2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:/temp1");
		System.out.printf("%s ���� ���� : %b\n", f1.getAbsolutePath(), f1.mkdir());
		//getAbsolutePath() : ������ ���� ���.
		//mkdir() : ���� ����. ����:true, ����:false(�̹� �ִ� ���)
		File f2 = new File("c:/temp1/test.txt");
		System.out.printf("%s ���� ���� : %b\n", f2.getAbsolutePath(), f2.createNewFile());
		//createNewFile() : ���ϻ���. ����:true, ����:false(�̹� �ִ� ���)
		System.out.printf("���� �̸� : %s, ���� ũ�� : %,d byte\n", f2.getName(), f2.length());
		//getName() : ���� �̸� ����.
		//length() : ������ ũ�� ����, 0 byte -> ������ �Է��� �� ����.
		
		//���� �̸� ����
		File f3 = new File("c:/temp1/test2.txt");
		System.out.printf("%s -> %s �̸� ���� : %b\n",f2.getName(), f3.getName(), f2.renameTo(f3));
		//f2.renameTo(f3) : f2����(test.txt)�� f3����(test2.txt)�� �̸� ����
		System.out.printf("%s ���� ���� ���� �Ͻ� : %s\n", f3.getName(), new Date(f3.lastModified()));
		//lastModified() : ����Ÿ�� long -> 1970�� ���ĺ��� ���� ���� ���������� �ð��� �и��ʷ� ����.
		System.out.printf("%s ���� ���� : %b\n", f3.getName(), f3.delete());
		//delete() : ���� ����.
	}
}
