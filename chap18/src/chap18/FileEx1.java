package chap18;

import java.io.File;

/*
 * File Ŭ���� ����
 *   1. ���� �� ������ ������ �����ϴ� Ŭ����. -> ���� ������ ������ �����ϰų� ����, ������ �� ����.(���� ��ü ����, ����, ������ ����) -> ����� ��Ʈ���� ����ؾ� ��.
 *   2. �������� �ʾƵ� ������ ������.
 */
public class FileEx1 {
	public static void main(String[] args) {
		String filePath = "C:\\";
		File f1 = new File(filePath);  // c:/ �� �ִ� ���� ����
		String files[] = f1.list();  // c:/ ���� ����, ���� �̸� ��� ����. ������ ���� �� ���� ��� ����.
		for(String f : files) {
			File f2 = new File(filePath, f);  //���� File ��ü�� ���Ե� ��������, ���� ����(����)��
			if(f2.isDirectory()) {  //f2�� ���丮(����)?
				System.out.printf("%s : ���丮\n", f);  //f : ������
			} else if(f2.isFile()) {  //f2�� ����?
				System.out.printf("%s : ����(%,d ����Ʈ)\n", f, f2.length());  //%,d : ������ ���ڸ����� ,
			}
		}
		
	}
}
