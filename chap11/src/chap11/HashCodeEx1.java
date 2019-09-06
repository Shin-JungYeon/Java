package chap11;
/*
 * Object 클래스의 멤버 : hashCode() 메서드
 *   해쉬코드 : JVM이 객체별로 부여하는 고유ID값(참조값이라고 생각하면 됨). 해쉬코드값이 같은 경우는 같은 객체로 봄.
 *   
 * 논리적으로 동등한 객체 : 내용이 같으면서 해쉬코드가 같은 경우.
 * 		equals 메서드를 오버라이딩 하면, hashCode() 메서드도 오버라이딩 하여 논리적인 동등성을 구현해야 한다. -> 권장사항
 */
class Hash { 
	
	String name;
	int value;
	Hash(String name, int value) {
		this.name = name;
		this.value = value;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Hash) {
			Hash h = (Hash)obj;
			return  name.equals(h.name) && value==h.value;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return name.hashCode() + value;  //문자열의 해쉬코드는 내용이 같은면 같음.
	}  //논리적 동등성을 구현하기 위해 오버라이딩, 원래의 해쉬코드 메서드는 각 객체마다 내용이 같아도 다른 ID값을 부여함.
}
public class HashCodeEx1 {
	public static void main(String[] args) {
		Hash h1 = new Hash("홍길동", 10);
		Hash h2 = new Hash("홍길동", 10);
		System.out.println("h1 객체의 해쉬코드 : " + h1.hashCode());
		System.out.println("h2 객체의 해쉬코드 : " + h2.hashCode());
//		h2 = h1;
		System.out.println("h1 객체의 해쉬코드 : " + h1.hashCode());
		System.out.println("h2 객체의 해쉬코드 : " + h2.hashCode());
		System.out.println("실제 해쉬코드 값 : ");
		System.out.println("h1 객체의 실제 해쉬코드 : " + System.identityHashCode(h1));
		System.out.println("h2 객체의 실제 해쉬코드 : " + System.identityHashCode(h2));
		
		System.out.println();
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		if(str1 == str2) {
			System.out.println("str1과 str2는 같은 객체다.");
		} else {
			System.out.println("str1과 str2는 다른 객체다.");
		}
		System.out.println("str1 객체의 해쉬코드 : " + str1.hashCode());
		System.out.println("str2 객체의 해쉬코드 : " + str2.hashCode());
		System.out.println("실제 해쉬코드 값 : ");
		System.out.println("str1 객체의 실제 해쉬코드 : " + System.identityHashCode(str1));
		System.out.println("str2 객체의 실제 해쉬코드 : " + System.identityHashCode(str2));
		
		//문제 : h1과 h2는 같은 객체다. 출력 되도록 프로그램 작성하기 -> equals(), hashCode() 오버라이딩 해주기.
		if((h1.equals(h2)) && (h1.hashCode() == h2.hashCode())) {
			System.out.println("h1과 h2는 같은 객체다.");  //논리적으로
		}
		
	}
}