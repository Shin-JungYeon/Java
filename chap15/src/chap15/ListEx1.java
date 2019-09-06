package chap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * collection : 객체들의 모임, 인터페이스.
 * 
 *   List 예제 : 객체를 추가한 순서를 계속해서 유지함.
 *   		       인덱스 사용 가능함. 가변배열이라고 함.
 *   		       구현 클래스 : ArrayList	: List의 대표 클래스, 모든 메서드가 동기화 되어 있지 않음.(동기화에 대해 unsafe)
 *                       Vector		: ArrayList와 같은 기능의 클래스, 모든 메서드가 동기화 되어 있음.(동기화에 대해 safe)
 *                       LinkedList	: FiFo를 구현한 클래스.
 */
public class ListEx1 {
	public static void main(String[] args) {
		// <Integer> : 제네릭 표현. Integer 객체들만의 모임.
//		List<Integer> list = new ArrayList<Integer>();  //List는 인터페이스임. new List 불가능. 구현 클래스(ArrayList)에 의해서만 객체화 가능.
//		List<Integer> list = new Vector<Integer>();  //구현 클래스(Vector)에 의해서만 객체화 가능.
		List<Integer> list = new LinkedList<Integer>();  //구현 클래스(LinkedList)에 의해서만 객체화 가능.
		list.add(1);	list.add(2);	list.add(5);  //list.add(new Integer(1)); 원래는 이런식으로 작성해야 하지만 자동으로 형변환(Boxing) 해줌.
		list.add(4);	list.add(3);	list.add(1);  //add해준 순서대로 인덱스 자동 부여.
		System.out.println(list);
		
		//인덱스를 이용해서 데이터 불러올 수 있음.
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + "번째 객체 : " + list.get(i));
		}
		
		//개선된 for문도 사용 가능.(모든 컬렉션 객체들은 다 가능.)
		for(Integer i : list) {
			System.out.println(i);
		}
		
		//subList() : 부분 List 객체 구하기.
		List<Integer> list2 = new ArrayList<Integer>(list.subList(1, 4));
		//(1)부터 (4-1)인덱스의 데이터 가져오기. 1, 2, 3 인덱스에 해당하는 객체만 저장.
		//list의 인덱스 1~3 부분을 따로 가져와서 새로운 객체 생성. -> list가 변하는 것과 아무 상관 없음.
		
//		List<Integer> list2 = list.subList(1, 4);
		//새로운 객체를 만든 것이 아니라 list2가 list의 인덱스 1~3 부분만 참조하고 있는 것. 윗줄과 달리 이렇게 list2를 만들면 list값이 바뀜에 따라 같이 바뀜.
		
		System.out.println("sort 이전 list2 : " + list2);
		
		//Collections : 클래스, Collection 객체들(Collection의 하위 인터페이스들을 구현한 클래스의 객체)의 여러 기능을 저장하고 있음.
		//Collection : 인터페이스
		Collections.sort(list);  //list 객체 오름차순 정렬하기. -> 순서 변경.
		System.out.println("sort 이후 list  : " + list);
		System.out.println("sort 이후 list2 : " + list2);
		System.out.println("list 객체 중 최대값 : " + Collections.max(list));
		System.out.println("list 객체 중 최소값 : " + Collections.min(list));
		
		System.out.println("list2 객체 중 최대값 : " + Collections.max(list2));
		System.out.println("list2 객체 중 최대값의 인덱스 : " + list2.indexOf(Collections.max(list2)));
		System.out.println(list2.indexOf(6));  //-1 리턴 : 해당 객체가 없는 경우. -> String과 같음.
	}
}
