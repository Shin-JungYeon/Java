package chap11;
/*
 * 다음과 같은 실행결과가 나오도록 코드를 완성하시오
 * 
 * [결과]
 * fullPath=c:/jdk11/work/PathSeparateTest.java
 * path=c:/jdk11/work
 * fileName=PathSeparateTest.java
 */
public class HW03 {
	public static void main(String[] args) {
		String fullPath = "c:/jdk11/work/PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		int index = fullPath.lastIndexOf("/");
		path = fullPath.substring(0, index);
		fileName = fullPath.substring(index+1);
		
//		path = fullPath.substring(0, fullPath.lastIndexOf('/'));
//		fileName = fullPath.substring(fullPath.lastIndexOf('/')+1);
		
		System.out.println("fullPath=" + fullPath);
		System.out.println("path=" + path);
		System.out.println("fileName=" + fileName);
	}
}
