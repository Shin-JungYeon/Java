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
 * ������ ������ �����ϱ�. -> Ŭ���̾�Ʈ ���α׷��� ����. ���������� (http://IP�ּ�:port) ����
 * �̹��� ���ϵ� ��µǵ��� SimpleWebServerEx1.java �����ϱ�. -> �������� �ƴ� byte������ �Է¹޾ƾ� ��.
 */
public class SimpleWebServerEx2 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8080);
		while(true) {
			System.out.println("Ŭ���̾�Ʈ ���� ���");
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
				if(filename.equals("")) filename = "index.html";  //�ڵ����� �ش��з���. index.html�� Tulips.jpg
				fis = new FileInputStream(filename);
//				int fline = 0;
//				while((fline = fis.read()) != -1) {
//					ps.println(fline);
//					ps.flush();
//				}
				int len = 0;
//				byte[] buf = new byte[fis.available()];
				byte[] buf = new byte[8096];  //���� 8K�� ���� ������.
				while((len=fis.read(buf)) != -1) {
//					ps.println(buf);  //PrintStream�� �޼������ ���̴� �״�θ� ���������� �������ֱ� ������ ����Ʈ�ڷ����� �̹����� ���ó� ��µ��� ����.
//					ps.flush();
					os.write(buf, 0, len);  //���ۿ� ����.
					os.flush();  //����� �͵� �Ѳ����� ��������.
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