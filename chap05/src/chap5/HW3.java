package chap5;
/*
 * 3.  "cloudinary is a cloud service that offers a solution to a web application's entire image management pipeline" 문자열에 사용된 알파벳의 갯수를 출력하기
 */
public class HW3 {
	public static void main(String[] args) {
		String s = "cloudinary is a cloud service that offers a solution to a web application's entire image management pipeline";
		int cnt=0;
		
		for(int i='a'; i<='z'; i++) {
			
			for(int j=0; j<s.length(); j++) {
				char ch = s.charAt(j);
				if(ch==i) cnt++;
			}
			System.out.println((char)i + " : " + cnt);
			cnt=0;
		}
		
//		int[] arr = new int[26];
//		for(int i=0; i<s.length(); i++) {
//			char cha = s.charAt(i);
//			if(cha >='a' && cha <='z') {  //소문자인 경우만
//				arr[cha-'a']++;
//			}
//		}
//		for(int i=0; i<arr.length; i++) {
//			System.out.println((char)(i+'a') + " : " + arr[i] + "개");
//		}
		
	}
}
