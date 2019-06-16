package selfStudy;

class Product {
	double price=200;
	
	
	Product(){
		this.price*=2;
	}
}

public class A1 {
	
	int num = 6;
	
	public static void updatePrice(Product prt, double price) {
		price = price * 2;
		prt.price = prt.price + price;
//If we remove product. after = sign it will print 400.0 :100.0
	}

	public static void main(String[] args) {
		Product prt = new Product();
		double newPrice = 100;
		A1 t = new A1();
		t.updatePrice(prt, newPrice);
		System.out.println(prt.price + " : " + newPrice);
	}
}