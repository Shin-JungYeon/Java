package chap8;  //package : 클래스와 인터페이스들의 모임 -> 폴더로 구분(폴더 자체가 패키지는 아님)
/*
 * 인터페이스의 객체 생성하기
 */
interface Action {
	void action();
}
public class InterfaceEx6 {
	public static void main(String[] args) {
//		Action a = new Action();  //인터페이스는 직접 객체화 불가능.
//		Action a = new Action() {};  //추상메서드 없을 때

//		인터페이스 직접 객체화, 이름 없는 내부 클래스(내부 객체) : 한 번 쓰고 버리는 일회용 객체.
		Action a = new Action() {
			@Override  //추상메서드는 반드시 오버라이딩 필요.
			public void action() {
				System.out.println("Action 인터페이스의 객체 내부의 action() 메서드");
			}
		};
		a.action();

		a = new Action() {
			@Override
			public void action() {
				System.out.println("Action 객체로 다른 기능 구현하기");
			}
		};
		a.action();
		
		
	}
}