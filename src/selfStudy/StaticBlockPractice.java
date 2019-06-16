package selfStudy;

import java.util.ArrayList;

public class StaticBlockPractice {

	private static ArrayList<String> studentList;

	static {
		System.out.println("Welcome to StudentsUtility");
	}

	static {
		
		loadAllMyData();
		
	}
	
	public static void loadAllMyData() {
		studentList = new ArrayList<String>();
		studentList.add("Abdul Kahn");
		studentList.add("Nurilla");
		studentList.add("Odiljan");
		studentList.add("Ansar");
		studentList.add("Muhammad");
		studentList.add("Ali");
		studentList.add("Erdem");
		studentList.add("Muratbek");
		studentList.add("Marat");
		studentList.add("Kubanych");
	}

	public static void main(String[] args) {
		System.out.println(       studentList           );
		displayAllStudent();
		addStudent("Jackal");
		displayAllStudent();
		updateStudent(2,"Hasan");
		displayAllStudent();
		removeStudent(9);
		displayAllStudent();
		resetTheList();
		addStudent("Ali");
		addStudent("Ayse");
		displayAllStudent();
	}
	public static void displayAllStudent() {

		for (int i = 0; i < studentList.size(); i++) {
			System.out.println("Student " + (i+1) +" : " + studentList.get(i));
		}
			
		
	}

	public static void addStudent(String name) {
		studentList.add(name);

	}

	public static void updateStudent(int index, String newName) {
		
		if(index>0 && index<studentList.size())
				studentList.set(index, newName);
		else
			System.out.println("OUT OF RANGE");
		
		

	}

	public static void removeStudent(int index) {
		studentList.remove(index);
	}

	public static void resetTheList() {
		studentList.clear();
	}
}
