package chap6;
/*
 * ���� Ŭ������ ������ �ǵ��� Coin Ŭ���� �����ϱ�
 */
class Coin {
	int side;  //0���� �ʱ�ȭ
	void flip() {
		side = (int)(Math.random()*2);  //0 <= (int)(Math.random()*2 < 2
	}
}
public class CoinEx1 {
	public static void main(String[] args) {
		Coin coin = new Coin();
		coin.flip(); //�����ϰ� ������ �ո�� �޸� ����
		switch(coin.side) {
		case 0 : System.out.println("�ո�"); break;
		case 1 : System.out.println("�޸�"); break;
		}
		
		
	}
}
