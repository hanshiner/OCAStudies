package selfStudy;

import java.time.LocalDate;

public class Whiz1 {

	int x_y, y=7,f=y*x_y;

	public static void main(String[] args) {
		Base bs = new Subclass();

		bs.display();

		int[] arr = { 1, 2, 3 };
		// double[] d = arr;
		Boolean b = Boolean.TRUE;

		System.out.println(b);

		Double m = 10.0;
		
		Integer in = 0x10;
		
		System.out.println(in);
		
		System.out.println(m + in);
		
		int a = 10;
		
		int b1;
		
		
		
		StringBuilder d = new StringBuilder("ffffffffff");
		
		System.out.println(d.capacity());
		
		LocalDate lc = LocalDate.ofYearDay(2015, 365);
		
		System.out.println(lc);
		
		String y  = "123456789";
		
		//System.out.println(y.getCha);
		float t = 10l;
		if(a>7) {
			b1=6;
		}
		
		//System.out.println(b1);
	}
}

class Base {

	public static void display() {

		System.out.println("Base");
	}
}

class Subclass extends Base {

	public static void display() {

		System.out.println("Subclass");
	}
}