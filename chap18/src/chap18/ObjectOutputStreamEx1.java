package chap18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * ObjectOutputStream ����
 *   1. ��ü�� �ܺη� ������ �� �ִ� ��Ʈ��.
 *   2. ���۵Ǵ� ��ü�� �ݵ�� Serializable �������̽��� �����ؾ� ��.
 *   3. ��ü�� �ܺη� �����ϴ� ����� ����ȭ��� �Ѵ�.
 *   4. ���۵� ��ü�� ObjectInputStream ���� readObject() �޼���� ���� �� ����.
 */
class Customer implements Serializable {  //Serializable �������̽� �ȿ��� �ƹ��͵� ����. �׳� ������ ���ָ� ��.
	private String name;
	private int age;
	private transient String jumin;  //transient : jumin ������ ���� ����ȭ���� ���ܽ�Ŵ(���� �ܺη� ���۵��� ����).
	public Customer(String name, int age, String jumin) {
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", jumin=" + jumin + "]";
	}
}
public class ObjectOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
		Customer c1 = new Customer("ȫ�浿", 20, "1234");
		Customer c2 = new Customer("���", 30, "5678");
		oos.writeObject(c1);  //��ü�� �������� ���ؼ���(write�ϱ� ���ؼ���) Serializable�� ����ȯ �ʿ�.
		oos.writeObject(c2);
		System.out.println("�� 1 : " + c1);
		System.out.println("�� 2 : " + c2);
	}
}
