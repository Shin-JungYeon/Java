package chap6;
/*
 * �� ���� ������ ������ �����Ͽ� �ո��� 3�� ������ �¸��ϴ� ���α׷� �ۼ�.
 */
public class CoinEx2 {
	public static void main(String[] args) {
		//���� ��Ű�� �ȿ��� ������� Ŭ���� ��� ����
		Coin mycoin = new Coin(); //Coin ��ü�� �����ϴ� �������� mycoin
		Coin youcoin = new Coin();
//		System.out.println("mycoin\tyoucoin");
//		int[] myc = new int[10];
//		int[] youc = new int[10];
//		int i=0;
//		
//		while(true) {
//			mycoin.flip();
//			switch(mycoin.side) {
//			case 0 : System.out.print("�ո�\t"); break;
//			case 1 : System.out.print("�޸�\t"); break;
//			}
//			myc[i] = mycoin.side;
//			youcoin.flip();
//			switch(youcoin.side) {
//			case 0 : System.out.print("�ո�\t"); break;
//			case 1 : System.out.print("�޸�\t"); break;
//			}
//			youc[i] = youcoin.side;
//			
//			
//			if(i>2) {
//				if(myc[i]==myc[i-1] && myc[i-1]==myc[i-2]) {
//					System.out.println("mycoin �¸�");
//					break;
//				} else(youc[i]==youc[i-1] && youc[i-1]==youc[i-2]){
//					System.out.println("youcoin �¸�");
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
				System.out.print("�ո�\t");
				mycnt++;
			} else {
				System.out.print("�޸�\t");
				mycnt = 0;
			}
			if(youcoin.side == 0) {
				System.out.println("�ո�\t");
				youcnt++;
			} else {
				System.out.println("�޸�\t");
				youcnt = 0;
			}
			if(mycnt == 3 || youcnt == 3) {
				break;
			}
		}
		if(mycnt > youcnt) System.out.println("mycoin �¸�");
		else if(mycnt < youcnt) System.out.println("youcoin �¸�");
		else System.out.println("���� ���");
		
		String str = new String("abc");
		str = new String("������");
//		str = new Coin();  //���������� �ڷ����� �������� ���ƾ���.
		
	}
}
