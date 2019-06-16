package selfStudy;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

abstract class Toy {
	public static void insertToy() {
		/* code goes here */}
}

public class GoodDayGoodLuck {

	public static String doMsg(char x) {
		return "Good Day!";
	}

	public static String doMsg(int y) {
		return "Good Luck!";
	}

	public static void main(String[] args) {
		char t = 8;
		int z = '8';
		System.out.println(doMsg(t));
		System.out.println(doMsg(z));

		LocalDate date = LocalDate.of(2012, 01, 31);
		date = date.plusDays(12);
		date = date.plusWeeks(6);
		date = date.plusMonths(14);
		System.out.println(date);

		List colors = new ArrayList();
		colors.add("green");
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.remove(2);
		colors.add(3, "cyan");
		System.out.println(colors);

		int[] array = { 10, 20, 30, 40, 50 };

		int x = array.length;

		while (x > 0) {
			System.out.print(array[--x] + " ");
		}

		System.out.println();
		while (x > 0) {
			x--;
			System.out.print(array[x] + " ");
		}
	}
}
