package chap7;
/*
 * Food, Fruit, Drink, Snack, Apple, Peach, Cock, Cider, Biscuit, Cookie 클래스 구현하기
 * 모든 식료품(Food)은 가격(price), 보너스포인트(point)를 가지고 있다.
 * 식료품 객체를 생성하기 위해서는 가격을 입력받고, 1/10을 포인트로 설정한다.
 * 식료품 종류는 과일(Fruit), 음료(Drink), 과자Snack() 종류로 나눈다.
 * 과일은 당도(brix)를 음료는 용량(ml), 과자는 무게(gram) 정보를 가지고 있다.
 * 과일에는 사과(Apple), 복숭아(Peach)가 있고,
 * 음료에는 콜라(Cock), 사이다(Cider)가 있고,
 * 과자에는 비스킷(Biscuit), 쿠키(Cookie)가 있다.
 * 사과와 복숭아는 가격과 당도를 입력받아 객체를 생성하고
 * 콜라와 사이다는 가격과 용량을 입력받아 객체를 생성하고
 * 비스킷과 쿠키는 가격과 무게를 입력받아 객체를 생성한다.
 * 
 * 위의 조건에 맞도록 클래스 구현하기
 */
class Food {
	int price, point;
	Food(int price) {
		this.price = price;
		this.point = price/10;
	}
}

class Fruit extends Food {
	double brix;
	Fruit(int price, double brix) {
		super(price);
		this.brix = brix;
	}
}
class Apple extends Fruit {
	Apple(int price, double brix) {
		super(price, brix);
	}
	public String toString() {
		return "Apple";
	}
}
class Peach extends Fruit {
	Peach(int price, double brix) {
		super(price, brix);
	}
	public String toString() {
		return "Peach";
	}
}

class Drink extends Food {
	int ml;
	Drink(int price, int ml) {
		super(price);
		this.ml = ml;
	}
}
class Cock extends Drink {
	Cock(int price, int ml) {
		super(price, ml);
	}	
	public String toString() {
		return "Cock";
	}
}
class Cider extends Drink {
	Cider(int price, int ml) {
		super(price, ml);
	}
	public String toString() {
		return "Cider";
	}
}

class Snack extends Food {
	int gram;
	Snack(int price, int gram) {
		super(price);
		this.gram = gram;
	}
}
class Biscuit extends Snack {
	Biscuit(int price, int gram) {
		super(price, gram);
		}
	public String toString() {
		return "Biscuit";
	}
}
class Cookie extends Snack {
	Cookie(int price, int gram) {
		super(price, gram);
	}
	public String toString() {  //해당 객체를 문자열화 해줌.
		return "Cookie";
	}
}
/*
 * Buyer2 클래스 구현하기
 *   멤버변수 : money, point, Food[] cart, fruitcnt, drinkcnt, snackcnt, cnt
 *   메서드 : void buy(Food)
 *          기능 : 물건 구입시마다 가격만큼 money 차감, point 증가.
 *                구입하려는 물건의 값이 큰 경우 "잔액 부족" 메세지 출력하고 buy 메서드 종료
 *                구입 가능시 구입한 물품명과 가격을 출력하고 장바구니에 물건 넣어주고, fruitcnt, drinkcnt, snackcnt, cnt 값 증가시키기.
 *   메서드 : void summary()
 *          기능 : 장바구니에 있는 물건을 조회하여 물건 목록과 총 가격, 현재의 보너스 포인트를 출력
 *                과일의 갯수, 과일 목록, 과일 구매 금액
 *                음료의 갯수, 음료 목록, 음료 구매 금액
 *                과자의 갯수, 과자 목록, 과자 구매 금액 출력하기
 *                남은 금액과 보유 포인트 출력
 */
class Buyer2 {
	int money=10000, point;
	int fruitcnt, drinkcnt, snackcnt, cnt;  //buyer가 한 명이기 때문에 cnt에 static 안해줘도 됨. buyer가 여러명일 때 static 사용하면 장바구니를 공동으로 사용하게 됨.
	Food[] cart = new Food[20];
	void buy(Food f) {
		if(money < f.price) {
			System.out.println(f + " 구입하려면 잔액이 부족합니다.");
			return;  //buy메서드를 종료시키기 위함.
		}
		this.money -= f.price;
		this.point += f.point;
		System.out.println(f + "을 장바구니에 넣겠습니다. 가격은 " + f.price + "입니다.");
		cart[cnt++] = f;
		if(f instanceof Fruit) fruitcnt++;
		if(f instanceof Drink) drinkcnt++;
		if(f instanceof Snack) snackcnt++;
	}
	void summary() {
		int sum=0;
		int fruitprice=0, drinkprice=0, snackprice=0;
		String foodlist = "", fruitlist = "", drinklist = "", snacklist = "";
		
		for(int i=0; i<cnt; i++) {
			sum += cart[i].price;
			foodlist += cart[i] + ((i==cnt-1)?"":",");  //최종 오버라이딩된 자료값으로
			if(cart[i] instanceof Fruit) {
				fruitlist += cart[i] + " ";
				fruitprice += cart[i].price;
			} else if(cart[i] instanceof Drink) {
				drinklist += cart[i] + ", ";
				drinkprice += cart[i].price;
			} else if(cart[i] instanceof Snack) {
				snacklist += cart[i] + ", ";
				snackprice += cart[i].price;
			}
		}
		System.out.println("총 구매건수: " + cnt + ", 구매한 물건의 목록: " + foodlist + ", 총 금액: " + sum);
		System.out.println("과일 구매건수: " + fruitcnt + ", 과일 구매 목록: " + fruitlist + ", 과일 구매 가격: " + fruitprice);
		System.out.println("음료 구매건수: " + drinkcnt + ", 음료 구매 목록: " + drinklist + ", 음료 구매 가격: " + drinkprice);
		System.out.println("과자 구매건수: " + snackcnt + ", 과자 구매 목록: " + snacklist + ", 과자 구매 가격: " + snackprice);
		System.out.println("현재 잔액: " + money + ", 보유 포인트: " + point);
	}
}
public class FoodEx1 {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		Apple a = new Apple(1000, 10.5);
		Peach p = new Peach(2000, 15.5);
		Cider ci = new Cider(1500, 250);
		b.buy(a);
		b.buy(p);
		b.buy(ci);
		b.summary();
	}
}
