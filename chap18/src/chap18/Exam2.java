package chap18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/*
 * 파일면을 입력받아서 해당 파일이 존재하면 입력된 파일명의 확장자를 .bak 파일을 출력파일로 하여 입력된 파일의 내용을 .bak 파일에 복사하기
 * 
 * [결과]
 * 
 * 원본파일 이름을 입력하세요.
 * aaa.txt
 * 
 * aaa.bak 파일이 생성
 * 
 * aaa.bak 파일의 내용 : 
 * 안녕하세요
 * 반갑습니다
 */
public class Exam2 {
	public static void main(String[] args) throws IOException {
		System.out.println("원본파일 이름을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String filename = scan.nextLine();
		String rename = filename.substring(0, filename.lastIndexOf("."))+".bak";  //lastIndexOf(".") 제일 뒤에서부터 찾아야 정확.
		int len;	
		FileInputStream fis = new FileInputStream(filename);
		FileOutputStream fos = new FileOutputStream(rename);
		byte buf[] = new byte[fis.available()];
		while((len=fis.read(buf))!=-1) {  //len 변수에 읽어올 파일의 크기를 그대로(or 더 크게) 가져왔다면 while문 필요 없음.
			fos.write(buf, 0, len);
		}
		fos.flush();
		fis.close();
	
	}
}
