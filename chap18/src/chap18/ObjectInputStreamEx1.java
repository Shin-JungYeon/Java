package chap18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * ObjectInputStream ����
 *   1. �ܺο��� ���۵� ��ü�� ���� �� �ִ� ��Ʈ��. -> readObject() �޼��带 �̿���.
 *   2. Object readObject() ��. ����ȯ�Ͽ� ���� ��ü�� �ڷ����� ���������� �����ؾ� �Ѵ�.
 */
public class ObjectInputStreamEx1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.ser"));  //object.ser ����(�̹� ��ϵ� ����)�� ��ü�� ���� �غ�. ���ο� ��ü�� ������ ���� �ƴ�.
		Object o = ois.readObject();
		Customer c1 = (Customer) o;
//		Customer c1 = (Customer) ois.readObject();  //���ο� ��ü�� �����ϴ� ���� �ƴ� �̹� ��ϵ� ���� �о ��üȭ ��Ŵ.
		Customer c2 = (Customer) ois.readObject();
		System.out.println(o);  //�޼���� ���������� Ÿ�԰� ������� ���� �������̵��� �޼��� ȣ��. -> Costomer Ŭ������ toString() ȣ��.
		System.out.println(c1);
		System.out.println(c2);
	}
}
