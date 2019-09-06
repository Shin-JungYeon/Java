package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Properties;

/*
 * Properties 클래스 -> Hashtable이 Map 객체이기 때문에 Properties 클래스도 Map 객체임. (java project -> new -> file)
 *   1. Hashtable의 하위 클래스
 *   2. 제네릭 표현을 안 함. -> 키, 객체가 모두 String인 클래스.
 */
public class MapEx3 {
	public static void main(String[] args) throws IOException {
		Properties pr = new Properties();
		//a.properties 파일 읽기위한 설정.
		FileInputStream fis = new FileInputStream("a.properties");  //한글은 유니코드로 저장 됨.
		pr.load(fis);  //파일에 있는 내용을 Map객체로 한꺼번에 로드해줌. (key)=(value)
		System.out.println(pr);
		pr.list(System.out);
		System.out.println();
		
		//key들만 조회해서 화면에 출력하기. : keySet()
		System.out.println("keySet()를 이용하여 조회하기");
		for(Object k : pr.keySet()) {
			System.out.println(k + "=" + pr.get(k));
		}
		System.out.println();
		
		//value들만 조회해서 화면에 출력하기. : values()
		System.out.println("values()를 이용하여 조회하기");
		for(Object v : pr.values()) {
			System.out.println(v);
		}
		System.out.println();
		
		//(key, value)들을 조회하여 화면에 출력하기. : entrySet()
		System.out.println("entrySet()를 이용하여 조회하기");
		for(Object e : pr.entrySet()) {
			Map.Entry en = (Map.Entry) e;
			System.out.println(e);
		}
		
	}
}
