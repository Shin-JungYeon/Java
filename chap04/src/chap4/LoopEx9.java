package chap4;
/*
 * break, continue 구문 예제
 *   break : switch, 반복문을 벗어남, 반복문의 조건과 상관없이 중간에 빠져나올 수 있음.
 *   continue : 반복문의 처음으로 제어를 이동함.
 */
public class LoopEx9 {
	public static void main(String[] args) {
		for(int i=2 ; i<=9 ; i++) {
			System.out.println("\n" + i + "단");
			for(int j=2 ; j<=9 ; j++) {
				//if(j==5) break;
				if(j==5) continue;  //if가 참일 때 다시 위로 올라가서 아래 실행문 건너뛰게 됨.
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
		
	}
}
