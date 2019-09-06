package practice;

import java.util.ArrayList;
import java.util.List;

/*
 * ������ ������, �Һ��� ������ ����
 * 
 * CarMarket Ŭ���� : �ڵ��� �Ǹż�
 * ��� ���� : List<String> carList;
 * ����޼��� : String getCar() : ������ �ڵ����� ���� ����
 *          synchronized String push() : getCar() �޼��忡�� ���ϵ� �ڵ����� carList�� �����ϴ� ���
 *          synchronized String pop() : carList�������� ù��° �ڵ��� �����Ͽ� ���� ���
 *          
 * Seller Ŭ���� : �Ǹſ�. Thread Ŭ���� ���
 * ����޼��� : run() : carList�� ��ü�� �����ϸ� pop �޼��� ȣ���ϱ�.
 *                  carList�� ��ü�� ������ wait()
 *                  0 ~ 2000�и��ʸ� ���Ƿ� sleep()
 *                  
 * Producer Ŭ���� : �ڵ��� ������. Thread Ŭ���� ���
 * ����޼��� : run() : push() �޼��� ȣ���Ͽ� carList�� ��ü�� add��.
 *                  carList ��ü�� �����ϸ� notifyAll() ��.
 *                  0 ~ 5000�и��ʸ� ���Ƿ� sleep()
 */
class CarMarket {
	List<String> carList = new ArrayList<String>();
	String getCar() {
		String[] car = {"�ҳ�Ÿ","�ƹݶ�","�׷���","��Ÿ��","���׽ý�"};
		return car[(int)(Math.random() * car.length)];
	}
	synchronized String push() {
		String car = getCar();
		carList.add(car);
		notifyAll();
		System.out.println(car + " �԰� ��.");
		return car;
		
	}
	synchronized String pop() {
		while(carList.size()==0) {
			
		}
		
		return carList.remove(0);  //remove�� ���� �������� ����
	}
}
class Seller extends Thread {  //�Һ���
	CarMarket carmarket;
	public Seller(CarMarket carmarket) {
		super("�Ǹſ�");
		this.carmarket = carmarket;
	}
	public void run() {
		carmarket.push();
		try {
			sleep((int)(Math.random()*3)*1000);  //0 ~ 2000�и��ʸ� ���Ƿ� sleep()
		} catch(InterruptedException e) {}
	}
}
class Producer extends Thread {  //������
	CarMarket carmarket;
	public Producer(CarMarket carmarket) {
		super("������");
		this.carmarket = carmarket;
	}
	public void run() {
		carmarket.pop();
		try {
			sleep((int)(Math.random()*6)*1000);  //0 ~ 5000�и��ʸ� ���Ƿ� sleep()
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
