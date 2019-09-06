package chap15;

import java.util.TreeSet;

/*
 * TreeSet을 이용하여 Lotto 번호 6개 생성하기.
 * 1 ~ 45 중 6개를 선택하여 TreeSet에 저장하고 출력하기.
 */
public class Exam3 {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		while(lotto.size()<6) {
			int lot = (int)(Math.random()*45)+1;
			lotto.add(lot);
		}
		System.out.println(lotto);
	}
}
