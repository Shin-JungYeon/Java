package chap15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 2. ���� keys , values , entry ��ü�� Iterator ��ü�� �����Ͽ� ����ϱ�.
 * 
 * [���]
 * ���=4567
 * ȫ�浿=1234
 * �̸���=2350
 * �Ӳ���=9870
 * 
 * 4567
 * 1234
 * 2350
 * 9870
 * 
 * ���=4567
 * ȫ�浿=1234
 * �̸���=2350
 * �Ӳ���=9870
 */
public class HW2_Iterator {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		String[] names = {"ȫ�浿", "���", "�̸���", "�Ӳ���"};
		int[] nums = {1234, 4567, 2350, 9870};
		for(int i=0;i<names.length;i++) {
			map.put(names[i], nums[i]);
		}
		Set<String> keys = map.keySet();
		Collection<Integer> values = map.values();  //�ߺ� ����(Set �ƴ�), ���� ��� ����(key�� ���� ����)(List �ƴ�). �ܼ��� ��ü�鸸 ��� ���� -> Collection Ÿ��
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		
		Iterator<String> itKeys = keys.iterator();  //Set -> Iterator
		Iterator<Integer> itValues = values.iterator();  //Collection -> Iterator
		Iterator<Map.Entry<String, Integer>> itEntry = entry.iterator();  //Set<Map.Entry> -> Iterator
		
		while(itKeys.hasNext()) {
//			System.out.println(itKeys.next() + "=" + itValues.next());
			String k = itKeys.next();  //�� �� ����Ϸ��� Iterator ���� ���׸� ǥ�� �ʿ�. -> String�̶�� ���� �˷������. �ƴϸ� ���������ȯ �ʿ�.
			System.out.println(k + "=" + map.get(k));  //map.get()�޼��� �̿��ϸ� ���� itValues.next()�� �� ��ü �ٽ� ������ �ʿ� ����.
		}
		System.out.println();
		
//		itValues = values.iterator();  //������ map.get()�޼��� �̿��ϸ� itValues.next()�� �� ��ü �ٽ� ������ �ʿ� ����.
		while(itValues.hasNext()) {
			System.out.println(itValues.next());
		}
		System.out.println();
		
		while(itEntry.hasNext()) {
			System.out.println(itEntry.next());
		}
		
	}
}
