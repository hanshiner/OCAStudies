package fromMuhtar;

class Employee {
	private String name;
	private int age;
	private int salary;

	public Employee(String name, int age) {
		// setName(name);
		// setAge(age);
		// setSalary(2000);
	}

	public Employee(String name, int age, int salary) {
		//setSalary(2000);
		//this(name, age);
	}

//getter and setter methods for attributes go here
	public void printDetails() {
		System.out.println(name + " : " + age + " : " + salary);
	}

}

public class Test2 {
	public static void main(String[] args) {
     //Employee e1 = new Employee();
		Employee e2 = new Employee("Jack", 50);
		Employee e3 = new Employee("Chloe", 40, 5000);
		//e1.printDetails();
		e2.printDetails();
		e3.printDetails();
	}
}
