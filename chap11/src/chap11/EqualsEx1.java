package chap11;
/*
 * Object 클래스의 equals 메서드 예제 : 내용비교를 위한 기능을 가진 메서드
 *        기본구현 : 동일 객체여부를 리턴 == 연산자의 기능과 동일.
 *                 -> 내용비교를 위해서는 오버라이딩 필요.
 */
class Equal {
	int vlaue;
	Equal(int value) {
		this.vlaue = value;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Equal) {
			Equal e = (Equal)obj;
			return this.vlaue == e.vlaue;  //객체 비교가 아닌 값 비교.
		}
		return false;
	}
}
public class EqualsEx1 {
	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		if(e1 == e2) {
			System.out.println("e1 객체와 e2 객체는 같은 객체다.");  //두 개의 참조변수가 모두 같은 객체를 참조하고 있다.
		} else {
			System.out.println("e1 객체와 e2 객체는 다른 객체다.");  //두 개의 참조변수가 서로 다른 객체를 참조하고 있다.
		}
		if(e1.equals(e2)) {  //원래 : 내용이 아닌 참조하고 있는 객체를 비교. -> 내용 비교하고 싶으면 이 메서드를 오버라이딩 해줘야 함.
			System.out.println("e1 객체와 e2 객체는 같은 내용을 가진 객체다.");  //참조하고 있는 객체 자체는 다를 수 있음.
		} else {
			System.out.println("e1 객체와 e2 객체는 다른 내용을 가진 객체다.");
		}

	}
}
