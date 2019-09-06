package chap14;

import java.util.function.IntBinaryOperator;

/*
 * Operator FunctionInterface ����
 *   Function �������̽��� ���� �������̽�.
 *   �Ű����� �ְ�, ���ϰ��� ����.
 *   Function�� ��������� �� �Ű����� ������ ��Ұ��� ���� ���꿡 ����.
 *   
 *   1. IntBinaryOperator : int applyAsInt(int, int) : int���� �Ű����� �� ���� �޾� int�� ���� ����.
 *   ...
 */
public class LambdaEx9 {
	private static int[] score = {92, 85, 87};
	public static void main(String[] args) {
		System.out.println("�ִ밪 : " + maxOrMin((a, b) -> (a>=b)?a:b));
		System.out.println("�ּҰ� : " + maxOrMin((a, b) -> (a<=b)?a:b));
	}
	//op : (a, b) -> (a>=b)?a:b)  //�� �� ū �� ����.
	//op : (a, b) -> (a<=b)?a:b)  //�� �� ���� �� ����.
	private static int maxOrMin(IntBinaryOperator op) {
		int result = score[0];
		for(int s : score) {
			result = op.applyAsInt(result, s);
		}
		return result;
	}
}
