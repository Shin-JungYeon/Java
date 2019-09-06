package chap6;

import java.util.Scanner;

/*
 * �簢�� Ŭ���� 3���� �����ϱ�
 * 1�� �簢�� : ���� 10, ���� 10�� �簢��
 * 2�� �簢�� : ���� 5, ���� 20�� �簢��
 * 3�� �簢�� : ���� 15, ���� 2�� �簢��
 * �� �����Ͽ�, ���� �簢���� ���̿� �ѷ��� ���ϴ� ���α׷� �ۼ�.
 */
class Rectangle {
	int width;
	int height;
	int serialno;
	static int cnt;
	void curcum() {
		System.out.print(serialno + "�� �簢���� �ѷ� : " + ((width*2)+(height*2)) + "\t");
	}
	void extd() {
		System.out.println(serialno + "�� �簢���� ���� : " + (width*height));
	}
}
public class RectangleEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Rectangle[] rarr = new Rectangle[3];
		
		for(int i=0; i<rarr.length; i++) {
			rarr[i] = new Rectangle();
			rarr[i].serialno = ++Rectangle.cnt;
		}
		
		for(int i=0; i<rarr.length; i++) {
			System.out.println("�簢���� ����, ���� ���̸� ������� �Է��ϼ���.");
			rarr[i].width = scan.nextInt();
			rarr[i].height = scan.nextInt();
		}
		
		for(Rectangle rar : rarr) {
			rar.curcum();
			rar.extd();
		}
		
		
	}
}
