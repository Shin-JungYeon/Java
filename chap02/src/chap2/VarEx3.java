package chap2;
/*
 * 특수 문자 예제 : \
 *             문자에 의미를 부여하거나, \, ', " 등 의미있는 문자의 의미를 제거함.
 */
public class VarEx3 {
	public static void main(String[] args) {
		System.out.println("안녕하세요\n홍길동 입니다.");
		System.out.println("서울\t부산\t대구\t광주");
		System.out.println("홍길동이 말했습니다 \"안녕\"");
		System.out.println("문자표시 문자 : " + '\'');
		System.out.println("문자열표시 문자 : " + "\"");
		System.out.println("작업 폴더 : " + "D:\\20190211\\java\\workspace");
	}
}