package chap18;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * InputStreamReader : Reader의 하위 클래스
 *   new InputStreamReader(InputStream 매개변수)
 */
public class ReaderEx1 {
	public static void main(String[] args) throws IOException {
		Reader in = new InputStreamReader(System.in);  //InputStreamReader : 바이트형(1byte 단위)을 문자형(2byte 단위)으로 읽어올 수 있게 해줌.
		int data = 0;
		while((data=in.read()) != -1) {  //여기에서 in이 Reader객체이기 때문에 in.read() 메서드는 2byte씩 읽어옴.
			System.out.print((char)data);
		}
		
	}
}
