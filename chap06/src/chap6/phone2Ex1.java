package chap6;
class Phone2 {
	String color;
	boolean power;
	String no;
	int serialno;
	static int cnt;  //기본값으로 초기화 됨.
	void power() {
		power = !power;
	}
	void send(String no) {
		System.out.println(no + "로 전화 거는 중~");
	}
	void receive(String no) {
		System.out.println(no + "에서 전화를 받는 중~");
	}
	public String toString() {
		return serialno + " : " + color + ", " + no;
	}
}
public class phone2Ex1 {
	public static void main(String[] args) {
		Phone2[] p = new Phone2[3];  //Phone2 객체를 참조할 참조변수 3개 생성(객체 3개가 아님)
		for(int i=0; i<p.length; i++) {
			p[i] = new Phone2();
			p[i].color = "노랑";
			p[i].no = "미정";
			p[i].serialno = ++Phone2.cnt;
//			p[i].serialno = ++p[i].cnt;  //가능은 하지만... cnt 앞에 static 안붙으면 참조변수마다 각자의 cnt 변수를 가져옴. 이 값은 모두 1이 됨. 의미를 잘 알고 사용해야 함.
		}
//		System.out.println(Phone2.cnt); //3
		for(Phone2 p2 : p) {
			System.out.println(p2);
		}
		
		
	}
}
