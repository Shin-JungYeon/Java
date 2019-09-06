package chap15;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 1 ~ 99 까지의 정수를 입력 받아서, 입력된 값이 999이 되면 입력을 종료. 중복된 숫자는 무시.
 * set1 오름차순 정렬
 * set2 내림차순 정렬
 */
public class Exam4 {
	public static void main(String[] args) {
		System.out.println("1 ~ 99사이의 정수를 입력해 주세요.(그만 입력하고 싶으면 999를 입력하세요.)");
		Scanner scan = new Scanner(System.in);
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		int input=0;
		while(input!=999) {
			try {
				input = scan.nextInt();
				if(input<1 || input>99 && input!=999) {
					throw new Exception();
				}
				set1.add(input);
				//set2.add(input);  //이렇게 하면 더 간단쓰
			} catch (Exception e) {
				System.out.println("범위를 벗어났습니다. 1 ~ 99 사이의 정수를 입력해 주세요.");
				continue;
			}
		}  //do while 문 쓰면 0으로 정지할 수 있네!
		set1.remove(999);
		System.out.println("오름차순 정렬 : " + set1);
		
		TreeSet<Integer> set2 = new TreeSet<Integer>(Comparator.reverseOrder());
		for(Integer i : set1) {
			set2.add(i);
		}
		System.out.println("내림차순 정렬 : " + set2);
	}
}
