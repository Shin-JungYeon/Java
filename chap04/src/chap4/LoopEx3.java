package chap4;
/*
 * 중첩 반복문 : 반복문 내부에 반복문이 존재
 * 구구단 출력하기
 */
public class LoopEx3 {
	public static void main(String[] args) {
		for (int i=2 ; i<=9 ; i++) {
			System.out.println("\n" + i + "단");
			for(int j=1 ; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
		
		System.out.print("\n");
		
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
		
	}
}
