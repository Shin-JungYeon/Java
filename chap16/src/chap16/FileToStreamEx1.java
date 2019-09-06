package chap16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/*
 * File�κ��� ��Ʈ�� �����ϱ�.
 * 
 * ��Ʈ�� : �츮�� ���ϴ�, �ʿ���ϴ� �������� ����.
 */
public class FileToStreamEx1 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/chap16/RandomToStreamEx1.java");
		
		Stream<String> st = Files.lines(path, Charset.defaultCharset());
		st.forEach(s -> System.out.println(s));
		System.out.println();
		st.close();
		
		BufferedReader br = new BufferedReader(new FileReader(path.toFile()));
		br.lines().forEach(s -> System.out.println(s));
		
		System.out.println("������ ������ ��Ʈ������ �����ϱ�.");
		path = Paths.get("src/chap16");
		Stream<Path> st2 = Files.list(path);
		st2.forEach(p -> System.out.println(p.getFileName()));
	}
}
