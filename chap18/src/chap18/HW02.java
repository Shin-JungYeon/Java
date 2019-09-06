package chap18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 2. 콘솔에서 파일명과 숫자를 입력받아서 해당 파일을 입력된 숫자만큼만 출력하는 프로그램 작성하기. Scanner 사용 불가.
 * 
 * [결과]
 * 
 * 출력할 파일명 입력
 * src/chap18/InputStreamEx1.java -> project부터 시작하기 때문에 폴더지정(상대경로) 필요.
 * 출력할 라인수 입력
 * 1
 * 
 * [결과]
 * 
 * 1 :package chap15;
 */
public class HW02 {
	public static void main(String[] args) throws IOException {
		/*
		String filepath = "src/chap18/";
		while(true) {
			try {
				System.out.println("출력할 파일명을 입력하세요.");
				InputStream input = System.in;
				int data=0;
				String filename = "";
				while((data=input.read()) != -1) {
					filename += (char)data;
					if(input.available() == 0) break;
				}
				System.out.println(filename);
				FileInputStream fis = new FileInputStream(filepath + "InputStreamEx1.java");
				if(input.available() == 0) {
					System.out.println("출력할 라인수를 입력하세요.");
					InputStream input2 = System.in;
					data = 0;
					char line = (char) input2.read();
					
					System.out.println(line);
					BufferedReader br = new BufferedReader(new InputStreamReader(fis));
					for(int i=1; i<=line; i++) {
						System.out.println(i + ":" + ((br.readLine()!=null)?br.readLine():""));
					}
					break;
				}
			} catch (FileNotFoundException e) {
				System.out.println("파일을 찾을 수 없습니다. 다시 입력해주세요.");
				continue;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		//BufferedReader : 문자열만 한 줄씩 콘솔창에서 키보드로부터(System.in) 입력받을 수 있음.
		String filepath = "src/chap18/";
		System.out.println("출력할 파일명 입력");
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String filename = stdin.readLine();  //문자열 한 줄씩 입력받음.
		System.out.println("출력할 라인수 입력");
		int line = Integer.parseInt(stdin.readLine());  //String으로 입력받아서  Integer로 형변환.
		BufferedReader fbr = new BufferedReader(new FileReader(filepath + filename));  //파일의 상대경로 입력해줘야 함.
		String msg = null;  //파일의 내용 한 줄씩 저장.
		int prt = 0;  //이미 출력한 라인을 저장.
		while((msg = fbr.readLine()) != null) {  //문자열 한 줄씩 읽어옴.
			if(line <= prt) break;
			prt++;
			System.out.println(prt + ":" + msg);
		}
		
	}
}
