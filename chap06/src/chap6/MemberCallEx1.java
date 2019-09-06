package chap6;
/*
 * 클래스 멤버와 인스턴스 멤버간의 호출 예제
 * 클래스 멤버에서 인스턴스 멤버 호출 시 반드시 객체화 필요
 */
public class MemberCallEx1 {
	static int cv1 = 10;
	static int cv2 = cv1;
	int iv1 = 100;
	int iv2 = iv1;
	
//	static int cv3 = iv2; //error  iv2는 준비가 되지 않았음.
	static int cv3 = new MemberCallEx1().iv2;
	
	public static void main(String[] args) {
		
//		cv2 = iv1; //error
//		method1(); //error
		MemberCallEx1 m = new MemberCallEx1();
		cv2 = m.iv1;
		m.method1();
		
		method2();
	}
	void method1() {
		System.out.println(cv1 + cv2);
		System.out.println(iv1 + iv2);
		method2();
	}
	static void method2() {
		System.out.println(cv1 + cv2);
		
//		System.out.println(iv1 + iv2); //error
		MemberCallEx1 m = new MemberCallEx1();
		System.out.println(m.iv1 + m.iv2);
	}
	
}
