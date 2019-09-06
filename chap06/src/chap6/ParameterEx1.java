package chap6;
/*
 * 매개변수 예제
 *    기본형 매개변수 : 조회만 가능
 *                 값이 복사되어 호출되기 때문에 원래 객체의 값은 보존
 *    참조형 매개변수 : 조회와 변경 가능
 *                 참조값이 복사되기 때문에 원래의 객체값이 변경될 수 있음.
 */
class ParamVal {
	int val;
}
public class ParameterEx1 {
	public static void main(String[] args) {
		ParamVal pv = new ParamVal();
		pv.val = 100;  //ParamVal 클래스의 val 값을 100으로 초기화.
		change1(pv.val);  //값을 넣어줌.
		System.out.println("main => change1() 이후 : " + pv.val); //결과가 100으로 값이 변하지 않음.
		change2(pv);  //객체 자체를 넣어줌.
		System.out.println("main => change2() 이후 : " + pv.val); //200
	}

	private static void change1(int val) {  //val에 pv.val(100) 대입
		val += 100;
		System.out.println("change1() : val = " + val); //200
	}

	private static void change2(ParamVal pv) {
		pv.val += 100;  //객체가 다시 val을 참조해서 100을 가져온 후 거기에 100을 더해줌.
		System.out.println("change2() : val = " + pv.val); //200
	}
	
}
