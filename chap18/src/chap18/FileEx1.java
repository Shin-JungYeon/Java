package chap18;

import java.io.File;

/*
 * File 클래스 예제
 *   1. 파일 및 폴더의 정보를 관리하는 클래스. -> 파일 내부의 내용은 저장하거나 수정, 삭제할 수 없음.(파일 자체 생성, 수정, 삭제는 가능) -> 입출력 스트림을 사용해야 함.
 *   2. 존재하지 않아도 관리는 가능함.
 */
public class FileEx1 {
	public static void main(String[] args) {
		String filePath = "C:\\";
		File f1 = new File(filePath);  // c:/ 에 있는 폴더 정보
		String files[] = f1.list();  // c:/ 하위 파일, 폴더 이름 목록 저장. 숨겨진 파일 및 폴더 모두 저장.
		for(String f : files) {
			File f2 = new File(filePath, f);  //현재 File 객체가 포함된 상위폴더, 하위 파일(폴더)명
			if(f2.isDirectory()) {  //f2가 디렉토리(폴더)?
				System.out.printf("%s : 디렉토리\n", f);  //f : 폴더명
			} else if(f2.isFile()) {  //f2가 파일?
				System.out.printf("%s : 파일(%,d 바이트)\n", f, f2.length());  //%,d : 십진수 세자리마다 ,
			}
		}
		
	}
}
