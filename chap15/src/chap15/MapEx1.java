package chap15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map 인터페이스 : (key, value) 쌍으로 모인 객체들의 집합. (key : 객체를 구별하는 고유 값)
 *              추가 시 동일한 키가 입력되면, 기존의 내용이 변경된다. key는 절대 중복 불가.
 * (-> 파이썬에서의 Dictionary)
 * 
 * 구현 클래스 : HashMap : Hash -> 순서 모름.
 * 			 Hashtable : Collection 이전 클래스임.(like Vector), HashMap과 기능이 유사함. 모든 메서드가 동기화 되어 있음.(Thread에 대해서 safe 하다.)
 * 			 TreeMap : 메서드가 동기화 되어 있지 않음.(Thread에 대해서 unsafe 하다.)
 */
public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] names = {"홍길동", "김삿갓", "이몽룡", "임꺽정", "김삿갓"};
		int[] nums = {1234, 4567, 2350, 9870, 3456};
		for(int i= 0; i<names.length; i++) {
			map.put(names[i], nums[i]);
			//add() 메서드 아닌 put() 메서드로 입력, 김삿갓=4567 에서 김삿갓이 key, 번호가 객체(value) -> 김삿갓이 중복되므로 객체의 값만 바꿈(최종값으로 변경 됨).(4567 -> 3456)
		}
		System.out.println(map);
		System.out.println();
		
		//키 값을 주고 객체를 리턴 : get(key)
		System.out.println("김삿갓의 전화번호=" + map.get("김삿갓"));  //key는 유일하지만 value는 유일하지 않음 -> value를 이용해서 key를 얻을 순 없음.
		System.out.println("홍길동의 전화번호=" + map.get("홍길동"));
		System.out.println("성춘향의 전화번호=" + map.get("성춘향"));  //없는 값을 찾을 땐 null 리턴
		System.out.println();
		
		//map에서 key들만 조회하기 : keySet()
		Set<String> keys = map.keySet();  //key 목록은 중복이 될 수 없으므로 Set 타입으로 저장.
		for(String k : keys) {
			System.out.println(k + "=" + map.get(k));
		}
		System.out.println();
		
		//map에서 value(객체)들만 조회하기 : values()
		Collection<Integer> values = map.values();  //중복 가능(Set 아님), 순서 상관 없음(key에 따라 결정)(List 아님). 단순히 객체들만 모아 놓음 -> Collection 타입
		for(Integer v : values) {
			System.out.println(v);  //value를 가지고 key를 찾아올 순 없으므로 단순히 value값들만 가져옴.
		}
		System.out.println();
		
		//map 에서 (key, value)의 쌍인 객체로 조회하기
		Set<Map.Entry<String, Integer>> entry = map.entrySet();  //key값을 가져오기 때문에 중복 불가 -> Set
		for(Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + "=" + m.getValue());
			System.out.println(m);  //toString 메서드 오버라이딩 되어 있어서 윗줄과 같은 결과 리턴, 따로따로가 아니라 함께.
		}
		System.out.println();
	}
}
