package chap14;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
 * Supplier FunctionInterface ����
 *   �Ű��������� ����, ���ϰ��� ������.
 *   getXXX() �޼���
 *   
 *   1. Supplier<T> : ���ϰ��� Ÿ���� T(Object)�� get() �޼��带 ����.
 *   2. IntSupplier : ���ϰ��� Ÿ���� int�� getAsInt() �޼��带 ����.
 *   3. DoubleSupplier : ���ϰ��� Ÿ���� double�� getAsDouble() �޼��带 ����.
 *   ...
 */
public class LambdaEx7 {
	public static void main(String[] args) {
		//1.
		Supplier<String> s1 = () -> "Java";  //���� ������ ������ �� return ���� ����.
		System.out.println(s1.get());
		
		//2.
		IntSupplier s2 = () -> {
			int num = (int)(Math.random()*10) + 1;
			return num;
		};
		System.out.println("1 ���� 10������ ������ �� : " + s2.getAsInt());
		
		//���� : s2�� �̿��ؼ� 1���� 100������ �� ���ϱ�.
		s2 = () -> {
			int sum = 0;
			for(int i=1; i<=100; i++) {
				sum += i;
			}
			return sum;
		};
		System.out.println("1 ���� 100������ �� : " + s2.getAsInt());
		
		//3.
		double[] arr = {1, 2, 5, 5.6, 10, 20, 30.5};
		DoubleSupplier s3 = () -> {
			double arrsum = 0;
			for(double d : arr) {
				arrsum += d;
			}
			return arrsum;
		};
		System.out.println("arr �迭�� ��ҵ��� �� : " + s3.getAsDouble());
	}
}
