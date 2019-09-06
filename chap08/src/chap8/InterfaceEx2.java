package chap8;
/*
 * �������̽��� �޼����� ����Ÿ������ ���
 */
interface Parseable {
	void parse(String filename);
}
class ParseManager {
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		} else {
			return new HTMLParser();  //XMLParser, HTMLParser�� Parseable�� ���� Ŭ�����̱� ������ ����Ÿ���� Parseable�ӿ��� �ұ��ϰ� ����.
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
