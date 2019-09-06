package chap18;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 1. bin/chap18/PrintStreamEx1.class ������ ���������̴�. -> �ݵ�� InputStream���� �о�� ��.
 *    �� ������ �о 16������ ����ϱ�.
 *    
 *    00000000 -> 8bit(1byte) -> (0000)(0000) -> 4bit�� 16���� �ϳ�
 *    01101111 -> 6F
 * 
 * [���]
 * 
 * CA FE BA BE 00 00 00 34 00 8E 07 00 02 01 00 17 
 * 63 68 61 70 31 35 2F 50 72 69 6E 74 53 74 72 65 
 * 61 6D 54 65 73 74 32 07 00 04 01 00 10 6A 61 76 
 * 61 2F 6C 61 6E 67 2F 4F 62 6A 65 63 74 01 00 06 
 * 3C 69 6E 69 74 3E 01 00 03 28 29 56 01 00 04 43 
 * 6F 64 65 0A 00 03 00 09 0C 00 05 00 06 01 00 0F 
 * ....
 */
public class HW01 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("bin/chap18/PrintStreamEx1.class");
		int data = 0;
		int i=0;
		while((data=fis.read()) != -1) {
			System.out.printf("%02X ", data);
			i++;
			if(i%16==0) {
				System.out.println();
			}
		}
		
		/*
		
		byte[] buf = new byte[16];  //ó������ 16����Ʈ�� �о���� �˾Ƽ� �ٳ���. �ݵ�� byte������ �о�;���(���������̴ϱ�).
		int len=0;
		while((len=fis.read(buf)) != -1){
			for(int j=0; j<len; j++) {
				System.out.printf(" %02X", buf[j]);
			}
			System.out.println();
		}
		
		*/
	}
}
