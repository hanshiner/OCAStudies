package fromMuhtar;

public class Super {

	protected Number add() {

		return 5.5;
	}

	public static void main(String[] args) {

		Integer x = new Integer(9);

		switch (x) {
		case 9:
			System.out.println("Ten");
			break;
		case 10:
			System.out.println("Twenty");
			break;
		}
	}
}

class Sub extends Super {

	public Integer add() {

		return 7;
	}

}