package chap15;

import java.util.HashSet;
import java.util.Set;

/*
 * 객체의 중복을 판단하는 기준.
 *   equals(Object) : 두 객체의 equals한 결과가 true 이고
 *   hashCode		: hashCode()의 리턴값이 같은 경우
 *                     -> 두 개의 객체를 동일한 것으로 간주함.
 *                     -> add 메서드가 자동으로 검사함.
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
		return name.hashCode() + age;  //String 객체는 내용이 같으면 같은 해쉬코드값을 가짐.
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
//			return name == p.name && age == p.age;
			return name.equals(p.name) && age == p.age;  //String 객체는 equals 비교했을 때 다른 객체여도 내용이 같으면 true 리턴.
		}
		return false;
	}
}
public class SetEx2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		set.add(new String("홍길동"));
		set.add(new String("홍길동"));  //new로 새로운 객체를 만들었지만  String객체는 내용이 같으면 같은것으로 취급.
		set.add(new Person("김삿갓", 30));
		set.add(new Person("김삿갓", 30));
		System.out.println(set);
	}
}
