package chap5;
/*
 * command line���� �����ϳ��� �Է¹޾� ������ ����� ȭ�鿡 ����ϱ�
 * Integer.parseInt(String) �޼��� �̿�, String �迭�� �Էµ� ���ڿ��� �״�� int ������ �о��. "10" -> 10
 * int num = Integer.parseInt(args[0]);
 */
public class ArrayEx12 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("command �� �Ķ���͸� �Է��ϼ���.");
			return;
		}
		
		int num = Integer.parseInt(args[0]);
		
		System.out.print(num + "�� ��� : ");
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				System.out.print(i + "\t");
			}
		}
		System.out.println();
		
	}
}
