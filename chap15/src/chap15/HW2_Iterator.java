package chap15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 2. 다음 keys , values , entry 객체를 Iterator 객체로 변경하여 출력하기.
 * 
 * [결과]
 * 김삿갓=4567
 * 홍길동=1234
 * 이몽룡=2350
 * 임꺽정=9870
 * 
 * 4567
 * 1234
 * 2350
 * 9870
 * 
 * 김삿갓=4567
 * 홍길동=1234
 * 이몽룡=2350
 * 임꺽정=9870
 */
public class HW2_Iterator {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		String[] names = {"홍길동", "김삿갓", "이몽룡", "임꺽정"};
		int[] nums = {1234, 4567, 2350, 9870};
		for(int i=0;i<names.length;i++) {
			map.put(names[i], nums[i]);
		}
		Set<String> keys = map.keySet();
		Collection<Integer> values = map.values();  //중복 가능(Set 아님), 순서 상관 없음(key에 따라 결정)(List 아님). 단순히 객체들만 모아 놓음 -> Collection 타입
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		
		Iterator<String> itKeys = keys.iterator();  //Set -> Iterator
		Iterator<Integer> itValues = values.iterator();  //Collection -> Iterator
		Iterator<Map.Entry<String, Integer>> itEntry = entry.iterator();  //Set<Map.Entry> -> Iterator
		
		while(itKeys.hasNext()) {
//			System.out.println(itKeys.next() + "=" + itValues.next());
			String k = itKeys.next();  //이 줄 사용하려면 Iterator 옆에 제네릭 표현 필요. -> String이라는 것을 알려줘야해. 아니면 명시적형변환 필요.
			System.out.println(k + "=" + map.get(k));  //map.get()메서드 이용하면 다음 itValues.next()할 때 객체 다시 가져올 필요 없음.
		}
		System.out.println();
		
//		itValues = values.iterator();  //위에서 map.get()메서드 이용하면 itValues.next()할 때 객체 다시 가져올 필요 없음.
		while(itValues.hasNext()) {
			System.out.println(itValues.next());
		}
		System.out.println();
		
		while(itEntry.hasNext()) {
			System.out.println(itEntry.next());
		}
		
	}
}
