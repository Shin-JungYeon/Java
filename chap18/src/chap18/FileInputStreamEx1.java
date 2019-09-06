package chap18;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * InputStream 데이터를 읽기 위한 기능
 *   1. int read() : 1byte를 읽어서 리턴. -> 한글 깨짐.
 *   2. int read(byte[] buf) : buf의 길이만큼 데이터를 읽어서 데이터는 buf에 저장. 실제로 읽은 바이트 수를 리턴.
 *   3. int read(byte[] buf, int start, int len) : buf의 시작 인덱스(start)부터 len만큼 데이터를 읽어서 buf에 저장해서 실제로 읽은 바이트 수를 리턴.
 */
public class FileInputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/chap18/InputStreamEx1.java");  //파일의 내용을 읽어서 가져옴. 한글은 다 깨져서 나옴. -> 화면에 출력할 때 1byte씩 해서	//상대경로
//		int data = 0;
//		while((data = fis.read())!=-1) {
//			System.out.print((char)data);  //내용을 문자 하나씩 읽어오기 때문에 println으로 쓰면 문자 한글자 출력하고 한줄띄고 함.
//		}
		int len = 0;
		byte[] buf = new byte[fis.available()];  //InputStream available() : 읽기 가능 바이트 수 리턴. 앞으로 읽을 수 있는(남아 있는) 바이트의 수.
//		while((len=fis.read(buf)) != -1) {  //실제로 읽은 바이트 수 리턴.
//			System.out.println(new String(buf, 0, len));  //모든 데이터 수를 buf가 가지고 있음.  //내용을 한꺼번에 읽어오기 때문에 println으로 써도 글자 밀리거나 하지 않음.
//		}
		while((len=fis.read(buf, 0, buf.length)) != -1) {  //바로 위의 while문과 같은 결과.
			System.out.println(new String(buf, 0, len));
		}
	}
}