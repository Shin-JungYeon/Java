package chap15;

import java.util.List;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

/*
 * Iterator 인터페이스 : 조회 전용 객체. 반복자. -> 처음부터 끝까지 객체를 하나하나 읽어냄.
 *   Collection 객체는 Iterator 객체로 변환이 가능하다. -> iterator() 메서드를 이용
 *   메서드
 *     1. boolean hasNext() : 조회 대상 객체 존재 유(true)/무(false) 리턴.
 *     2. Object next()		: 조회하여 객체 리턴.
 *     3. void remove()	: 조회된 객체를 제거. next() 이후에 사용 가능.
 *     
 * Enumeration 인터페이스 : Iterator의 구버전. Collection 프레임워크 이전에 사용되던 반복자. Vector(List 객체), Hashtable(Map 객체) 클래스에서만 사용 가능.
 *   메서드
 *     1. boolean hasNextElement() : 조회 대상 객체 존재 유(true)/무(false) 리턴.
 *     2. Object nextElement()	   : 조회하여 객체 리턴.
 *     remove() 메서드는 존재하지 않음.
 */
public class IteratorEx1 {
	public static void main(String[] args) {
		Iterator it = null;
		List list = new ArrayList();
		Set set = new HashSet();
		for(int i=1; i<=5; i++) {
			list.add(i*10);
			set.add(i*100);
		}
		it = list.iterator();  //List 객체를 Iterator 객체로 변환
		print(it);
		it = set.iterator();  //Set 객체를 Iterator 객체로 변환
		print(it);
		System.out.println(list);  //print() 메서드로 전부 remove 해서 남은 내용이 없음.
		System.out.println(set);
		System.out.println();
		
		Vector vlist = new Vector();
		for(int i=1; i<=5; i++) {
			vlist.add(i*10);
		}
		System.out.println("Enumeration 반복자 연습");
		Enumeration e = vlist.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		e = vlist.elements();
		System.out.println(e.nextElement());  //끝까지 읽어낸 후 다시 처음으로 돌아가고 싶으면 객체 다시 불러와야 함.
		it = vlist.iterator();  //Vector는 List객체임. -> Iteration 객체로 변환 가능. 
		
	}
	private static void print(Iterator it) {
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
	}
}
