package chap18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * ObjectOutputStream 예제
 *   1. 객체를 외부로 전송할 수 있는 스트림.
 *   2. 전송되는 객체는 반드시 Serializable 인터페이스를 구현해야 함.
 *   3. 객체를 외부로 전송하는 기능을 직렬화라고 한다.
 *   4. 전송된 객체는 ObjectInputStream 으로 readObject() 메서드로 읽을 수 있음.
 */
class Customer implements Serializable {  //Serializable 인터페이스 안에는 아무것도 없음. 그냥 구현만 해주면 됨.
	private String name;
	private int age;
	private transient String jumin;  //transient : jumin 변수의 값은 직렬화에서 제외시킴(값이 외부로 전송되지 않음).
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
		Customer c1 = new Customer("홍길동", 20, "1234");
		Customer c2 = new Customer("김삿갓", 30, "5678");
		oos.writeObject(c1);  //객체로 쓰여지기 위해서는(write하기 위해서는) Serializable로 형변환 필요.
		oos.writeObject(c2);
		System.out.println("고객 1 : " + c1);
		System.out.println("고객 2 : " + c2);
	}
}
