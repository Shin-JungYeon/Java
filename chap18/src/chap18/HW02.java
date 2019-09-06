package chap18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 2. �ֿܼ��� ���ϸ�� ���ڸ� �Է¹޾Ƽ� �ش� ������ �Էµ� ���ڸ�ŭ�� ����ϴ� ���α׷� �ۼ��ϱ�. Scanner ��� �Ұ�.
 * 
 * [���]
 * 
 * ����� ���ϸ� �Է�
 * src/chap18/InputStreamEx1.java -> project���� �����ϱ� ������ ��������(�����) �ʿ�.
 * ����� ���μ� �Է�
 * 1
 * 
 * [���]
 * 
 * 1 :package chap15;
 */
public class HW02 {
	public static void main(String[] args) throws IOException {
		/*
		String filepath = "src/chap18/";
		while(true) {
			try {
				System.out.println("����� ���ϸ��� �Է��ϼ���.");
				InputStream input = System.in;
				int data=0;
				String filename = "";
				while((data=input.read()) != -1) {
					filename += (char)data;
					if(input.available() == 0) break;
				}
				System.out.println(filename);
				FileInputStream fis = new FileInputStream(filepath + "InputStreamEx1.java");
				if(input.available() == 0) {
					System.out.println("����� ���μ��� �Է��ϼ���.");
					InputStream input2 = System.in;
					data = 0;
					char line = (char) input2.read();
					
					System.out.println(line);
					BufferedReader br = new BufferedReader(new InputStreamReader(fis));
					for(int i=1; i<=line; i++) {
						System.out.println(i + ":" + ((br.readLine()!=null)?br.readLine():""));
					}
					break;
				}
			} catch (FileNotFoundException e) {
				System.out.println("������ ã�� �� �����ϴ�. �ٽ� �Է����ּ���.");
				continue;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		//BufferedReader : ���ڿ��� �� �پ� �ܼ�â���� Ű����κ���(System.in) �Է¹��� �� ����.
		String filepath = "src/chap18/";
		System.out.println("����� ���ϸ� �Է�");
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String filename = stdin.readLine();  //���ڿ� �� �پ� �Է¹���.
		System.out.println("����� ���μ� �Է�");
		int line = Integer.parseInt(stdin.readLine());  //String���� �Է¹޾Ƽ�  Integer�� ����ȯ.
		BufferedReader fbr = new BufferedReader(new FileReader(filepath + filename));  //������ ����� �Է������ ��.
		String msg = null;  //������ ���� �� �پ� ����.
		int prt = 0;  //�̹� ����� ������ ����.
		while((msg = fbr.readLine()) != null) {  //���ڿ� �� �پ� �о��.
			if(line <= prt) break;
			prt++;
			System.out.println(prt + ":" + msg);
		}
		
	}
}
