package chap11;
/*
 * StringBuffer Ŭ������ �ֿ� �޼���
 *   1. ������ ���ڿ�. -> ���� �߰��� ��ü ��ü�� �߰� ��.
 *   2. String Ŭ������ ���� ���� ���.
 *   3. StringBuilder Ŭ������ ��� �޼��尡 ������. -> jdk5.0 ���� �߰��� Ŭ����. 
 *      StringBuffer : ��Ƽ������ ȯ�濡�� ���, Thread�� safe ��. ��� �޼��尡 ����ȭ �Ǿ� �ִ�.
 *      StringBuilder : �̱۽����� ȯ�濡�� ���, Thread�� unsafe ��. " ����ȭ �Ǿ� ���� �ʴ�. �Ȱ�����! ������ �� ����. ����� ��� ���� ���.
 */
public class StringBufferEx2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("abc").append(123).append(true);  //���� ��ü�� ������ �ʰ�, ���ڿ��� �ٲ㼭 �̾ ��� ����.
		System.out.println(sb);
		
		sb.delete(1, 3);  //index 1 ���� 3 �ձ���(2 ����) ����.
		System.out.println(sb);
		
		sb.deleteCharAt(4);  //index 4�� ° ���� �� �� ����.
		System.out.println(sb);
		
		sb.insert(5, "@@");  //index 5�� °�� @@ �߰�. �� ���� ���ڴ� �ڷ� �и�.
		System.out.println(sb);
		
		sb = new StringBuffer("ABCDEFG");  //���ο� ��ü ����.
		sb.replace(0, 3, "abc");  //index 0���� 3 �ձ���(2����) ���ڿ� ��ü(����)
		System.out.println(sb);
		
		sb.reverse();  //���� ������
		System.out.println(sb);
		
		//���� �� ���ο� ��ü�� ��������� ���� �ƴ϶� �� �ȿ��� ��� ����.
		
	}
}
