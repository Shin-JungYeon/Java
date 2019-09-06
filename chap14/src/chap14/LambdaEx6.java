package chap14;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

/*
 * Consumer FunctionInterface ����
 *   �Ű������� �ְ�, ����Ÿ���� ���� �߻� �޼��带 ����� ������ �ִ� �������̽�.
 *   accept(��ü) �޼���.
 *   
 *   1. Consumer<T> : �Ű������� T Ÿ���� Object(��ü)�� �޴� accept �޼��带 ����.
 *   2. BiConsumer<T, U> : �Ű������� 2���� accept �޼��带 ����.
 *   3. DoubleConsumer : �Ű������� double Ÿ���� accept �޼��带 ����. �ڵ�����ȯ ����.
 *   4. ObjIntConsumer<T> : �Ű������� TŸ���� Object(��ü)�� int Ÿ���� ������ �޴� accept �޼��带 ����.
 *   ...
 */
public class LambdaEx6 {
	static Integer[] arr = {1, 2, 3, 4, 5};
	public static void main(String[] args) {
		//1.
		Consumer<String> c1 = t -> System.out.println(t + "8.0");
		c1.accept("Java");  //t��� �Ű������� ���ڿ�(��ü) ����.
		
		Consumer<Integer[]> c2 = t -> {
			int sum = 0;
			for(int i : t) sum += i;
			System.out.println("�迭�� �� : " + sum);
		};
		c2.accept(arr);
		
		//2.
		BiConsumer<String, String> c3 = (t, u) -> System.out.println(t + u);  //�Ű������� 2��
		c3.accept("Jave", "8.0");
		
		//3.
		DoubleConsumer c4 = d -> System.out.println("Java" + d);
		c4.accept(8.0);  //8�̶�� �־ �ڵ�����ȯ �Ǿ� 8.0���� ��µ�.
		
		//4.
		ObjIntConsumer<String> c5 = (t, i) -> System.out.println(t + i);
		c5.accept("jave", 8);
	}
}