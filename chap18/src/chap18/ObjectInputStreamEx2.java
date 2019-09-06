package chap18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object2.ser"));
		System.out.println("����� 1 : " + ois.readObject());  //������ �о���� ������ Serializable �Ǿ��ִ� UserInfo2�� ������ ������ �� ����.
															//UserInfo2Ŭ�������� writeObject, readObject �޼��� �ۼ����ָ� ������ ������ ��ü �о�� �� ����.
		System.out.println("����� 2 : " + ois.readObject());
	}
}
