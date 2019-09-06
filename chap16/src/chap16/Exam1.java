package chap16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

class Employee {
	private String name;  //이름
	private String work;  //업무
	private String position;  //직급
	private int age;  //나이
	public Employee(String name, String work, String position, int age) {
		this.name = name;
		this.work = work;
		this.position = position;
		this.age = age;
	}
	public String getName() {return name;}
	public String getWork() {return work;}
	public String getPosition() {return position;}
	public int getAge() {return age;}
	@Override
	public String toString() {
		return "name=" + name + ", work=" + work + ", position=" + position + ", age=" + age;
	}
}
public class Exam1 {
	public static void main(String[] args) throws IOException {
		//1. emp.txt 파일을 읽어서, st 객체에 저장.
		BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
		Stream<Employee> st = br.lines().map(data -> {  //파일의 내용을 한 줄씩 불러와서 data에 넣어줌. br.lines() : Stream<String>
			String[] emp = data.split(",");  //"," 를 기준으로 분류해서 배열객체로 만듦.
			Employee e = new Employee(emp[0], emp[1], emp[2], Integer.parseInt(emp[3]));  //나이만 정수형으로 변환해서 Employee 객체 생성.
			return e;  //새로운 Employee 타입의 스트림 하나 완성.
		});
		st.forEach(s -> System.out.println(s));
		System.out.println();
		
		//2. emp.txt 파일을 읽어서, 현재 직원들이 속한 직급 정보(중복없이) 출력하기.
		br = new BufferedReader(new FileReader("emp.txt"));  //위에서 한 번 다 읽었으면 새로 읽어와야 함.
		Stream<String> po = br.lines().map(data -> {
			String[] emp = data.split(",");
			return emp[2];
		});
		System.out.println("직원들이 속한 직급 정보 : ");
		po.distinct().forEach(e -> System.out.println(e));

		//위의 내용 한줄에 끝내기
//		new BufferedReader(new FileReader("emp.txt")).lines().map(data -> data.split(",")[2]).distinct().forEach(s -> System.out.println(s));
		
	}
}
