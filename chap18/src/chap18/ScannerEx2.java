package chap18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * Scanner 예제
 *   File 정보 분석하기
 */
public class ScannerEx2 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("score.txt"));
		/*
		 * 홍길동,4.5,3.8,4.2
		 * 김삿갓,3.5,2.8,3.2
		 * 이몽룡,4.0,3.0,4.1
		 * 임꺽정,3.0,3.3,3.1
		 * 성춘향,3.1,3.5,3.8
		 */
		int cnt = 0;
		int totalSum = 0;
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			Scanner scan2 = new Scanner(line).useDelimiter(",");
			double sum = 0;
			int i = 0;
			String name = scan2.next();  //한 줄을 , 를 기준으로 분류시킨 후 가장 앞의 값(이름) 가져옴.
			System.out.print(name + ":");
			while(scan2.hasNextDouble()) {  //이름은 이미 읽었으므로 그 다음 값부터 double값 존재?
				double score = scan2.nextDouble();  //double값 읽어옴.
				sum += score;
				System.out.print(score + ",");
				i++;
			}
			System.out.printf(" sum=%.2f, avg=%.2f%n", sum, sum/i );
			totalSum += sum;
			cnt++;
		}
		System.out.println("총 인원수 : " + cnt);
	}
}
