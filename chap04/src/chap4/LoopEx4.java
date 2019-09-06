package chap4;
/*
 * 중첩 반복문
 * 구구단 가로 출력하기
 */
public class LoopEx4 {
	public static void main(String[] args) {
		for (int i=2 ; i<=9 ; i++) {
			System.out.print(i + "단\t");
		}
		System.out.print("\n");
		for (int i=1 ; i<=9 ; i++) {
			for (int j=2 ; j<=9 ; j++) {
				System.out.print(j + "*" + i + "=" + (i*j) + "\t");
			}
			System.out.print("\n");
		}
		
		System.out.println();
		
		for (int i=2 ; i<=9 ; i++) {
			System.out.print(i + "단\t");
		}
		System.out.println();
		for (int j=1 ; j<=9 ; j++) {
			for(int i=2; i<=9 ; i++) {
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
	}
}
