package chap6;
/*
 * 구동 클래스가 실행이 되도록 Coin 클래스 구현하기
 */
class Coin {
	int side;  //0으로 초기화
	void flip() {
		side = (int)(Math.random()*2);  //0 <= (int)(Math.random()*2 < 2
	}
}
public class CoinEx1 {
	public static void main(String[] args) {
		Coin coin = new Coin();
		coin.flip(); //랜덤하게 동전의 앞면과 뒷면 결정
		switch(coin.side) {
		case 0 : System.out.println("앞면"); break;
		case 1 : System.out.println("뒷면"); break;
		}
		
		
	}
}
