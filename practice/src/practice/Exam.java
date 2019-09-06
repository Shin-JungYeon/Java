package practice;
abstract class Shape {

	  Shape() {}

	  abstract double  area();

	  abstract double  length();

	}

	class Circle extends Shape {

	  int r;

	  Circle(int r) {

	    this.r = r;

	  }

	  @Override

	  public double area() {

	    return Math.PI*r*r;

	  }

	  @Override

	  public double length() {

	    return 2*Math.PI*r;

	  }

	  @Override

	  public String toString() {

	    return "[type=원" + ", r=" + r + "]";

	  }

	}

	class Rectangle extends Shape {

	  int width, height;

	  Rectangle(int width, int height) {

	    this.width= width;

	    this.height= height;

	  }

	  @Override

	  public double area() {

	    return width*height;

	  }

	  @Override

	  public double length() {

	    return 2*(width+height);

	  }

	  @Override

	  public String toString() {

	    return "[type=사각형" + ", width=" + width + ", height=" + height + "]";

	  }

	}

	public class Exam {

		public static void main(String[] args) {

		Shape[] shapes = new Shape[2];

		shapes[0] = new Circle(10);

		shapes[1] = new Rectangle(5,5);

		for(Shape s : shapes) {

		System.out.println(s 

		+ ",넓이:" + s.area() + ", 둘레:" + s.length());

		}

		}

		}

