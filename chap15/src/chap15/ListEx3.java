package chap15;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {  //�߻� Ŭ����
	int x, y;
	Shape() {
		this(0, 0);
	}
	Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	abstract double area();  //�߻�޼���
	abstract double length();  //�߻�޼���
	public String getLocation() {
		return "[" + x +"," + y + "]";
	}
	public String toString() {
		return "\n���� : " + String.format("%.2f", area()) + ", �ѷ� : " + String.format("%.2f", length());
	}
}
class Circle extends Shape {
	double r;
	Circle() {
		this(1);
	}
	Circle(double r) {
		this.r = r;
	}
	Circle(int x, int y, double r) {
		super(x, y);
		this.r = r;
	}
	@Override
	double area() {
		return r * r * Math.PI;
	}
	@Override
	double length() {
		return 2 * r * Math.PI;
	}
	@Override
	public String toString() {
//		return  "���� �߽� ��ǥ : " + "[" + x + "," + y + "]" + "\n���� ������ : " + r
//				+ "\n���� ���� : " + String.format("%.2f",area()) + ", �ѷ� : " + String.format("%.2f",area()) + "\n";
		return "��ǥ : " + getLocation() + ", ������ : " + r + super.toString();
	}
}
class Rectangle extends Shape {
	int w, h;
	Rectangle() {
		this(1, 1);
	}
	Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	Rectangle(int x, int y, int w, int h) {
		super(x, y);
		this.w = w;
		this.h = h;
	}
	@Override
	double area() {
		return w * h;
	}
	@Override
	double length() {
		return (w + h) * 2;
	}
	@Override
	public String toString() {
//		return  "�簢���� ��ǥ : " + "[" + x + "," + y + "]" + "\n�簢�� �� �ʺ� : " + w + ", ���� : " + h
//				+ "\n�簢���� ���� : " + area() + ", �ѷ� : " + length() + "\n";
		return "��ǥ : " + getLocation() + ", ���� : " + w + ", ���� : " + h + super.toString();
	}
}
public class ListEx3 {
	public static void main(String[] args) {
		List<Shape> list = new ArrayList<Shape>();  //ShapeŸ���� ��ü�� ����. -> list : Shape ��ü�� ����. ShapeŬ����(�߻�Ŭ����)�� ���� Ŭ���� ��ü�� ����.
		list.add(new Circle(5));  //0�� ° List
		list.add(new Circle(10, 10, 3));  //1�� ° List
		list.add(new Circle());
		list.add(new Rectangle());
		list.add(new Rectangle(5, 10));
		list.add(new Rectangle(3, 3, 5, 10));
		for(Shape s : list) {
			System.out.println(s);  //x y ��ǥ, (r || w h), area length ����ϱ�
		}
//		System.out.println(list);
	}
}
