package network;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * SimpleWebServerEx1.java의 스레드 클래스를 Runnable 인터페이스 구현 방식으로 수정하기
 */
public class HW2 {
	public static void main(String[] args) throws IOException {  //main은 클라이언트를 accept만 해줄 뿐.
		ServerSocket server = new ServerSocket(8080);
		while(true) {
			System.out.println("클라이언트 접속 대기");
			Socket client = server.accept();
			HttpRunnable htc = new HttpRunnable(client);
			Thread htt = new Thread(htc);
			htt.start();
		}
	}
	
	static class HttpRunnable implements Runnable {
		private Socket client;
		BufferedReader br;
		PrintWriter pw;
		public HttpRunnable(Socket client) {
			this.client = client;
			try {
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				pw = new PrintWriter(client.getOutputStream());
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("server ip : " + client.getLocalAddress());
			System.out.println("server port : " + client.getLocalPort());
			System.out.println("client ip : " + client.getInetAddress());
			System.out.println("client port : " + client.getPort());
		}
		public void run() {
			BufferedReader fbr = null;
			try {
				String line = br.readLine();
				//브라우저가 전송한 데이터
				//line = "GET / HPPT/1.1" or "GET /index.html HTTP/1.1"
				System.out.println("Http Header : " + line);
				int start = line.indexOf("/") + 1;
				int end = line.lastIndexOf("HTTP") - 1;
				String filename = line.substring(start, end);
				if(filename.equals("")) filename = "index.html";  //index.html : project에 file로 생성.
				fbr = new BufferedReader(new FileReader(filename));
				String fline = null;
				while((fline = fbr.readLine()) != null) {
					pw.println(fline);
					pw.flush();
				}
			} catch(IOException e) {
					e.printStackTrace();
			} finally {
				try {
					if(fbr != null) fbr.close();
					if(br != null) br.close();
					if(pw != null) pw.close();
					if(client != null) client.close();
				} catch(IOException e) {}
			}
		}
	}
}
