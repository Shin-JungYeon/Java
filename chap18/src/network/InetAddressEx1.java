package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * InetAddress Ŭ���� : IP �ּҸ� �����ϴ� Ŭ����.
 *   1. �������� ���������� default(���� ��Ű�� �������� ��� ����. java.net) -> �������� �����ڴ� ��ü ���� �Ұ�.
 *   2. static �޼��� ���� -> �̹� ������� ��ü ���.
 *        getByName()
 *        getAllByName()
 *        getLocalHost()
 *        getByAddress()
 */
public class InetAddressEx1 {
	public static void main(String[] args) throws UnknownHostException {
//		InetAddress ip = InetAddress.getByName("www.goodee.co.kr");
		InetAddress ip = InetAddress.getByName("www.daum.net");
		System.out.println("getByName() �޼��带 �̿��� InetAddress ��ü ����");  //������ �ּҷ� ip �ּҰ� ������.
		System.out.println("hostname : " + ip.getHostName());
		System.out.println("ip address : " + ip.getHostAddress());  //���� ip �ּ�
		System.out.println();
		
		//byte������ ��ȸ�ϱ�
		byte[] ipAddr = ip.getAddress();
		for(byte b : ipAddr) {
			System.out.print(((b<0)?b+256:b) + ".");  //byte -> -128~127
		}
		System.out.println();
		
		System.out.println("getAllByName() �޼��带 �̿��� InetAddress ��ü ����");  //������ �ּҷ� ip �ּҰ��� ������.
		InetAddress ips[] = InetAddress.getAllByName("www.daum.net");  //daum.net���� ��ϵǾ� �ִ� ��� ������ �ּ� ����.
		for(InetAddress i : ips) {
			System.out.println("IP : " + i);
		}
		System.out.println();
		
		System.out.println("getLocalHost() �޼��带 �̿��� InetAddress ��ü ����");  //���� ���� ���� �� ��ǻ���� �ּҰ�
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("�� ��ǻ�� IP : " + local);
		System.out.println();
		
		System.out.println("getByAddress() �޼��带 �̿��� InetSddress ��ü ����");
		InetAddress ip2 = InetAddress.getByAddress(ip.getAddress());
		System.out.println(ip2);
	}
}
