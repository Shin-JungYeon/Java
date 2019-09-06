package network;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * URL Ŭ���� : URL ������ �����ϴ� Ŭ����. URL ������ ���������� ������.(URL ���¿� �� �´���.)
 */
public class URLEx1 {
	public static void main(String[] args) throws MalformedURLException {
		URL url1 = null, url2 = null;
		url1 = new URL("http://www.goodee.co.kr:3000/index.jsp");  //URL("protocal://host:portfile")
		url2 = new URL("file", "", -1, "aaa.txt");  //URL(protocal, host, port, file)
		System.out.println("protocal : " + url1.getProtocol() + ", " + url2.getProtocol());
		System.out.println("host : " + url1.getHost() + ", " + url2.getHost());
		System.out.println("port : " + url1.getPort() + ", " + url2.getPort());
		System.out.println("file : " + url1.getFile() + ", " + url2.getFile());
		System.out.println("url : " + url1 + ", " + url2);
	}
}
