package chap15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Stack 클래스 : LiFo(Last in First out). Vector의 하위 클래스
 *   메서드
 *     1. push(Object)  : 스택에 객체를 저장.
 *     2. Object pop()  : 스택에 저장된 객체를 꺼내서 리턴.
 *     3. Object peek() : 스택에 저장된 객체를 조회하여 리턴.
 * {value1, value2, value3} -(push)-> value3 -(pop)-> {value3, value2, value1}
 * 									  value2
 * 									  value1
 * 
 * Queue 인터페이스 : jdk5.0 이후에 Collection 프레임워크에 추가됨. FiFo(First in First out).
 *   구현클래스 : LinkedList
 *              -> Queue, List 인터페이스를 다중 구현한 클래스. Queue 객체이면서, List 객체이기도 함.
 *   메서드
 *     1. offer(Object) : 큐에 객체를 저장.
 *     2. Object poll() : 큐에 저장된 객체를 꺼내서 리턴.
 *     3. Object peek() : 큐에 저장된 객체를 조회하여 리턴.
 * {value1, value2, value3} -(offer)-> value3, value2, value1 -(poll)-> {value1, value2, value3}
 */
public class StackQueueEx1 {
	public static void main(String[] args) { 
		String cars[] = {"소나타", "그랜저", "SM5", "K9"};
		
		//Stack
		Stack<String> stack = new Stack<String>();
		for(String s : cars) {
			stack.push(s);  //입력한 순서대로 아래쪽에 저장. -> 꺼낼때는 가장 위(마지막 저장 객체)에서부터
		}
		System.out.println("스택에 저장된 객체의 갯수 : " + stack.size());
		
		System.out.println(stack.peek());  //객체 값을 단순히 조회만하여 보여줌.
		System.out.println("스택에 저장된 객체의 갯수 : " + stack.size());
		
		System.out.println(stack.pop());  //객체 값을 아예 꺼내버림.
		System.out.println("스택에 저장된 객체의 갯수 : " + stack.size());
		
		int cnt = stack.size();
		for(int i=0; i<cnt; i++) {
			System.out.println(stack.pop());
		}
		System.out.println("스택에 저장된 객체의 갯수 : " + stack.size());
		
		System.out.println();
		
		//Queue
		Queue<String> queue = new LinkedList<String>();  //Queue 객체이면서 List 객체이기도 함. 인터페이스는 다중 구현이 가능하기 때문.
		for(String s : cars) {
			queue.offer(s);
		}
		System.out.println("큐에 저장된 객체의 갯수 : " + queue.size());
		
		System.out.println(queue.peek());
		System.out.println("큐에 저장된 객체의 갯수 : " + queue.size());
		
		System.out.println(queue.poll());  //Stack 객체와 꺼내는 순서가 반대.
		System.out.println("큐에 저장된 객체의 갯수 : " + queue.size());
		
		cnt = queue.size();
		for(int i=0; i<cnt; i++) {
			System.out.println(queue.poll());
		}
		System.out.println("스택에 저장된 객체의 객수 : " + queue.size());
		
	}
}
