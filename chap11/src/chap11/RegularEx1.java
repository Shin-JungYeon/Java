package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ���� ǥ���� ���� : ������ ������ �����Ͽ� ����Ȱ �� �ִ� ���.
 */
public class RegularEx1 {
	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus", "cA", "ca", "cp", "c.",
				         "car","combat","count", "cTT", "data", "disk", "c"};
		Pattern p = Pattern.compile("c[a-zA-Z]*");
		/*
		 * c[a-z]* : ù ��° ���ڰ� c�̸鼭 ���� ���ڰ� [a-z](�ҹ���)�� *��(0�� �̻�, ��� ��)�� ���ڿ� ����.
		 * c[a-z]+ : c ���� �ҹ��ڰ� 1�� �̻�.
		 * c[a-z]? : c ���� �ҹ��� 1�� �Ǵ� ��� ��.
		 */
		for(String s : data) {
			Matcher m = p.matcher(s);  //data�� ���� p�� ���Ŀ� ��ġ�ϴ� �� �Ǵ�.
			if(m.matches()) {
				System.out.print(s + ", ");
			}
		}
		
		System.out.println();
		
		String names = "ȫ�浿,     ���,�̸���    ,   ������  ,   �Ӳ���";
		String[] arr = names.split("\\s*,\\s*");
		//  \\s*, \\s* : , �� �ڷ� *(0�� �̻�)�� \\s(����)���� �����ؼ� ������.
		// split(String regex) : regex ���Խ� ǥ�� ���.
		for(String s : arr) {
//			System.out.println(s.trim());  //�� �� ���� ����.
			System.out.println(s);
		}
	}
}
