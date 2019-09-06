package chap5;
/*
 * 배열의 선언, 생성, 초기화
 */
public class ArrayEx4 {
	public static void main(String[] args) {
		//배열의 선언, 생성, 초기화 한 줄에 구현
		int arr[] = {10, 20, 30, 40, 50};
//		for(int a : arr) {
//			System.out.println(a);
//		}
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] =" + arr[i]);
		}
		
		System.out.println("생성 초기화만 할 때");
		arr = new int[] {100, 200, 300, 400, 500, 600, 700, 800};
		//생성, 초기화, 기존에 존재하던 배열에 다른 값을 넣어줄 때, int[]에 숫자 절대 넣어주면 안 됨.
		//값이 직접 바뀌는 것이 아님, 새로운 메모리 할당, 이 전의 객체와는 참조를 끊음 > 쓰레기통 행(값만 비워지는 것이 아니라 객체가 아예 사라짐), 새로운 생성, 초기화가 꼭 5개일 필요 없음
//		for(int a : arr) {
//			System.out.println(a);
//		}
		for(int i=0; i<arr.length; i++) {  //객체가 순간순간 동적으로 바뀔 수 있음, 때문에 arr.length 사용하는 것이 좋음.
			System.out.println("arr[" + i + "] =" + arr[i]);
		}
		
		String[] strarr = {"홍길동", "김삿갓", "이몽룡"};
		for(String s : strarr) {
			System.out.println(s);
		}
		
	}
}