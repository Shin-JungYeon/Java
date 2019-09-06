package chap18;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * InputStreamReader : Reader�� ���� Ŭ����
 *   new InputStreamReader(InputStream �Ű�����)
 */
public class ReaderEx1 {
	public static void main(String[] args) throws IOException {
		Reader in = new InputStreamReader(System.in);  //InputStreamReader : ����Ʈ��(1byte ����)�� ������(2byte ����)���� �о�� �� �ְ� ����.
		int data = 0;
		while((data=in.read()) != -1) {  //���⿡�� in�� Reader��ü�̱� ������ in.read() �޼���� 2byte�� �о��.
			System.out.print((char)data);
		}
		
	}
}
