package chap18;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
 * File 클래스의 주요 메서드 예제
 */
public class FileEx2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:/temp1");
		System.out.printf("%s 폴더 생성 : %b\n", f1.getAbsolutePath(), f1.mkdir());
		//getAbsolutePath() : 파일의 절대 경로.
		//mkdir() : 폴더 생성. 성공:true, 실패:false(이미 있는 경우)
		File f2 = new File("c:/temp1/test.txt");
		System.out.printf("%s 파일 생성 : %b\n", f2.getAbsolutePath(), f2.createNewFile());
		//createNewFile() : 파일생성. 성공:true, 실패:false(이미 있는 경우)
		System.out.printf("파일 이름 : %s, 파일 크기 : %,d byte\n", f2.getName(), f2.length());
		//getName() : 파일 이름 리턴.
		//length() : 파일의 크기 리턴, 0 byte -> 내용은 입력할 수 없음.
		
		//파일 이름 변경
		File f3 = new File("c:/temp1/test2.txt");
		System.out.printf("%s -> %s 이름 변경 : %b\n",f2.getName(), f3.getName(), f2.renameTo(f3));
		//f2.renameTo(f3) : f2파일(test.txt)을 f3파일(test2.txt)로 이름 변경
		System.out.printf("%s 파일 최종 수정 일시 : %s\n", f3.getName(), new Date(f3.lastModified()));
		//lastModified() : 리턴타입 long -> 1970년 이후부터 최종 파일 수정까지의 시간을 밀리초로 리턴.
		System.out.printf("%s 파일 삭제 : %b\n", f3.getName(), f3.delete());
		//delete() : 파일 삭제.
	}
}
