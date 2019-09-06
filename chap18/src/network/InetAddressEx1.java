package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * InetAddress 클래스 : IP 주소를 관리하는 클래스.
 *   1. 생성자의 접근제어자 default(같은 패키지 내에서만 사용 가능. java.net) -> 개인적인 개발자는 객체 생성 불가.
 *   2. static 메서드 제공 -> 이미 만들어진 객체 사용.
 *        getByName()
 *        getAllByName()
 *        getLocalHost()
 *        getByAddress()
 */
public class InetAddressEx1 {
	public static void main(String[] args) throws UnknownHostException {
//		InetAddress ip = InetAddress.getByName("www.goodee.co.kr");
		InetAddress ip = InetAddress.getByName("www.daum.net");
		System.out.println("getByName() 메서드를 이용한 InetAddress 객체 생성");  //도메인 주소로 ip 주소값 가져옴.
		System.out.println("hostname : " + ip.getHostName());
		System.out.println("ip address : " + ip.getHostAddress());  //실제 ip 주소
		System.out.println();
		
		//byte형으로 조회하기
		byte[] ipAddr = ip.getAddress();
		for(byte b : ipAddr) {
			System.out.print(((b<0)?b+256:b) + ".");  //byte -> -128~127
		}
		System.out.println();
		
		System.out.println("getAllByName() 메서드를 이용한 InetAddress 객체 생성");  //도메인 주소로 ip 주소값들 가져옴.
		InetAddress ips[] = InetAddress.getAllByName("www.daum.net");  //daum.net으로 등록되어 있는 모든 도메인 주소 리턴.
		for(InetAddress i : ips) {
			System.out.println("IP : " + i);
		}
		System.out.println();
		
		System.out.println("getLocalHost() 메서드를 이용한 InetAddress 객체 생성");  //현재 실행 중인 내 컴퓨터의 주소값
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("내 컴퓨터 IP : " + local);
		System.out.println();
		
		System.out.println("getByAddress() 메서드를 이용한 InetSddress 객체 생성");
		InetAddress ip2 = InetAddress.getByAddress(ip.getAddress());
		System.out.println(ip2);
	}
}
