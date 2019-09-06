package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 에코 클라이언트 프로그램
 * 
 * 클라이언트						서버
 * 								1. ServerSocket(8000) -> OS로부터 8000번 port 할당받음.(bind) (아파트의 호수 같은 것)
 * 								2. accept() : 클라이언트가 들어올때까지 대기.
 * 3. Socket(서버IP, 8000)
 * 4. client 객체가 Socket 참조
 * 
 * 하나의 Socket을 가상의 공간에서 클라이언트와 서버가 공유하고 있음. 항상 서버가 먼저 시작해줘야 함.
 * 클라이언트에서 out -> 서버에서 in으로 받음 -> 받은 것을 서버에서 다시 out -> 클라이언트에서 in  => TCP/IP 방식
 */
public class EchoClientEx1 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));  //stdin : 키보드로부터 입력 받을 준비
		Socket client = new Socket("192.168.0.59", 8000);  //new Socket(IP주소, port) : (IP주소)의 컴퓨터의 (port)값을 가진 서버로 접속.
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));  //client 소켓에 InputStream 입력. -> Reader -> BufferedReader
		//Socket으로 부터 IO스트림 객체를 할당.
		//in : client.getInputStream() -> 입력스트림
		PrintWriter out = new PrintWriter(client.getOutputStream());  //
		//out : client.getOutputStream() -> 출력 스트림
		//      client 소켓에 입력 받았던 데이터를 서버로 출력하는 객체.
		System.out.println("local ip : " + client.getLocalAddress());
		System.out.println("local port : " + client.getLocalPort());
		System.out.println("server ip : " + client.getInetAddress());
		System.out.println("server port : " + client.getPort());
		System.out.println("메세지를 입력하세요.");
		String input;
		while((input = stdin.readLine()) != null) {  //키보드로부터 입력받은 내용을 stdin에 저장했다가 한 줄씩 불러옴.
			if(input.equals("bye")) break;  //클라이언트와 서버 모두 종료.
			out.println(input);  //out -> 키보드에서 입력된 내용을 서버로 전송.
			out.flush();
			System.out.println("server echo : " + in.readLine());  //in.readLine() : 서버에서 보내준 내용을 수신.
			System.out.println("메세지를 입력하세요.");
		}
		out.close(); in.close();
		stdin.close(); client.close();
	}
}
