package chap11;
/*
 * indexof(���ڿ�) : ���ڿ��� �����ϸ� ���ϰ��� 0 �̻�.
 *                        ������ ���ϰ��� -1.
 */
public class Exam1 {
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "12"));  //2
		System.out.println(count("12345AB12AB345AB", "AB"));  //3
		System.out.println(count("12345", "6"));  //0
	}

	private static int count(String str, String str2) {
		int index = 0;
		int count = 0;
		while(true) {
			index = str.indexOf(str2, index);
			if(index >= 0) {
				index++;
				count++;
			} else {
				break;
			}
		}
		return count;
	}
	
}
