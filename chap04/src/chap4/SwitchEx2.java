package chap4;
/*
 * switch 구문
 * Math.random()
 * : 난수 발생 함수, 임의의 수
 * 0 <= x < 1.0 double형
 * 0 <= x*3 < 3.0
 * 0 <= (int)(x*3) < 3
 * num : 0, 1, 2 중 한 개의 값을 저장.
 */
public class SwitchEx2 {
	public static void main(String[] args) {
		int num =(int)(Math.random() * 3);
		/*
		 * switch 구문에서 조건 값으로 사용할 수 있는 자료형
		 * : byte, short, int, char, String
		 */
		switch(num) {
		    case 0 : System.out.println("0값이 선택 되었습니다."); break;
		    case 1 : System.out.println("1값이 선택 되었습니다."); break;
		    case 2 : System.out.println("2값이 선택 되었습니다."); break;
		}
		
	}
}
