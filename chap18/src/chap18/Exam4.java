package chap18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

/*
 * src/chap18 ������ .java ���� �� InputStream ���� ��� �ҽ��� InputStream����.txt ���Ϸ� �����ϱ�. -> �� ���� ���� �� ��.
 * 
 * InputStream ���� ��� �ҽ� : ***InputStream***.java
 * 
 *   1. f1 = File("src/chap18") ����.
 *   2. f1�� �������� �� ������ �޾Ƽ�, �� �� �����̸鼭 ������ �̸��� InputStream�̶�� ���� �����ϸ�,
 *      FileInputStream ���� ����.
 *   3. FileInputStream�� Vector�� ���� -> SequenceInputStream ��ü�� �����ϱ�.
 *   4. SequenceInputStream �о "InputStream����.txt" ���Ϸ� �����ϱ�.
 */
public class Exam4 {
	public static void main(String[] args) throws IOException {
		Vector<InputStream> v = new Vector<InputStream>();
		File f1 = new File("src/chap18/");
		String[] files = f1.list();
		for(String f : files) {
			File f2 = new File("src/chap18", f);
//			String f2name = f2.getName();  //f�� String �����̱� ������ ���� �̸� �ٽ� �޾ƿ� �ʿ� ����.
//			if(f2.isFile() && f2name.contains("InputStream") && f2name.contains(".java")) {
			if(f2.isFile() && f.contains("InputStream") && f.contains(".java")) {  //f.contains(".java") Ȯ���ڰ� �ٸ� ������ �� ���� �ֱ⶧���� �߰�����.
//				FileInputStream fis = new FileInputStream(f2);
//				v.add(fis);
				v.add(new FileInputStream(f2));  //�ٷ� �־��ָ� ����.
			}
		}
		
		SequenceInputStream st = new SequenceInputStream(v.elements());  //�Ѳ����� �о���� ���� ���������.
		FileOutputStream fos = new FileOutputStream("InputStream����.txt");
		int len = 0;
		byte[] buf = new byte[st.available()];
		while((len=st.read(buf)) != -1) {
//			String bufst = new String(buf, 0, len);
//			fos.write(bufst.getBytes());
			fos.write(buf, 0, len);  //buf �� �̹� byte���ε� �� ���� ���� �ι� �Ѱ���?
		}
		fos.flush();		
	}
}
