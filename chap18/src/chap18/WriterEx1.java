package chap18;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * OutputStreamWriter : Writer의 하위 클래스
 *   new OutputStreamWriter(OutputStream 매개변수)
 */
public class WriterEx1 {
	public static void main(String[] args) throws IOException {
		Writer out = new OutputStreamWriter(System.out);  //OutputStreamWriter : 바이트형(1byte 단위)을 문자형(2byte 단위)으로 내보낼 수 있게 해줌.
		out.write('1'); out.write('2'); out.write('3');
		out.write('A'); out.write('B'); out.write('C');
		out.write('가'); out.write('나'); out.write('다');
		out.flush();  //버퍼의 내용을 목적지로 강제 전송함.
	}
}
