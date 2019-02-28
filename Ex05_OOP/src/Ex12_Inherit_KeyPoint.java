
class Product {// 전자제품
	int price;
	int bouncePoint;

	Product(int price) {
		this.price = price;
		this.bouncePoint = ((int) (this.price / 10.0));
	}
}

class KtTv extends Product {
	KtTv() {
		super(500);
	}

	@Override
	public String toString() {
		return "Kttv";
	}
}

class Audio extends Product {
	Audio() {
		super(100);
	}

	@Override
	public String toString() {
		return "Audio";
	}
}

class Notebook extends Product {
	Notebook() {
		super(200);
	}

	@Override
	public String toString() {
		return "Notebook";
	}
}

class Buyer {
	int money = 1000;
	int bounspoint = 0;
	Product[] Cart = new Product[10];
	int sum;
	int count;

	Buyer() {
		this(10000);
	}

	Buyer(int money) {
		this.money = money;
	}

	void buy(Product ab) {
		if (this.money < ab.price) {
			System.out.println("잔액 부족");
			return;
		}
		this.money -= ab.price;
		bounspoint += ab.bouncePoint;
		System.out.println(ab + "구매");

		if (this.count >= 10) {
			System.out.println("넘나 많이 삼");
			return;
		}
		Cart[count++] = ab;

	}

	void Summery() {
		String totalList = "";
		int totalprice = 0;
		for (int i = 0; i<count; i++) {
			totalprice += Cart[i].price;
		}
		System.out.println(totalprice);
		
	}

	void cartShow(Product[] Cart) {
		for (int i = 0; i < count; i++) {
			for (Product value : Cart) {
				System.out.println(value.price + "," + value.toString());
			}4
		}
	}
}
public class Ex12_Inherit_KeyPoint {
	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		KtTv tv = new KtTv();
		Audio audio = new Audio();
		Notebook notebook = new Notebook();

		buyer.buy(tv);
		buyer.buy(audio);
		buyer.buy(notebook);
		buyer.buy(notebook);
		buyer.buy(notebook);
		buyer.buy(notebook);
		buyer.buy(notebook);
		buyer.buy(notebook);

		buyer.Summery();
	}
}
