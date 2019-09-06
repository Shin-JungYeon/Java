package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 멀티 에코 서버 구현하기
 *   하나의 서버가 여러 개의 클라이언트와 통신하기. -> Thread
 */
public class EchoServerEx2 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8000);
		while(true) {  //클라이언트가 종료 돼도 서버는 종료되지 않음. -> 강제 종료 필요.
			System.out.println("클라이언트 접속 대기 중");
			Socket client = server.accept();
			new EchoServerThread(client).start();
		}
	}
	static class EchoServerThread extends Thread {  //네트워크는 Thread, IO 반드시 필요.
		Socket client;
		PrintWriter out;
		BufferedReader in;
		EchoServerThread(Socket client) {
			this.client = client;
			try {
				out = new PrintWriter(client.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			} catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println("server ip : " + client.getLocalAddress());
			System.out.println("server port : " + client.getLocalPort());
			System.out.println("client ip : " + client.getInetAddress());
			System.out.println("client port : " + client.getPort());
		}
		public void run() {  //클라이언트가  bye하면 Thread가 죽음. main은 여전히 살아있음.
			String input;
			try {
				while((input = in.readLine()) != null) {
					System.out.println("client msg : " + input);
					out.println(input);
					out.flush();
				}
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				try {
					in.close(); out.close(); client.close();
				} catch(IOException e) {}
			}
		}
	}
	
}
