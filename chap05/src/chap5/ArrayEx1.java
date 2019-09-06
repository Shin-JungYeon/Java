package chap5;
/*
 * 배열 예제1
 */
public class ArrayEx1 {
	public static void main(String[] args) {
		int[] arr1;  //배열 참조변수 선언, 배열의 선언.
		arr1 = new int[5];  //배열 객체 생성, 배열의 생성
		arr1[0] = 10;  //원래는 0으로 초기화 되어 있음, 기본값은 0.
		arr1[1] = 40;
		arr1[2] = 30;
		for(int i=0; i<arr1.length; i++) {  //index는 0 ~ length-1
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}
		System.out.println();
		
		int[] arr2 = new int[10];
		arr2 = arr1;  //arr1과 같은 배열을 참조, 원래 arr2가 참조하던 배열은 버려짐.
		arr2[3] = 100;  //같은 배열을 참조하기 때문에 arr1[3]도 100값을 갖게 됨.
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
		System.out.println();
		
		//개선된 for 구문, 첨자(index) 사용 불가
		for(int a : arr1) {
			System.out.println(a);
		}
	}
}
