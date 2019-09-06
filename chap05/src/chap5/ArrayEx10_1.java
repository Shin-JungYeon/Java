package chap5;

import java.util.Scanner;

public class ArrayEx10_1 {
	public static void main(String[] args) {
		int[] coin = {500, 100, 50, 10, 5, 1};
		int[] cnt = {5, 5, 5, 5, 5, 5};
		
		System.out.println("�������� �ٲ� �ݾ��� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int won = scan.nextInt();
		int maxwon = 0;  //������ ������ �ִ� �ݾ�
		
		for (int i=0; i<coin.length; i++) {
			maxwon +=coin[i]*cnt[i];
		}
		if(won>maxwon) {
			System.out.println("������ �����մϴ�.");
			return;  //�޼��� ����, �� ������ ������ �Ʒ� ���� ����x
		}
		
		//������ ���� ������ �ٲ��� �� �ִ� ���.
		for (int i=0 ; i<coin.length; i++) {
			int coinNum = 0;  //�ʿ��� ������ ����
			coinNum = won / coin[i];
			if(cnt[i]<coinNum) {  //�ʿ��� ������ �� ū ���
				coinNum = cnt[i];  //������ �ִ� �������� �ٲ���.
				cnt[i] = 0;
			} else {  //�ʿ��� ������ ������ �������� �� ���� ���
				cnt[i] -= coinNum;
			}
			won -= coinNum*coin[i];
			System.out.println(coin[i] + "��\t: " + coinNum);
		}
		System.out.println();
		for(int i=0; i<coin.length; i++) {
			System.out.println("���� ���� " + coin[i] + "��\t: " + cnt[i] + "��");
		}
	}
}
