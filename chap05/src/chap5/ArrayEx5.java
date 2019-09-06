package chap5;
/*
 * Lotto ��ȣ �����ϱ�
 * 1 ~ 45 ������ �� �߿��� ���Ƿ� 6���� ������. �ߺ� �Ұ�
 */
public class ArrayEx5 {
	public static void main(String[] args) {
		//1. 1 ���� 45������ ���� ���� �迭 ����, �ʱ�ȭ
		int[] balls = new int[45];
		for(int i=0; i<balls.length; i++) {
			balls[i] = (i+1);
		}
		
		//2. �迭�� �� ����, ���Ƿ� �迭�� �ε��� 2���� ã�Ƽ� �� ���� ���� �ٲٱ� 1000��
		for(int i=0; i<1000; i++) {
			int f = (int)(Math.random()*45);
			int t = (int)(Math.random()*45);
			//balls[t] <-- balls[f]
			//balls[f] <-- balls[t]
			int tmp = balls[f];  //t�ε��� ���� �ٷ� f�ε��� ���� ������ f�ε����� �ִ� ���� �ƿ� �����, �̰��� �����ϱ� ���� ���� ����.
			balls[f] = balls[t];
			balls[t] = tmp;			
		}
		
		//3. lotto �迭�� balls �迭�� 0 ~ 5 ������ ���� lotto �迭�� ����.
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = balls[i];
		}
		
		for(int b : lotto) {
			System.out.print(b + ", ");
		}
		System.out.println();
		
		//4. lotto ��ȣ �����Ͽ� ����ϱ�.
		for(int i=0; i<lotto.length; i++) {
			boolean change = false;
			for(int j=0; j<lotto.length-i-1; j++) {
				if(lotto[j]> lotto[j+1]) {
					int tmp = lotto[j];
					lotto[j]= lotto[j+1];
					lotto[j+1]= tmp;
					change= true;
				}
			}
			if(!change) break;
		}
		for(int b : lotto) {
			System.out.print(b + ", ");
		}
		System.out.println();
		
	}
}
