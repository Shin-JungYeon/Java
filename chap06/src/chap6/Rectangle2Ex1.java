package chap6;
/*
 * ���簢�� Ŭ������ �̿��� ������ ����
 */
class Rectangle2 {
	int width, height, serialno;
	static int cnt;
	
	Rectangle2(int w, int h) {
		width = w;
		height = h;
		serialno = ++cnt;
	}
	
	void area() {
		System.out.print(serialno + "�� �簢���� ���� : " + width*height + "\t");
	}
	void length() {
		System.out.println(serialno + "�� �簢���� �ѷ� : " + (width+height)*2);
	}
	boolean isSquare() {
		return width == height;
	}
}
public class Rectangle2Ex1 {
	public static void main(String[] args) {
		Rectangle2[] rarr = new Rectangle2[3];
		rarr[0] = new Rectangle2(10, 10);
		rarr[1] = new Rectangle2(15, 20);
		rarr[2] = new Rectangle2(20, 5);
		for(Rectangle2 r : rarr) {
			r.area();
			r.length();
			if(r.isSquare()) {
				System.out.println(r.serialno + "�� �簢���� ���簢�� �Դϴ�.");
			} else {
				System.out.println(r.serialno + "�� �簢���� ���簢�� �Դϴ�.");
			}
			System.out.println();
		}
		
	}
}
