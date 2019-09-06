package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Properties;

/*
 * Properties Ŭ���� -> Hashtable�� Map ��ü�̱� ������ Properties Ŭ������ Map ��ü��. (java project -> new -> file)
 *   1. Hashtable�� ���� Ŭ����
 *   2. ���׸� ǥ���� �� ��. -> Ű, ��ü�� ��� String�� Ŭ����.
 */
public class MapEx3 {
	public static void main(String[] args) throws IOException {
		Properties pr = new Properties();
		//a.properties ���� �б����� ����.
		FileInputStream fis = new FileInputStream("a.properties");  //�ѱ��� �����ڵ�� ���� ��.
		pr.load(fis);  //���Ͽ� �ִ� ������ Map��ü�� �Ѳ����� �ε�����. (key)=(value)
		System.out.println(pr);
		pr.list(System.out);
		System.out.println();
		
		//key�鸸 ��ȸ�ؼ� ȭ�鿡 ����ϱ�. : keySet()
		System.out.println("keySet()�� �̿��Ͽ� ��ȸ�ϱ�");
		for(Object k : pr.keySet()) {
			System.out.println(k + "=" + pr.get(k));
		}
		System.out.println();
		
		//value�鸸 ��ȸ�ؼ� ȭ�鿡 ����ϱ�. : values()
		System.out.println("values()�� �̿��Ͽ� ��ȸ�ϱ�");
		for(Object v : pr.values()) {
			System.out.println(v);
		}
		System.out.println();
		
		//(key, value)���� ��ȸ�Ͽ� ȭ�鿡 ����ϱ�. : entrySet()
		System.out.println("entrySet()�� �̿��Ͽ� ��ȸ�ϱ�");
		for(Object e : pr.entrySet()) {
			Map.Entry en = (Map.Entry) e;
			System.out.println(e);
		}
		
	}
}
