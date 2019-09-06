package chap18;

import java.io.FileReader;
import java.io.IOException;
/*
 * Reader �����͸� �б� ���� ���
 *   1. int read() : 1char�� �����͸� �о ����. -> �ѱ� ������ ����.
 *   2. int read(char[] buf) : buf�� ���̸�ŭ �����͸� �о �����ʹ� buf�� ����. ���� ���ڼ��� ����. -> ���� ���� ����.
 *   3. int read(char[] buf, int start, int len) : buf�� ���� �ε���(start)���� len��ŭ �����͸� �о buf�� �����ؼ� ������ ���� ���ڼ��� ����.
 */
public class FileReaderEx1 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src/chap18/ReaderEx1.java");
		int data;
//		while((data=fr.read()) != -1) {
//			System.out.print((char)data);  //������ ���� �ϳ��� �о���� ������ println���� ���� ���� �ѱ��� ����ϰ� ���ٶ�� ��.
//		}
		int len;
		char[] buf = new char[1024];  //���� ũ�Ⱑ 1024���� ũ�� �˾Ƽ� ������ �о��.
//		while((len=fr.read(buf)) != -1) {
//			System.out.print(new String(buf, 0, len));  //������ �Ѳ����� �о���� ������ println���� �ᵵ ���� �и��ų� ���� ����.
//		}
		while((len=fr.read(buf, 0, buf.length)) != -1) {
			System.out.println(new String(buf, 0, len));
		}
	}
}
