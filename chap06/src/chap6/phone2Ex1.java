package chap6;
class Phone2 {
	String color;
	boolean power;
	String no;
	int serialno;
	static int cnt;  //�⺻������ �ʱ�ȭ ��.
	void power() {
		power = !power;
	}
	void send(String no) {
		System.out.println(no + "�� ��ȭ �Ŵ� ��~");
	}
	void receive(String no) {
		System.out.println(no + "���� ��ȭ�� �޴� ��~");
	}
	public String toString() {
		return serialno + " : " + color + ", " + no;
	}
}
public class phone2Ex1 {
	public static void main(String[] args) {
		Phone2[] p = new Phone2[3];  //Phone2 ��ü�� ������ �������� 3�� ����(��ü 3���� �ƴ�)
		for(int i=0; i<p.length; i++) {
			p[i] = new Phone2();
			p[i].color = "���";
			p[i].no = "����";
			p[i].serialno = ++Phone2.cnt;
//			p[i].serialno = ++p[i].cnt;  //������ ������... cnt �տ� static �Ⱥ����� ������������ ������ cnt ������ ������. �� ���� ��� 1�� ��. �ǹ̸� �� �˰� ����ؾ� ��.
		}
//		System.out.println(Phone2.cnt); //3
		for(Phone2 p2 : p) {
			System.out.println(p2);
		}
		
		
	}
}
