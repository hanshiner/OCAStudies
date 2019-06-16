package selfStudy;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysReview {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		int a = 1;
		list1.remove(a);

		System.out.println(list1);

		ArrayList<String> colors = new ArrayList<>();

		colors.add("green");
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.add(3, "cyan");

		System.out.println(colors);

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		Integer ab = 1;
		System.out.println(list.remove(ab));

	}

}
