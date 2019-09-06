package chap18;

import java.io.IOException;
import java.io.InputStream;

/*
 * IO 스트림 : 데이터의 이동 통로.
 * 			 단방향, 입력과 출력이 명확하게 구분 됨.
 * 			 지연 존재, 내부에 버퍼 존재. 내부적으로 모아놨다가 하나씩 처리. 액션이 일어나야 출력됨.
 *          
 * 		입력 	바이트  : 1byte 단위 read()			: InputStream
 * 			문자	 : 2byte(1char) 단위 read()	: Reader
 * 		출력	바이트  : 1byte 단위 write()			: OutputStream > PrintStream (OutputStream의 하위 객체)
 * 			문자	 : 2byte(1char) write() 	: Writer
 * 
 * 	 InputStream을 Reader 객체로 변환 : InputStreamReader : Reader의 하위 클래스, InputStream를 매개변수로 받아서 Reader형태로 바꿔줌.
 * 	 OutputStream을 Writer 객체로 변환 : OutputStreamWriter : Writer의 하위 클래스
 * 
 *   자바가 제공해주는 표준입출력 객체. 객체 생성 필요 없이 바로 사용 가능.
 * 		표준입력 객체 : InputStream System.in
 * 		표준출력 객체 : PrintStream System.out
 * 		표준오류 객체 : PrintStream System.err
 */
public class InputStreamEx1 {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;  //System.in : 표준입력, InputStream 타입.
		int data = 0;
		while((data=in.read()) != -1) {  //ctrl + z : -1	in.read() : 1byte씩 아스키코드값으로 읽어옴. -> 한글은 한글자에 2byte 라서 깨짐.
			System.out.print((char)data);
		}
	}
}
