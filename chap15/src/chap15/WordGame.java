package chap15;

import java.util.Scanner;
import java.util.Vector;

/*
 * 텍스트 기반의 타자 연습 게임 프로그램 작성하기
 *   1. WordGenerator 라는 스레드를 이용하여 2초마다 단어를 하나씩 추가.
 *   2. 사용자가 단어를 입력하면 Vector 에서 일치하는 단어를 찾아 삭제.
 *   3. 모든 데이터가 삭제되면 프로그램이 종료.
 */
public class WordGame {
	Vector<String> words = new Vector<String>();
	public static void main(String[] args) {
		WordGame game = new WordGame();  //현재 클래스 자체를 객체화 시킴.
		game.play();
		System.out.println("프로그램 종료");
	}
	private void play() {
		WordGenerator wg = new WordGenerator();  //Thread 객체 생성. new 상태
		wg.start();
		words.add(wg.data[(int)(Math.random() * wg.data.length)]);  //프로그램 실행하자 마자 처음에 랜덤으로 data에서 값을 가져와 비어있는 words에 넣어주고 화면에 보여줌.
		while(true) {
			System.out.println(words);
			Scanner s = new Scanner(System.in);
			String input = s.nextLine().trim();
			int index = words.indexOf(input);
			if(index != -1) {
				words.remove(index);  //입력값과 일치하면 즉시 제거.
			}
			if(words.size() == 0) break;  //완전히 비워질 때까지 반복. -> 종료 되면 play() 종료 되는 것. -> main 종료 되면서 데몬스레드 종료.
		}
	}
	class WordGenerator extends Thread {
		final int interval = 2 * 1000;  //2초
		String[] data = {"java", "sql", "jsp", "mybatis", "sitemesh", "mariadb",
				         "xml", "json", "html", "spring", "jquery", "css", "hadop"};
		WordGenerator() {
			setDaemon(true);  //데몬 스레드, 메인이 종료될 때까지 스레드가 돌 수 있도록 해줌.
		}
		public void run() {  //2초에 한 번씩 계속해서 값을 추가 해줌.
			while(true) {
				try {
					sleep(interval);
				} catch(InterruptedException e) {
				e.printStackTrace();
				}
			words.add(data[(int)(Math.random() * data.length)]);  //sleep 지나고 계속해서 랜덤으로 단어 추가.
			}
		}
	}
}
