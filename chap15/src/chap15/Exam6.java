package chap15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 1. HashMap 객체에 (나라이름, 수도명) 쌍으로 저장하기.
 *    (대한민국,서울), (캐나다,오타와), (영국,런던), (스위스,베른)
 * 2. 화면에서 나라이름을 입력받아서, 입력받은 나라의 수도를 출력하기.
 *    -> 등록되지 않은 나라의 경우 "수도가 등록된 나라가 아닙니다." 출력하기.
 * 3. 2번의 경우에서 등록된 나라가 아닌 경우, map객체에 나라와 수도를 등록하고, 다시 수도 조회를 할 수 있도록 반복문으로 처리하기.
 *    만약 나라 이름에 "끝" 내용이 입력되면 현재 등록된 내용을 개선된 for문을 이용하여 출력하고 프로그램 종료하기.
 * 4. 등록된 나라 수정, 삭제할 수 있도록 코딩하기.
 */
public class Exam6 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		//1.
//		String[] country = {"대한민국", "캐나다", "영국", "스위스"};
//		String[] capital = {"서울", "오타와", "런던", "베른"};
//		for(int i=0; i<country.length; i++) {
//			map.put(country[i], capital[i]);
//		}
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");  //하나하나 넣어줘도 됨.
		System.out.println(map);
		
		//2.
//		System.out.println("나라 이릅을 입력하세요.");
//		Scanner scan = new Scanner(System.in);
//		String c = scan.next();
//		if(map.get(c)!=null) {
//			System.out.println(c + "의 수도는 " + map.get(c) + "입니다.");
//		} else {
//			System.out.println("수도가 등록된 나라가 아닙니다.");
//		}
		
		//3.
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("수도를 조회할 나라 이릅을 입력하세요.");
			String input = scan.next();
			if(input.equals("끝")) {
				break;
			}
			
			if(map.get(input)==null) {
				System.out.println("등록된 나라가 아닙니다. 수도를 등록하세요.");
				System.out.println("입력한 나라의 수도를 입력하세요.");
				String cap = scan.next();
				map.put(input, cap);
				continue;
			} else {  //map.get(c) == null -> key값에 해당하는 value 값 없음.
				System.out.println(input + "의 수도는 " + map.get(input) + "입니다.");
				
				System.out.println("등록된 나라를 수정 또는 삭제하겠습니다??(수정(U)/삭제(D))");
				String ud = scan.next();
				if(ud.equalsIgnoreCase("u")) {
					System.out.println("수정할 수도이름을 등록하세요.");
					String cap = scan.nextLine();
					map.put(input, cap);  //추가해주기만 하면 최종 값으로 변경.
				} else if(ud.equalsIgnoreCase("d")) {
					map.remove(input);  //remove() 메서드 이용해서 (key, value)쌍 삭제.
					System.out.println(input + "나라를 삭제했습니다.");
				}
			}
		}
		
		for(String k : map.keySet()) {  //이 방법을 더 많이 사용.
			System.out.println(k + "의 수도 : " + map.get(k));
		}
		
//		Set<Entry<String, String>> entry = map.entrySet();
//		for(Map.Entry<String, String> m : map.entrySet()) {  //map.entrySet() 를 바로 입력해도 됨.
//			System.out.println(m.getKey() + "의 수도 : " + m.getValue());
//		}

	}
}