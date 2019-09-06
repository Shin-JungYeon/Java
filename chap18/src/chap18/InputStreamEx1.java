package chap18;

import java.io.IOException;
import java.io.InputStream;

/*
 * IO ��Ʈ�� : �������� �̵� ���.
 * 			 �ܹ���, �Է°� ����� ��Ȯ�ϰ� ���� ��.
 * 			 ���� ����, ���ο� ���� ����. ���������� ��Ƴ��ٰ� �ϳ��� ó��. �׼��� �Ͼ�� ��µ�.
 *          
 * 		�Է� 	����Ʈ  : 1byte ���� read()			: InputStream
 * 			����	 : 2byte(1char) ���� read()	: Reader
 * 		���	����Ʈ  : 1byte ���� write()			: OutputStream > PrintStream (OutputStream�� ���� ��ü)
 * 			����	 : 2byte(1char) write() 	: Writer
 * 
 * 	 InputStream�� Reader ��ü�� ��ȯ : InputStreamReader : Reader�� ���� Ŭ����, InputStream�� �Ű������� �޾Ƽ� Reader���·� �ٲ���.
 * 	 OutputStream�� Writer ��ü�� ��ȯ : OutputStreamWriter : Writer�� ���� Ŭ����
 * 
 *   �ڹٰ� �������ִ� ǥ������� ��ü. ��ü ���� �ʿ� ���� �ٷ� ��� ����.
 * 		ǥ���Է� ��ü : InputStream System.in
 * 		ǥ����� ��ü : PrintStream System.out
 * 		ǥ�ؿ��� ��ü : PrintStream System.err
 */
public class InputStreamEx1 {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;  //System.in : ǥ���Է�, InputStream Ÿ��.
		int data = 0;
		while((data=in.read()) != -1) {  //ctrl + z : -1	in.read() : 1byte�� �ƽ�Ű�ڵ尪���� �о��. -> �ѱ��� �ѱ��ڿ� 2byte �� ����.
			System.out.print((char)data);
		}
	}
}
