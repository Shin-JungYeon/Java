package chap11;
/*
 * 1. 다음과 같은 실행 결과를 얻도록 SutdaCard클래스를 구현하시오
 * 
 * [결과]
 * c1=3K
 * c2=3K
 * c1.equals(c2) : true
 */
class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard(int num, boolean isKwang) {
		super();
		this.num = num;
		this.isKwang = isKwang;
	}
	@Override
	public String toString() {
		return num + ((isKwang)?"k":"");
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof SutdaCard) {
			SutdaCard c = (SutdaCard)obj;
			return (this.num==c.num) && (this.isKwang==c.isKwang);
		}
		return false;
	}
}
public class HW01 {
	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3,true);
		SutdaCard c2 = new SutdaCard(3,true);
		System.out.println("c1=" + c1);//3K
		System.out.println("c2=" + c2);//3K
		System.out.println("c1.equals(c2) : "  + c1.equals(c2));
	}
}
