package chap9;
/*
 * �ܺ�Ŭ������ private ����� ����
 *  -> ������ �����ζ�� ���� �ٸ� Ŭ�����ϱ� ������ �ȵǴµ� ���� Ŭ������ Ŭ���������� �ܺ� Ŭ������ ����̴ϱ� ���� Ŭ������ ��������� ���� ����.
 */
class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;
	class InstanceInner {  //�ν��Ͻ����, �ܺ�Ŭ������ ��üȭ �Ǿ�� ����Ŭ������ ��üȭ ����.
		int iiv = outeriv;  //�ܺ�Ŭ������ private ��� ���� ����.
		int iiv2 = outercv;
	}
	static class StaticInner {  //Ŭ�������, �ܺ�Ŭ������ ��üȭ ���� ���� ��� ����.
//		int siv = outeriv;
		int siv = new Outer2().outeriv;  //Ŭ����������� �ν��Ͻ������ ����Ϸ��� ��üȭ �ʿ�
		static int siv2 = new Outer2().outeriv;
		static int scv = outercv;
	}
	static StaticInner si = new StaticInner();
	InstanceInner ii = new InstanceInner();
//	static InstanceInner ii2 = new InstanceInner();  //static�� ���� Ŭ��������� �ν��Ͻ������ ����� �� ����.
	static InstanceInner ii2 = new Outer2().new InstanceInner();  //��üȭ �ʿ�
	void method(final int pv) {
//		��������Ŭ������ ����޼��忡�� ��������Ŭ������ ���� �ܺθ޼����� �������� ���ٽ� ���������� ���ȭ �Ǿ�� ��. -> ���� �Ұ�. final �ٿ��ָ� ����.
		final int i = 100;
//		i++;  // �� �� ���� �ʱ�ȭ �Ǿ����� �� ���� ����Ǿ�� �ȵ�.
		class LocalInner {  //���� ���� Ŭ����
			int liv = outeriv;
			int liv2 = outercv;
			void method() {  //���� ���� Ŭ������ �޼��� ���� �� ����.
//				pv = 10;  //����Ұ�
				System.out.println("pv=" + pv);
				System.out.println("i=" + i);
				System.out.println("liv=" + liv);
				System.out.println("outeriv=" + outeriv);
			}
		}
		LocalInner lc = new LocalInner();
		lc.method();
	}
}
public class InnerEx2 {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.method(1);
		
//		System.out.println("iiv=" + out.new InstanceInner().iiv);  //out : Outer2 �̹� ��üȭ ����.
//		System.out.println("iiv2=" + out.new InstanceInner().iiv2);
		Outer2.InstanceInner oic = out.new InstanceInner();
		System.out.println(oic.iiv + "," + oic.iiv2);
		
//		System.out.println("siv=" + new Outer2.StaticInner().siv);
//		System.out.println("scv=" + new Outer2.StaticInner().scv);
		Outer2.StaticInner osc = new Outer2.StaticInner();
		System.out.println(osc.siv + "," + osc.scv + "," + osc.siv2);
	}
}
//���� Ŭ������ �׳� Ŭ����, �ܺ�Ŭ���� ���忡�� ���� Ŭ������ ����� ������ ������ �ִ�.