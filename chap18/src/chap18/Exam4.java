package chap18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

/*
 * src/chap18 폴더의 .java 파일 중 InputStream 관련 모든 소스를 InputStream예제.txt 파일로 생성하기. -> 몇 개가 있을 지 모름.
 * 
 * InputStream 관련 모든 소스 : ***InputStream***.java
 * 
 *   1. f1 = File("src/chap18") 설정.
 *   2. f1의 하위폴더 및 파일을 받아서, 그 중 파일이면서 파일의 이름에 InputStream이라는 값이 존재하면,
 *      FileInputStream 으로 설정.
 *   3. FileInputStream을 Vector에 저장 -> SequenceInputStream 객체로 연결하기.
 *   4. SequenceInputStream 읽어서 "InputStream예제.txt" 파일로 생성하기.
 */
public class Exam4 {
	public static void main(String[] args) throws IOException {
		Vector<InputStream> v = new Vector<InputStream>();
		File f1 = new File("src/chap18/");
		String[] files = f1.list();
		for(String f : files) {
			File f2 = new File("src/chap18", f);
//			String f2name = f2.getName();  //f가 String 형태이기 때문에 굳이 이름 다시 받아올 필요 없음.
//			if(f2.isFile() && f2name.contains("InputStream") && f2name.contains(".java")) {
			if(f2.isFile() && f.contains("InputStream") && f.contains(".java")) {  //f.contains(".java") 확장자가 다른 파일이 올 수도 있기때문에 추가해줌.
//				FileInputStream fis = new FileInputStream(f2);
//				v.add(fis);
				v.add(new FileInputStream(f2));  //바로 넣어주면 간단.
			}
		}
		
		SequenceInputStream st = new SequenceInputStream(v.elements());  //한꺼번에 읽어오기 위해 연결시켜줌.
		FileOutputStream fos = new FileOutputStream("InputStream예제.txt");
		int len = 0;
		byte[] buf = new byte[st.available()];
		while((len=st.read(buf)) != -1) {
//			String bufst = new String(buf, 0, len);
//			fos.write(bufst.getBytes());
			fos.write(buf, 0, len);  //buf 가 이미 byte형인데 왜 굳이 일을 두번 한거죠?
		}
		fos.flush();		
	}
}
