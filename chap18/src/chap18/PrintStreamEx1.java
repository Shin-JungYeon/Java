package chap18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * PrintStream ���� -> ������Ʈ��.
 *   1. OutputStream�� ���� Ŭ����.
 *   2. write() �޼����� ����� ��� ��Ų print, println, printf �޼��带 �߰���.
 *        ��� �ڷ����� ���̴� �״�� ���������� �ٷ� �������.
 *        ����ó���� ���ص� ��.
 *        
 * ǥ�����(System.out), ǥ�ؿ���(System.err) ��ü�� �ڷ����� PrintStream ��.
 */
class Print {
	int x;
	public String toString() {
		return "x=" + x;
	}
}
public class PrintStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos);  //PrintStream(fos, true) -> true : autoflush(�ڵ����� flush �ϰڴ�.)
		ps.println("ȫ�浿");
		ps.println(1234);
		ps.println(true);
		ps.println('a');
		ps.println(new Print());  //Print ��ü�� �����ָ鼭 toString() �޼��� �ڵ� ȣ��.
		ps.flush();  //����������(print.txt)�� ������.
		
		//print2.txt ���Ͽ� �ٷ� ���尡��.
		PrintStream ps2 = new PrintStream("print2.txt");  //���ڿ� �־��ָ� ���ϸ����� �ν�.
		ps2.println("ȫ�浿");
		ps2.println(1234);
		ps2.println(true);
		ps2.flush();  //PrintStream�� autoflush �������� ���ִ� ���� ����.
	}
}
