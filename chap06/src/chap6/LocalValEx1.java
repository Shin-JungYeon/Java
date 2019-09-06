package chap6;
/*
 * 지역 변수 예제 : 지역 변수는 메서드(함수) 내부에서 선언된 변수다.
 *              매개 변수는 지역 변수다.
 *              모든 지역 변수는 초기화 되어야 한다.
 */
/*
 * void main(String[] args)
 * 리턴값 이름(자료형 매개변수)
 */
public class LocalValEx1 {
	public static void main(String[] args) {
		int num;
		boolean b = true;
		if(b) {
			num = 100;
		} else {
			num = 200;
		}  //else 없으면 에러, num이 초기화 안될 가능성 있기 때문에. 처음에 0으로 초기화 되었다면 에러발생하지 않음.
		System.out.println(num);
		
		String grade;
		int score = 80;
		switch(score/10) {
			case 9 : grade = "A"; break;
			case 8 : grade = "B"; break;
			case 7 : grade = "C"; break;
			case 6 : grade = "D"; break;
			default : grade = "F"; //default 없으면 에러, 반드시 초기화 필요.
		}
		System.out.println(grade + "학점");
		
		
	}
}
