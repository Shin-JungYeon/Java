package chap6;
/*
 * 2. Circle2 Ŭ���� ����
 *   1) �������
 *      ������, ����x��ǥ, ����y��ǥ, ���� ��ȣ no, ���� ��ȣ�� ���������ִ� count (static����)
 *   2) ������ 3�� 
 *      a. �Ű����� ���� ��ü �����ϸ� ������ 1, �߾��� (1,1) ��ü����
 *      b. �Ű������� 1��(r)�̸� �������� r�̰�  �߾����� (1,1)�� ��ü ����
 *      c. �Ű������� 3��(r, x, y)�̸� ������ r, �߾����� (x,y) �� ��ü ����
 *   3) ��� �޼ҵ�
 *      a. double area : ���� ���̸� ����ϴ� �޼ҵ�      Math.PI
 *      b. double length : ���� �ѷ��� ����ϴ� �޼ҵ�      Math.PI
 *      c. String toString() : ���� ���� ��� ������ ����ϱ� 
 *      
 * ���� Ŭ���� �����
 * 
 * [���]
 * 1����=> ������:1(1,1), ����:3.14, �ѷ�:6.28
 * 2����=> ������:50(1,1), ����:7853.98, �ѷ�:314.16
 * 3����=> ������:100(10,20), ����:31415.93, �ѷ�:628.32
 * 
 * ����ϱ�
 */
class Circle2 {
	int r, x, y, no;
	static int count;
	
	Circle2(int r, int x, int y) {
		this.r = r;
		this.x = x;
		this.y = y;
		no = ++count;
	}
	Circle2(int r) {
		this(r, 1, 1);
	}
	Circle2() {
		this(1, 1, 1);
	}
	double area() {
		return ((Math.PI)*r*r);
	}
	double length() {
		return (2*(Math.PI)*r);
	}
	public String toString() {
		return no + "���� => " + "������ : " + this.r + "(" + this.x + "," + this.y + "),  ���� : "
	           + String.format("%.2f",area()) + ",  �ѷ� : " + String.format("%.2f",length());
	}
}
public class HW2_Circle {

	public static void main(String[] args) {
		 Circle2 c1 = new Circle2();
		 Circle2 c2 = new Circle2(50);
		 Circle2 c3 = new Circle2(100, 10, 20);

		 System.out.println(c1);
		 System.out.println(c2);
		 System.out.println(c3);
		
	}

}
