package chap15;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {  //추상 클래스
	int x, y;
	Shape() {
		this(0, 0);
	}
	Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	abstract double area();  //추상메서드
	abstract double length();  //추상메서드
	public String getLocation() {
		return "[" + x +"," + y + "]";
	}
	public String toString() {
		return "\n넓이 : " + String.format("%.2f", area()) + ", 둘레 : " + String.format("%.2f", length());
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
//		return  "원의 중심 좌표 : " + "[" + x + "," + y + "]" + "\n원의 반지름 : " + r
//				+ "\n원의 넓이 : " + String.format("%.2f",area()) + ", 둘레 : " + String.format("%.2f",area()) + "\n";
		return "좌표 : " + getLocation() + ", 반지름 : " + r + super.toString();
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
//		return  "사각형의 좌표 : " + "[" + x + "," + y + "]" + "\n사각형 의 너비 : " + w + ", 높이 : " + h
//				+ "\n사각형의 넓이 : " + area() + ", 둘레 : " + length() + "\n";
		return "좌표 : " + getLocation() + ", 가로 : " + w + ", 세로 : " + h + super.toString();
	}
}
public class ListEx3 {
	public static void main(String[] args) {
		List<Shape> list = new ArrayList<Shape>();  //Shape타입의 객체를 모음. -> list : Shape 객체만 저장. Shape클래스(추상클래스)의 하위 클래스 객체를 저장.
		list.add(new Circle(5));  //0번 째 List
		list.add(new Circle(10, 10, 3));  //1번 째 List
		list.add(new Circle());
		list.add(new Rectangle());
		list.add(new Rectangle(5, 10));
		list.add(new Rectangle(3, 3, 5, 10));
		for(Shape s : list) {
			System.out.println(s);  //x y 좌표, (r || w h), area length 출력하기
		}
//		System.out.println(list);
	}
}
