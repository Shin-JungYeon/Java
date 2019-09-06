package chap5;

import java.util.Scanner;

public class ArrayEx10_1 {
	public static void main(String[] args) {
		int[] coin = {500, 100, 50, 10, 5, 1};
		int[] cnt = {5, 5, 5, 5, 5, 5};
		
		System.out.println("동전으로 바꿀 금액을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int won = scan.nextInt();
		int maxwon = 0;  //보유한 동전의 최대 금액
		
		for (int i=0; i<coin.length; i++) {
			maxwon +=coin[i]*cnt[i];
		}
		if(won>maxwon) {
			System.out.println("동전이 부족합니다.");
			return;  //메서드 종료, 이 구문을 만나면 아래 문장 실행x
		}
		
		//보유한 동전 내에서 바꿔줄 수 있는 경우.
		for (int i=0 ; i<coin.length; i++) {
			int coinNum = 0;  //필요한 동전의 갯수
			coinNum = won / coin[i];
			if(cnt[i]<coinNum) {  //필요한 동전이 더 큰 경우
				coinNum = cnt[i];  //보유한 최대 동전으로 바꿔줌.
				cnt[i] = 0;
			} else {  //필요한 동전이 보유한 동전보다 더 작은 경우
				cnt[i] -= coinNum;
			}
			won -= coinNum*coin[i];
			System.out.println(coin[i] + "원\t: " + coinNum);
		}
		System.out.println();
		for(int i=0; i<coin.length; i++) {
			System.out.println("남은 동전 " + coin[i] + "원\t: " + cnt[i] + "개");
		}
	}
}
