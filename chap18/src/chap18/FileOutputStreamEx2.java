package chap18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * ���������� File�� �����ϱ�
 */
public class FileOutputStreamEx2 {
	public static void main(String[] args) {
		firstMethod();
	}
	
	private static void firstMethod() {
		secondMethod();
	}
	
	private static void secondMethod() {
		try {
			throw new Exception("���Ͽ� ���� �޼��� �����ϱ�");
		} catch (Exception e) {
			e.printStackTrace();  //ǥ�ؿ�����Ʈ��(System.err) ���, ȭ�鿡 ���
			try {
				/*
				 * FileOutputStream(���ϸ�)
				 *   ���ϸ��� ������ ���� : ���� ���� ������.(�������� ����.) -> ���� ������ ������ ������ �����鼭, ���ο� ������ �߰� : FileOutputStream(���ϸ�, true)
				 *   ���ϸ��� ������ ���� : ������ �����ؼ� �ش� ������ ����.
				 */
				FileOutputStream fos = new FileOutputStream("err.log");//, true);  //FileOutputStream(���ϸ�, true) : ���ο� ������ �߰�.
				fos.write(e.getMessage().getBytes());  //fos(err.log) ���Ϸ� �����޼��� ����ϱ� -> ���� ������ �͸� ������ ����.
				e.printStackTrace(new PrintStream(fos));  //fos ���Ͽ� ��� ���
				fos.write("\n\n".getBytes());
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}	
		}
	}
	
}
