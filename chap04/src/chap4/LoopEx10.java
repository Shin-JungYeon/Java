package chap4;
/*
 * 1���� 100������ �� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���� ���� ���Ͽ� ����ϱ�
 */
public class LoopEx10 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1 ; i<=100 ; i++) {
			if(i%2==0 || i%3==0) continue;
			sum += i;
			//System.out.print(i + " ");
		}
		System.out.println(sum);
		
	}
}