package chap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 화면에서 5명의 점수를 입력 받아서 평균과 중간값을 출력하고, 가장 최고점을 받은 학생의 인덱스를 출력하기.
 * 
 * 50 60 60 40 70
 * 40 50 60 60 70 -> 중간값 : 60, 최고값 : 70 
 * 
 * ArrayList 객체 이용하기.
 */
public class Exam1 {
	public static void main(String[] args) {
		List<Integer> score = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("5명의 점수를 입력해 주세요.");
		int sum = 0;
		for(int i=0; i<5; i++) {
			int sc = scan.nextInt();
			score.add(sc);
			sum += sc;
		}
		int index = score.indexOf(Collections.max(score));
		Collections.sort(score);
		System.out.println("중간값 : " + score.get(2) + ", 평균 : " + (double)sum/score.size() + ", 최고점의 인덱스 : " + index);
	}
}
