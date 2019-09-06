package chap8;
/*
 * 인터페이스를 메서드의 리턴타입으로 사용
 */
interface Parseable {
	void parse(String filename);
}
class ParseManager {
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		} else {
			return new HTMLParser();  //XMLParser, HTMLParser가 Parseable의 구현 클래스이기 때문에 리턴타입이 Parseable임에도 불구하고 가능.
		}
	}
}
class XMLParser implements Parseable {
	@Override
	public void parse(String filename) {
		System.out.println(filename + " -> XML parsing");
	}
}
class HTMLParser implements Parseable {
	@Override
	public void parse(String filename) {
		System.out.println(filename + " -> HTML parsing");
	}
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		Parseable p = ParseManager.getParser("XML");
		p.parse("doc.xml");
		p = ParseManager.getParser("HTML");
		p.parse("doc.html");
	}
}
