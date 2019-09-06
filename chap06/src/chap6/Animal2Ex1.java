package chap6;
/*
 * 구동 클래스가 정상적으로 실행되어 결과가
 * 원숭이:26살 로 출력되도록 Animal2 클래스 구현하기
 */
class Animal2 {
	String name;
	int age;
	Animal2(String n, int a){
		name = n;
		age = a;
	}
	Animal2(String n){
		name = n;
		age = 1;
	}
	Animal2(int a){
		name = "사람";
		age = a;
	}
	void info() {
		System.out.println(name + ":" + age + "살");
	}
}
public class Animal2Ex1 {
	public static void main(String[] args) {
		Animal2 a1 = new Animal2("원숭이", 26);
		a1.info();  //원숭이:26살;
		Animal2 a2 = new Animal2("강아지");
		a2.info();  //강아지:1살
		Animal2 a3 = new Animal2(20);
		a3.info();  //사람:20살
	}
}