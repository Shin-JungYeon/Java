package chap8;

//import chap8.packtest.Pack1;  //Pack1 클래스의 패키지명 설정
import chap8.packtest.*;  //chap8.packtest 패키지의 모든 클래스의 패키지명을 생략

/*
 * package : 클래스와 인터페이스들의 모임 -> 폴더로 구분(폴더 자체가 패키지는 아님)
 *   1. 클래스들의 모임
 *   2. 클래스의 이름은 패키지명을 포함한다.
 *       String -> java.lang.String
 *   3. package 설정은 파일의 처음에(제일 윗줄에) 한 번만 할 수 있다. -> 하나의 파일에 있는 모든 클래스는 같은 패키지에 있는 클래스가 된다.
 *   
 * import : 클래스 사용시 패키지명을 생략 할 수 있도록 지원.
 * 
 * 패키지명 생략 가능한 경우
 *   1. 사용하는 클래스와 사용되는 클래스가 같은 패키지의 클래스인 경우
 *   2. java.lang 패키지에 속한 클래스인 경우 (String, System, ...)
 *   3. import 구문에 설정된 패키지에 속한 클래스인 경우 (Scnner, ...) 
 *   
 * 접근제어자 : private < (default) : 생략된 경우 < protected < public 
 *         :           < 같은 패키지에 속한 클래스만 접근 가능 < 
 *         
 * 				동일클래스		동일패키지		상속		그 외
 *  private		   O		   X		 X		 X
 * (default)	   O		   O		 X		 X
 * protected	   O		   O		 O		 X
 *   public		   O		   O		 O		 O
 * 
 * 멤버 : private, (default), protected, public
 * 클래스 : (default), public
 */
class Test extends Pack1 {
	void testmethod() {
//		method();  //default 접근제어자이므로 접근 불가
		method2();  //protected 접근제어자이므로 상속관계에서 접근 허용
	}
}
public class PackageEx1 {
	public static void main(String[] args) {
//		chap8.packtest.Pack1 p = new chap8.packtest.Pack1();  //import 하지 않고 호출. 하지만 너무 기니까 import 사용해서 패키지명 생략
		System.out.println("패키지 예제");
		
		Pack1 p = new Pack1();
//		p.method();  //PackageEx1 클래스에서 Pack1 클래스의 method() 접근 불가능. default 접근 제어자
//		p.method2();  //PackageEx1 클래스에서 Pack1 클래스의 method2() 접근 불가능. protected 접근 제어자
		Test t = new Test();  //같은 패키지에 있는 클래스는 import없이도 패키지명 생략 가능
		t.testmethod();  //상속을 통해서 testmethod()를 다리로 method2() 메서드에 접근 가능
		Test2 t2 = new Test2();
		t2.testmethod();  //default 접근제어자임.
		
		
	}
}