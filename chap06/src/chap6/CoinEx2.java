package chap6;
/*
 * 두 개의 동전을 던져서 연속하여 앞면이 3번 나오면 승리하는 프로그램 작성.
 */
public class CoinEx2 {
	public static void main(String[] args) {
		//같은 패키지 안에서 만들어진 클래스 사용 가능
		Coin mycoin = new Coin(); //Coin 객체를 참조하는 참조변수 mycoin
		Coin youcoin = new Coin();
//		System.out.println("mycoin\tyoucoin");
//		int[] myc = new int[10];
//		int[] youc = new int[10];
//		int i=0;
//		
//		while(true) {
//			mycoin.flip();
//			switch(mycoin.side) {
//			case 0 : System.out.print("앞면\t"); break;
//			case 1 : System.out.print("뒷면\t"); break;
//			}
//			myc[i] = mycoin.side;
//			youcoin.flip();
//			switch(youcoin.side) {
//			case 0 : System.out.print("앞면\t"); break;
//			case 1 : System.out.print("뒷면\t"); break;
//			}
//			youc[i] = youcoin.side;
//			
//			
//			if(i>2) {
//				if(myc[i]==myc[i-1] && myc[i-1]==myc[i-2]) {
//					System.out.println("mycoin 승리");
//					break;
//				} else(youc[i]==youc[i-1] && youc[i-1]==youc[i-2]){
//					System.out.println("youcoin 승리");
//					break;
//				}
//				
//			}
//			i++;
//			System.out.println();
//			
//			if(i==10) break; 
//		}
		
		
		int mycnt=0, youcnt=0;
		System.out.println("mycoin\tyoucoin");
		while(true) {
			mycoin.flip();
			youcoin.flip();
			
			if(mycoin.side == 0) {
				System.out.print("앞면\t");
				mycnt++;
			} else {
				System.out.print("뒷면\t");
				mycnt = 0;
			}
			if(youcoin.side == 0) {
				System.out.println("앞면\t");
				youcnt++;
			} else {
				System.out.println("뒷면\t");
				youcnt = 0;
			}
			if(mycnt == 3 || youcnt == 3) {
				break;
			}
		}
		if(mycnt > youcnt) System.out.println("mycoin 승리");
		else if(mycnt < youcnt) System.out.println("youcoin 승리");
		else System.out.println("둘이 비김");
		
		String str = new String("abc");
		str = new String("가나다");
//		str = new Coin();  //참조변수의 자료형과 참조변수 같아야함.
		
	}
}
