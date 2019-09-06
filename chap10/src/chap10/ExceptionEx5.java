package chap10;

public class ExceptionEx5 {
	public static void main(String[] args) throws InterruptedException {
		for(int i=1; i<=5; i++) {
			Thread.sleep(1000);  //예외처리를 반드시 해줘야 하는 메서드.
			System.out.println(i);
		}
	}
}
