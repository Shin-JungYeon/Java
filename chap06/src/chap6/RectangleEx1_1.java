package chap6;
/*
 * 사각형 클래스 3개를 생성하기
 * 1번 사각형 : 가로 10, 세로 10인 사각형
 * 2번 사각형 : 가로 5, 세로 20인 사각형
 * 3번 사각형 : 가로 15, 세로 2인 사각형
 * 을 생성하여, 각각 사각형의 넓이와 둘레를 구하는 프로그램 작성.
 */
class Rectangle1 {
	int width, height, serialno;  //인스턴스변수
	static int cnt;  //클래스변수
	void area() {
		System.out.print(serialno + "번 사각형의 넓이 : " + width*height + "\t");
//		return;  //void 일 땐 생략 가능
	}
	void length() {
		System.out.println(serialno + "번 사각형의 둘레 : " + (width+height)*2);
	}
	boolean isSquare() {
//		if(width==height) {
//			return true;
//		} else {
//			return false;
//		}
		return width == height;  //리턴타입을 지정한 경우 return 없으면 에러, 반환값과 같은 자료형 내보내줘야 함.
	}
}
public class RectangleEx1_1 {
	public static void main(String[] args) {
		Rectangle1[] rarr = new Rectangle1[3];
		
		rarr[0] = new Rectangle1();
		rarr[0].serialno = ++Rectangle.cnt; //1
		rarr[0].width = 10;
		rarr[0].height = 10;
		
		rarr[1] = new Rectangle1();
		rarr[1].serialno = ++Rectangle.cnt; //2
		rarr[1].width = 5;
		rarr[1].height = 20;
		
		rarr[2] = new Rectangle1();
		rarr[2].serialno = ++Rectangle.cnt; //3
		rarr[2].width = 15;
		rarr[2].height = 2;
		
		for(Rectangle1 r : rarr) {
			r.area();
			r.length();
			if(r.isSquare()) {
				System.out.println(r.serialno + "번 사각형은 정사각형 입니다.");
			} else {
				System.out.println(r.serialno + "번 사각형은 직사각형 입니다.");
			}
			System.out.println();
		}
		
		
	}
}
