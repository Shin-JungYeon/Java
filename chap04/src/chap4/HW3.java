package chap4;
/*
 3. ������ 2x+4y=10�� ��� �ظ� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
   �� x�� y�� �����̰�  ������ ������ 0<=x<=10, 0<=y<=10
 */
public class HW3 {
	public static void main(String[] args) {
		for(int x=0 ; x<=10 ; x++) {
			for(int y=0 ; y<=10 ; y++) {
				if(2*x+4*y==10)
					System.out.print("x = " + x + ", " + "y = " + y);
			}
			System.out.println();
		}
		
	}
}
