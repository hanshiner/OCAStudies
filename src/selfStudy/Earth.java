package selfStudy;

abstract class Planet {
	protected void resolve() { // Line n1
	}

	 abstract void rotate(); // Line n2
}

class Earth extends Planet { // Line n3
	protected void resolve() {
	}

	  void rotate() { // Line n4
	}
}