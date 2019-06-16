package selfStudy;

//3 types of methods in interface
//abstract
//default
//static 

public interface FirstInterface {

	public static final String TEMP_SAAS = "100C";

	public default void giveMeNumber() {
		System.out.println(5);
	}
}

interface SecondInterface{

	public default void giveMeNumber(){
		System.out.println(9);
	}
	
}

//class MyClass implements FirstInterface, SecondInterface {
//
//	
//	
//}
