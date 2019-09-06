package practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* 
 * 1 ~ 1000번까지의 번호를 가지는 복권이 있다. -> (int)(Math.random()*1000)+1
 * 1등 1장, 2등 2장, 3등 3장 을 추첨하는 프로그램 작성하기.
 * 단 추첨은 3등부터 추첨하고, 중복되어 당첨은  안된다.
 * LinkedHashSet : 순서유지, 중복불가
 * new ArrayList(Set) : Set 객체를 List객체로 생성
 * 
 * [결과]
 * 3등 복권 추첨합니다.
 * 467
 * 23
 * 922
 * 2등 복권 추첨합니다.
 * 284
 * 698
 * 1등 복권 추첨합니다.
 * 474
 * *** 복권 추첨 결과 ***
 * 1등:474
 * 2등:698,284
 * 3등:922,23,467
 * 
 */
public class LotteryExam {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lottoSet = new LinkedHashSet<Integer>();
		while(lottoSet.size() < 6) {
			lottoSet.add((int)(Math.random()*1000)+1);
		}
		System.out.println(lottoSet);
		System.out.println();
		
		List<Integer> lottoList = new ArrayList<Integer>(lottoSet);
		List<Integer> lottoListRev = new ArrayList<Integer>();
		
		for(int i=lottoList.size(); i>0; i--) {
			lottoListRev.add(lottoList.get(i-1));
		}
		
		int rank=3;
		while(lottoList.size()!=0) {
			System.out.println(rank + "등 복권 추첨합니다.");
			for(int i=0; i<rank; i++) {
				System.out.println(lottoList.remove(0));
			}
			rank--;
		}
		System.out.println();
		
//		System.out.println(lottoListRev);
		System.out.println("***복권 추첨 결과***");
		while(lottoListRev.size()!=0) {
			System.out.print(++rank + "등 : ");
			for(int i=rank; i>0; i--) {
				System.out.print(lottoListRev.remove(0) + ((i!=1)?",":""));
			}
			System.out.println();
		}

	}
}
