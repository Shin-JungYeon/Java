package chap18;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * InputStream �����͸� �б� ���� ���
 *   1. int read() : 1byte�� �о ����. -> �ѱ� ����.
 *   2. int read(byte[] buf) : buf�� ���̸�ŭ �����͸� �о �����ʹ� buf�� ����. ������ ���� ����Ʈ ���� ����.
 *   3. int read(byte[] buf, int start, int len) : buf�� ���� �ε���(start)���� len��ŭ �����͸� �о buf�� �����ؼ� ������ ���� ����Ʈ ���� ����.
 */
public class FileInputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/chap18/InputStreamEx1.java");  //������ ������ �о ������. �ѱ��� �� ������ ����. -> ȭ�鿡 ����� �� 1byte�� �ؼ�	//�����
//		int data = 0;
//		while((data = fis.read())!=-1) {
//			System.out.print((char)data);  //������ ���� �ϳ��� �о���� ������ println���� ���� ���� �ѱ��� ����ϰ� ���ٶ�� ��.
//		}
		int len = 0;
		byte[] buf = new byte[fis.available()];  //InputStream available() : �б� ���� ����Ʈ �� ����. ������ ���� �� �ִ�(���� �ִ�) ����Ʈ�� ��.
//		while((len=fis.read(buf)) != -1) {  //������ ���� ����Ʈ �� ����.
//			System.out.println(new String(buf, 0, len));  //��� ������ ���� buf�� ������ ����.  //������ �Ѳ����� �о���� ������ println���� �ᵵ ���� �и��ų� ���� ����.
//		}
		while((len=fis.read(buf, 0, buf.length)) != -1) {  //�ٷ� ���� while���� ���� ���.
			System.out.println(new String(buf, 0, len));
		}
	}
}