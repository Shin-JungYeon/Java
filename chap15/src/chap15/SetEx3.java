package chap15;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * TreeSet : 중복불가, 정렬 순서를 가지고 있는 Set -> 정렬의 방식을 정하는 것이 중요.
 * 			 Set 인터페이스의 구현 클래스 -> TreeSet 객체는 Set 객체임.
 * 			   -> 사실 Set을 직접 구현한 것이 아니라 Set 인터페이스의 하위 객체인 SortedSet 인터페이스를 구현한 것.
 */
public class SetEx3 {
	public static void main(String[] args) {
//		TreeSet<String> set = new TreeSet<String>();
//		Set<String> set = new TreeSet<String>();  //subSet()은 Set의 멤버가 아님. -> HashSet(Set의 하위 객체)에서도 사용 불가.
		SortedSet<String> set = new TreeSet<String>();  //subSet()은 SortedSet의 멤버임.
		String from = "bat";
		String to = "d";
		
		set.add("abc"); set.add("bat"); set.add("azz");
		set.add("car"); set.add("Car"); set.add("disc");
		set.add("dance"); set.add("dZZZZ"); set.add("dzzzz");
		set.add("fan");
		
		System.out.println(set);  //대문자 -> 소문자 : 기본정렬 방식
		System.out.println("from:" + from + ", to:" + to);
		System.out.println(set.subSet(from, to));  //to는 포함 되지 않음.
		System.out.println("from:" + from + ", to:" + to + "zzzz");
		System.out.println(set.subSet(from, to + "zzzz"));
		System.out.println();
		
		/*
		 *  Comparator 인터페이스 객체 -> 내부 클래스로 설정해야 함. Comparator<> c = new Comparator<>() {};
		 *   : compare 추상메서드 존재
		 * 
		 * 기본정렬 방식(오름차순)을 변경할 때 사용되는 객체.
		 */
		
		//대소문자 구분 없이 오름차순 정렬하기.
		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {  //리턴값 int, 대소문자 상관없이 (s2-s1)해줌. -> 결과 양수면 s2가 뒤로 감.(음수면 앞으로)
				return s1.compareToIgnoreCase(s2);
			}
		};  // ; 필수
		Set<String> set2 = new TreeSet<String>(c);  //괄호 안에 c없으면 대소문자 구분함. compareToIgnoreCase(s2) 가 아니라 compareTo(s2)임.
		set2.add("car"); set2.add("Care"); set2.add("abc");
		System.out.println("set2=" + set2);
		
		//대소문자 구분 없이 내림차순 정렬하기.
		Set<String> set3 = new TreeSet<String>(c.reversed());
		//c.reversed() : 뒤집기. (jdk8.0 이후에 가능 -> default메서드(구현부 존재, 인스턴스멤버)로 들어가 있슴.)
		set3.add("car"); set3.add("Care"); set3.add("abc");
		System.out.println("set3=" + set3);
		
		//내림차순 정렬하기.
		Set<String> set4 = new TreeSet<String>(Comparator.reverseOrder());
		//Comparator.reverseOrder() : 대소문자 구분, 내림차순. (jdk8.0 이후에 가능 -> static메서드(구현부 존재, 클래스멤버)로 들어가 있슴.)
		set4.add("car"); set4.add("Care"); set4.add("abc");
		System.out.println("set4=" + set4);
	}
}
