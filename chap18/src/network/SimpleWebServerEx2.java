package network;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
//import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 간단한 웹서버 구현하기. -> 클라이언트 프로그램이 없음. 브라우저에서 (http://IP주소:port) 접속
 * 이미지 파일도 출력되도록 SimpleWebServerEx1.java 수정하기. -> 문자형이 아닌 byte형으로 입력받아야 함.
 */
public class SimpleWebServerEx2 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8080);
		while(true) {
			System.out.println("클라이언트 접속 대기");
			Socket client = server.accept();
			HttpThread ht = new HttpThread(client);
			ht.start();
		}
	}
	
	static class HttpThread extends Thread {
		private Socket client;
		BufferedReader br;
//		PrintWriter pw;
//		PrintStream ps;
		OutputStream os;
		public HttpThread(Socket client) {
			this.client = client;
			try {
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
//				ps = new PrintStream(client.getOutputStream());
				os = client.getOutputStream();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("server ip : " + client.getLocalAddress());
			System.out.println("server port : " + client.getLocalPort());
			System.out.println("client ip : " + client.getInetAddress());
			System.out.println("client port : " + client.getPort());
		}
		public void run() {
//			BufferedReader fbr = null;
			FileInputStream fis = null;
			try {
				String line = br.readLine();
				System.out.println("Http Header : " + line);
				int start = line.indexOf("/") + 1;
				int end = line.lastIndexOf("HTTP") - 1;
				String filename = line.substring(start, end);
				if(filename.equals("")) filename = "index.html";  //자동으로 해더분류함. index.html과 Tulips.jpg
				fis = new FileInputStream(filename);
//				int fline = 0;
//				while((fline = fis.read()) != -1) {
//					ps.println(fline);
//					ps.flush();
//				}
				int len = 0;
//				byte[] buf = new byte[fis.available()];
				byte[] buf = new byte[8096];  //보통 8K로 많이 설정함.
				while((len=fis.read(buf)) != -1) {
//					ps.println(buf);  //PrintStream의 메서드들은 보이는 그대로를 문자형으로 리턴해주기 때문에 바이트자료형인 이미지는 역시나 출력되지 못함.
//					ps.flush();
					os.write(buf, 0, len);  //버퍼에 저장.
					os.flush();  //저장된 것들 한꺼번에 내보내기.
				}
			} catch(IOException e) {
					e.printStackTrace();
			} finally {
				try {
					if(fis != null) fis.close();
					if(br != null) br.close();
//					if(ps != null) ps.close();
					if(os != null) os.close();
					if(client != null) client.close();
				} catch(IOException e) {}
			}
		}
	}
	
}