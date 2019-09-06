package chap4;
/* for문을 이용해서 1부터 100까지의 정수 중 3의 배수의 총합을 구하시오.
 * [정답]
 * 3의 배수의 합 : 1683
 */
public class Exercise03 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1 ; i<=100 ; i++) {
			if(i%3==0)
				sum += i;
		}
		System.out.println("3의 배수의 합 : " + sum);
			
	}

}
