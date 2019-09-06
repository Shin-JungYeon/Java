package chap18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * PrintStream 예제 -> 보조스트림.
 *   1. OutputStream의 하위 클래스.
 *   2. write() 메서드의 기능을 향상 시킨 print, println, printf 메서드를 추가함.
 *        모든 자료형을 보이는 그대로 문자형으로 바로 출력해줌.
 *        예외처리를 안해도 됨.
 *        
 * 표준출력(System.out), 표준오류(System.err) 객체의 자료형이 PrintStream 임.
 */
class Print {
	int x;
	public String toString() {
		return "x=" + x;
	}
}
public class PrintStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos);  //PrintStream(fos, true) -> true : autoflush(자동으로 flush 하겠다.)
		ps.println("홍길동");
		ps.println(1234);
		ps.println(true);
		ps.println('a');
		ps.println(new Print());  //Print 객체를 보내주면서 toString() 메서드 자동 호출.
		ps.flush();  //최종목적지(print.txt)로 보내줌.
		
		//print2.txt 파일에 바로 저장가능.
		PrintStream ps2 = new PrintStream("print2.txt");  //문자열 넣어주면 파일명으로 인식.
		ps2.println("홍길동");
		ps2.println(1234);
		ps2.println(true);
		ps2.flush();  //PrintStream은 autoflush 해주지만 써주는 것이 안전.
	}
}
