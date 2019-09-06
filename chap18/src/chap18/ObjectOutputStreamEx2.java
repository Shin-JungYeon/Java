package chap18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class UserInfo {
	protected String name;  //public -> default�� �ص� ����. private ���� �ϸ� �ڼ�Ŭ��������(�������� �ص�) ���� ���ϱ� ������ �ȵ�.
	protected String password;  //protected�� ����� �ڼձ����� ���� ����. public�� ��ΰ� ������ �� ����.
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
	
	//�θ� Ŭ������ Serializable �������̽��� �������� �ʾƵ� �� ���� ��ü�� ������ �ܺη� ������ �� ����.
	//ObjectInputStream�� writeObject�޼��忡�� ������ name, password�� ����ȭ ��.
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name);  //UTF : ���ڿ���
		out.writeUTF(password);
		out.defaultWriteObject();  //���� �Ϸ��� �ߴ��� �ض� -> age
	}
	//ObjectInputStream�� readObject�޼��忡�� ������ name, password�� ������ȭ ��.
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		password = in.readUTF();  //���� �״�� ����� ��.
		in.defaultReadObject();
	}
}
public class ObjectOutputStreamEx2 {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Object2.ser"));
		UserInfo2 u1 = new UserInfo2("ȫ�浿", "1234", 20);
		UserInfo2 u2 = new UserInfo2("���", "5678", 30);
		oos.writeObject(u1);  //u1 ��ü�� Serializable�� ������ UserInfo2 Ŭ������ ��ü�̹Ƿ� writeObject() �ϴµ����� �ƹ� ���� ����.
		oos.writeObject(u2);
		System.out.println("����� 1 : " + u1);
		System.out.println("����� 2 : " + u2);
	}
}
