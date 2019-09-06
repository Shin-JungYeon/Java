package chap18;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/*
 * SequenceInputStream ����
 *   ���� ���� InputStream�� ��Ƽ� �ϳ��� InputStream���� ����.
 *   ���� ��Ʈ��.
 */
public class SequenceInputStreamEx1 {
	public static void main(String[] args) throws IOException {
		byte[] arr1 = {1, 2, 3, 4, 5};
		byte[] arr2 = {6, 7, 8, 9, 10};
		ByteArrayInputStream stream1 = new ByteArrayInputStream(arr1);  // ByteArray -> IputStream ��ü�� ��ȯ. (�ε����� ���� �̿��ؼ� �κ������θ� ������ ���� ����.)
		ByteArrayInputStream stream2 = new ByteArrayInputStream(arr2);  //ByteArrayReader�� ����. Reader�� �������̱⶧��. StringReader ���.
		SequenceInputStream in = new SequenceInputStream(stream1, stream2);  //��Ʈ�� �� ���� �ٿ�������.
		System.out.println("stream1�� ����");
		int data;
//		while((data = stream1.read()) != -1) {
//			System.out.println((byte)data);
//		}
//		System.out.println("stream2�� ����");
//		while((data = stream2.read()) != -1) {
//			System.out.println((byte)data);
//		}
		System.out.println("���� ��Ʈ�� in�� ����");
		while((data = in.read()) != -1) {  //�տ��� ���� �� �о���� ���⼱ ���� ���� ����. ������״ٰ� �ؼ� ���ο� ��ü�� �����Ǵ� ���� �ƴ϶� ���������� �ٿ����� �� ��.
			System.out.println((byte)data);
		}
		
	}
}
