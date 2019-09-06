package chap14;
/*
 * 3. �Ű����� ���� ���̰�, ���ϰ��� ����.
 */
interface FunctionalInterface4 {
	int method(int x, int y);
}
public class LambdaEx4 {
	public static void main(String[] args) {
		//1.
		FunctionalInterface4 f4 = (x, y) -> {
			return x*y;
		};
		System.out.println("�� ���� �� : " + f4.method(10, 5));  //����� ������ ���ϵǱ� ������ prtin�޼���� �������� �� �� ����.
		
		//2.
		f4 = (x, y) -> x+y;
		System.out.println("�� ���� �� : " + f4.method(10, 20));
		
		//3.
		System.out.println("�� ���� �� : " + calc((x, y) -> x-y, 20, 10));
		
		//���� : calc �Լ��� �̿��ϱ�. -> ǥ������� �ſ� �پ���.
		f4 = (x, y) -> {
//			return Math.max(x, y);
			return (x>y)?x:y;
		};
		System.out.println("�� �� �� ū�� : " + calc(f4, 20, 10));
//		System.out.println("�� �� �� ū�� : " + calc((x, y) -> Math.max(x, y), 20, 10));  //((x>y)?x:y), 20, 10));
		System.out.println("�� �� �� ������ : " + calc((x, y) -> Math.min(x, y), 10, 20));  //((x>y)?y:x), 10, 20));
		System.out.println("x/y�� �� : " + calc((x, y) -> x/y, 25, 10));
	}
	static int calc(FunctionalInterface4 f, int x, int y) {  //f : (x, y) -> x-y
		return f.method(x, y);
	}
}
