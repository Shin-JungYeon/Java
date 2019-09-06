package chap12;
/*
 * Process : OS 상태에서 실행중인 프로그램.
 *           프로세스 간의 메모리 전달 불가. 완벽하게 독립되어 있는 환경.
 *           하나의 프로세스 내에서 스레드 간의 메모리 전달은 가능. 같은 환경을 공유.
 * 
 * Runtime : Runtime.getRuntime() : OS로부터 프로세스의 실행 권한을 받아 옴.
 */
public class ProcessEx1 {
	public static void main(String[] args) {
		try {
			Process p1 = Runtime.getRuntime().exec("calc.exe");
			Process p2 = Runtime.getRuntime().exec("mspaint.exe");
			Process p3 = Runtime.getRuntime().exec("notepad.exe");
//			p1.waitFor();
//			p2.waitFor();
//			p3.waitFor();
			System.out.println("main 메서드 종료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
