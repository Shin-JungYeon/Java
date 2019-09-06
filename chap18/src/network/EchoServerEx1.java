package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 에코 서버 프로그램
 * 서버 프로그램 반드시 필요. 서버 먼저 실행.
 */
public class EchoServerEx1 {
	public static void main(String[] args) throws IOException {
		/* 
		 * 8000번 port를 binding(OS로부터 port값 할당받는것) 하고 대기 상태
		 * BindException : port 한 개당 한 개의 서버만 할당해줄 수 있음.
		 */
		ServerSocket server = new ServerSocket(8000);
		System.out.println("클라이언트 접속 대기 중");
		Socket client = server.accept();  //클라이언트의 접속 대기중 -> 클라이언트 프로그램 실행할 때까지 -> 클라이언트가 생성한 Socket객체 받음.
										  //서버 한 개에 클라이언트 여러개 받으려면 병렬처리(스레드) 필요.
		System.out.println("server ip : " + client.getLocalAddress());
		System.out.println("server port : " + client.getLocalPort());
		System.out.println("client ip : " + client.getInetAddress());
		System.out.println("client port : " + client.getPort());
		PrintWriter out = new PrintWriter(client.getOutputStream(), true);
		//out : client.getOutputStream() : 클라이언트의 데이터를 전송할 수 있는 객체.
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		//In : client.getInputStream() : 클라이언트로부터 데이터를 수신받을 수 있는 객체.
		String input;
		while((input = in.readLine()) != null) {  //클라이언트가 종료 되면 in이 없어 서버도 종료 됨.
			System.out.println("client msg : " + input);
			out.println(input);  //print로 하면 line이 끝나지 않아서 readLine()으로 읽지 못함.
			out.flush();
		}
		in.close(); out.close();
		client.close(); server.close();
	}
}
