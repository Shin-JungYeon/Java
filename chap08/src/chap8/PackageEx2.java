package chap8;
/*
 * 1. 객체 생성을 못하도록 생성자의 접근 제어자를 private으로 설정할 수 있다. -> calendar 클래스의 생성자가 private 접근제어자를 가짐.
 *   Math 클래스의 생성자가 private 임. -> 모든 멤버가 static 임. 객체 생성 불필요.
 * 2. 객체의 갯수를 제한할 수 있다.
 */
class Single {
	private static Single s = new Single();  //Single 클래스 내부에서만 객체 생성 가능
	private Single() {}  //생성자
	private int value;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public static Single getInstance() {
		return s;
	}
}
public class PackageEx2 {
	public static void main(String[] args) {
//		Math math = new Math();  //객체 생성 불가.
//		Single s1 = new Single();  //객체 생성 불가.
		Single s1 = Single.getInstance();  //생성자의 접근제어자가 private이므로 메서드를 통해서만 객체 생성 가능.
		Single s2 = Single.getInstance();
		Single s3 = Single.getInstance();
		System.out.println(s1.getValue() + ", " + s2.getValue() + ", " + s3.getValue());
		s1.setValue(100);
		System.out.println(s1.getValue() + ", " + s2.getValue() + ", " + s3.getValue());  //객체가 한 개뿐임.
		//각 객체마다 각각의 value 값을 생성해낸 것이 아님. Single.getInstance() 로 생성된 객체는 Single 타입의 s 객체 단 하나 뿐.
	}
}
