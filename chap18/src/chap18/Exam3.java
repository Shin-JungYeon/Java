package chap18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Exam2.java를 FileReader, FileWriter클래스를 이용하여 구현하기.
 */
public class Exam3 {
	public static void main(String[] args) throws IOException {
		System.out.println("원본파일 이름을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String filename = scan.nextLine();
		String rename = filename.substring(0, filename.lastIndexOf("."))+".bak";  //lastIndexOf(".") 제일 뒤에서부터 찾아야 정확.
		
		FileReader fr = new FileReader(filename);  //굳이 경로까지 다 써줄 필요 없음.
		int len;
		char[] buf = new char[1024];  //Reader, Writer 는 2byte(1char)단위이므로 char형 배열 필요.
		len=fr.read(buf);
		
		FileWriter fw = new FileWriter(rename);  //Output
		fw.write(buf, 0, len);
		fw.flush();
		fw.close();
	}
}
