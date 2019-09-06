package chap15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Stack Ŭ���� : LiFo(Last in First out). Vector�� ���� Ŭ����
 *   �޼���
 *     1. push(Object)  : ���ÿ� ��ü�� ����.
 *     2. Object pop()  : ���ÿ� ����� ��ü�� ������ ����.
 *     3. Object peek() : ���ÿ� ����� ��ü�� ��ȸ�Ͽ� ����.
 * {value1, value2, value3} -(push)-> value3 -(pop)-> {value3, value2, value1}
 * 									  value2
 * 									  value1
 * 
 * Queue �������̽� : jdk5.0 ���Ŀ� Collection �����ӿ�ũ�� �߰���. FiFo(First in First out).
 *   ����Ŭ���� : LinkedList
 *              -> Queue, List �������̽��� ���� ������ Ŭ����. Queue ��ü�̸鼭, List ��ü�̱⵵ ��.
 *   �޼���
 *     1. offer(Object) : ť�� ��ü�� ����.
 *     2. Object poll() : ť�� ����� ��ü�� ������ ����.
 *     3. Object peek() : ť�� ����� ��ü�� ��ȸ�Ͽ� ����.
 * {value1, value2, value3} -(offer)-> value3, value2, value1 -(poll)-> {value1, value2, value3}
 */
public class StackQueueEx1 {
	public static void main(String[] args) { 
		String cars[] = {"�ҳ�Ÿ", "�׷���", "SM5", "K9"};
		
		//Stack
		Stack<String> stack = new Stack<String>();
		for(String s : cars) {
			stack.push(s);  //�Է��� ������� �Ʒ��ʿ� ����. -> �������� ���� ��(������ ���� ��ü)��������
		}
		System.out.println("���ÿ� ����� ��ü�� ���� : " + stack.size());
		
		System.out.println(stack.peek());  //��ü ���� �ܼ��� ��ȸ���Ͽ� ������.
		System.out.println("���ÿ� ����� ��ü�� ���� : " + stack.size());
		
		System.out.println(stack.pop());  //��ü ���� �ƿ� ��������.
		System.out.println("���ÿ� ����� ��ü�� ���� : " + stack.size());
		
		int cnt = stack.size();
		for(int i=0; i<cnt; i++) {
			System.out.println(stack.pop());
		}
		System.out.println("���ÿ� ����� ��ü�� ���� : " + stack.size());
		
		System.out.println();
		
		//Queue
		Queue<String> queue = new LinkedList<String>();  //Queue ��ü�̸鼭 List ��ü�̱⵵ ��. �������̽��� ���� ������ �����ϱ� ����.
		for(String s : cars) {
			queue.offer(s);
		}
		System.out.println("ť�� ����� ��ü�� ���� : " + queue.size());
		
		System.out.println(queue.peek());
		System.out.println("ť�� ����� ��ü�� ���� : " + queue.size());
		
		System.out.println(queue.poll());  //Stack ��ü�� ������ ������ �ݴ�.
		System.out.println("ť�� ����� ��ü�� ���� : " + queue.size());
		
		cnt = queue.size();
		for(int i=0; i<cnt; i++) {
			System.out.println(queue.poll());
		}
		System.out.println("���ÿ� ����� ��ü�� ���� : " + queue.size());
		
	}
}
