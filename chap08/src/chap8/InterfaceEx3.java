package chap8;
/*
 * 매개변수의 자료형으로 인터페이스 자료형을 사용하기
 *  : 주로 허용의 기능을 가진다. (접근해도 되는지)
 */
interface Repairable {}  //멤버가 없음. 자료형만을 주기위함.

class Unit2 {
	int hp;
	final int MAX_HP;
	Unit2(int hp) {
		this.hp = hp;
		MAX_HP = hp;
	}
}

class AirUnit extends Unit2 {
	AirUnit(int hp) {
		super(hp);
	}
}
class GroundUnit extends Unit2 {
	GroundUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
	}
	public String toString() {
		return "Tank";
	}
}
class DropShip extends AirUnit implements Repairable {
	DropShip() {
		super(125);
	}
	public String toString() {
		return "DropShip";
	}
}
class Marine extends GroundUnit {
	Marine() {
		super(40);
	}
	public String toString() {
		return "Marine";
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
	}
	void repair (Repairable r) {   //모든 Unit2을 수리할 수 있는 것이 아님. 인터페이스를 사용해서 수리가능한 것들 오버로딩해주기.
		if (r instanceof Repairable) {  //(r instanceof Unit2) 로 작성해도 됨(원래는 이게 맞음), 애초에 입력받은 매개변수 자료형이 Repairable 이기 때문에
			Unit2 u = (Unit2)r;
//			r.hp = r.MAX_HP;  //Repairable 타입으로는 hp, MAX_HP에  접근이 안되기 때문에 Unit2로 형변환 해준것임.
			u.hp = u.MAX_HP;
			System.out.println(r + " 수리 완료");
		}
	}
	public String toString() {
		return "SCV";
	}
}
public class InterfaceEx3 {
	public static void main(String[] args) {
		Tank t = new Tank();
		DropShip d = new DropShip();
		Marine m = new Marine();
		SCV s = new SCV();
		s.repair(t); s.repair(d);  //Repairable 인터페이스를 구현했기 때문에 Repairable 자료형으로 형변환 가능.
//		s.repair(m);  //Repairable 인터페이스를 구현하지 않았기 때문에 Repairable 객체로 형변환 될 수 없음.
	}
}
