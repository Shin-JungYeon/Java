package chap5;
/*
 * �迭 ����1
 */
public class ArrayEx1 {
	public static void main(String[] args) {
		int[] arr1;  //�迭 �������� ����, �迭�� ����.
		arr1 = new int[5];  //�迭 ��ü ����, �迭�� ����
		arr1[0] = 10;  //������ 0���� �ʱ�ȭ �Ǿ� ����, �⺻���� 0.
		arr1[1] = 40;
		arr1[2] = 30;
		for(int i=0; i<arr1.length; i++) {  //index�� 0 ~ length-1
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}
		System.out.println();
		
		int[] arr2 = new int[10];
		arr2 = arr1;  //arr1�� ���� �迭�� ����, ���� arr2�� �����ϴ� �迭�� ������.
		arr2[3] = 100;  //���� �迭�� �����ϱ� ������ arr1[3]�� 100���� ���� ��.
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
		System.out.println();
		
		//������ for ����, ÷��(index) ��� �Ұ�
		for(int a : arr1) {
			System.out.println(a);
		}
	}
}
