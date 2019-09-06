package chap15;

import java.util.HashSet;
import java.util.Set;

/*
 * Set : Collection 인터페이스의 하위 인터페이스 -> 중복불가.
 *   구현클래스 : HashSet : 순서 모름.(시스템 마음)
 *            TreeSet : 정렬됨.
 *   객체 추가 : boolean add(Object)
 *             -> true : 추가 성공
 *                false : 추가 실패 (중복됐기때문)
 *   순서 유지가 안되기 때문에 인덱스를 통해 객체를 꺼낼 수 없다. -> 개선된 for문은 사용 가능.
 * 
 */
public class SetEx1 {
	public static void main(String[] args) {
		Object[] arr = {"1", 1, "2", "3", "3", "4", "4", "2", "4"};  //정수 1은 Integer로 Boxing돼서 들어감.
		Set<Object> set1 = new HashSet<Object>();
		Set<Object> set2 = new HashSet<Object>();
		Set<Object> set3 = new HashSet<Object>();
		for(int i=0; i<arr.length; i++) {
			if(!set1.add(arr[i])) {
				if(!set2.add(arr[i])) {
					set3.add(arr[i]);
				}
			}
		}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		
		for(Object o : set1) {
			System.out.print(o + " ");
		}
		
	}
}
