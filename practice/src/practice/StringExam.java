package practice;
/*
 * 다음의 결과가 나오도록  프로그램을 완성하시오.
 * 
 * [결과]
 * (1!2@3^4~5),!@^~() -> 12345
 * (1!2@3^4~5),12345 -> (!@^~)
 */
public class StringExam {
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5),!@^~() -> " + delChar("(1!2@3^4~5)", "!@^~()"));
		System.out.println("(1!2@3^4~5),12345 -> " + delChar("(1!2@3^4~5)", "12345"));
	}

//	private static String delChar(String string, String string2) {
//		String str = string;
//		for(int i=0; i<string2.length(); i++) {
//			str = str.replace((string2.substring(i,i+1)), "");
//		}
//		return str;
//	}
//	
	
//	 private static String delChar(String str1, String str2) {
//		String sb = "";
//		for(int i=0; i<str1.length(); i++) {
//			if(str2.indexOf(str1.charAt(i)) < 0) {
//				sb += str1.charAt(i);
//			}
//		}
//		return sb;
//	}
	
	private static String delChar(String str1, String str2) {
		StringBuffer sb = new StringBuffer();  //StringBuffer 이용, 계속해서 문자가 더해지는 경우.
		for(int i=0; i<str1.length(); i++) {
			if(str2.indexOf(str1.charAt(i)) < 0) {
				sb.append(str1.charAt(i));
			}
		}
//		sb.append(str1);
//		for(int i=0; i<str2.length(); i++) {
//			sb.deleteCharAt(str1.indexOf(str2.charAt(i)));
//		}
		return sb.toString();
	}
	
}