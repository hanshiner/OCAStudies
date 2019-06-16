package fromMuhtar;

import java.util.ArrayList;

import fromMuhtar.Acc;

public class AccTest extends Acc {

	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		String[] myArray;
		try {
			while (true) { // while is not stopping
				myList.add("My String");
			}
		} catch (RuntimeException re) {
			System.out.println("Caught a RuntimeException");
		} catch (Exception e) {
			System.out.println("Caught an Exception");
		}
		System.out.println("Ready to use");
	}
}
