package chap6;
/*
 * 1. (1)동물클래스(Animal) 구현하기
 *       멤버변수 : 이름(name), 나이(age)
 *       멤버메서드: eat() 
 *       기능 :" 맛있게 얌얌 "  출력함
 *    (2)구동클래스(AnimalTest.java) 구현하기
 *
 * [결과]
 * 
 * 원숭이:26살
 * 맛있게 얌얌
 */
class Animal {
	String name;
	int age;
	void eat() {
		System.out.println(name + ":" + age + "살\n" + "맛있게 얌얌");
	}
}
public class HW1_AnimalTest {
	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.name = "원숭이";
		ani.age = 26;
		ani.eat();
	}
}
