package chap6;
/*
 * 1. 1.SutdaCard ī�� �����ϱ�
 *  ���� : int number, boolean isKwang 
 *  �޼��� : String info()
 *  �Ʒ� ����Ŭ������ ȣ��Ǵ� �����ڿ� �µ��� �����ڵ� �����ϱ� 
 *  
 *  ���� Ŭ������ ���� ���
 *  [���]
 *   3
 *   1K
 */

class SutdaCard {
	boolean isKwang;
	int number;
	SutdaCard(int number, boolean isKwang) {   //������
		this.number = number;
		this.isKwang = isKwang;
	}
	SutdaCard() {   //������
		this(1, true);
	}
	String info() {
		return this.number + ((this.isKwang==true)?"K":"");
	}
}
public class HW1_SutdaCard {
	public static void main(String[] args) {
		  SutdaCard card1 = new SutdaCard(3,false);
		  SutdaCard card2 = new SutdaCard();

		  System.out.println(card1.info()); //3, ���ϰ��� �־�� ȭ�� ����� ����(void �� ��)
		  System.out.println(card2.info()); //1K
	}
}