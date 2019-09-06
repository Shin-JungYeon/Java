package chap8;

//import chap8.packtest.Pack1;  //Pack1 Ŭ������ ��Ű���� ����
import chap8.packtest.*;  //chap8.packtest ��Ű���� ��� Ŭ������ ��Ű������ ����

/*
 * package : Ŭ������ �������̽����� ���� -> ������ ����(���� ��ü�� ��Ű���� �ƴ�)
 *   1. Ŭ�������� ����
 *   2. Ŭ������ �̸��� ��Ű������ �����Ѵ�.
 *       String -> java.lang.String
 *   3. package ������ ������ ó����(���� ���ٿ�) �� ���� �� �� �ִ�. -> �ϳ��� ���Ͽ� �ִ� ��� Ŭ������ ���� ��Ű���� �ִ� Ŭ������ �ȴ�.
 *   
 * import : Ŭ���� ���� ��Ű������ ���� �� �� �ֵ��� ����.
 * 
 * ��Ű���� ���� ������ ���
 *   1. ����ϴ� Ŭ������ ���Ǵ� Ŭ������ ���� ��Ű���� Ŭ������ ���
 *   2. java.lang ��Ű���� ���� Ŭ������ ��� (String, System, ...)
 *   3. import ������ ������ ��Ű���� ���� Ŭ������ ��� (Scnner, ...) 
 *   
 * ���������� : private < (default) : ������ ��� < protected < public 
 *         :           < ���� ��Ű���� ���� Ŭ������ ���� ���� < 
 *         
 * 				����Ŭ����		������Ű��		���		�� ��
 *  private		   O		   X		 X		 X
 * (default)	   O		   O		 X		 X
 * protected	   O		   O		 O		 X
 *   public		   O		   O		 O		 O
 * 
 * ��� : private, (default), protected, public
 * Ŭ���� : (default), public
 */
class Test extends Pack1 {
	void testmethod() {
//		method();  //default �����������̹Ƿ� ���� �Ұ�
		method2();  //protected �����������̹Ƿ� ��Ӱ��迡�� ���� ���
	}
}
public class PackageEx1 {
	public static void main(String[] args) {
//		chap8.packtest.Pack1 p = new chap8.packtest.Pack1();  //import ���� �ʰ� ȣ��. ������ �ʹ� ��ϱ� import ����ؼ� ��Ű���� ����
		System.out.println("��Ű�� ����");
		
		Pack1 p = new Pack1();
//		p.method();  //PackageEx1 Ŭ�������� Pack1 Ŭ������ method() ���� �Ұ���. default ���� ������
//		p.method2();  //PackageEx1 Ŭ�������� Pack1 Ŭ������ method2() ���� �Ұ���. protected ���� ������
		Test t = new Test();  //���� ��Ű���� �ִ� Ŭ������ import���̵� ��Ű���� ���� ����
		t.testmethod();  //����� ���ؼ� testmethod()�� �ٸ��� method2() �޼��忡 ���� ����
		Test2 t2 = new Test2();
		t2.testmethod();  //default ������������.
		
		
	}
}