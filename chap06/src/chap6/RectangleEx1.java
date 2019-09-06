package chap6;

import java.util.Scanner;

/*
 * 사각형 클래스 3개를 생성하기
 * 1번 사각형 : 가로 10, 세로 10인 사각형
 * 2번 사각형 : 가로 5, 세로 20인 사각형
 * 3번 사각형 : 가로 15, 세로 2인 사각형
 * 을 생성하여, 각각 사각형의 넓이와 둘레를 구하는 프로그램 작성.
 */
class Rectangle {
	int width;
	int height;
	int serialno;
	static int cnt;
	void curcum() {
		System.out.print(serialno + "번 사각형의 둘레 : " + ((width*2)+(height*2)) + "\t");
	}
	void extd() {
		System.out.println(serialno + "번 사각형의 넓이 : " + (width*height));
	}
}
public class RectangleEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Rectangle[] rarr = new Rectangle[3];
		
		for(int i=0; i<rarr.length; i++) {
			rarr[i] = new Rectangle();
			rarr[i].serialno = ++Rectangle.cnt;
		}
		
		for(int i=0; i<rarr.length; i++) {
			System.out.println("사각형의 가로, 세로 길이를 순서대로 입력하세요.");
			rarr[i].width = scan.nextInt();
			rarr[i].height = scan.nextInt();
		}
		
		for(Rectangle rar : rarr) {
			rar.curcum();
			rar.extd();
		}
		
		
	}
}
