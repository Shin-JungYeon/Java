package chap11;
/*
 * StringBuffer 클래스의 주요 메서드
 *   1. 동적인 문자열. -> 문자 추가시 객체 자체에 추가 됨.
 *   2. String 클래스의 보조 역할 기능.
 *   3. StringBuilder 클래스와 모든 메서드가 동일함. -> jdk5.0 이후 추가된 클래스. 
 *      StringBuffer : 멀티스레드 환경에서 사용, Thread에 safe 함. 모든 메서드가 동기화 되어 있다.
 *      StringBuilder : 싱글스레드 환경에서 사용, Thread에 unsafe 함. " 동기화 되어 있지 않다. 똑같지만! 성능이 더 좋다. 모바일 등에서 많이 사용.
 */
public class StringBufferEx2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("abc").append(123).append(true);  //새로 객체를 만들지 않고, 문자열로 바꿔서 이어서 계속 붙임.
		System.out.println(sb);
		
		sb.delete(1, 3);  //index 1 부터 3 앞까지(2 까지) 삭제.
		System.out.println(sb);
		
		sb.deleteCharAt(4);  //index 4번 째 문자 한 개 삭제.
		System.out.println(sb);
		
		sb.insert(5, "@@");  //index 5번 째에 @@ 추가. 그 뒤의 문자는 뒤로 밀림.
		System.out.println(sb);
		
		sb = new StringBuffer("ABCDEFG");  //새로운 객체 생성.
		sb.replace(0, 3, "abc");  //index 0부터 3 앞까지(2까지) 문자열 대체(변경)
		System.out.println(sb);
		
		sb.reverse();  //순서 뒤집기
		System.out.println(sb);
		
		//전부 다 새로운 객체가 만들어지는 것이 아니라 그 안에서 계속 변함.
		
	}
}
