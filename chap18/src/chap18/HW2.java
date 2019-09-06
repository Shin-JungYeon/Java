package chap18;

import java.io.File;

/*
 * 2. C:/Windows 폴더의 정보를 출력하기
 * 
 * [결과]
 * 하위 폴더 갯수 : 89
 * 하위 파일 갯수 : 45
 * 하위 파일의 총 크기 : 15,638,717 byte
 */
public class HW2 {
	public static void main(String[] args) {
		String filePath = "C:/Windows/";  // or "C:\\Windows\\";
		File file = new File(filePath);  //Windows 라는 폴더를 가리킴.
		String[] files = file.list();  //하위 폴더, 하위 파일의 정보(이름)를 배열로 넘겨줌.
		int direcnum = 0, filenum = 0, filesum = 0;
		for(String f : files) {
			File file2 = new File(filePath, f);  //f는 오직 이름 정보. filepath 안에 있는 f라는 이름을 가진 파일객체를 가져옴.
			if(file2.isDirectory()) {
				direcnum++;
			} else if(file2.isFile()) {
				filenum++;
				filesum += file2.length();
			}
		}
		System.out.println("하위 폴더 갯수 : " + direcnum);
		System.out.println("하위 파일 갯수 : " + filenum);
		System.out.printf("하위 파일의 총 크기 : %,d byte", filesum);
//		System.out.println("하위 파일의 총 크기 : " + String.format("%,d", filesum) + "byte");
	}
}