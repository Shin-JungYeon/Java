package chap15;

import java.util.List;
import java.util.Vector;

/*
 * Vector 예제 : List 구현 클래스.
 *             Collection 프레임워크 이전에 사용되던 클래스.
 *             List 인터페이스의 메서드와 이전에 사용되던 메서드가 혼재 되어 있음.
 */
public class ListEx2 {
	public static void main(String[] args) {
		Vector<Double> list = new Vector();
		list.add(0.3);
		list.add(Math.PI);  //add() List 에 있는 추상 메서드
		list.addElement(5.0);  //addElement() : Vector 클래스에 있는 멤버. 기능은 같음. List의 멤버가 아니므로 List 타입의 객체는 참조(접금)할 수 없음.
		System.out.println(list);
		double num = 5.0;
		int index = list.indexOf(num);
		if(index<0) System.out.println(num + "은 list에 없는 요소입니다.");
		else System.out.println(num + "의 위치는 " + index + "입니다.");
		if(list.contains(num)) {  //list 안에 num 이라는 요소가 있어? true/false
//			list.removeElement(num);  //num이라는 요소를 지워. remove() 메서드 오버로딩 되어 있음.
			list.remove(num);  //num이라는 요소를 지워. remove() 메서드 오버로딩 되어 있음. num의 자료형이 Integer 이면 인덱스가 우선.
			System.out.println(num + " 삭제 됨.");
		}
		list.remove(0);  //인덱스 0을 지워 -> 남은 요소들이 앞으로 당겨져서 다시 0번째 요소가 생김. remove() 메서드 오버로딩 되어 있음.
		System.out.println(list);
		System.out.println(list.get(0));
		List<Integer> list2 = new Vector<Integer>();
		for(int i=0; i<=5; i++) {
			list2.add(i*10);
		}
		System.out.println(list2.remove(0));
		System.out.println(list2.remove(30));  //자료형이 Integer 이면 인덱스가 우선. -> ArrayIndexOutOfBoundsException 예외 발생.
		System.out.println(list2.remove(new Integer(30)));  //객체로 넣어줘야 함.
		
	}
}
