package chap18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataInputStream 예제
 *   1. 보조스트림
 *   2. 기본형으로 읽을 수 있는 기능을 가지고 있음. 기본형으로 복구시켜줌.
 *   3. DataOutputStream 으로 저장된 내용을 읽을 수 있음.
 */
public class DataInputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("data.ser");
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readBoolean());  //data.ser으로부터 값을 1byte만 읽어옴. -> boolean형으로 복구	//입력된 순서를 알고 있어야 함.
		System.out.println(dis.readInt());
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());
	}
}
