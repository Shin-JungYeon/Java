package chap7;
/*
 * SutdaCard 20������ �̷���� SutdaDeck Ŭ���� �����ϱ�
 * 1. ��� ����
 *    SutdaCard 20���� ������ �ִ�.
 *    SutdaCard�� ���� ���� ī�带 2�徿 �� 20������ �̷���� �ִ�.
 *    �� �� 1,3,8��ȣ�� ī��� ���� �� ������ ���� ī���.
 * 2. ������
 *    �Ű������� ����, SutdaCard 20���� �����Ͽ� ��� ������ �迭�� �����ϱ�
 * 3. �޼���
 *    a. void shuffle()
 *       ��� : ī���� ��ġ�� �ڼ��´�.
 *    b. SutdaCard pick(int index)
 *       ��� : index�� �ش��ϴ� ī�� ������ ��ȯ�Ѵ�.
 *    c. SutdaCard pick()
 *       ��� : ������ ī�� ������ ��ȯ�Ѵ�.
 * 
 * ���� Ŭ������ �����Ҷ� ���
 * 
 * 1: 1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10
 * 2: 5,6,6,8K,4,2,8,3K,3,9,10,7,9,1,5,1K,4,10,2,7
 * 3: 5
 * 4: 4
 * 
 * �� 2,3,4 ���� �����ϰ� ��µȴ�.
 */
class SutdaDeck1 {
	SutdaCard[] cards;
	SutdaDeck1() {
		cards = new SutdaCard[20];
		for(int i=0; i<cards.length; i++) {
			cards[i] = new SutdaCard(i%10+1, (i==0||i==2||i==7)?true:false);
		}
	}
	void shuffle() {
		for(int i=0; i<10000; i++) {
			int f = (int)(Math.random()*20);
			int t = (int)(Math.random()*20);
			SutdaCard s = cards[f];
			cards[f] = cards[t];
			cards[t] = s;
		}
	}
	public String toString() {
		String s = "";
		for(SutdaCard c : cards) {
			s += c.toString() + ",";  //toString() ���� ����.
		}
		return s;
	}
	SutdaCard pick(int index) {
		return cards[index];
	}
	SutdaCard pick() {
		return cards[(int)(Math.random()*20)];
	}
}

class SutdaCard {
	int number;
	boolean isKwang;
	SutdaCard(int number, boolean isKwang) {
		this.number = number;
		this.isKwang = isKwang;
	}
	public String toString() {
		return number + (isKwang?"K":"");
	}
	public String info() {
		return number + (isKwang?"K":"");
	}
}

public class Sutda {
	public static void main(String[] args) {
		SutdaDeck1 deck = new SutdaDeck1();
		System.out.println("1: " + deck.toString());
		deck.shuffle();
		System.out.println("2: " + deck);
		System.out.println("3: " + deck.pick(0).info());  //deck.pick(0) �� �޼����� return Ÿ���� SutdaCard �̱� ������ info()�� SutdaCard Ŭ���� �ȿ� ����� ��� ��.
		System.out.println("4: " + deck.pick().info());
	}
}