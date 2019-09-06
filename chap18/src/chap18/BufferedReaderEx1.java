package chap18;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 보조스트림 : 다른 스트림을 연결하여 기능을 추가할 수 있는 스트림. 자기랑 같은 타입의 객체를 받음.(InputStreamReader, OutputStreamWriter만 Stream 객체 받음.)
 * BufferedReader : 버퍼를 추가하여 성능을 향상할 수 있는 스트림.
 *                  readLine() 메서드를 이용하여 한줄씩 읽을 수 있는 기능을 가지고 있음. String형만 읽음. -> Scanner 클래스의 nextLine()과 같은 기능.
 *   new BufferedReader(Reader) -> Reader의 하위 클래스 모두 가능.
 */
public class BufferedReaderEx1 {
	public static void main(String[] args) throws IOException {
		//키보드에서 한줄씩 입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //InputStream -> Reader -> BufferedReader 스트림 이동.
		FileOutputStream fos = new FileOutputStream("buffered.txt");
		String data = null;
		while((data = br.readLine()) != null) {  //한줄씩 입력받음.
			System.out.println(data);  //화면에 출력.
			fos.write((data + "\n").getBytes());  //파일에 저장.
		}
	}
}
