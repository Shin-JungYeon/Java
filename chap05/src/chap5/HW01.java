package chap5;
/*
 * 1.  1 부터 9까지 숫자 중 중복되지 않는 세자리 숫자를 모두 출력하기
 * 
 * [결과]
 * 
 * 123,124,125...129
 * 
 * 132,134,135...139
 * 
 * ......
 */
public class HW01 {
	public static void main(String[] args) {

		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				for(int k=1; k<=9; k++) {
					System.out.print(((i!=j&&j!=k&&i!=k)?(i*100+j*10+k)+"\t":""));
				}
			}
			System.out.println();	
		}
		
	}
}
