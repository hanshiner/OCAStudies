package fromMuhtar;

import java.io.IOException;

class Animal {

	public String toString() {
		return "I am an Animal";
	}
}

class Cow extends Animal {

	public String toString() {
		return "I am a Cow";
	}
}

public class ObjectCasting {
	public static void main(String args[]) throws IOException {
		Animal creature;
		Cow daisy = new Cow();
		System.out.println(daisy);
		creature = daisy;
		System.out.println(creature);
		creature = new Animal();
		System.out.println(creature);
		// daisy = creature; // Compile-time error, incompatible type
		if (creature instanceof Cow) {
			daisy = (Cow) creature;
			System.out.println(daisy);
			
			Long l = 12l;
			
		}
	}
}
