package chap8;
/*
 * �Ű������� �ڷ������� �������̽� �ڷ����� ����ϱ�
 *  : �ַ� ����� ����� ������. (�����ص� �Ǵ���)
 */
interface Repairable {}  //����� ����. �ڷ������� �ֱ�����.

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
	void repair (Repairable r) {   //��� Unit2�� ������ �� �ִ� ���� �ƴ�. �������̽��� ����ؼ� ���������� �͵� �����ε����ֱ�.
		if (r instanceof Repairable) {  //(r instanceof Unit2) �� �ۼ��ص� ��(������ �̰� ����), ���ʿ� �Է¹��� �Ű����� �ڷ����� Repairable �̱� ������
			Unit2 u = (Unit2)r;
//			r.hp = r.MAX_HP;  //Repairable Ÿ�����δ� hp, MAX_HP��  ������ �ȵǱ� ������ Unit2�� ����ȯ ���ذ���.
			u.hp = u.MAX_HP;
			System.out.println(r + " ���� �Ϸ�");
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
		s.repair(t); s.repair(d);  //Repairable �������̽��� �����߱� ������ Repairable �ڷ������� ����ȯ ����.
//		s.repair(m);  //Repairable �������̽��� �������� �ʾұ� ������ Repairable ��ü�� ����ȯ �� �� ����.
	}
}
