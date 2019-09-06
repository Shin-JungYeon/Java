package chap18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object2.ser"));
		System.out.println("사용자 1 : " + ois.readObject());  //파일을 읽어오긴 했지만 Serializable 되어있는 UserInfo2의 정보만 가져올 수 있음.
															//UserInfo2클래스에서 writeObject, readObject 메서드 작성해주면 강제로 내보낸 객체 읽어올 수 있음.
		System.out.println("사용자 2 : " + ois.readObject());
	}
}
