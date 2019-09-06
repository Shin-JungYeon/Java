package chap6;
/*
 * 2. (1)��(Circle) Ŭ���� ����
 * �� ������� :
 * ������r, ����x��ǥ, ����y��ǥ, ���� ��ȣ no, ���� ��ȣ�� ���������ִ� count (static����)
 * �� ��� �޼ҵ�
 * a. area : ���� ���̸� ����ϴ� �޼ҵ�. Math.PI ��� ���
 * b. length : ���� �ѷ��� ����ϴ� �޼ҵ�. Math.PI ��� ���
 * c. toString : ���� �߽����� �������� ����ϴ� �޼ҵ�
 * 
 * (2)���� Ŭ����(CircleEx) ����
 * - �� ��ü���� ������ ����
 * - �� ���� ��ȣ, ������, x��ǥ, y��ǥ�� ����ϱ� 
 */
class Circle {
	int radius, xaxis, yaxis, no;
	static int cnt;
	double area(int r) {
		return ((Math.PI)*r*r);
		//return (((Math.PI)*radius*radius)+0.005)-(((Math.PI)*r*r)+0.005)%0.01;
	}
	double length(int r) {
		return (2*(Math.PI)*r);
		//return ((2*(Math.PI)*r)+0.005)-((2*(Math.PI)*r)+0.005)%0.01;
	}
	public String toString() {
		return  no + "�� ��\n" + "�߽����� ��ǥ : " + "(" + xaxis + ", " + yaxis + ")\t" + "������ : " + radius ;
	}
}
public class HW2_CircleEx {
	public static void main(String[] args) {
		System.out.printf("%X\n", 15);  //16���� ���
		System.out.printf("%o\n", 15);  //8���� ���
		System.out.printf("%3d%3d\n", 5, 5);  //10������ 3�ڸ��� ���
		
		Circle[] cir = new Circle[3];
		
			cir[0] = new Circle();
			cir[0].radius = 3;
			cir[0].xaxis = 2;
			cir[0].yaxis = 4;
			cir[0].no = ++Circle.cnt;
			
			cir[1] = new Circle();
			cir[1].radius = 1;
			cir[1].xaxis = 3;
			cir[1].yaxis = 5;
			cir[1].no = ++Circle.cnt;
			
			cir[2] = new Circle();
			cir[2].radius = 4;
			cir[2].xaxis = 4;
			cir[2].yaxis = 3;
			cir[2].no = ++Circle.cnt;
			
			for(Circle c : cir) {
				System.out.println(c);
			}
			
			System.out.println();
			for(int i=0; i<cir.length; i++) {
				System.out.print(cir[i].no + "�� ��\n���� : " + cir[i].area(cir[i].radius));
				System.out.println("\t�ѷ� : " + cir[i].length(cir[i].radius));
				System.out.println(String.format("%.2f", cir[i].area(cir[i].radius)));
			}
			
			
			System.out.println();
			for(int i=0; i<cir.length; i++) {
				System.out.print(cir[i].no + "�� ��\n���� : " + String.format("%.2f", cir[i].area(cir[i].radius)));
				System.out.println("\t�ѷ� : " + String.format("%.2f", cir[i].length(cir[i].radius)));
			}
			/*
			 * String.format("%.2f, area())  ������ ���信 �´� ���ڿ��� �ٲ���.
			 * %.2f :   % : ������������
			 *        .2f : �Ҽ��� ���� 2�ڸ��� ��� ����, �Ҽ��� ���� 3�ڸ����� �ݿø� ��.
			 */
			
		
	}
}
