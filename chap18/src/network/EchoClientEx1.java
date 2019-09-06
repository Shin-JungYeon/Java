package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * ���� Ŭ���̾�Ʈ ���α׷�
 * 
 * Ŭ���̾�Ʈ						����
 * 								1. ServerSocket(8000) -> OS�κ��� 8000�� port �Ҵ����.(bind) (����Ʈ�� ȣ�� ���� ��)
 * 								2. accept() : Ŭ���̾�Ʈ�� ���ö����� ���.
 * 3. Socket(����IP, 8000)
 * 4. client ��ü�� Socket ����
 * 
 * �ϳ��� Socket�� ������ �������� Ŭ���̾�Ʈ�� ������ �����ϰ� ����. �׻� ������ ���� ��������� ��.
 * Ŭ���̾�Ʈ���� out -> �������� in���� ���� -> ���� ���� �������� �ٽ� out -> Ŭ���̾�Ʈ���� in  => TCP/IP ���
 */
public class EchoClientEx1 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));  //stdin : Ű����κ��� �Է� ���� �غ�
		Socket client = new Socket("192.168.0.59", 8000);  //new Socket(IP�ּ�, port) : (IP�ּ�)�� ��ǻ���� (port)���� ���� ������ ����.
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));  //client ���Ͽ� InputStream �Է�. -> Reader -> BufferedReader
		//Socket���� ���� IO��Ʈ�� ��ü�� �Ҵ�.
		//in : client.getInputStream() -> �Է½�Ʈ��
		PrintWriter out = new PrintWriter(client.getOutputStream());  //
		//out : client.getOutputStream() -> ��� ��Ʈ��
		//      client ���Ͽ� �Է� �޾Ҵ� �����͸� ������ ����ϴ� ��ü.
		System.out.println("local ip : " + client.getLocalAddress());
		System.out.println("local port : " + client.getLocalPort());
		System.out.println("server ip : " + client.getInetAddress());
		System.out.println("server port : " + client.getPort());
		System.out.println("�޼����� �Է��ϼ���.");
		String input;
		while((input = stdin.readLine()) != null) {  //Ű����κ��� �Է¹��� ������ stdin�� �����ߴٰ� �� �پ� �ҷ���.
			if(input.equals("bye")) break;  //Ŭ���̾�Ʈ�� ���� ��� ����.
			out.println(input);  //out -> Ű���忡�� �Էµ� ������ ������ ����.
			out.flush();
			System.out.println("server echo : " + in.readLine());  //in.readLine() : �������� ������ ������ ����.
			System.out.println("�޼����� �Է��ϼ���.");
		}
		out.close(); in.close();
		stdin.close(); client.close();
	}
}
