package chap6;
/*
 * ����Լ� ���� : �ڱ� �Լ� ȣ��
 */
public class factorialEx1 {
//	public static void main(String[] args) {
//		System.out.println(factorial(4));
//	}
//	private static int factorial(int i) {
//		return (i==1)?1:i*factorial(i-1);
//	}
	public static void main(String[] args) {
		System.out.println(new factorialEx1().factorial(4));
	}
	private int factorial(int i) {
		return (i==1)?1:i*factorial(i-1);
	}
}