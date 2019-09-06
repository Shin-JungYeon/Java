package chap15;

import java.util.Scanner;
import java.util.Vector;

/*
 * 2. WordGame 클래스 기능 추가하기.
 *   1. 단계 추가하기 : 1 단계: 5초마다 추가 ... 5단계 : 1초마다 단어 추가하기
 *   2. 영문, 한글 선택하도록 추가하기.
 */
public class HW2_WordGame {
	Vector<String> words = new Vector<String>();
	public static void main(String[] args) {
		HW2_WordGame game = new HW2_WordGame();  //현재 클래스 자체를 객체화 시킴.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("영문버전을 원하시면 'E', 한글버전을 원하시면 'K'를 눌러주세요.");
		String version = scan.next();
		System.out.println("1부터 5단계 중 원하는 단계를 선택해 주세요.");
		int level = scan.nextInt();
		
		game.play2(version, level);

		System.out.println("프로그램 종료");
	}
	private void play2(String version, int level) {
		WordGenerator wg = new WordGenerator(version, level);  //Thread 객체 생성. new 상태
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
		
		final String[] dataKor = {"자바", "클래스", "스레드", "인터페이스", "리스트", "벡터", 
				"문자열", "배열", "오버로딩", "오버라이딩", "참조변수", "객체", "메서드"};
		
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
