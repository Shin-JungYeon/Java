package chap18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class UserInfo {
	protected String name;  //public -> default로 해도 가능. private 으로 하면 자손클래스에서(무슨짓을 해도) 접근 못하기 때문에 안됨.
	protected String password;  //protected로 해줘야 자손까지만 접근 가능. public은 모두가 접근할 수 있음.
	public UserInfo() {}
	public UserInfo(String name, String password) {
		this.name = name;
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", password=" + password;
	}
}
class UserInfo2 extends UserInfo implements Serializable {
	private int age;
	public UserInfo2(String name, String password, int age) {
		super(name, password);
		this.age = age;
	}
	@Override
	public String toString() {
		return super.toString() + ", age=" + age + "]";
	}
	
	//부모 클래스가 Serializable 인터페이스를 구현하지 않아도 그 안의 객체를 강제로 외부로 보내줄 수 있음.
	//ObjectInputStream의 writeObject메서드에서 설정된 name, password를 직렬화 함.
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name);  //UTF : 문자열을
		out.writeUTF(password);
		out.defaultWriteObject();  //원래 하려고 했던거 해라 -> age
	}
	//ObjectInputStream의 readObject메서드에서 설정된 name, password를 역직렬화 함.
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		password = in.readUTF();  //순서 그대로 써줘야 함.
		in.defaultReadObject();
	}
}
public class ObjectOutputStreamEx2 {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Object2.ser"));
		UserInfo2 u1 = new UserInfo2("홍길동", "1234", 20);
		UserInfo2 u2 = new UserInfo2("김삿갓", "5678", 30);
		oos.writeObject(u1);  //u1 객체는 Serializable을 구현한 UserInfo2 클래스의 객체이므로 writeObject() 하는데에는 아무 문제 없음.
		oos.writeObject(u2);
		System.out.println("사용자 1 : " + u1);
		System.out.println("사용자 2 : " + u2);
	}
}
