package chap4;
/*
 1. 다음의 결과가 나오도록 프로그램 작성하기
 
  [결과]
   (1) + (1+2) + (1 + 2 + 3) + .... (1 + 2 ...+ 10) = 220 
 */
public class HW1 {
	public static void main(String[] args) {
		int sum=0;
		
		for (int i=1 ; i<=10 ; i++) {
			System.out.print("(");
			for (int j=1 ; j<=i ; j++) {
				System.out.print((j<i)?(j + " + "):j);
				sum += j;
			}
			System.out.print((i<10)?(") + "):")");
		}
		System.out.print(" = " + sum);
		
		System.out.println();
		
		int sum2 = 0;
		for (int i=1 ; i<=10 ; i++) {
			System.out.print("(");
			for (int j=1 ; j<=i ; j++) {
				sum2 +=j;
				System.out.print(j + ((j==i)?"":"+"));
			}
		    System.out.print(")" + ((i==10)?"=":"+"));
		}
		System.out.println(sum2);
	}
}