package chap18;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("out.txt");  //FileNotFoundException 예외처리 필요 -> 리눅스, 다중사용자환경 등에서는 사용자권한이 없으면 만들 수 없음.
		fos.write('1'); fos.write('2'); fos.write('3');
		fos.write('A'); fos.write('B'); fos.write('C');
		fos.write('가'); fos.write('나'); fos.write('다');  //한글 깨짐. -> 1byte 단위만 내보내기 때문.
		byte[] buf = "\n반갑습니다. 바이트형 출력스트림 예제입니다.".getBytes();  //한꺼번에 입력하면 깨지지 않음. -> getBytes() : byte형 배열로 바꿔줌.
																	//FileWriter 에서는 char형 배열로 만들어 줘야 함. String도 가능.
		fos.write(buf);
		fos.flush();  //버퍼의 내용을 목적지로 강제 전송함.
	}
}
