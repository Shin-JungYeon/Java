package chap4;
/*
 * switch ����
 * Math.random()
 * : ���� �߻� �Լ�, ������ ��
 * 0 <= x < 1.0 double��
 * 0 <= x*3 < 3.0
 * 0 <= (int)(x*3) < 3
 * num : 0, 1, 2 �� �� ���� ���� ����.
 */
public class SwitchEx2 {
	public static void main(String[] args) {
		int num =(int)(Math.random() * 3);
		/*
		 * switch �������� ���� ������ ����� �� �ִ� �ڷ���
		 * : byte, short, int, char, String
		 */
		switch(num) {
		    case 0 : System.out.println("0���� ���� �Ǿ����ϴ�."); break;
		    case 1 : System.out.println("1���� ���� �Ǿ����ϴ�."); break;
		    case 2 : System.out.println("2���� ���� �Ǿ����ϴ�."); break;
		}
		
	}
}
