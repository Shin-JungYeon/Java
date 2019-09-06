package chap5;
/*
 * command 라인에서 숫자를 입력받아 소수인지 판별하시오.
 */
public class Ex06 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("command 에 파라미터를 입력하세요.");
			return; //메인 메서드 종료
		}
		
		int num = Integer.parseInt(args[0]); //문자열 -> 정수
//		int[] nu= new int[num];
		int cnt=0;
		for(int i=0; i<num; i++) {
//			nu[i] = num%(i+1);
			if(num%(i+1)==0) {
				cnt++;
			}
		}
		if(cnt==2) {
			System.out.println(num + "은/는 소수입니다.");
		} else {
			System.out.println(num + "은/는 약수가 " + cnt + "개 있습니다. 소수가 아닙니다.");
		}
		
	}
}