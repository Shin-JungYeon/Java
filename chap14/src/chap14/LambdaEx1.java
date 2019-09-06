package chap14;
/*
 * 람다식 예제 : jdk8 버전 추가
 * 
 * 람다식에서 사용할 수 있는 인터페이스는 반드시 FunctionalInterface여야 한다.
 * FunctionalInterface : 추상메서드가 한 개인 인터페이스. 람다를 사용하기 위한 전제조건.
 * 
 * @FunctionalInterface : 인터페이스에는 추상메서드가 한 개임을 알려주는 annotation. 함수객체라는 것을 명시적으로 알려줄 뿐. 안쓴다고 해서 프로그램이 실행되는 데에 지장을 주진 않음.
 * 
 * 1. 매개변수 없고, 리턴값도 없는 경우 예제.
 *    매개변수 없음 : () ->
 *    람다식 내부에 처리하는 구문이 한 개인 경우 {}생략할 수 있음.
 * 
 */
@FunctionalInterface
interface FunctionalInterface1 {
	void method();
//	void method2();  //@FunctionalInterface 어노테이션이 있을 때 추상메서드가 두 개 이상이면 에러 발생.
}
public class LambdaEx1 {
	public static void main(String[] args) {
		//예전 방식
		FunctionalInterface1 f1 = new FunctionalInterface1() {	
			@Override
			public void method() {
				System.out.println("인터페이스 객체");
			}
		};
		f1.method();
		
		//람다 방식 1
		FunctionalInterface1 f2;
		f2 = () -> {
			String str = "method call(1)";
			System.out.println(str);
		};  //이게 메서드를 오버라이딩한 것과 같은 것.
		f2.method();
		
//		f2 = () -> {
//			String str = "method call(2)";
//			System.out.println(str);
//		};
		f2 = () -> System.out.println("method call(2)");  //실행시킬 내용이 한 줄일 땐 {} 생략 가능.
		f2.method();
		
		//람다 방식 2 : 매개변수로 사용되는 람다식
		execute(f2);
		execute(()->{System.out.println("method call(3)");});  //execute 메서드의 매개 변수 안에 람다식 메서드 자체를 넣어줘도 됨.
		execute(()->System.out.println("method call(4)"));  //실행시킬내용이 한 줄일 땐 {} 생략 가능.
	}
	static void execute(FunctionalInterface1 f) {
		f.method();
	}
}
