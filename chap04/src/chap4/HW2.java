package chap4;
/*
 2. 두개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램 작성

 [결과]

   1,5

   2,4

   3,3

   4,2

   5,1
 */
public class HW2 {
	public static void main(String[] args) {
		int num1, num2;
		for (num1=1 ; num1<=6 ; num1++) {
			for (num2=1 ; num2<=6 ; num2++) {
				if(num1+num2==6)
					System.out.println(num1+","+num2);
			}
			System.out.println();
		}
		
	}
}
