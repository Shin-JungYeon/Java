package chap14;
/*
 * Runnable �������̽� ���� ��ü�� ���ٽ����� ǥ���ϱ�.
 */
public class LambdaEx2 {
	public static void main(String[] args) {
		//��� 1
		Runnable r = () -> {
			int sum = 0;
			for(int i=1; i<=100; i++) {
				sum += i;
			}
			System.out.println("1. 1���� 100������ �� : " + sum);
		};
		Thread t = new Thread(r);
		t.start();
		
		//��� 2(�Ű����� ����) �Ű����� ��� ���� ���ٽ� �־��� �� ����.
		Thread t2 = new Thread(() -> {
			int sum = 0;
			for(int i=1; i<=100; i++) {
				sum += i;
			}
			System.out.println("2. 1���� 100������ �� : " + sum);
		});
		t2.start();
		
		System.out.println("main �޼��� ����.");
	}
}
