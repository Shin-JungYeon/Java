package chap15;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet 객체에 저장할 요소(객체)는 반드시 Comparable 인터페이스를 구현해야 한다.
 * 
 * 정렬에 관련된 인터페이스 -> 추상메서드 존재
 *   Comparable	->	compareTo(Object)		: 객체별 기본 정렬방식을 지정.
 *   Comparator	->	compare(Object, Object)	: 정렬 방식을 따로 지정.
 */
class Phone implements Comparable {  //Comparable 인터페이스 안에는 compareTo() 추상메서드 존재 -> 정렬 방식을 알려줘야 함.
	int number;
	String model;
	Phone(int number, String model){
		this.number = number;
		this.model = model;
	}
	@Override
	public String toString() {
		return "[number=" + number + ", model=" + model + "]";
	}
	
	//전화번호 순으로 정렬 : 
	@Override
	public int compareTo(Object o) {  //결과 : 양수, this가 o객체보다 뒤 쪽 / 음수, this가 o객체보다 앞 쪽
		Phone p = (Phone)o;
		return number - p.number;  //번호를 기준으로 오름차순으로 정렬. -> 기본정렬방식
	}
}
public class SetEx4 {
	public static void main(String[] args) {
		TreeSet<Phone> set = new TreeSet<Phone>();
		set.add(new Phone(1234, "삼성"));  //ClassCastException, 정렬 때문에 TreeSet 객체에는 아무 자료형이나 넣을 수 없다.
		set.add(new Phone(5678, "LG"));
		set.add(new Phone(2345, "애플"));
		System.out.println("전화번호 순으로 정렬하기.");
		for(Phone p : set) {
			System.out.println(p);
		}
		System.out.println();
		
		System.out.println("전화번호의 역순으로 정렬하기.");
		TreeSet<Phone> set2 = new TreeSet<Phone>(Comparator.reverseOrder());  //기본정렬방식의 역순으로 정렬.
		set2.add(new Phone(1234, "삼성"));
		set2.add(new Phone(5678, "LG"));
		set2.add(new Phone(2345, "애플"));
		for(Phone p : set2) {
			System.out.println(p);
		}
		System.out.println();
		
		System.out.println("모델의 오름차순으로 정렬하기.");
//		TreeSet<Phone> set3 = new TreeSet<Phone>(new ModelAsc());  //class를 새로 만들어서 그 안에서 작성하는 법.
		TreeSet<Phone> set3 = new TreeSet<Phone>(new Comparator<Phone>() {  //내부클래스로 작성하는 법
			@Override
			public int compare(Phone p1, Phone p2) {
				return p1.model.compareTo(p2.model);  //현재 있는 객체들 모두와 값 비교 해서 정렬. p1이 뭐고 p2가 뭐고 알 필요 없어 프로그램이 알아서 해주는 것임.
			}
		});
		set3.add(new Phone(1234, "삼성"));
		set3.add(new Phone(5678, "엘지"));
		set3.add(new Phone(2345, "애플"));
		for(Phone p : set3) {
			System.out.println(p);
		}
		System.out.println();
	}
}
class ModelAsc implements Comparator<Phone> {

	@Override
	public int compare(Phone p1, Phone p2) {
		return p1.model.compareTo(p2.model);
	}
	
}