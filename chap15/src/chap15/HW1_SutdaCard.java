package chap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 1. SutdaCard 20������ �̷���� SutdaDeck Ŭ���� �����ϱ�
 *      ��� ���� : SutdaCard 20���� ������ �ִ�.
 *              SutdaCard�� ���� ���� ī�带 2�徿 �� 20������ �̷���� �ִ�.
 *              �� �� 1,3,8��ȣ�� ī��� ���� �� ������ ���� ī���.
 *      ������ : �Ű������� ����, SutdaCard 20���� �����Ͽ� ��� ������ List�� �����ϱ�
 *      �޼���
 *        a. void shuffle()
 *           ��� : ī���� ��ġ�� �ڼ��´�.
 *        b. SutdaCard pick(int index)
 *           ��� : index�� �ش��ϴ� ī�� ������ ��ȯ�Ѵ�.
 *        c. SutdaCard pick()
 *           ��� : ������ ī�� ������ ��ȯ�Ѵ�.
 *
 * ���� Ŭ������ �����Ҷ� ���
 * 
 * 1:1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10
 * 2:5,6,6,8K,4,2,8,3K,3,9,10,7,9,1,5,1K,4,10,2,7
 * 3:5
 * 4:4
 * 
 * �� 2,3,4 ���� �����ϰ� ��µȴ�.  
 */
class SutdaDeck {
	List<String> cards = new ArrayList<String>();  //SutdaCard Ŭ���� ������� ������ε� �� �� ����. �ڷ����� String �� �ƴ϶� SutdaCard �� �ؼ� �ڵ��ϸ� ��.
	boolean isKwang;
	
	SutdaDeck() {
		for(int i=0; i<20; i++) {
			if((i+1)%10 != 0) {
				isKwang = (i<10) && (i%10==0||i%10==2||i%10==7);
				cards.add((i+1)%10 + ((isKwang)?"K":""));
			} else {
				cards.add("10");
			}
		}
	}
	
	public void shuffle() {
//		for(int i=0; i<1000; i++) {
//			int index = (int)(Math.random()*20);
//			String temp = cards.get(index);
//			cards.remove(index);
//			cards.add(temp);
//		}
		Collections.shuffle(cards);  //shuffle() �޼��尡 �����Ѵ�~~~~~
	}
	
	public String pick(int i) {
		return cards.get(i);
	}
	
	public String pick() {
		return cards.get((int)(Math.random()*20));
	}
	
	public String toString() {
		String sutdaCard20="";
		for(int i=0; i<cards.size(); i++) {
			sutdaCard20 += cards.get(i) + ((i!=cards.size()-1)?",":"");
		}
		return sutdaCard20;
	}
	
}
public class HW1_SutdaCard {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println("1:" + deck.toString());
		deck.shuffle();
		System.out.println("2:" + deck);
		System.out.println("3:" + deck.pick(0));
		System.out.println("4:" + deck.pick());
	}
}
