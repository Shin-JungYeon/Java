package chap18;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx1 {
	public static void main(String[] args) throws IOException{
		OutputStream out =  System.out;
		out.write('1'); out.write('2'); out.write('3');
		out.write('A'); out.write('B'); out.write('C');  //���ۿ� �ϴ� ���(1byte ��). -> ������ �ִٰ� ��� �׼��� �Ͼ�� ���.
		out.write('��'); out.write('��'); out.write('��');  //�ѱ��� ����.
		out.flush();  //������ ������ �������� ���� ������.
	}
}
