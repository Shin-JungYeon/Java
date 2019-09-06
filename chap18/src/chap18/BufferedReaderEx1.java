package chap18;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ������Ʈ�� : �ٸ� ��Ʈ���� �����Ͽ� ����� �߰��� �� �ִ� ��Ʈ��. �ڱ�� ���� Ÿ���� ��ü�� ����.(InputStreamReader, OutputStreamWriter�� Stream ��ü ����.)
 * BufferedReader : ���۸� �߰��Ͽ� ������ ����� �� �ִ� ��Ʈ��.
 *                  readLine() �޼��带 �̿��Ͽ� ���پ� ���� �� �ִ� ����� ������ ����. String���� ����. -> Scanner Ŭ������ nextLine()�� ���� ���.
 *   new BufferedReader(Reader) -> Reader�� ���� Ŭ���� ��� ����.
 */
public class BufferedReaderEx1 {
	public static void main(String[] args) throws IOException {
		//Ű���忡�� ���پ� �Է� �ޱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //InputStream -> Reader -> BufferedReader ��Ʈ�� �̵�.
		FileOutputStream fos = new FileOutputStream("buffered.txt");
		String data = null;
		while((data = br.readLine()) != null) {  //���پ� �Է¹���.
			System.out.println(data);  //ȭ�鿡 ���.
			fos.write((data + "\n").getBytes());  //���Ͽ� ����.
		}
	}
}
