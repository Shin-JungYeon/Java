package chap15;

import java.util.HashSet;
import java.util.Set;

/*
 * ��ü�� �ߺ��� �Ǵ��ϴ� ����.
 *   equals(Object) : �� ��ü�� equals�� ����� true �̰�
 *   hashCode		: hashCode()�� ���ϰ��� ���� ���
 *                     -> �� ���� ��ü�� ������ ������ ������.
 *                     -> add �޼��尡 �ڵ����� �˻���.
 */
class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [neme=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return name.hashCode() + age;  //String ��ü�� ������ ������ ���� �ؽ��ڵ尪�� ����.
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
//			return name == p.name && age == p.age;
			return name.equals(p.name) && age == p.age;  //String ��ü�� equals ������ �� �ٸ� ��ü���� ������ ������ true ����.
		}
		return false;
	}
}
public class SetEx2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		set.add(new String("ȫ�浿"));
		set.add(new String("ȫ�浿"));  //new�� ���ο� ��ü�� ���������  String��ü�� ������ ������ ���������� ���.
		set.add(new Person("���", 30));
		set.add(new Person("���", 30));
		System.out.println(set);
	}
}
