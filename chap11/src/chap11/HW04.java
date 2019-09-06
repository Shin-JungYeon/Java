package chap11;
/*
 * 4. 다음 결과가 나오도록 정의된 메서드를 구현하기
 *      메서드명 : fillZero
 *      기능 : 주어진 문자열(숫자)로 주어진 길이의 문자열로 만들고, 왼쪽 빈 공간은 0으로 채운다.
 *           만일 주어진 문자열이 null이거나 문자열의 길이가 length의 값과 같으면 그대로 반환한다.
 *           만일 주어진 length의 값이 0과 같거나, 작은 값이면 빈 문자열("")을 반환한다.
 *      반환타입 : String
 *      매개변수 : String src, int length
 * 
 * [결과]
 * 0000012345
 * 
 * 123
 * null
 * 
 * 강사님꺼 다시 보기.
 */
public class HW04 {
	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
		System.out.println(fillZero(null,3));
	}
	
	private static String fillZero(String src, int length) {
		StringBuffer sb = new StringBuffer();
		sb.append(src);
		
		if((src == null)||(length == src.length())) {
			return src;
		}
		if(length <= 0) {
			return "";
		}
		if(length < src.length()) {
			sb.delete(length, src.length());
		}
		if(length >= src.length()) {
			for(int i=0; i<length-src.length(); i++) {
				sb.insert(i, "0");
			}
//			String re="";
//			for(int i=0; i<length-src.length(); i++) {
//				re += "0";
//			}
//			return re+src;
		}
		return sb.toString();
	}
	
}
