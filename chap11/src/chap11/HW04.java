package chap11;
/*
 * 4. ���� ����� �������� ���ǵ� �޼��带 �����ϱ�
 *      �޼���� : fillZero
 *      ��� : �־��� ���ڿ�(����)�� �־��� ������ ���ڿ��� �����, ���� �� ������ 0���� ä���.
 *           ���� �־��� ���ڿ��� null�̰ų� ���ڿ��� ���̰� length�� ���� ������ �״�� ��ȯ�Ѵ�.
 *           ���� �־��� length�� ���� 0�� ���ų�, ���� ���̸� �� ���ڿ�("")�� ��ȯ�Ѵ�.
 *      ��ȯŸ�� : String
 *      �Ű����� : String src, int length
 * 
 * [���]
 * 0000012345
 * 
 * 123
 * null
 * 
 * ����Բ� �ٽ� ����.
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
