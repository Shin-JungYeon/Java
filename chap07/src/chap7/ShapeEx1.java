package chap7;
/*
 * �߻�Ŭ���� : �߻�޼��带 ���� �� �ִ� Ŭ����, abstract ������ ������.
 *           ��üȭ �Ұ���, ��üȭ�� �ݵ�� ����� ���ؼ� �ڼ�Ŭ������ ��üȭ�� ������.
 *             -> ��üȭ�Ǵ� �ڼ�Ŭ������ �߻�޼��带 �ݵ�� �������̵� �ؾ� ��.
 *           �� �ܿ��� �Ϲ�Ŭ������ ����. (������, �������, ����޼���, �������̵�, �����ε�, ... ����)
 *           ������ ǥ��ȭ�� ����.
 * �߻�޼��� : ����θ� �����ϴ� �޼���, ������{}�� ����.
 *           ��üȭ�Ǵ� �ڼ�Ŭ�������� �ݵ�� �������̵��� �ʿ�.
 */
abstract class Shape {  //�߻�Ŭ����
	String type;
	Shape(String type) {
		this.type = type;
	}
	abstract double area();  //�߻�޼���
	abstract double length();  //�߻�޼���
}
class Circle extends Shape {
	int r;
	Circle(int r){
		super("��");
		this.r = r;
	}
	@Override
	double area() {
		return Math.PI * r * r;
	}
	@Override
	double length() {
		return 2 * Math.PI * r;
	}
}
/*
 * Rectangle Ŭ���� ����. Shape Ŭ������ ��ӹ޾� �����ϱ�
 *   ������� : width, height
 */
class Rectangle extends Shape {
	int width, height;
	Rectangle(int width, int height){
		super("�簢��");
		this.width = width;
		this.height = height;
	}
	@Override
	double area() {
		return width * height;
	}
	@Override
	double length() {
		return 2 * (width + height);
	}
}
public class ShapeEx1 {
	public static void main(String[] args) {
		
	Shape[] shapes = new Shape[2];
	shapes[0] = new Circle(10);
	shapes[1] = new Rectangle(10, 10);
	for(Shape s : shapes) {
		System.out.println(s.type + "�� ����: " + s.area() + ", �ѷ�: " + s.length());  //�߻�޼��� ������ ��ºҰ�
	}
	
	}
}
