package chap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 1. SutdaCard 20장으로 이루어진 SutdaDeck 클래스 구현하기
 *      멤버 변수 : SutdaCard 20장을 가지고 있다.
 *              SutdaCard는 같은 수의 카드를 2장씩 총 20장으로 이루어져 있다.
 *              그 중 1,3,8번호의 카드는 두장 중 한장이 광인 카드다.
 *      생성자 : 매개변수는 없고, SutdaCard 20장을 생성하여 멤버 변수인 List에 저장하기
 *      메서드
 *        a. void shuffle()
 *           기능 : 카드의 위치를 뒤섞는다.
 *        b. SutdaCard pick(int index)
 *           기능 : index에 해당하는 카드 한장을 반환한다.
 *        c. SutdaCard pick()
 *           기능 : 임의의 카드 한장을 반환한다.
 *
 * 구동 클래스를 실행할때 결과
 * 
 * 1:1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10
 * 2:5,6,6,8K,4,2,8,3K,3,9,10,7,9,1,5,1K,4,10,2,7
 * 3:5
 * 4:4
 * 
 * 단 2,3,4 번은 랜덤하게 출력된다.  
 */
class SutdaDeck {
	List<String> cards = new ArrayList<String>();  //SutdaCard 클래스 만들었던 방법으로도 할 수 있음. 자료형을 String 이 아니라 SutdaCard 로 해서 코딩하면 됨.
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
		Collections.shuffle(cards);  //shuffle() 메서드가 존재한다~~~~~
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
