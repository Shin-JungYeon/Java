package chap18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * 예외정보를 File에 저장하기
 */
public class FileOutputStreamEx2 {
	public static void main(String[] args) {
		firstMethod();
	}
	
	private static void firstMethod() {
		secondMethod();
	}
	
	private static void secondMethod() {
		try {
			throw new Exception("파일에 예외 메세지 저장하기");
		} catch (Exception e) {
			e.printStackTrace();  //표준오류스트림(System.err) 출력, 화면에 출력
			try {
				/*
				 * FileOutputStream(파일명)
				 *   파일명의 파일이 존재 : 원래 파일 수정됨.(최종본만 저장.) -> 기존 파일의 내용을 가지고 있으면서, 새로운 내용을 추가 : FileOutputStream(파일명, true)
				 *   파일명의 파일이 없음 : 파일을 생성해서 해당 내용을 저장.
				 */
				FileOutputStream fos = new FileOutputStream("err.log");//, true);  //FileOutputStream(파일명, true) : 새로운 내용을 추가.
				fos.write(e.getMessage().getBytes());  //fos(err.log) 파일로 오류메세지 출력하기 -> 제일 최종의 것만 가지고 있음.
				e.printStackTrace(new PrintStream(fos));  //fos 파일에 결과 출력
				fos.write("\n\n".getBytes());
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}	
		}
	}
	
}
