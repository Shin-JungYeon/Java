package practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* 
 * 1 ~ 1000�������� ��ȣ�� ������ ������ �ִ�. -> (int)(Math.random()*1000)+1
 * 1�� 1��, 2�� 2��, 3�� 3�� �� ��÷�ϴ� ���α׷� �ۼ��ϱ�.
 * �� ��÷�� 3����� ��÷�ϰ�, �ߺ��Ǿ� ��÷��  �ȵȴ�.
 * LinkedHashSet : ��������, �ߺ��Ұ�
 * new ArrayList(Set) : Set ��ü�� List��ü�� ����
 * 
 * [���]
 * 3�� ���� ��÷�մϴ�.
 * 467
 * 23
 * 922
 * 2�� ���� ��÷�մϴ�.
 * 284
 * 698
 * 1�� ���� ��÷�մϴ�.
 * 474
 * *** ���� ��÷ ��� ***
 * 1��:474
 * 2��:698,284
 * 3��:922,23,467
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
			System.out.println(rank + "�� ���� ��÷�մϴ�.");
			for(int i=0; i<rank; i++) {
				System.out.println(lottoList.remove(0));
			}
			rank--;
		}
		System.out.println();
		
//		System.out.println(lottoListRev);
		System.out.println("***���� ��÷ ���***");
		while(lottoListRev.size()!=0) {
			System.out.print(++rank + "�� : ");
			for(int i=rank; i>0; i--) {
				System.out.print(lottoListRev.remove(0) + ((i!=1)?",":""));
			}
			System.out.println();
		}

	}
}
