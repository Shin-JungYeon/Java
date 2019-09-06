package chap15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 1. HashMap ��ü�� (�����̸�, ������) ������ �����ϱ�.
 *    (���ѹα�,����), (ĳ����,��Ÿ��), (����,����), (������,����)
 * 2. ȭ�鿡�� �����̸��� �Է¹޾Ƽ�, �Է¹��� ������ ������ ����ϱ�.
 *    -> ��ϵ��� ���� ������ ��� "������ ��ϵ� ���� �ƴմϴ�." ����ϱ�.
 * 3. 2���� ��쿡�� ��ϵ� ���� �ƴ� ���, map��ü�� ����� ������ ����ϰ�, �ٽ� ���� ��ȸ�� �� �� �ֵ��� �ݺ������� ó���ϱ�.
 *    ���� ���� �̸��� "��" ������ �ԷµǸ� ���� ��ϵ� ������ ������ for���� �̿��Ͽ� ����ϰ� ���α׷� �����ϱ�.
 * 4. ��ϵ� ���� ����, ������ �� �ֵ��� �ڵ��ϱ�.
 */
public class Exam6 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		//1.
//		String[] country = {"���ѹα�", "ĳ����", "����", "������"};
//		String[] capital = {"����", "��Ÿ��", "����", "����"};
//		for(int i=0; i<country.length; i++) {
//			map.put(country[i], capital[i]);
//		}
		map.put("���ѹα�", "����");
		map.put("ĳ����", "��Ÿ��");
		map.put("����", "����");
		map.put("������", "����");  //�ϳ��ϳ� �־��൵ ��.
		System.out.println(map);
		
		//2.
//		System.out.println("���� �̸��� �Է��ϼ���.");
//		Scanner scan = new Scanner(System.in);
//		String c = scan.next();
//		if(map.get(c)!=null) {
//			System.out.println(c + "�� ������ " + map.get(c) + "�Դϴ�.");
//		} else {
//			System.out.println("������ ��ϵ� ���� �ƴմϴ�.");
//		}
		
		//3.
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("������ ��ȸ�� ���� �̸��� �Է��ϼ���.");
			String input = scan.next();
			if(input.equals("��")) {
				break;
			}
			
			if(map.get(input)==null) {
				System.out.println("��ϵ� ���� �ƴմϴ�. ������ ����ϼ���.");
				System.out.println("�Է��� ������ ������ �Է��ϼ���.");
				String cap = scan.next();
				map.put(input, cap);
				continue;
			} else {  //map.get(c) == null -> key���� �ش��ϴ� value �� ����.
				System.out.println(input + "�� ������ " + map.get(input) + "�Դϴ�.");
				
				System.out.println("��ϵ� ���� ���� �Ǵ� �����ϰڽ��ϴ�??(����(U)/����(D))");
				String ud = scan.next();
				if(ud.equalsIgnoreCase("u")) {
					System.out.println("������ �����̸��� ����ϼ���.");
					String cap = scan.nextLine();
					map.put(input, cap);  //�߰����ֱ⸸ �ϸ� ���� ������ ����.
				} else if(ud.equalsIgnoreCase("d")) {
					map.remove(input);  //remove() �޼��� �̿��ؼ� (key, value)�� ����.
					System.out.println(input + "���� �����߽��ϴ�.");
				}
			}
		}
		
		for(String k : map.keySet()) {  //�� ����� �� ���� ���.
			System.out.println(k + "�� ���� : " + map.get(k));
		}
		
//		Set<Entry<String, String>> entry = map.entrySet();
//		for(Map.Entry<String, String> m : map.entrySet()) {  //map.entrySet() �� �ٷ� �Է��ص� ��.
//			System.out.println(m.getKey() + "�� ���� : " + m.getValue());
//		}

	}
}