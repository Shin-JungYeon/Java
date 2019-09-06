package chap11;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
	public static void main(String[] args) {
		String text = "홍길동/이수홍//박연수";
		StringTokenizer st = new StringTokenizer(text, "/");  //text를 "/" 기준으로 토큰화, Token : 의미 있는 하나의 문자열.

		int cnt = st.countTokens();  //현재 남아 있는 토큰의 갯수
		for(int i=0; i<cnt; i++) {
			System.out.println(st.nextToken());  //토큰 한 개를 꺼내옴. -> 남아있는 토큰의 갯수가 줄어듦. -> 반복 조건이 바뀜.
		}
		
		System.out.println();
		
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {  //다음 토큰이 존재 해?, 토큰화 할 때 이렇게 사용하는 것이 맞음. 남아 있는 갯수가 아닌 존재 여부가 반복 조건이 됨.
			System.out.println(st.nextToken());
		}
		
		System.out.println();
		
		System.out.println("split() 메서드 이용하기.");
		String[] tarr = text.split("/");  //배열로 저장.
		for(int i=0; i<tarr.length; i++) {
			System.out.println(tarr[i]);
		}
		
		//Tokenizer 는 의미없는 토큰(공백) 무시. split은 나타냄. -> 실행해보면 알 수 있음.
	}
}
