package chap7;
/*
 * Food, Fruit, Drink, Snack, Apple, Peach, Cock, Cider, Biscuit, Cookie Ŭ���� �����ϱ�
 * ��� �ķ�ǰ(Food)�� ����(price), ���ʽ�����Ʈ(point)�� ������ �ִ�.
 * �ķ�ǰ ��ü�� �����ϱ� ���ؼ��� ������ �Է¹ް�, 1/10�� ����Ʈ�� �����Ѵ�.
 * �ķ�ǰ ������ ����(Fruit), ����(Drink), ����Snack() ������ ������.
 * ������ �絵(brix)�� ����� �뷮(ml), ���ڴ� ����(gram) ������ ������ �ִ�.
 * ���Ͽ��� ���(Apple), ������(Peach)�� �ְ�,
 * ���ῡ�� �ݶ�(Cock), ���̴�(Cider)�� �ְ�,
 * ���ڿ��� ��Ŷ(Biscuit), ��Ű(Cookie)�� �ִ�.
 * ����� �����ƴ� ���ݰ� �絵�� �Է¹޾� ��ü�� �����ϰ�
 * �ݶ�� ���̴ٴ� ���ݰ� �뷮�� �Է¹޾� ��ü�� �����ϰ�
 * ��Ŷ�� ��Ű�� ���ݰ� ���Ը� �Է¹޾� ��ü�� �����Ѵ�.
 * 
 * ���� ���ǿ� �µ��� Ŭ���� �����ϱ�
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
	public String toString() {  //�ش� ��ü�� ���ڿ�ȭ ����.
		return "Cookie";
	}
}
/*
 * Buyer2 Ŭ���� �����ϱ�
 *   ������� : money, point, Food[] cart, fruitcnt, drinkcnt, snackcnt, cnt
 *   �޼��� : void buy(Food)
 *          ��� : ���� ���Խø��� ���ݸ�ŭ money ����, point ����.
 *                �����Ϸ��� ������ ���� ū ��� "�ܾ� ����" �޼��� ����ϰ� buy �޼��� ����
 *                ���� ���ɽ� ������ ��ǰ��� ������ ����ϰ� ��ٱ��Ͽ� ���� �־��ְ�, fruitcnt, drinkcnt, snackcnt, cnt �� ������Ű��.
 *   �޼��� : void summary()
 *          ��� : ��ٱ��Ͽ� �ִ� ������ ��ȸ�Ͽ� ���� ��ϰ� �� ����, ������ ���ʽ� ����Ʈ�� ���
 *                ������ ����, ���� ���, ���� ���� �ݾ�
 *                ������ ����, ���� ���, ���� ���� �ݾ�
 *                ������ ����, ���� ���, ���� ���� �ݾ� ����ϱ�
 *                ���� �ݾװ� ���� ����Ʈ ���
 */
class Buyer2 {
	int money=10000, point;
	int fruitcnt, drinkcnt, snackcnt, cnt;  //buyer�� �� ���̱� ������ cnt�� static �����൵ ��. buyer�� �������� �� static ����ϸ� ��ٱ��ϸ� �������� ����ϰ� ��.
	Food[] cart = new Food[20];
	void buy(Food f) {
		if(money < f.price) {
			System.out.println(f + " �����Ϸ��� �ܾ��� �����մϴ�.");
			return;  //buy�޼��带 �����Ű�� ����.
		}
		this.money -= f.price;
		this.point += f.point;
		System.out.println(f + "�� ��ٱ��Ͽ� �ְڽ��ϴ�. ������ " + f.price + "�Դϴ�.");
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
			foodlist += cart[i] + ((i==cnt-1)?"":",");  //���� �������̵��� �ڷᰪ����
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
		System.out.println("�� ���ŰǼ�: " + cnt + ", ������ ������ ���: " + foodlist + ", �� �ݾ�: " + sum);
		System.out.println("���� ���ŰǼ�: " + fruitcnt + ", ���� ���� ���: " + fruitlist + ", ���� ���� ����: " + fruitprice);
		System.out.println("���� ���ŰǼ�: " + drinkcnt + ", ���� ���� ���: " + drinklist + ", ���� ���� ����: " + drinkprice);
		System.out.println("���� ���ŰǼ�: " + snackcnt + ", ���� ���� ���: " + snacklist + ", ���� ���� ����: " + snackprice);
		System.out.println("���� �ܾ�: " + money + ", ���� ����Ʈ: " + point);
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
