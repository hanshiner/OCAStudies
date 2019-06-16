package selfStudy;

public class Test1 {

	void readCard(int cardNo) throws Exception {
		System.out.println("Reading card");
	}

	void checkCard(int cardNo) throws RuntimeException { // line n1
		System.out.println("Checking card");
	}

	public static void main(String[] args) throws Exception {
		Test1 ex = new Test1();
		int cardNo = 12344;
		ex.checkCard(cardNo); // line n2
		ex.readCard(cardNo); // line n3
	}
}
