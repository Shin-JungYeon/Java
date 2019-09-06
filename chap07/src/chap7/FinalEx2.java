package chap7;
/*
 * final ������ �����ڿ��� �� �� �� ������ ������.
 *   -> ��ü���� �ٸ� ������� ���� �� �ִ�.
 */
class Card {
	final String type;
	final int number; // = 0;  ����� �ʱ�ȭ
	Card() {
		this("Spade", 1);  //�� Ŭ���� ���� �ٸ� Ŭ���� ȣ��
	}
	Card(String type, int number) {
		this.type = type;
		this.number = number;
//		this.number = 100;  //�ν��Ͻ� ������ �� �� �� ���� �� ���� ����, �� ���ķδ� �ȵ�.
	}
}

public class FinalEx2 {
	public static void main(String[] args) {
		Card c1 = new Card();
		System.out.println(c1.type + ", " + c1.number);
		Card c2 = new Card("Clover", 1);
		System.out.println(c2.type + ", " + c2.number);
//		c2.number = 2;  //number�� ����̹Ƿ� ���� �Ұ�.
		Card c3 = new Card("Heart", 6);
		System.out.println(c3.type + ", " + c3.number);
	}
}