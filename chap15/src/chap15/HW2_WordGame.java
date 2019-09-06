package chap15;

import java.util.Scanner;
import java.util.Vector;

/*
 * 2. WordGame Ŭ���� ��� �߰��ϱ�.
 *   1. �ܰ� �߰��ϱ� : 1 �ܰ�: 5�ʸ��� �߰� ... 5�ܰ� : 1�ʸ��� �ܾ� �߰��ϱ�
 *   2. ����, �ѱ� �����ϵ��� �߰��ϱ�.
 */
public class HW2_WordGame {
	Vector<String> words = new Vector<String>();
	public static void main(String[] args) {
		HW2_WordGame game = new HW2_WordGame();  //���� Ŭ���� ��ü�� ��üȭ ��Ŵ.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���������� ���Ͻø� 'E', �ѱ۹����� ���Ͻø� 'K'�� �����ּ���.");
		String version = scan.next();
		System.out.println("1���� 5�ܰ� �� ���ϴ� �ܰ踦 ������ �ּ���.");
		int level = scan.nextInt();
		
		game.play2(version, level);

		System.out.println("���α׷� ����");
	}
	private void play2(String version, int level) {
		WordGenerator wg = new WordGenerator(version, level);  //Thread ��ü ����. new ����
		wg.start();
		
		if(version.equalsIgnoreCase("k")) {
			words.add(wg.dataKor[(int)(Math.random() * wg.dataKor.length)]);
		}
		if(version.equalsIgnoreCase("e")) {
			words.add(wg.dataEng[(int)(Math.random() * wg.dataEng.length)]);
		}
		
		while(true) {
			System.out.println(words);
			Scanner s = new Scanner(System.in);
			String input = s.nextLine().trim();
			int index = words.indexOf(input);
			if(index != -1) {
				words.remove(index);
			}
			if(words.size() == 0) break;
		}
	}
	
	class WordGenerator extends Thread {
		String version;
		int level;
		WordGenerator(String version, int level) {
			setDaemon(true);
			this.version = version;
			this.level = level;
		}
		
		final int interval = 1000;
		final String[] dataEng = {"java", "sql", "jsp", "mybatis", "sitemesh", "mariadb", 
				"xml", "json", "html", "spring", "jquery", "css", "hadop"};
		
		final String[] dataKor = {"�ڹ�", "Ŭ����", "������", "�������̽�", "����Ʈ", "����", 
				"���ڿ�", "�迭", "�����ε�", "�������̵�", "��������", "��ü", "�޼���"};
		
		public void run() {
			while(true) {
				try {
					sleep((6-level) * interval);
				} catch(InterruptedException e) {
				e.printStackTrace();
				}
				if(version.equalsIgnoreCase("k")) {
					words.add(dataKor[(int)(Math.random() * dataKor.length)]);
				}
				if(version.equalsIgnoreCase("e")) {
					words.add(dataEng[(int)(Math.random() * dataEng.length)]);
				}
			}
		}
	}
	
}
