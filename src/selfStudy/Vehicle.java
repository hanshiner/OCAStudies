package selfStudy;

abstract class Iron{
	
	public abstract void madeOf();
	
	
}







public abstract class Vehicle extends Iron{

	private String make;

	static int wheelCount = 4;

	
	private String carBarnd() {
		return "hey man";
	}
	
	public void madeOf() {
		System.out.println("mADE OF IRON");
	}
	
	Vehicle(String make) {
		this.make = make;
	}

	public abstract Number year();

}

// FIRST CONCRETE(NON-ABSTRACT) CLASS MUST IMPLEMENT ALL ABSTRACT METHODS

class Car extends Vehicle {

	String model;

	Car(String model) {
		super("Toyota");
		this.model = model;
	}

	public Integer year() {
		return 1988;
	}

	public static void main(String[] args) {

		Car toyota = new Car("Camry");
	}
}