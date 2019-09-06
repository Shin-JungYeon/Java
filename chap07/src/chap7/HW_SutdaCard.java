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
class SutdaDeck {
	boolean isKwang;
	int index;
	String[] sutdaCard = new String[20];
	
	SutdaDeck() {
		for(int i=0; i<=1; i++) {
			for(int j=0; j<sutdaCard.length/2; j++) {
				sutdaCard[index++] = (j+1) + ((i==0&&(j==0||j==2||j==7))?"K":"");
			}
		}
	}
	void shuffle() {
		String temp;
		int num;
		for(int i=0; i<1000; i++) {
			for(int j=0; j<sutdaCard.length; j++) {
				num = (int)(Math.random()*20);
				temp = sutdaCard[j];
				sutdaCard[j] = sutdaCard[num];
				sutdaCard[num] = temp;
			}
		}	
	}
	String pick(int index) {
		return sutdaCard[index];
	}
	String pick() {
		int num = (int)(Math.random()*20);
		return sutdaCard[num];
	}
	
	public String toString() {
		String sutdaCard20="";
		for(int i=0; i<index; i++) {
			sutdaCard20 += sutdaCard[i] + ((i==index-1)?"":",");
		}
		return sutdaCard20;
	}
}
public class HW_SutdaCard {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println("1: " + deck);
		deck.shuffle();
		System.out.println("2: " + deck);
		System.out.println("3: " + deck.pick(0));//.info());
		System.out.println("4: " + deck.pick());//.info());

	}
}
