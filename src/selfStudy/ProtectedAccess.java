package selfStudy;

public class ProtectedAccess extends Acc {

	public static void main(String[] args) {

		Acc obj = new Acc();

		System.out.println(obj.s);
	}

}

class Acc {
	int p;

	private int q;

	protected int r;

	public int s;

}
