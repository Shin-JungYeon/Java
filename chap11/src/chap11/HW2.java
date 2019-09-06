package chap11;
/*
 * 2. ����� �������� round �Լ� �����ϱ�
 *    String.format() ���
 */
public class HW2 {
	public static void main(String[] args) {
		System.out.println(round(3.1415,1)); //3.1
		System.out.println(round(3.1415,2)); //3.14
		System.out.println(round(3.1415,3)); //3.142
		System.out.println(round(3.1415,4)); //3.1415
		
	}

	private static String round(double d, int i) {
		String rd;
		rd = String.format("%."+i+"f", d);
		return rd;
		
		//return String.format("%."+i+"f", d);  //�� �ٿ� �ڵ� ����.
	}
}