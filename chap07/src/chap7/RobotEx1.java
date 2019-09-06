package chap7;
/*
 * Robot �� �������� DancRobot, SingRobot, DrawRobot �� �ִ�.
 * Robot Ŭ������ action �޼��带 ����� ������.
 * DancRobot �� ���� ���� �߰�,
 * SingRobot �� ���� �뷡�� �θ���,
 * DrawRobot �� ���� �׸��� �׸���.
 * 
 * Robot Ŭ������ ������ ���� Robot ������ �޴´�.
 */
abstract class Robot {
	String type;
	Robot(String type) {
		this.type = type;
	}
	abstract String action();
}
class DanceRobot extends Robot {
	
	DanceRobot() {
		super("DenceRobot");
	}
	String action() {
		return "���� ��ϴ�.";
	}
}
class SingRobot extends Robot{
	SingRobot() {
		super("SingRobot");
	}
	String action() {
		return "�뷡�� �θ��ϴ�.";
	}
}
class DrawRobot extends Robot {
	DrawRobot() {
		super("DrawRobot");
	}
	String action() {
		return "�׸��� �׸��ϴ�.";
	}
}
public class RobotEx1 {
	public static void main(String[] args) {
		Robot[] r = new Robot[3];
		r[0] = new DanceRobot();
		r[1] = new SingRobot();
		r[2] = new DrawRobot();
		for(Robot rb : r) {
			System.out.println(rb.type + "�� " + rb.action());
		}
	}
}
