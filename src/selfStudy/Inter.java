package selfStudy;

class Bu {
	public void hello() {
		System.out.println("Budanhello");
	}
}

public class Inter extends Bu {

	public void hello() {
		System.out.println("Interdenhello");
	}
	
	public void hi() {
		System.out.println("Interdenhi");
	}

	public static void main(String[] args) {

		Inter b = new Inter();
		b.hello();

		Bu b1 = new Inter();
		b1.hello();

		//b1.hi();
	}

}
