package chap18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * ObjectInputStream 예제
 *   1. 외부에서 전송된 객체를 읽을 수 있는 스트림. -> readObject() 메서드를 이용함.
 *   2. Object readObject() 임. 형변환하여 원래 객체의 자료형의 참조변수로 참조해야 한다.
 */
public class ObjectInputStreamEx1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.ser"));  //object.ser 파일(이미 등록된 파일)을 객체로 읽을 준비. 새로운 객체를 생성한 것이 아님.
		Object o = ois.readObject();
		Customer c1 = (Customer) o;
//		Customer c1 = (Customer) ois.readObject();  //새로운 객체를 생성하는 것이 아닌 이미 등록된 것을 읽어서 객체화 시킴.
		Customer c2 = (Customer) ois.readObject();
		System.out.println(o);  //메서드는 참조변수의 타입과 상관없이 최종 오버라이딩된 메서드 호출. -> Costomer 클래스의 toString() 호출.
		System.out.println(c1);
		System.out.println(c2);
	}
}
