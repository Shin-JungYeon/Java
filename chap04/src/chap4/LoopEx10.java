package chap4;
/*
 * 1부터 100까지의 수 중 2의 배수도 아니고 3의 배수도 아닌 수의 합을 구하여 출력하기
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