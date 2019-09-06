package practice;

import java.util.ArrayList;
import java.util.List;

/*
 * 생산자 스레드, 소비자 스레드 문제
 * 
 * CarMarket 클래스 : 자동차 판매소
 * 멤버 변수 : List<String> carList;
 * 멤버메서드 : String getCar() : 임의의 자동차를 선택 리턴
 *          synchronized String push() : getCar() 메서드에서 리턴된 자동차를 carList에 저장하는 기능
 *          synchronized String pop() : carList변수에서 첫번째 자동차 제거하여 리턴 기능
 *          
 * Seller 클래스 : 판매원. Thread 클래스 상속
 * 멤버메서드 : run() : carList에 객체가 존재하면 pop 메서드 호출하기.
 *                  carList에 객체가 없으면 wait()
 *                  0 ~ 2000밀리초를 임의로 sleep()
 *                  
 * Producer 클래스 : 자동차 공급자. Thread 클래스 상속
 * 멤버메서드 : run() : push() 메서드 호출하여 carList에 객체를 add함.
 *                  carList 객체가 존재하면 notifyAll() 함.
 *                  0 ~ 5000밀리초를 임의로 sleep()
 */
class CarMarket {
	List<String> carList = new ArrayList<String>();
	String getCar() {
		String[] car = {"소나타","아반떼","그랜저","산타페","제네시스"};
		return car[(int)(Math.random() * car.length)];
	}
	synchronized String push() {
		String car = getCar();
		carList.add(car);
		notifyAll();
		System.out.println(car + " 입고 됨.");
		return car;
		
	}
	synchronized String pop() {
		while(carList.size()==0) {
			
		}
		
		return carList.remove(0);  //remove한 값이 무엇인지 리턴
	}
}
class Seller extends Thread {  //소비자
	CarMarket carmarket;
	public Seller(CarMarket carmarket) {
		super("판매원");
		this.carmarket = carmarket;
	}
	public void run() {
		carmarket.push();
		try {
			sleep((int)(Math.random()*3)*1000);  //0 ~ 2000밀리초를 임의로 sleep()
		} catch(InterruptedException e) {}
	}
}
class Producer extends Thread {  //생산자
	CarMarket carmarket;
	public Producer(CarMarket carmarket) {
		super("생산자");
		this.carmarket = carmarket;
	}
	public void run() {
		carmarket.pop();
		try {
			sleep((int)(Math.random()*6)*1000);  //0 ~ 5000밀리초를 임의로 sleep()
		} catch(InterruptedException e) {}
	}
}
public class CarExam {
	public static void main(String[] args) {
		CarMarket cm = new CarMarket();
		Thread seller = new Seller(cm);
		Thread producer = new Producer(cm);
		seller.start(); producer.start();
	}
}
