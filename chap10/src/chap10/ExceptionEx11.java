package chap10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

/*
 * �������̵� �� �θ�Ŭ������ �޼��庸�� �ڼ�Ŭ������ �޼����� ����ó���� ���ų�, ���� ������ �����ϴ�. -> �θ�� ������ ������ ������ Ŀ��.
 * �������̵� �� �θ�Ŭ������ �޼��庸�� �ڼ�Ŭ������ �޼����� ���������ڴ� ���ų�, ���� ������ �����ϴ�. -> �θ�� ������ ���� ���� ������.
 * 
 * �θ𿡼� ����� ����Ŭ����	�ڼտ��� ����� ����Ŭ����
 *  IOException  >  FileNotFoundException, UnknownHostException
 *  
 * FileNotFoundException, UnknownHostException �� IOException�� ���� Ŭ������.
 * ���� Ŭ���� ���� �� ���ĵ� ���� Ŭ�������� ���� ������.	
 */
class Parent {
	void method() throws IOException {  //throws RuntimeException : ������ ����
		System.out.println("Parent method");
	}
}
class Child extends Parent {
	@Override
	protected void method() throws FileNotFoundException, UnknownHostException {  //Exception(������ �ֻ���) �Ұ���. RuntimeException ���� ���ų� ���� ��ü�� ����ó���� ����.
		try {
			System.out.println("Child method");
			FileInputStream fis = new FileInputStream("aaa");
		}catch (IOException e) {  //IOException �� RuntimeException �� ���� ������ ����. �� �ڼ� Ŭ�������� ��� �Ѵٸ� try catch ������ ���ָ� �ȴ�.
		}
	}
}
public class ExceptionEx11 {
	public static void main(String[] args) throws FileNotFoundException, UnknownHostException {
		Child c = new Child();
		c.method();
	}
}
