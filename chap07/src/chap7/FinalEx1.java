package chap7;
/*
 * final ������ ����
 * (abstract(�� �ٽ� �Ἥ ��������� ��)�� �ݴ�)
 * final class : ���� Ŭ����, ��� �Ұ� Ŭ����
 *               �ٸ� Ŭ������ �θ�Ŭ������ �� �� ����.
 * final method : ���� �޼���, ������(�������̵�) �Ұ� �޼���
 * final value : ���, ���� �Ұ� ����
 *               �ν��Ͻ� ������ ��� �����ڿ��� �� �� �� ����(�ʱ�ȭ) ����. �� ����� �ʱ�ȭ �Ǿ����� �ʾƾ� ��.
 *               
 * final �����ڿ� abstract �����ڴ� �Բ� ����� �� ����. �ݴ� �ǹ̸� ������ ����.
 */
//final class Parent4 {
class Parent4 {
//	final void method() {
	void method() {
		System.out.println("Parent4 Ŭ������ �޼���");
	}
}
class Child4 extends Parent4 {
//	final int val = 100;  //�ڹٿ����� const ����� ������� ����.
	int val = 100;
	void method() {
		System.out.println("Child4 Ŭ������ �޼���");
		System.out.println(val += 10);
	}
}

public class FinalEx1 {
	public static void main(String[] args) {
		
	}
}
