package chap10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

/*
 * 오버라이딩 시 부모클래스의 메서드보다 자손클래스의 메서드의 예외처리는 같거나, 좁은 범위만 가능하다. -> 부모로 갈수록 예외의 범위는 커짐.
 * 오버라이딩 시 부모클래스의 메서드보다 자손클래스의 메서드의 접근제어자는 같거나, 넓은 범위만 가능하다. -> 부모로 갈수록 접근 범위 좁아짐.
 * 
 * 부모에서 선언된 예외클래스	자손에서 선언된 예외클래스
 *  IOException  >  FileNotFoundException, UnknownHostException
 *  
 * FileNotFoundException, UnknownHostException 은 IOException의 하위 클래스임.
 * 하위 클래스 여러 개 합쳐도 상위 클래스보다 좁은 범위다.	
 */
class Parent {
	void method() throws IOException {  //throws RuntimeException : 예외의 선언
		System.out.println("Parent method");
	}
}
class Child extends Parent {
	@Override
	protected void method() throws FileNotFoundException, UnknownHostException {  //Exception(예외의 최상위) 불가능. RuntimeException 보다 같거나 하위 객체의 예외처리만 가능.
		try {
			System.out.println("Child method");
			FileInputStream fis = new FileInputStream("aaa");
		}catch (IOException e) {  //IOException 은 RuntimeException 과 같은 계층에 있음. 꼭 자손 클래스에서 써야 한다면 try catch 문에서 써주면 된다.
		}
	}
}
public class ExceptionEx11 {
	public static void main(String[] args) throws FileNotFoundException, UnknownHostException {
		Child c = new Child();
		c.method();
	}
}
