package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * 1. 수업시간에 했던 EchoServerEx2.java의 스레드 클래스를 Runnable 인터페이스 구현방식으로 수정하기
 */
public class HW1 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8050);
		while(true) {
			System.out.println("클라이언트 접속 대기 중");
			Socket client = server.accept();
			EchoServerRunnable c = new EchoServerRunnable(client);
			Thread t = new Thread(c);
			t.start();
		}
	}
	static class EchoServerRunnable implements Runnable {
		Socket client;
		PrintWriter out;
		BufferedReader in;
		EchoServerRunnable(Socket client) {
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
		public void run() {
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
