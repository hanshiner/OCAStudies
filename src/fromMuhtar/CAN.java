package fromMuhtar;

public class CAN extends Tan{
	static int c = 3;

	public static void main(String[] args) {
		System.out.println(c);
	}

}

class Tan extends Pan{
	static int c = 4;
}

class Pan {
	static int c = 10;
}
