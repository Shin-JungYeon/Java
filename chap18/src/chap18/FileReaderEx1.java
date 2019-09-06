package chap18;

import java.io.FileReader;
import java.io.IOException;
/*
 * Reader 데이터를 읽기 위한 기능
 *   1. int read() : 1char의 데이터를 읽어서 리턴. -> 한글 깨지지 않음.
 *   2. int read(char[] buf) : buf의 길이만큼 데이터를 읽어서 데이터는 buf에 저장. 읽은 문자수를 리턴. -> 성능 가장 좋음.
 *   3. int read(char[] buf, int start, int len) : buf의 시작 인덱스(start)부터 len만큼 데이터를 읽어서 buf에 저장해서 실제로 읽은 문자수를 리턴.
 */
public class FileReaderEx1 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src/chap18/ReaderEx1.java");
		int data;
//		while((data=fr.read()) != -1) {
//			System.out.print((char)data);  //내용을 문자 하나씩 읽어오기 때문에 println으로 쓰면 문자 한글자 출력하고 한줄띄고 함.
//		}
		int len;
		char[] buf = new char[1024];  //파일 크기가 1024보다 크면 알아서 나눠서 읽어옴.
//		while((len=fr.read(buf)) != -1) {
//			System.out.print(new String(buf, 0, len));  //내용을 한꺼번에 읽어오기 때문에 println으로 써도 글자 밀리거나 하지 않음.
//		}
		while((len=fr.read(buf, 0, buf.length)) != -1) {
			System.out.println(new String(buf, 0, len));
		}
	}
}
