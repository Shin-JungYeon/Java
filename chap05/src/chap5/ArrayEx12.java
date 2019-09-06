package chap5;
/*
 * command line에서 숫자하나를 입력받아 숫자의 약수를 화면에 출력하기
 * Integer.parseInt(String) 메서드 이용, String 배열에 입력된 문자열을 그대로 int 값으로 읽어옴. "10" -> 10
 * int num = Integer.parseInt(args[0]);
 */
public class ArrayEx12 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("command 에 파라미터를 입력하세요.");
			return;
		}
		
		int num = Integer.parseInt(args[0]);
		
		System.out.print(num + "의 약수 : ");
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				System.out.print(i + "\t");
			}
		}
		System.out.println();
		
	}
}
