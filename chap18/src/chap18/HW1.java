package chap18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 1. 파일명을 입력받아서 해당 존재하면  입력된 파일명의 확장자를 .line 파일을 출력파일로 입력된 파일의 내용을 .line 파일에 복사하기. 단 복사할때 라인수를 추가하기.
 * 
 * [결과]
 * 
 * 원본파일이름을 입력하세요
 * aaa.txt
 * aaa.line 파일이 생성.
 * aaa.line 파일의 내용
 * 1:안녕하세요
 * 2:반갑습니다.
 * 
 */
public class HW1 {
	public static void main(String[] args) throws IOException {
		System.out.println("원본 파일 이름을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String originfile = scan.nextLine();
		String newfile = originfile.substring(0, originfile.lastIndexOf(".")) + ".line";
		
		FileInputStream fr = new FileInputStream(originfile);
		FileOutputStream fw = new FileOutputStream(newfile);
		BufferedReader br = new BufferedReader(new InputStreamReader(fr));
		
		String content = null;
		int i=0;
		while((content = br.readLine()) != null) {
			fw.write(((++i) + ":" + content + "\n").getBytes());  //한줄씩 받아오기 때문에 내용 추가도 한줄씩 됨.
		}
		fw.flush();
		fw.close();
	}
}
