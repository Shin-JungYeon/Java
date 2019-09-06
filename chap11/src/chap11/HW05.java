package chap11;
/*
 * 5. ����� �������� �޼��� �����ϱ�
 *      �޼���� : format
 *      ��� : �־��� ���ڿ��� ������ ũ���� ���ڿ��� ��ȯ. ������ ������ ��������ä���.
 *      ��ȯŸ�� : String
 *      �Ű����� : String str, int length, int alignment (0 : ���� ����, 1: ��� ����, 2:������ ����)
 *                                 
 * [���]
 *  ������****
 *  **������**
 *  ****������
 *  ����             
 */
public class HW05 {
	public static void main(String[] args) {
		String str = "������";
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));
		System.out.println(format(str, 2, 0));
	}

	private static String format(String str, int length, int alignment) {
		if(str.length() >= length) return str.substring(0, length);
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<length; i++) {
			sb.append('*');  //���� ä���ְ� ���� ���ڿ��� ��ü�ϱ�.
		}
		switch(alignment) {
		case 0 : sb.replace(0, str.length(), str); break;
		case 1 : sb.replace((length-str.length())/2, (length-str.length())/2+str.length(), str); break;
		case 2 : sb.replace(length-str.length(), length, str); break;
		}
		return sb.toString();
		
//		StringBuffer sb = new StringBuffer();
//		sb.append(str);
//		if(sb.length() > length) {
//			sb.delete(length, str.length());
//		} else {
//			for(int i=0; i<length-str.length(); i++) {
//				sb.insert(str.length(), "*");
//			}
//		}
//		
//		switch(alignment) {
//		case 0 : break;
//		case 1 :
//			for(int i=0; i<length-str.length(); i++) {
//				sb.insert(0, "*");
//			} break;
//		case 2 :
//			for(int i=0; i<length-str.length(); i++) {
//				sb.insert(0, "*");
//			} break;
//		}
//		
//		return sb.toString();
	}
	
}
