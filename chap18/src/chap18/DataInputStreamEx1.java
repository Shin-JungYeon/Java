package chap18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataInputStream ����
 *   1. ������Ʈ��
 *   2. �⺻������ ���� �� �ִ� ����� ������ ����. �⺻������ ����������.
 *   3. DataOutputStream ���� ����� ������ ���� �� ����.
 */
public class DataInputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("data.ser");
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readBoolean());  //data.ser���κ��� ���� 1byte�� �о��. -> boolean������ ����	//�Էµ� ������ �˰� �־�� ��.
		System.out.println(dis.readInt());
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());
	}
}
