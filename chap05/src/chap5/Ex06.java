package chap5;
/*
 * command ���ο��� ���ڸ� �Է¹޾� �Ҽ����� �Ǻ��Ͻÿ�.
 */
public class Ex06 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("command �� �Ķ���͸� �Է��ϼ���.");
			return; //���� �޼��� ����
		}
		
		int num = Integer.parseInt(args[0]); //���ڿ� -> ����
//		int[] nu= new int[num];
		int cnt=0;
		for(int i=0; i<num; i++) {
//			nu[i] = num%(i+1);
			if(num%(i+1)==0) {
				cnt++;
			}
		}
		if(cnt==2) {
			System.out.println(num + "��/�� �Ҽ��Դϴ�.");
		} else {
			System.out.println(num + "��/�� ����� " + cnt + "�� �ֽ��ϴ�. �Ҽ��� �ƴմϴ�.");
		}
		
	}
}