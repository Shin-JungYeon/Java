package chap11;
/*
 * 2. 다음과 같은 실행 결과를 얻도록 Point3D클래스의 equals()메서드와 toString() 를 오버라이딩 하시오
 * 
 * [결과]
 * [1,2,3]
 * [1,2,3]
 * p1==p2?false
 * p1.equals(p2)?true
 */
class Point3D {
	int x, y, z;
	public Point3D(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point3D) {
			Point3D p = (Point3D)obj;
			return (this.x==p.x) && (this.y==p.y) && (this.z==p.z);
		}
		return false;
	}
	@Override
	public String toString() {
		return "[" + x + "," + y + "," + z + "]";
	}
}
public class HW02 {
	public static void main(String[] args) {
		Point3D p1 = new Point3D(1,2,3);
		Point3D p2 = new Point3D(1,2,3);
		System.out.println(p1);//[1,2,3]
		System.out.println(p2);//[1,2,3]
		System.out.println("p1==p2?" + (p1==p2));
		System.out.println("p1.equals(p2)?" + (p1.equals(p2)));
	}
}
