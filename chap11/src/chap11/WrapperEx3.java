package chap11;
/*
 * switch 구문의 조건값으로 사용될 수 있는 자료형 : byte, short, int, char, String
 * 									+ Byte, Short, Integer, Character
 */
public class WrapperEx3 {
	public static void main(String[] args) {
		Character v = 1;
		switch(v) {
		case 1 : System.out.println("1입니다."); break;
		default : System.out.println("1이 아닙니다."); break;
		}
		
	}
}
