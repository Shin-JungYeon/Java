package chap3;

public class DataEx {
	public static void main(String[] args) {
		//1.
		System.out.println(7^ 2);
		
		//2.
		System.out.println(3/2);
		System.out.println(3<2);
		System.out.println(3*4);
		System.out.println(3<<2);
		System.out.println(3*2^2);
		
		//3.
		int a=10, b=20;
		int c;
		c=++a + ++b;
		System.out.println("1.a="+a+"\tb="+b+"\tc"+c);
		c=a++ + b++;
		System.out.println("2.a="+a+"\tb="+b+"\tc"+c);
		c=a++ + ++b;
		System.out.println("3.a="+a+"\tb="+b+"\tc"+c);
		c=++a + b++;
		System.out.println("4.a="+a+"\tb="+b+"\tc"+c);
		c=--a + --b;
		System.out.println("5.a="+a+"\tb="+b+"\tc"+c);
		c=a-- + b--;
		System.out.println("6.a="+a+"\tb="+b+"\tc"+c);
		c=a-- + --b;
		System.out.println("7.a="+a+"\tb="+b+"\tc"+c);
		c=--a + b--;
		System.out.println("8.a="+a+"\tb="+b+"\tc"+c);
		
		//4.
		byte a4 =10;
		byte b4 =20;
		byte c4 = (byte) (a4 + b4);
		char ch = 'A';
		ch = (char) (ch +2);
		float f = (float)3/2;
		long l=3000l*3000*3000;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d==f2;
		System.out.println("c4=" + c4);
		System.out.println("ch=" + ch);
		System.out.println("f=" + f);
		System.out.println("l" + l);
		System.out.println("result=" + result);
		System.out.printf("float : %.20f\ndouble : %.20f", 0.1f, 0.1);
		//float 와 double 형의 값이 같더라도 내부적으로 다르게 표현 됨. (부호)(소수)(지수)
	}
}