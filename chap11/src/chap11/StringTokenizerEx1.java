package chap11;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ//�ڿ���";
		StringTokenizer st = new StringTokenizer(text, "/");  //text�� "/" �������� ��ūȭ, Token : �ǹ� �ִ� �ϳ��� ���ڿ�.

		int cnt = st.countTokens();  //���� ���� �ִ� ��ū�� ����
		for(int i=0; i<cnt; i++) {
			System.out.println(st.nextToken());  //��ū �� ���� ������. -> �����ִ� ��ū�� ������ �پ��. -> �ݺ� ������ �ٲ�.
		}
		
		System.out.println();
		
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {  //���� ��ū�� ���� ��?, ��ūȭ �� �� �̷��� ����ϴ� ���� ����. ���� �ִ� ������ �ƴ� ���� ���ΰ� �ݺ� ������ ��.
			System.out.println(st.nextToken());
		}
		
		System.out.println();
		
		System.out.println("split() �޼��� �̿��ϱ�.");
		String[] tarr = text.split("/");  //�迭�� ����.
		for(int i=0; i<tarr.length; i++) {
			System.out.println(tarr[i]);
		}
		
		//Tokenizer �� �ǹ̾��� ��ū(����) ����. split�� ��Ÿ��. -> �����غ��� �� �� ����.
	}
}
