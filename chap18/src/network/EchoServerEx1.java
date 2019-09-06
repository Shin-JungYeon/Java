package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ���� ���� ���α׷�
 * ���� ���α׷� �ݵ�� �ʿ�. ���� ���� ����.
 */
public class EchoServerEx1 {
	public static void main(String[] args) throws IOException {
		/* 
		 * 8000�� port�� binding(OS�κ��� port�� �Ҵ�޴°�) �ϰ� ��� ����
		 * BindException : port �� ���� �� ���� ������ �Ҵ����� �� ����.
		 */
		ServerSocket server = new ServerSocket(8000);
		System.out.println("Ŭ���̾�Ʈ ���� ��� ��");
		Socket client = server.accept();  //Ŭ���̾�Ʈ�� ���� ����� -> Ŭ���̾�Ʈ ���α׷� ������ ������ -> Ŭ���̾�Ʈ�� ������ Socket��ü ����.
										  //���� �� ���� Ŭ���̾�Ʈ ������ �������� ����ó��(������) �ʿ�.
		System.out.println("server ip : " + client.getLocalAddress());
		System.out.println("server port : " + client.getLocalPort());
		System.out.println("client ip : " + client.getInetAddress());
		System.out.println("client port : " + client.getPort());
		PrintWriter out = new PrintWriter(client.getOutputStream(), true);
		//out : client.getOutputStream() : Ŭ���̾�Ʈ�� �����͸� ������ �� �ִ� ��ü.
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		//In : client.getInputStream() : Ŭ���̾�Ʈ�κ��� �����͸� ���Ź��� �� �ִ� ��ü.
		String input;
		while((input = in.readLine()) != null) {  //Ŭ���̾�Ʈ�� ���� �Ǹ� in�� ���� ������ ���� ��.
			System.out.println("client msg : " + input);
			out.println(input);  //print�� �ϸ� line�� ������ �ʾƼ� readLine()���� ���� ����.
			out.flush();
		}
		in.close(); out.close();
		client.close(); server.close();
	}
}
