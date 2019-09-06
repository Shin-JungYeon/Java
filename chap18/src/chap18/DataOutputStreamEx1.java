package chap18;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataOutputStream ����
 *   1. ������Ʈ��.
 *   2. �⺻�ڷ������� ����ϴ� ��� ������ ����. -> �ƽ�Ű�ڵ�� ��� ���� �ʰ�, �� �ڷ��� �״��(2���� ��) �����.(?)
 *   3. ����� ������ ��Ȯ�� �о���� DataInputStream ���� read() �ؾ� ��.
 */
public class DataOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("data.ser");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeBoolean(true);  //1byte
		dos.writeInt(1234);		 //4
		dos.writeInt(65);		 //4  -> �ƽ�Ű������ �ϸ� �빮�� A
		dos.writeChar('a');		 //2  -> 
		dos.writeDouble(123.45); //8
		System.out.println(dos.size() + "����Ʈ ���");  //�� 19byte
		dos.flush(); dos.close();
		
	}
}
