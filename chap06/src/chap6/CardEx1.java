package chap6;
/*
 * Ŭ���� ����, �ν��Ͻ� ���� : Ŭ���� ���ο��� ���� ��, �ڵ����� �ʱ�ȭ��(�⺻������)
 * 
 *   Ŭ���� ���� : ���� ��� : static �ڷ��� ������;
 *             �޸� �Ҵ� ��ġ : Ŭ���� ����
 *             �޸� �Ҵ� �ñ� : Ŭ���� ������ �ε�� ��(���� ���� �޸� �Ҵ�)
 *             Ư¡ : ��üȭ �ʿ� ����
 *                   ��� ��ü�� ���뺯���� ����(�ϳ��� ��ü���� �ٲ㵵 ��� ��ü�� ���� ���� �ٲ�, ���������� ���� ���ۿ� ����.)
 *             ���� : Ŭ������.������
 *             
 *   �ν��Ͻ� ���� : ���� ��� : �ڷ��� ������;
 *   (��ü ����)    �޸� �Ҵ� ��ġ : �� ����
 *               �޸� �Ҵ� �ñ� : ��üȭ�� ��
 *               Ư¡ : �ݵ�� ��üȭ �ʿ�(��üȭ�� �Ǿ�� �޸� �Ҵ� �� ����ó�� ��� ����)
 *                     ��ü���� �ٸ� �޸� ������ ����
 *               ���� : ����������.������
 */
class Card {
	String type;  //������� �� �ν��Ͻ�����, ��üȭ �� �� ������ �ȴ�. �� ���� �ڷ����ϻ�.
	int number;   //�ν��Ͻ� ����
	static int width = 150;
	static int height = 250;
	//static : ������� ��  Ŭ��������, main �޼��庸�� ���� �޸� �Ҵ� ����. ��üȭ ���� �ʰ� �ٷ� ��� ����. �ٸ� ������ ��üȭ �Ǿ�� ��� ����.
	public String toString() {
		//toString() : ��ü�� ���ڿ�ȭ �ϴ� �޼���, ���������̸��� ����ϸ� �ڵ� ȣ��Ǵ� �޼���.
		return type + " : " + number + " (" + width + ", " + height + ")";
	}
}
public class CardEx1 {
	public static void main(String[] args) {
		System.out.println("Card�� ũ�� : " + Card.width + ", " + Card.height);
//		System.out.println(Card.type + ":" + Card.number);  //�ν��Ͻ� ������ ��üȭ �Ǿ�� ��밡��
		
		Card c1 = new Card();
		c1.type = "Space";
		c1.number = 1;
		
		Card c2 = new Card();
		c2.type = "Clover";
		c2.number = 10;
		
		System.out.println(c1.toString());
		System.out.println(c2);
		//���� ���, c2�� toString() �޼��带 �ڵ����� ȣ���� ��.
		
		c1.width = 50;
		c1.height = 80;
		Card.width = 50;
		Card.height = 80;
		
		System.out.println(c1.toString());
		System.out.println(c2);
		//c1�� ���� �����ߴµ� c2�� �Բ� ���� ��, Card Ŭ������ �ִ� static int ���� ����� ���̱� ����.
		
		
		
	}
}