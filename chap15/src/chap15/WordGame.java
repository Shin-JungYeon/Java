package chap15;

import java.util.Scanner;
import java.util.Vector;

/*
 * �ؽ�Ʈ ����� Ÿ�� ���� ���� ���α׷� �ۼ��ϱ�
 *   1. WordGenerator ��� �����带 �̿��Ͽ� 2�ʸ��� �ܾ �ϳ��� �߰�.
 *   2. ����ڰ� �ܾ �Է��ϸ� Vector ���� ��ġ�ϴ� �ܾ ã�� ����.
 *   3. ��� �����Ͱ� �����Ǹ� ���α׷��� ����.
 */
public class WordGame {
	Vector<String> words = new Vector<String>();
	public static void main(String[] args) {
		WordGame game = new WordGame();  //���� Ŭ���� ��ü�� ��üȭ ��Ŵ.
		game.play();
		System.out.println("���α׷� ����");
	}
	private void play() {
		WordGenerator wg = new WordGenerator();  //Thread ��ü ����. new ����
		wg.start();
		words.add(wg.data[(int)(Math.random() * wg.data.length)]);  //���α׷� �������� ���� ó���� �������� data���� ���� ������ ����ִ� words�� �־��ְ� ȭ�鿡 ������.
		while(true) {
			System.out.println(words);
			Scanner s = new Scanner(System.in);
			String input = s.nextLine().trim();
			int index = words.indexOf(input);
			if(index != -1) {
				words.remove(index);  //�Է°��� ��ġ�ϸ� ��� ����.
			}
			if(words.size() == 0) break;  //������ ����� ������ �ݺ�. -> ���� �Ǹ� play() ���� �Ǵ� ��. -> main ���� �Ǹ鼭 ���󽺷��� ����.
		}
	}
	class WordGenerator extends Thread {
		final int interval = 2 * 1000;  //2��
		String[] data = {"java", "sql", "jsp", "mybatis", "sitemesh", "mariadb",
				         "xml", "json", "html", "spring", "jquery", "css", "hadop"};
		WordGenerator() {
			setDaemon(true);  //���� ������, ������ ����� ������ �����尡 �� �� �ֵ��� ����.
		}
		public void run() {  //2�ʿ� �� ���� ����ؼ� ���� �߰� ����.
			while(true) {
				try {
					sleep(interval);
				} catch(InterruptedException e) {
				e.printStackTrace();
				}
			words.add(data[(int)(Math.random() * data.length)]);  //sleep ������ ����ؼ� �������� �ܾ� �߰�.
			}
		}
	}
}
