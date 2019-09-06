package chap9;
/*
 * 외부클래스의 private 멤버에 접근
 *  -> 원래의 개념대로라면 서로 다른 클래스니까 접근이 안되는데 내부 클래스는 클래스이지만 외부 클래스의 멤버이니까 같은 클래스의 멤버끼리는 접근 가능.
 */
class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;
	class InstanceInner {  //인스턴스멤버, 외부클래스가 객체화 되어야 내부클래스의 객체화 가능.
		int iiv = outeriv;  //외부클래스의 private 멤버 접근 가능.
		int iiv2 = outercv;
	}
	static class StaticInner {  //클래스멤버, 외부클래스의 객체화 없이 직접 사용 가능.
//		int siv = outeriv;
		int siv = new Outer2().outeriv;  //클래스멤버에서 인스턴스멤버를 사용하려면 객체화 필요
		static int siv2 = new Outer2().outeriv;
		static int scv = outercv;
	}
	static StaticInner si = new StaticInner();
	InstanceInner ii = new InstanceInner();
//	static InstanceInner ii2 = new InstanceInner();  //static이 붙은 클래스멤버는 인스턴스멤버를 사용할 수 없음.
	static InstanceInner ii2 = new Outer2().new InstanceInner();  //객체화 필요
	void method(final int pv) {
//		지역내부클래스의 멤버메서드에서 지역내부클래스가 속한 외부메서드의 지역변수 접근시 지역변수는 상수화 되어야 함. -> 변경 불가. final 붙여주면 안전.
		final int i = 100;
//		i++;  // 한 번 값이 초기화 되었으면 그 값이 변경되어서는 안됨.
		class LocalInner {  //지역 내부 클래스
			int liv = outeriv;
			int liv2 = outercv;
			void method() {  //지역 내부 클래스도 메서드 가질 수 있음.
//				pv = 10;  //변경불가
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
		
//		System.out.println("iiv=" + out.new InstanceInner().iiv);  //out : Outer2 이미 객체화 했음.
//		System.out.println("iiv2=" + out.new InstanceInner().iiv2);
		Outer2.InstanceInner oic = out.new InstanceInner();
		System.out.println(oic.iiv + "," + oic.iiv2);
		
//		System.out.println("siv=" + new Outer2.StaticInner().siv);
//		System.out.println("scv=" + new Outer2.StaticInner().scv);
		Outer2.StaticInner osc = new Outer2.StaticInner();
		System.out.println(osc.siv + "," + osc.scv + "," + osc.siv2);
	}
}
//내부 클래스는 그냥 클래스, 외부클래스 입장에서 내부 클래스는 멤버적 성질을 가지고 있다.