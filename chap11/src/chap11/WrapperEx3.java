package chap11;
/*
 * switch ������ ���ǰ����� ���� �� �ִ� �ڷ��� : byte, short, int, char, String
 * 									+ Byte, Short, Integer, Character
 */
public class WrapperEx3 {
	public static void main(String[] args) {
		Character v = 1;
		switch(v) {
		case 1 : System.out.println("1�Դϴ�."); break;
		default : System.out.println("1�� �ƴմϴ�."); break;
		}
		
	}
}
