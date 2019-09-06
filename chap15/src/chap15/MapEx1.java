package chap15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map �������̽� : (key, value) ������ ���� ��ü���� ����. (key : ��ü�� �����ϴ� ���� ��)
 *              �߰� �� ������ Ű�� �ԷµǸ�, ������ ������ ����ȴ�. key�� ���� �ߺ� �Ұ�.
 * (-> ���̽㿡���� Dictionary)
 * 
 * ���� Ŭ���� : HashMap : Hash -> ���� ��.
 * 			 Hashtable : Collection ���� Ŭ������.(like Vector), HashMap�� ����� ������. ��� �޼��尡 ����ȭ �Ǿ� ����.(Thread�� ���ؼ� safe �ϴ�.)
 * 			 TreeMap : �޼��尡 ����ȭ �Ǿ� ���� ����.(Thread�� ���ؼ� unsafe �ϴ�.)
 */
public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] names = {"ȫ�浿", "���", "�̸���", "�Ӳ���", "���"};
		int[] nums = {1234, 4567, 2350, 9870, 3456};
		for(int i= 0; i<names.length; i++) {
			map.put(names[i], nums[i]);
			//add() �޼��� �ƴ� put() �޼���� �Է�, ���=4567 ���� ����� key, ��ȣ�� ��ü(value) -> ����� �ߺ��ǹǷ� ��ü�� ���� �ٲ�(���������� ���� ��).(4567 -> 3456)
		}
		System.out.println(map);
		System.out.println();
		
		//Ű ���� �ְ� ��ü�� ���� : get(key)
		System.out.println("����� ��ȭ��ȣ=" + map.get("���"));  //key�� ���������� value�� �������� ���� -> value�� �̿��ؼ� key�� ���� �� ����.
		System.out.println("ȫ�浿�� ��ȭ��ȣ=" + map.get("ȫ�浿"));
		System.out.println("�������� ��ȭ��ȣ=" + map.get("������"));  //���� ���� ã�� �� null ����
		System.out.println();
		
		//map���� key�鸸 ��ȸ�ϱ� : keySet()
		Set<String> keys = map.keySet();  //key ����� �ߺ��� �� �� �����Ƿ� Set Ÿ������ ����.
		for(String k : keys) {
			System.out.println(k + "=" + map.get(k));
		}
		System.out.println();
		
		//map���� value(��ü)�鸸 ��ȸ�ϱ� : values()
		Collection<Integer> values = map.values();  //�ߺ� ����(Set �ƴ�), ���� ��� ����(key�� ���� ����)(List �ƴ�). �ܼ��� ��ü�鸸 ��� ���� -> Collection Ÿ��
		for(Integer v : values) {
			System.out.println(v);  //value�� ������ key�� ã�ƿ� �� �����Ƿ� �ܼ��� value���鸸 ������.
		}
		System.out.println();
		
		//map ���� (key, value)�� ���� ��ü�� ��ȸ�ϱ�
		Set<Map.Entry<String, Integer>> entry = map.entrySet();  //key���� �������� ������ �ߺ� �Ұ� -> Set
		for(Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + "=" + m.getValue());
			System.out.println(m);  //toString �޼��� �������̵� �Ǿ� �־ ���ٰ� ���� ��� ����, ���ε��ΰ� �ƴ϶� �Բ�.
		}
		System.out.println();
	}
}
