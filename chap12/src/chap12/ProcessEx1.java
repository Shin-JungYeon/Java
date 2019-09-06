package chap12;
/*
 * Process : OS ���¿��� �������� ���α׷�.
 *           ���μ��� ���� �޸� ���� �Ұ�. �Ϻ��ϰ� �����Ǿ� �ִ� ȯ��.
 *           �ϳ��� ���μ��� ������ ������ ���� �޸� ������ ����. ���� ȯ���� ����.
 * 
 * Runtime : Runtime.getRuntime() : OS�κ��� ���μ����� ���� ������ �޾� ��.
 */
public class ProcessEx1 {
	public static void main(String[] args) {
		try {
			Process p1 = Runtime.getRuntime().exec("calc.exe");
			Process p2 = Runtime.getRuntime().exec("mspaint.exe");
			Process p3 = Runtime.getRuntime().exec("notepad.exe");
//			p1.waitFor();
//			p2.waitFor();
//			p3.waitFor();
			System.out.println("main �޼��� ����");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
