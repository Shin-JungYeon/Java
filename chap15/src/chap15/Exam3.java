package chap15;

import java.util.TreeSet;

/*
 * TreeSet�� �̿��Ͽ� Lotto ��ȣ 6�� �����ϱ�.
 * 1 ~ 45 �� 6���� �����Ͽ� TreeSet�� �����ϰ� ����ϱ�.
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
