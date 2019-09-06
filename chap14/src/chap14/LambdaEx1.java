package chap14;
/*
 * ���ٽ� ���� : jdk8 ���� �߰�
 * 
 * ���ٽĿ��� ����� �� �ִ� �������̽��� �ݵ�� FunctionalInterface���� �Ѵ�.
 * FunctionalInterface : �߻�޼��尡 �� ���� �������̽�. ���ٸ� ����ϱ� ���� ��������.
 * 
 * @FunctionalInterface : �������̽����� �߻�޼��尡 �� ������ �˷��ִ� annotation. �Լ���ü��� ���� ��������� �˷��� ��. �Ⱦ��ٰ� �ؼ� ���α׷��� ����Ǵ� ���� ������ ���� ����.
 * 
 * 1. �Ű����� ����, ���ϰ��� ���� ��� ����.
 *    �Ű����� ���� : () ->
 *    ���ٽ� ���ο� ó���ϴ� ������ �� ���� ��� {}������ �� ����.
 * 
 */
@FunctionalInterface
interface FunctionalInterface1 {
	void method();
//	void method2();  //@FunctionalInterface ������̼��� ���� �� �߻�޼��尡 �� �� �̻��̸� ���� �߻�.
}
public class LambdaEx1 {
	public static void main(String[] args) {
		//���� ���
		FunctionalInterface1 f1 = new FunctionalInterface1() {	
			@Override
			public void method() {
				System.out.println("�������̽� ��ü");
			}
		};
		f1.method();
		
		//���� ��� 1
		FunctionalInterface1 f2;
		f2 = () -> {
			String str = "method call(1)";
			System.out.println(str);
		};  //�̰� �޼��带 �������̵��� �Ͱ� ���� ��.
		f2.method();
		
//		f2 = () -> {
//			String str = "method call(2)";
//			System.out.println(str);
//		};
		f2 = () -> System.out.println("method call(2)");  //�����ų ������ �� ���� �� {} ���� ����.
		f2.method();
		
		//���� ��� 2 : �Ű������� ���Ǵ� ���ٽ�
		execute(f2);
		execute(()->{System.out.println("method call(3)");});  //execute �޼����� �Ű� ���� �ȿ� ���ٽ� �޼��� ��ü�� �־��൵ ��.
		execute(()->System.out.println("method call(4)"));  //�����ų������ �� ���� �� {} ���� ����.
	}
	static void execute(FunctionalInterface1 f) {
		f.method();
	}
}
