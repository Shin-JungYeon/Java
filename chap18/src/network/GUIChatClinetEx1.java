package network;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/*
 * ��Ƽ ä�� Ŭ���̾�Ʈ ���α׷�.
 * GUI ȯ�� : AWT �ڹ� API ����Ͽ� �ڵ���.
 */
//Frame : ������ â �ϳ�. �󲮵���.
//ActionListener : Action �̺�Ʈ ó�� ���� �������̽�. -> �̺�Ʈ�� ��Ģ���� ����. -> �ý����� ������ �޾ƾ� ��. �̺�Ʈ ���� �ٸ� Listener�� ����. �ڵ鷯 �޼��带 ����
public class GUIChatClinetEx1 extends Frame implements ActionListener {
	CardLayout c1;
	String userid;
	Button btnexit, btnsend, btnconnect;
	TextArea talist;
	TextField tfip, tfname, tfinput;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	
	public static void main(String[] args) {
		new GUIChatClinetEx1();
	}
	
	GUIChatClinetEx1() {  //������
		super("ä�� ���α׷� ����");
		c1 = new CardLayout();
		setLayout(c1);
		Panel connect = new Panel();
		connect.setLayout(new BorderLayout());
		connect.add("North", new Label("ä�� ���� ȭ��", Label.CENTER));
		
		Panel conn_sub = new Panel();
		conn_sub.setLayout(new GridLayout(10, 1));
		conn_sub.add(new Label("���� IP", Label.CENTER));
		tfip = new TextField("127.0.0.1", 15);
		conn_sub.add(tfip);
		conn_sub.add(new Label("����� ID", Label.CENTER));
		tfname = new TextField("ȫ�浿", 15);
		conn_sub.add(tfname);
		connect.add("Center", conn_sub);
		btnconnect = new Button("��������");
		connect.add("South", btnconnect);
		//��ư Ŭ�� �� �߻��Ǵ� �̺�Ʈ(ActionEvent) ó��
		//ActionEvent�� ���� ������ : ActionListener
		//ActionListener�� ����ϱ� ���ؼ��� ActionListener Ÿ���� �������̽� ��ü�� �����.
		btnconnect.addActionListener(this);  //btn ��ư�� Ŭ���Ǹ� �˷���. this�� �ڵ鷯(ActionListener Ÿ������ ���;���. ActionListener �������̽��� ���������Ƿ� ActionListener��ü�� ����.)
		
		Panel chat = new Panel();
		chat.setLayout(new BorderLayout());
		chat.add("North", new Label("ä�� ver1.0"));
		talist = new TextArea();
		chat.add("Center", talist);
		
		Panel chat_sub = new Panel();
		tfinput = new TextField("", 25);
		btnexit = new Button("����");
		btnsend = new Button("����");
		
		chat_sub.add(tfinput);  //�Է�â
		chat_sub.add(btnexit);  //�����ư
		chat_sub.add(btnsend);  //���۹�ư
		
		tfinput.addActionListener(this);  //TextField ��ü���� EnterŰ�� �ԷµǸ� ActionEvent�� �߻���.
		btnexit.addActionListener(this);
		btnsend.addActionListener(this);
		
		chat.add("South", chat_sub);
		add(connect, "����â");
		add(chat, "ä��â");
		c1.show(this, "����â");
		setSize(500, 500);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	//�̺�Ʈ �ڵ鷯 -> �̺�Ʈ ó��.
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Object obj = e.getSource();  //�̺�Ʈ�� �߻���Ų ������Ʈ. �̺�Ʈ �ҽ�.
			if(obj == btnconnect) init();  //�� ��ü�� �Ȱ���?
			else if (obj == btnexit) System.exit(0);
			else {  //tfinput ��ü�� Enter Ű�� �Էµǰų� btnsend ��ư�� Ŭ�� �� ���.
				String sendData = tfinput.getText();
				oos.writeObject(sendData);  //�ش� ������ ������ ����.
				oos.flush();
				tfinput.setText("");
				tfinput.requestFocus();
			}
		} catch(IOException ie) {
			ie.printStackTrace();
		}
	}
	
	private void init() {
		try {
			String ip = tfip.getText();
			Socket client = new Socket(ip, 6000);
			oos = new ObjectOutputStream(client.getOutputStream());
			ois = new ObjectInputStream(client.getInputStream());
			userid = tfname.getText();
			oos.writeObject(userid);  //userid���� ������ ����.
			oos.flush();
			ReceiveDataThread rt = new ReceiveDataThread();
			rt.setDaemon(true);
			rt.start();
			
			c1.show(this, "ä��â");
			setTitle(userid + "ä��â");  //�������� title ����
			tfinput.requestFocus();  //tfinput ������Ʈ�� Ŀ�� �̵�. -> ä��â ���ڸ��� �Է�â���� Ŀ���� �̵���Ŵ. �ٷ� ��ȭ�� �Ἥ ���۰����ϰ� �ϱ� ����.
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//�����κ��� ���ŵ� �����͸� talist ������Ʈ�� ���� �߰��ϱ�.
	class ReceiveDataThread extends Thread {  //���� �߰��� ���� �� �� �𸣱� ������ ������� �������. main�� ����ִ� ���� ����(Daemon).
		String rcvData;
		public void run() {
			try {
				while(true) {
					rcvData = (String) ois.readObject();
					talist.append(rcvData + "\n");  //ä��â�� ������(�����).
				}
			} catch(Exception e ) {
				e.printStackTrace();
			}
		}
	}
	
}
