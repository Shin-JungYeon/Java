package chap18;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/*
 * SequenceInputStream 예제
 *   여러 개의 InputStream을 모아서 하나의 InputStream으로 리턴.
 *   연결 스트림.
 */
public class SequenceInputStreamEx1 {
	public static void main(String[] args) throws IOException {
		byte[] arr1 = {1, 2, 3, 4, 5};
		byte[] arr2 = {6, 7, 8, 9, 10};
		ByteArrayInputStream stream1 = new ByteArrayInputStream(arr1);  // ByteArray -> IputStream 객체로 변환. (인덱스와 길이 이용해서 부분적으로만 가져올 수도 있음.)
		ByteArrayInputStream stream2 = new ByteArrayInputStream(arr2);  //ByteArrayReader는 없음. Reader는 문자형이기때문. StringReader 사용.
		SequenceInputStream in = new SequenceInputStream(stream1, stream2);  //스트림 두 개를 붙여버린것.
		System.out.println("stream1의 내용");
		int data;
//		while((data = stream1.read()) != -1) {
//			System.out.println((byte)data);
//		}
//		System.out.println("stream2의 내용");
//		while((data = stream2.read()) != -1) {
//			System.out.println((byte)data);
//		}
		System.out.println("연결 스트림 in의 내용");
		while((data = in.read()) != -1) {  //앞에서 먼저 다 읽어오면 여기선 읽을 것이 없음. 연결시켰다고 해서 새로운 객체가 생성되는 것이 아니라 물리적으로 붙여놓은 것 뿐.
			System.out.println((byte)data);
		}
		
	}
}
