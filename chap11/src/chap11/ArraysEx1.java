package chap11;

import java.util.Arrays;

/*
 * Arrays Ŭ���� ���� : �迭�� ����, ��, ���� �� ����� �����ϰ� �ִ� Ŭ����
 */
public class ArraysEx1 {
	public static void main(String[] args) {
		String[] arr1 = {"����", "�̸���", "���", "����"};
		for(String s : arr1) System.out.print(s + ", ");
		System.out.println();
		Arrays.fill(arr1, "������");  //Arrays.fill(arr, "") : �迭�� ������ ���� ""���� �ٲ��.
		for(String s : arr1) System.out.print(s + ", ");
		System.out.println();
		Arrays.fill(arr1, 1, 3,  "������");  //Arrays.fill(arr, i, j, "") : �迭�� i���� j-1������ ������ ""���� �ٲ��.
		for(String s : arr1) System.out.print(s + ", ");
		System.out.println();
		
		//���� : ������ �迭 100���� ���� ���� �迭�� �����Ͽ�, ��� ���� 100���� �����ϱ�.
		int[] intArr = new int[100];
		Arrays.fill(intArr, 100);
		for(int i : intArr) System.out.print(i + ", ");
		System.out.println();
		
		String[] arr2 = {"����", "�̸���", "���", "����"};
		Arrays.sort(arr2);  //�������� �����ϱ�
		for(String s : arr2) System.out.print(s + ", ");
		System.out.println();
		
	}
}
