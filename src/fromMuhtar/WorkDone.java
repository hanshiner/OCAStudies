package fromMuhtar;

public class WorkDone {
	public static void main(String[] args) {
		String[] arr = { "A", "B", "C", "D" };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (arr[i].equals("A")) {
				break;
			}
		}
		System.out.println("Work done");

	}
}
