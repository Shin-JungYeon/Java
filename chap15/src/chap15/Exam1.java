package chap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * ȭ�鿡�� 5���� ������ �Է� �޾Ƽ� ��հ� �߰����� ����ϰ�, ���� �ְ����� ���� �л��� �ε����� ����ϱ�.
 * 
 * 50 60 60 40 70
 * 40 50 60 60 70 -> �߰��� : 60, �ְ� : 70 
 * 
 * ArrayList ��ü �̿��ϱ�.
 */
public class Exam1 {
	public static void main(String[] args) {
		List<Integer> score = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("5���� ������ �Է��� �ּ���.");
		int sum = 0;
		for(int i=0; i<5; i++) {
			int sc = scan.nextInt();
			score.add(sc);
			sum += sc;
		}
		int index = score.indexOf(Collections.max(score));
		Collections.sort(score);
		System.out.println("�߰��� : " + score.get(2) + ", ��� : " + (double)sum/score.size() + ", �ְ����� �ε��� : " + index);
	}
}
