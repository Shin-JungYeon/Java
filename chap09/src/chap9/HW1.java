package chap9;
/*
 * 1. ���� �ҽ��� ������ ������ �߻��Ѵ�. ����� "Tested" �� ��µǵ��� ���α׷��� �����ϰ� ������ ������ �����ϱ�.
 */
interface Beta {}

class Alpha implements Beta {
	String testIt() {
		return "Tested";
   }
}
public class HW1 {
	static Beta getIt() {
		return new Alpha();
	}
	public static void main(String[] args) {
		 Beta b = getIt();
		 System.out.println( ((Alpha)b).testIt() );  //b�� �ڷ����� Alpha�� ����ȯ ����.
	}
}
//testIt() �޼���� AlphaŬ������ ����̴�. �׷��� b�� �ڷ����� Beta�̹Ƿ� AlphaŬ������ ����� ���� �Ұ�. �׷��� ������ ����ȯ�� �ʿ��ϴ�.
//��ĥ �� �ִ� ����� �پ�.