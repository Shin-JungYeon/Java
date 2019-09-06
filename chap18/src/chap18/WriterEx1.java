package chap18;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * OutputStreamWriter : Writer�� ���� Ŭ����
 *   new OutputStreamWriter(OutputStream �Ű�����)
 */
public class WriterEx1 {
	public static void main(String[] args) throws IOException {
		Writer out = new OutputStreamWriter(System.out);  //OutputStreamWriter : ����Ʈ��(1byte ����)�� ������(2byte ����)���� ������ �� �ְ� ����.
		out.write('1'); out.write('2'); out.write('3');
		out.write('A'); out.write('B'); out.write('C');
		out.write('��'); out.write('��'); out.write('��');
		out.flush();  //������ ������ �������� ���� ������.
	}
}
