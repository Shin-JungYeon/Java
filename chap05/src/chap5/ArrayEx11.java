package chap5;
/*
 * command ���ο��� ���ڿ� �迭 �Է¹ޱ�
 * 
 */
public class ArrayEx11 {
	public static void main(String[] args) {
		
		for(int i=0; i<args.length; i++) {
			System.out.println("Hello, " + args[i]);
		}
		
		for(String a : args) {
			System.out.println("Hello, " + a);
		}
	
	}
}
/*
 * ���� : Last in First out
 * ->   ->
 *   ...
 *   3
 *   2
 *   1
 * 
 * ť : First in First out
 * -> ...3 2 1 ->
 */