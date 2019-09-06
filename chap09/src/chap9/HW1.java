package chap9;
/*
 * 1. 다음 소스는 컴파일 오류가 발생한다. 결과가 "Tested" 가 출력되도록 프로그램을 수정하고 수정한 이유를 설명하기.
 */
interface Beta {}

class Alpha implements Beta {
	String testIt() {
		return "Tested";
   }
}
public class HW1 {
	static Beta getIt() {
		return new Alpha();
	}
	public static void main(String[] args) {
		 Beta b = getIt();
		 System.out.println( ((Alpha)b).testIt() );  //b의 자료형을 Alpha로 형변환 해줌.
	}
}
//testIt() 메서드는 Alpha클래스의 멤버이다. 그런데 b의 자료형은 Beta이므로 Alpha클래스의 멤버에 접근 불가. 그렇기 때문에 형변환이 필요하다.
//고칠 수 있는 방법은 다양.