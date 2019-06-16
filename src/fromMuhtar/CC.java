package fromMuhtar;

class AAA {
	public void test() {
		System.out.println("A");
	}
}

class BBB extends AAA {
	public void test() {
		System.out.println("B");
	}
}

public class CC extends BBB { // if class C extends B then answer is C C
	public void test() {
		System.out.println("C");
	}

	public static void main(String[] args) {
//		AAA a = new AAA();
//		BBB b = (BBB)a;
		
		AAA a = new CC();
		BBB b = (BBB)a;
		
		
		
	}
}