package chap18;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataOutputStream 예제
 *   1. 보조스트림.
 *   2. 기본자료형으로 출력하는 기능 가지고 있음. -> 아스키코드로 출력 하지 않고, 그 자료형 그대로(2진수 값) 출력함.(?)
 *   3. 저장된 내용을 정확히 읽어내려면 DataInputStream 으로 read() 해야 함.
 */
public class DataOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("data.ser");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeBoolean(true);  //1byte
		dos.writeInt(1234);		 //4
		dos.writeInt(65);		 //4  -> 아스키값으로 하면 대문자 A
		dos.writeChar('a');		 //2  -> 
		dos.writeDouble(123.45); //8
		System.out.println(dos.size() + "바이트 출력");  //총 19byte
		dos.flush(); dos.close();
		
	}
}
