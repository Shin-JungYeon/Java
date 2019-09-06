package chap18;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("out.txt");  //FileNotFoundException ����ó�� �ʿ� -> ������, ���߻����ȯ�� ����� ����ڱ����� ������ ���� �� ����.
		fos.write('1'); fos.write('2'); fos.write('3');
		fos.write('A'); fos.write('B'); fos.write('C');
		fos.write('��'); fos.write('��'); fos.write('��');  //�ѱ� ����. -> 1byte ������ �������� ����.
		byte[] buf = "\n�ݰ����ϴ�. ����Ʈ�� ��½�Ʈ�� �����Դϴ�.".getBytes();  //�Ѳ����� �Է��ϸ� ������ ����. -> getBytes() : byte�� �迭�� �ٲ���.
																	//FileWriter ������ char�� �迭�� ����� ��� ��. String�� ����.
		fos.write(buf);
		fos.flush();  //������ ������ �������� ���� ������.
	}
}
